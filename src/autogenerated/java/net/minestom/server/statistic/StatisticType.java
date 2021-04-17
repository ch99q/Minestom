package net.minestom.server.statistic;

import java.lang.Override;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED
 */
public class StatisticType implements Keyed {
  public static final StatisticType LEAVE_GAME = new StatisticType(NamespaceID.from("minecraft:leave_game"));

  public static final StatisticType PLAY_ONE_MINUTE = new StatisticType(NamespaceID.from("minecraft:play_one_minute"));

  public static final StatisticType TIME_SINCE_DEATH = new StatisticType(NamespaceID.from("minecraft:time_since_death"));

  public static final StatisticType TIME_SINCE_REST = new StatisticType(NamespaceID.from("minecraft:time_since_rest"));

  public static final StatisticType CROUCH_TIME = new StatisticType(NamespaceID.from("minecraft:sneak_time"));

  public static final StatisticType WALK_ONE_CM = new StatisticType(NamespaceID.from("minecraft:walk_one_cm"));

  public static final StatisticType CROUCH_ONE_CM = new StatisticType(NamespaceID.from("minecraft:crouch_one_cm"));

  public static final StatisticType SPRINT_ONE_CM = new StatisticType(NamespaceID.from("minecraft:sprint_one_cm"));

  public static final StatisticType WALK_ON_WATER_ONE_CM = new StatisticType(NamespaceID.from("minecraft:walk_on_water_one_cm"));

  public static final StatisticType FALL_ONE_CM = new StatisticType(NamespaceID.from("minecraft:fall_one_cm"));

  public static final StatisticType CLIMB_ONE_CM = new StatisticType(NamespaceID.from("minecraft:climb_one_cm"));

  public static final StatisticType FLY_ONE_CM = new StatisticType(NamespaceID.from("minecraft:fly_one_cm"));

  public static final StatisticType WALK_UNDER_WATER_ONE_CM = new StatisticType(NamespaceID.from("minecraft:walk_under_water_one_cm"));

  public static final StatisticType MINECART_ONE_CM = new StatisticType(NamespaceID.from("minecraft:minecart_one_cm"));

  public static final StatisticType BOAT_ONE_CM = new StatisticType(NamespaceID.from("minecraft:boat_one_cm"));

  public static final StatisticType PIG_ONE_CM = new StatisticType(NamespaceID.from("minecraft:pig_one_cm"));

  public static final StatisticType HORSE_ONE_CM = new StatisticType(NamespaceID.from("minecraft:horse_one_cm"));

  public static final StatisticType AVIATE_ONE_CM = new StatisticType(NamespaceID.from("minecraft:aviate_one_cm"));

  public static final StatisticType SWIM_ONE_CM = new StatisticType(NamespaceID.from("minecraft:swim_one_cm"));

  public static final StatisticType STRIDER_ONE_CM = new StatisticType(NamespaceID.from("minecraft:strider_one_cm"));

  public static final StatisticType JUMP = new StatisticType(NamespaceID.from("minecraft:jump"));

  public static final StatisticType DROP = new StatisticType(NamespaceID.from("minecraft:drop"));

  public static final StatisticType DAMAGE_DEALT = new StatisticType(NamespaceID.from("minecraft:damage_dealt"));

  public static final StatisticType DAMAGE_DEALT_ABSORBED = new StatisticType(NamespaceID.from("minecraft:damage_dealt_absorbed"));

  public static final StatisticType DAMAGE_DEALT_RESISTED = new StatisticType(NamespaceID.from("minecraft:damage_dealt_resisted"));

  public static final StatisticType DAMAGE_TAKEN = new StatisticType(NamespaceID.from("minecraft:damage_taken"));

  public static final StatisticType DAMAGE_BLOCKED_BY_SHIELD = new StatisticType(NamespaceID.from("minecraft:damage_blocked_by_shield"));

  public static final StatisticType DAMAGE_ABSORBED = new StatisticType(NamespaceID.from("minecraft:damage_absorbed"));

  public static final StatisticType DAMAGE_RESISTED = new StatisticType(NamespaceID.from("minecraft:damage_resisted"));

  public static final StatisticType DEATHS = new StatisticType(NamespaceID.from("minecraft:deaths"));

  public static final StatisticType MOB_KILLS = new StatisticType(NamespaceID.from("minecraft:mob_kills"));

  public static final StatisticType ANIMALS_BRED = new StatisticType(NamespaceID.from("minecraft:animals_bred"));

  public static final StatisticType PLAYER_KILLS = new StatisticType(NamespaceID.from("minecraft:player_kills"));

  public static final StatisticType FISH_CAUGHT = new StatisticType(NamespaceID.from("minecraft:fish_caught"));

  public static final StatisticType TALKED_TO_VILLAGER = new StatisticType(NamespaceID.from("minecraft:talked_to_villager"));

  public static final StatisticType TRADED_WITH_VILLAGER = new StatisticType(NamespaceID.from("minecraft:traded_with_villager"));

  public static final StatisticType EAT_CAKE_SLICE = new StatisticType(NamespaceID.from("minecraft:eat_cake_slice"));

  public static final StatisticType FILL_CAULDRON = new StatisticType(NamespaceID.from("minecraft:fill_cauldron"));

  public static final StatisticType USE_CAULDRON = new StatisticType(NamespaceID.from("minecraft:use_cauldron"));

  public static final StatisticType CLEAN_ARMOR = new StatisticType(NamespaceID.from("minecraft:clean_armor"));

  public static final StatisticType CLEAN_BANNER = new StatisticType(NamespaceID.from("minecraft:clean_banner"));

  public static final StatisticType CLEAN_SHULKER_BOX = new StatisticType(NamespaceID.from("minecraft:clean_shulker_box"));

  public static final StatisticType INTERACT_WITH_BREWINGSTAND = new StatisticType(NamespaceID.from("minecraft:interact_with_brewingstand"));

  public static final StatisticType INTERACT_WITH_BEACON = new StatisticType(NamespaceID.from("minecraft:interact_with_beacon"));

  public static final StatisticType INSPECT_DROPPER = new StatisticType(NamespaceID.from("minecraft:inspect_dropper"));

  public static final StatisticType INSPECT_HOPPER = new StatisticType(NamespaceID.from("minecraft:inspect_hopper"));

  public static final StatisticType INSPECT_DISPENSER = new StatisticType(NamespaceID.from("minecraft:inspect_dispenser"));

  public static final StatisticType PLAY_NOTEBLOCK = new StatisticType(NamespaceID.from("minecraft:play_noteblock"));

  public static final StatisticType TUNE_NOTEBLOCK = new StatisticType(NamespaceID.from("minecraft:tune_noteblock"));

  public static final StatisticType POT_FLOWER = new StatisticType(NamespaceID.from("minecraft:pot_flower"));

  public static final StatisticType TRIGGER_TRAPPED_CHEST = new StatisticType(NamespaceID.from("minecraft:trigger_trapped_chest"));

  public static final StatisticType OPEN_ENDERCHEST = new StatisticType(NamespaceID.from("minecraft:open_enderchest"));

  public static final StatisticType ENCHANT_ITEM = new StatisticType(NamespaceID.from("minecraft:enchant_item"));

  public static final StatisticType PLAY_RECORD = new StatisticType(NamespaceID.from("minecraft:play_record"));

  public static final StatisticType INTERACT_WITH_FURNACE = new StatisticType(NamespaceID.from("minecraft:interact_with_furnace"));

  public static final StatisticType INTERACT_WITH_CRAFTING_TABLE = new StatisticType(NamespaceID.from("minecraft:interact_with_crafting_table"));

  public static final StatisticType OPEN_CHEST = new StatisticType(NamespaceID.from("minecraft:open_chest"));

  public static final StatisticType SLEEP_IN_BED = new StatisticType(NamespaceID.from("minecraft:sleep_in_bed"));

  public static final StatisticType OPEN_SHULKER_BOX = new StatisticType(NamespaceID.from("minecraft:open_shulker_box"));

  public static final StatisticType OPEN_BARREL = new StatisticType(NamespaceID.from("minecraft:open_barrel"));

  public static final StatisticType INTERACT_WITH_BLAST_FURNACE = new StatisticType(NamespaceID.from("minecraft:interact_with_blast_furnace"));

  public static final StatisticType INTERACT_WITH_SMOKER = new StatisticType(NamespaceID.from("minecraft:interact_with_smoker"));

  public static final StatisticType INTERACT_WITH_LECTERN = new StatisticType(NamespaceID.from("minecraft:interact_with_lectern"));

  public static final StatisticType INTERACT_WITH_CAMPFIRE = new StatisticType(NamespaceID.from("minecraft:interact_with_campfire"));

  public static final StatisticType INTERACT_WITH_CARTOGRAPHY_TABLE = new StatisticType(NamespaceID.from("minecraft:interact_with_cartography_table"));

  public static final StatisticType INTERACT_WITH_LOOM = new StatisticType(NamespaceID.from("minecraft:interact_with_loom"));

  public static final StatisticType INTERACT_WITH_STONECUTTER = new StatisticType(NamespaceID.from("minecraft:interact_with_stonecutter"));

  public static final StatisticType BELL_RING = new StatisticType(NamespaceID.from("minecraft:bell_ring"));

  public static final StatisticType RAID_TRIGGER = new StatisticType(NamespaceID.from("minecraft:raid_trigger"));

  public static final StatisticType RAID_WIN = new StatisticType(NamespaceID.from("minecraft:raid_win"));

  public static final StatisticType INTERACT_WITH_ANVIL = new StatisticType(NamespaceID.from("minecraft:interact_with_anvil"));

  public static final StatisticType INTERACT_WITH_GRINDSTONE = new StatisticType(NamespaceID.from("minecraft:interact_with_grindstone"));

  public static final StatisticType TARGET_HIT = new StatisticType(NamespaceID.from("minecraft:target_hit"));

  public static final StatisticType INTERACT_WITH_SMITHING_TABLE = new StatisticType(NamespaceID.from("minecraft:interact_with_smithing_table"));

  static {
    Registries.registerStatisticType(LEAVE_GAME);
    Registries.registerStatisticType(PLAY_ONE_MINUTE);
    Registries.registerStatisticType(TIME_SINCE_DEATH);
    Registries.registerStatisticType(TIME_SINCE_REST);
    Registries.registerStatisticType(CROUCH_TIME);
    Registries.registerStatisticType(WALK_ONE_CM);
    Registries.registerStatisticType(CROUCH_ONE_CM);
    Registries.registerStatisticType(SPRINT_ONE_CM);
    Registries.registerStatisticType(WALK_ON_WATER_ONE_CM);
    Registries.registerStatisticType(FALL_ONE_CM);
    Registries.registerStatisticType(CLIMB_ONE_CM);
    Registries.registerStatisticType(FLY_ONE_CM);
    Registries.registerStatisticType(WALK_UNDER_WATER_ONE_CM);
    Registries.registerStatisticType(MINECART_ONE_CM);
    Registries.registerStatisticType(BOAT_ONE_CM);
    Registries.registerStatisticType(PIG_ONE_CM);
    Registries.registerStatisticType(HORSE_ONE_CM);
    Registries.registerStatisticType(AVIATE_ONE_CM);
    Registries.registerStatisticType(SWIM_ONE_CM);
    Registries.registerStatisticType(STRIDER_ONE_CM);
    Registries.registerStatisticType(JUMP);
    Registries.registerStatisticType(DROP);
    Registries.registerStatisticType(DAMAGE_DEALT);
    Registries.registerStatisticType(DAMAGE_DEALT_ABSORBED);
    Registries.registerStatisticType(DAMAGE_DEALT_RESISTED);
    Registries.registerStatisticType(DAMAGE_TAKEN);
    Registries.registerStatisticType(DAMAGE_BLOCKED_BY_SHIELD);
    Registries.registerStatisticType(DAMAGE_ABSORBED);
    Registries.registerStatisticType(DAMAGE_RESISTED);
    Registries.registerStatisticType(DEATHS);
    Registries.registerStatisticType(MOB_KILLS);
    Registries.registerStatisticType(ANIMALS_BRED);
    Registries.registerStatisticType(PLAYER_KILLS);
    Registries.registerStatisticType(FISH_CAUGHT);
    Registries.registerStatisticType(TALKED_TO_VILLAGER);
    Registries.registerStatisticType(TRADED_WITH_VILLAGER);
    Registries.registerStatisticType(EAT_CAKE_SLICE);
    Registries.registerStatisticType(FILL_CAULDRON);
    Registries.registerStatisticType(USE_CAULDRON);
    Registries.registerStatisticType(CLEAN_ARMOR);
    Registries.registerStatisticType(CLEAN_BANNER);
    Registries.registerStatisticType(CLEAN_SHULKER_BOX);
    Registries.registerStatisticType(INTERACT_WITH_BREWINGSTAND);
    Registries.registerStatisticType(INTERACT_WITH_BEACON);
    Registries.registerStatisticType(INSPECT_DROPPER);
    Registries.registerStatisticType(INSPECT_HOPPER);
    Registries.registerStatisticType(INSPECT_DISPENSER);
    Registries.registerStatisticType(PLAY_NOTEBLOCK);
    Registries.registerStatisticType(TUNE_NOTEBLOCK);
    Registries.registerStatisticType(POT_FLOWER);
    Registries.registerStatisticType(TRIGGER_TRAPPED_CHEST);
    Registries.registerStatisticType(OPEN_ENDERCHEST);
    Registries.registerStatisticType(ENCHANT_ITEM);
    Registries.registerStatisticType(PLAY_RECORD);
    Registries.registerStatisticType(INTERACT_WITH_FURNACE);
    Registries.registerStatisticType(INTERACT_WITH_CRAFTING_TABLE);
    Registries.registerStatisticType(OPEN_CHEST);
    Registries.registerStatisticType(SLEEP_IN_BED);
    Registries.registerStatisticType(OPEN_SHULKER_BOX);
    Registries.registerStatisticType(OPEN_BARREL);
    Registries.registerStatisticType(INTERACT_WITH_BLAST_FURNACE);
    Registries.registerStatisticType(INTERACT_WITH_SMOKER);
    Registries.registerStatisticType(INTERACT_WITH_LECTERN);
    Registries.registerStatisticType(INTERACT_WITH_CAMPFIRE);
    Registries.registerStatisticType(INTERACT_WITH_CARTOGRAPHY_TABLE);
    Registries.registerStatisticType(INTERACT_WITH_LOOM);
    Registries.registerStatisticType(INTERACT_WITH_STONECUTTER);
    Registries.registerStatisticType(BELL_RING);
    Registries.registerStatisticType(RAID_TRIGGER);
    Registries.registerStatisticType(RAID_WIN);
    Registries.registerStatisticType(INTERACT_WITH_ANVIL);
    Registries.registerStatisticType(INTERACT_WITH_GRINDSTONE);
    Registries.registerStatisticType(TARGET_HIT);
    Registries.registerStatisticType(INTERACT_WITH_SMITHING_TABLE);
  }

  @NotNull
  private final NamespaceID id;

  protected StatisticType(@NotNull NamespaceID id) {
    this.id = id;
  }

  @Override
  @NotNull
  public Key key() {
    return this.id;
  }

  @NotNull
  public NamespaceID getId() {
    return this.id;
  }

  public int getNumericalId() {
    return Registries.getStatisticTypeId(this);
  }

  @Nullable
  public static StatisticType fromId(int id) {
    return Registries.getStatisticType(id);
  }

  @NotNull
  public static List<StatisticType> values() {
    return Registries.getStatisticTypes();
  }
}
