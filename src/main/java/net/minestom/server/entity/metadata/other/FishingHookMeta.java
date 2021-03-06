package net.minestom.server.entity.metadata.other;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import net.minestom.server.entity.metadata.EntityMeta;
import net.minestom.server.entity.metadata.ObjectDataProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FishingHookMeta extends EntityMeta implements ObjectDataProvider {

    private Entity hooked;
    private Entity owner;

    public FishingHookMeta(@NotNull Entity entity, @NotNull Metadata metadata) {
        super(entity, metadata);
    }

    @Nullable
    public Entity getHookedEntity() {
        return this.hooked;
    }

    public void setHookedEntity(@Nullable Entity value) {
        this.hooked = value;
        int entityID = value == null ? 0 : value.getEntityId() + 1;
        super.metadata.setIndex((byte) 7, Metadata.VarInt(entityID));
    }

    public boolean isCatchable() {
        return super.metadata.getIndex((byte) 8, false);
    }

    public void setCatchable(boolean value) {
        super.metadata.setIndex((byte) 8, Metadata.Boolean(value));
    }

    @Nullable
    public Entity getOwnerEntity() {
        return owner;
    }

    public void setOwnerEntity(@Nullable Entity value) {
        this.owner = value;
    }

    @Override
    public int getObjectData() {
        return owner != null ? owner.getEntityId() : 0;
    }

    @Override
    public boolean requiresVelocityPacketAtSpawn() {
        return false;
    }
}
