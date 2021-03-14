package net.minestom.server.utils.cache;

import io.netty.buffer.ByteBuf;
import net.minestom.server.MinecraftServer;
import net.minestom.server.network.netty.packet.FramedPacket;
import net.minestom.server.network.packet.server.ServerPacket;
import net.minestom.server.utils.PacketUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Implemented by {@link ServerPacket server packets} which can be temporary cached in memory to be re-sent later
 * without having to go through all the writing and compression.
 * <p>
 * {@link #getIdentifier()} is to differentiate this packet from the others of the same type.
 */
public interface CacheablePacket {

    /**
     * Gets the cache linked to this packet.
     * <p>
     * WARNING: the cache needs to be shared between all the object instances, tips is to make it static.
     *
     * @return the temporary packet cache
     */
    @NotNull
    TemporaryCache<TimedBuffer> getCache();

    /**
     * Gets the identifier of this packet.
     * <p>
     * Used to verify if this packet is already cached or not.
     *
     * @return this packet identifier, null to prevent caching
     */
    @Nullable
    UUID getIdentifier();

    /**
     * Gets the last time this packet changed.
     *
     * @return the last packet update time in milliseconds
     */
    long getTimestamp();

    @Nullable
    static FramedPacket getCachedPacket(@NotNull ServerPacket serverPacket) {
        if (!(serverPacket instanceof FramedPacket))
            return null;
        if (!MinecraftServer.hasPacketCaching())
            return null;

        final CacheablePacket cacheablePacket = (CacheablePacket) serverPacket;
        final UUID identifier = cacheablePacket.getIdentifier();
        if (identifier == null) {
            // This packet explicitly asks to do not retrieve the cache
            return null;
        }

        final long timestamp = cacheablePacket.getTimestamp();
        // Try to retrieve the cached buffer
        TemporaryCache<TimedBuffer> temporaryCache = cacheablePacket.getCache();
        TimedBuffer timedBuffer = temporaryCache.retrieve(identifier);

        // Update the buffer if non-existent or outdated
        final boolean shouldUpdate = timedBuffer == null ||
                timestamp > timedBuffer.getTimestamp();

        if (shouldUpdate) {
            final ByteBuf tempBuffer = PacketUtils.createFramedPacket(serverPacket, true);
            timedBuffer = new TimedBuffer(tempBuffer, timestamp);
        }

        temporaryCache.cache(identifier, timedBuffer);
        return new FramedPacket(timedBuffer.getBuffer());
    }

}
