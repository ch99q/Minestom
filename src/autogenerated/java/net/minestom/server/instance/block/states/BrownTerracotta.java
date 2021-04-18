package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownTerracotta {
  public static final BlockState BROWN_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:brown_terracotta_0"), (short) 6863, Block.BROWN_TERRACOTTA);

  static {
    Registries.registerBlockState(BROWN_TERRACOTTA_0);
  }

  public static void initStates() {
    Block.BROWN_TERRACOTTA.addBlockState(BROWN_TERRACOTTA_0);
  }
}