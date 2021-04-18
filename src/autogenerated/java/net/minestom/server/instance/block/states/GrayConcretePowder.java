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
public final class GrayConcretePowder {
  public static final BlockState GRAY_CONCRETE_POWDER_0 = new BlockState(NamespaceID.from("minecraft:gray_concrete_powder_0"), (short) 9465, Block.GRAY_CONCRETE_POWDER);

  static {
    Registries.registerBlockState(GRAY_CONCRETE_POWDER_0);
  }

  public static void initStates() {
    Block.GRAY_CONCRETE_POWDER.addBlockState(GRAY_CONCRETE_POWDER_0);
  }
}