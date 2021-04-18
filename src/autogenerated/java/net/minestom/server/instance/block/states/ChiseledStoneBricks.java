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
public final class ChiseledStoneBricks {
  public static final BlockState CHISELED_STONE_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:chiseled_stone_bricks_0"), (short) 4498, Block.CHISELED_STONE_BRICKS);

  static {
    Registries.registerBlockState(CHISELED_STONE_BRICKS_0);
  }

  public static void initStates() {
    Block.CHISELED_STONE_BRICKS.addBlockState(CHISELED_STONE_BRICKS_0);
  }
}