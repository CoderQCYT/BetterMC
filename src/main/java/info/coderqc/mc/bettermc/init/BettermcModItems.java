
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import info.coderqc.mc.bettermc.item.ShadowSwordItem;
import info.coderqc.mc.bettermc.item.ShadowShovelItem;
import info.coderqc.mc.bettermc.item.ShadowPickaxeItem;
import info.coderqc.mc.bettermc.item.ShadowIngotItem;
import info.coderqc.mc.bettermc.item.ShadowHoeItem;
import info.coderqc.mc.bettermc.item.ShadowAxeItem;
import info.coderqc.mc.bettermc.item.ShadowArmorItem;
import info.coderqc.mc.bettermc.item.PowerBowItem;
import info.coderqc.mc.bettermc.item.PlatinumSwordItem;
import info.coderqc.mc.bettermc.item.PlatinumShovelItem;
import info.coderqc.mc.bettermc.item.PlatinumPickaxeItem;
import info.coderqc.mc.bettermc.item.PlatinumIngotItem;
import info.coderqc.mc.bettermc.item.PlatinumHoeItem;
import info.coderqc.mc.bettermc.item.PlatinumAxeItem;
import info.coderqc.mc.bettermc.item.PlatinumArmorItem;
import info.coderqc.mc.bettermc.item.ObsidianSwordItem;
import info.coderqc.mc.bettermc.item.ObsidianShovelItem;
import info.coderqc.mc.bettermc.item.ObsidianPickaxeItem;
import info.coderqc.mc.bettermc.item.ObsidianHoeItem;
import info.coderqc.mc.bettermc.item.ObsidianAxeItem;
import info.coderqc.mc.bettermc.item.ObsidianArmorItem;
import info.coderqc.mc.bettermc.item.MilkItem;
import info.coderqc.mc.bettermc.item.EmeraldzSwordItem;
import info.coderqc.mc.bettermc.item.EmeraldzShovelItem;
import info.coderqc.mc.bettermc.item.EmeraldzPickaxeItem;
import info.coderqc.mc.bettermc.item.EmeraldzHoeItem;
import info.coderqc.mc.bettermc.item.EmeraldzAxeItem;
import info.coderqc.mc.bettermc.item.EmeraldzArmorItem;
import info.coderqc.mc.bettermc.item.CopperSwordItem;
import info.coderqc.mc.bettermc.item.CopperShovelItem;
import info.coderqc.mc.bettermc.item.CopperPickaxeItem;
import info.coderqc.mc.bettermc.item.CopperHoeItem;
import info.coderqc.mc.bettermc.item.CopperAxeItem;
import info.coderqc.mc.bettermc.item.CopperArmorItem;
import info.coderqc.mc.bettermc.item.CoconutItem;
import info.coderqc.mc.bettermc.item.BeansItem;
import info.coderqc.mc.bettermc.item.AmethystSwordItem;
import info.coderqc.mc.bettermc.item.AmethystShovelItem;
import info.coderqc.mc.bettermc.item.AmethystPickaxeItem;
import info.coderqc.mc.bettermc.item.AmethystHoeItem;
import info.coderqc.mc.bettermc.item.AmethystAxeItem;
import info.coderqc.mc.bettermc.item.AmethystArmorItem;
import info.coderqc.mc.bettermc.item.AmberSwordItem;
import info.coderqc.mc.bettermc.item.AmberShovelItem;
import info.coderqc.mc.bettermc.item.AmberPickaxeItem;
import info.coderqc.mc.bettermc.item.AmberItem;
import info.coderqc.mc.bettermc.item.AmberHoeItem;
import info.coderqc.mc.bettermc.item.AmberAxeItem;
import info.coderqc.mc.bettermc.item.AmberArmorItem;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BettermcMod.MODID);
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate",
			() -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", () -> new EmeraldzPickaxeItem());
	public static final RegistryObject<Item> EMERALD_AXE = REGISTRY.register("emerald_axe", () -> new EmeraldzAxeItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldzSwordItem());
	public static final RegistryObject<Item> EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", () -> new EmeraldzShovelItem());
	public static final RegistryObject<Item> EMERALD_HOE = REGISTRY.register("emerald_hoe", () -> new EmeraldzHoeItem());
	public static final RegistryObject<Item> EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", () -> new EmeraldzArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate",
			() -> new EmeraldzArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings",
			() -> new EmeraldzArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", () -> new EmeraldzArmorItem.Boots());
	public static final RegistryObject<Item> AMETHYST_PICKAXE = REGISTRY.register("amethyst_pickaxe", () -> new AmethystPickaxeItem());
	public static final RegistryObject<Item> AMETHYST_AXE = REGISTRY.register("amethyst_axe", () -> new AmethystAxeItem());
	public static final RegistryObject<Item> AMETHYST_SWORD = REGISTRY.register("amethyst_sword", () -> new AmethystSwordItem());
	public static final RegistryObject<Item> AMETHYST_SHOVEL = REGISTRY.register("amethyst_shovel", () -> new AmethystShovelItem());
	public static final RegistryObject<Item> AMETHYST_HOE = REGISTRY.register("amethyst_hoe", () -> new AmethystHoeItem());
	public static final RegistryObject<Item> AMETHYST_ARMOR_HELMET = REGISTRY.register("amethyst_armor_helmet", () -> new AmethystArmorItem.Helmet());
	public static final RegistryObject<Item> AMETHYST_ARMOR_CHESTPLATE = REGISTRY.register("amethyst_armor_chestplate",
			() -> new AmethystArmorItem.Chestplate());
	public static final RegistryObject<Item> AMETHYST_ARMOR_LEGGINGS = REGISTRY.register("amethyst_armor_leggings",
			() -> new AmethystArmorItem.Leggings());
	public static final RegistryObject<Item> AMETHYST_ARMOR_BOOTS = REGISTRY.register("amethyst_armor_boots", () -> new AmethystArmorItem.Boots());
	public static final RegistryObject<Item> BEANS = REGISTRY.register("beans", () -> new BeansItem());
	public static final RegistryObject<Item> COCONUT = REGISTRY.register("coconut", () -> new CoconutItem());
	public static final RegistryObject<Item> EUCALYPTUS_WOOD = block(BettermcModBlocks.EUCALYPTUS_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EUCALYPTUS_LOG = block(BettermcModBlocks.EUCALYPTUS_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EUCALYPTUS_PLANKS = block(BettermcModBlocks.EUCALYPTUS_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EUCALYPTUS_LEAVES = block(BettermcModBlocks.EUCALYPTUS_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> EUCALYPTUS_STAIRS = block(BettermcModBlocks.EUCALYPTUS_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EUCALYPTUS_SLAB = block(BettermcModBlocks.EUCALYPTUS_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EUCALYPTUS_FENCE = block(BettermcModBlocks.EUCALYPTUS_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> EUCALYPTUS_FENCE_GATE = block(BettermcModBlocks.EUCALYPTUS_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> EUCALYPTUS_PRESSURE_PLATE = block(BettermcModBlocks.EUCALYPTUS_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> EUCALYPTUS_BUTTON = block(BettermcModBlocks.EUCALYPTUS_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUGLAS_FIR_WOOD = block(BettermcModBlocks.DOUGLAS_FIR_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUGLAS_FIR_LOG = block(BettermcModBlocks.DOUGLAS_FIR_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS = block(BettermcModBlocks.DOUGLAS_FIR_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUGLAS_FIR_LEAVES = block(BettermcModBlocks.DOUGLAS_FIR_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DOUGLAS_FIR_STAIRS = block(BettermcModBlocks.DOUGLAS_FIR_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUGLAS_FIR_SLAB = block(BettermcModBlocks.DOUGLAS_FIR_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUGLAS_FIR_FENCE = block(BettermcModBlocks.DOUGLAS_FIR_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DOUGLAS_FIR_FENCE_GATE = block(BettermcModBlocks.DOUGLAS_FIR_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> DOUGLAS_FIR_PRESSURE_PLATE = block(BettermcModBlocks.DOUGLAS_FIR_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> DOUGLAS_FIR_BUTTON = block(BettermcModBlocks.DOUGLAS_FIR_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_WOOD = block(BettermcModBlocks.BAOBAB_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_LOG = block(BettermcModBlocks.BAOBAB_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_PLANKS = block(BettermcModBlocks.BAOBAB_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_LEAVES = block(BettermcModBlocks.BAOBAB_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAOBAB_STAIRS = block(BettermcModBlocks.BAOBAB_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_SLAB = block(BettermcModBlocks.BAOBAB_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAOBAB_FENCE = block(BettermcModBlocks.BAOBAB_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAOBAB_FENCE_GATE = block(BettermcModBlocks.BAOBAB_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAOBAB_PRESSURE_PLATE = block(BettermcModBlocks.BAOBAB_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAOBAB_BUTTON = block(BettermcModBlocks.BAOBAB_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WILLOW_WOOD = block(BettermcModBlocks.WILLOW_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WILLOW_LOG = block(BettermcModBlocks.WILLOW_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WILLOW_PLANKS = block(BettermcModBlocks.WILLOW_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WILLOW_LEAVES = block(BettermcModBlocks.WILLOW_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WILLOW_STAIRS = block(BettermcModBlocks.WILLOW_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WILLOW_SLAB = block(BettermcModBlocks.WILLOW_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WILLOW_FENCE = block(BettermcModBlocks.WILLOW_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WILLOW_FENCE_GATE = block(BettermcModBlocks.WILLOW_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> WILLOW_PRESSURE_PLATE = block(BettermcModBlocks.WILLOW_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> WILLOW_BUTTON = block(BettermcModBlocks.WILLOW_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMBER = REGISTRY.register("amber", () -> new AmberItem());
	public static final RegistryObject<Item> AMBER_ORE = block(BettermcModBlocks.AMBER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMBER_BLOCK = block(BettermcModBlocks.AMBER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMBER_PICKAXE = REGISTRY.register("amber_pickaxe", () -> new AmberPickaxeItem());
	public static final RegistryObject<Item> AMBER_AXE = REGISTRY.register("amber_axe", () -> new AmberAxeItem());
	public static final RegistryObject<Item> AMBER_SWORD = REGISTRY.register("amber_sword", () -> new AmberSwordItem());
	public static final RegistryObject<Item> AMBER_SHOVEL = REGISTRY.register("amber_shovel", () -> new AmberShovelItem());
	public static final RegistryObject<Item> AMBER_HOE = REGISTRY.register("amber_hoe", () -> new AmberHoeItem());
	public static final RegistryObject<Item> AMBER_ARMOR_HELMET = REGISTRY.register("amber_armor_helmet", () -> new AmberArmorItem.Helmet());
	public static final RegistryObject<Item> AMBER_ARMOR_CHESTPLATE = REGISTRY.register("amber_armor_chestplate",
			() -> new AmberArmorItem.Chestplate());
	public static final RegistryObject<Item> AMBER_ARMOR_LEGGINGS = REGISTRY.register("amber_armor_leggings", () -> new AmberArmorItem.Leggings());
	public static final RegistryObject<Item> AMBER_ARMOR_BOOTS = REGISTRY.register("amber_armor_boots", () -> new AmberArmorItem.Boots());
	public static final RegistryObject<Item> SHADOW_INGOT = REGISTRY.register("shadow_ingot", () -> new ShadowIngotItem());
	public static final RegistryObject<Item> MILK_BUCKET = REGISTRY.register("milk_bucket", () -> new MilkItem());
	public static final RegistryObject<Item> ROCK = block(BettermcModBlocks.ROCK, CreativeModeTab.TAB_MATERIALS);
	public static final RegistryObject<Item> POWER_BOW = REGISTRY.register("power_bow", () -> new PowerBowItem());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_HELMET = REGISTRY.register("obsidian_armor_helmet", () -> new ObsidianArmorItem.Helmet());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_CHESTPLATE = REGISTRY.register("obsidian_armor_chestplate",
			() -> new ObsidianArmorItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_LEGGINGS = REGISTRY.register("obsidian_armor_leggings",
			() -> new ObsidianArmorItem.Leggings());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_BOOTS = REGISTRY.register("obsidian_armor_boots", () -> new ObsidianArmorItem.Boots());
	public static final RegistryObject<Item> RUSTED_WOOD = block(BettermcModBlocks.RUSTED_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTED_LOG = block(BettermcModBlocks.RUSTED_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTED_PLANKS = block(BettermcModBlocks.RUSTED_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTED_LEAVES = block(BettermcModBlocks.RUSTED_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RUSTED_STAIRS = block(BettermcModBlocks.RUSTED_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTED_SLAB = block(BettermcModBlocks.RUSTED_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTED_FENCE = block(BettermcModBlocks.RUSTED_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RUSTED_FENCE_GATE = block(BettermcModBlocks.RUSTED_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RUSTED_PRESSURE_PLATE = block(BettermcModBlocks.RUSTED_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RUSTED_BUTTON = block(BettermcModBlocks.RUSTED_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SHADOW_ARMOR_HELMET = REGISTRY.register("shadow_armor_helmet", () -> new ShadowArmorItem.Helmet());
	public static final RegistryObject<Item> SHADOW_ARMOR_CHESTPLATE = REGISTRY.register("shadow_armor_chestplate",
			() -> new ShadowArmorItem.Chestplate());
	public static final RegistryObject<Item> SHADOW_ARMOR_LEGGINGS = REGISTRY.register("shadow_armor_leggings", () -> new ShadowArmorItem.Leggings());
	public static final RegistryObject<Item> SHADOW_ARMOR_BOOTS = REGISTRY.register("shadow_armor_boots", () -> new ShadowArmorItem.Boots());
	public static final RegistryObject<Item> SHADOW_PICKAXE = REGISTRY.register("shadow_pickaxe", () -> new ShadowPickaxeItem());
	public static final RegistryObject<Item> SHADOW_AXE = REGISTRY.register("shadow_axe", () -> new ShadowAxeItem());
	public static final RegistryObject<Item> SHADOW_SWORD = REGISTRY.register("shadow_sword", () -> new ShadowSwordItem());
	public static final RegistryObject<Item> SHADOW_SHOVEL = REGISTRY.register("shadow_shovel", () -> new ShadowShovelItem());
	public static final RegistryObject<Item> SHADOW_HOE = REGISTRY.register("shadow_hoe", () -> new ShadowHoeItem());
	public static final RegistryObject<Item> TINTED_WOOD = block(BettermcModBlocks.TINTED_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TINTED_LOG = block(BettermcModBlocks.TINTED_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TINTED_PLANKS = block(BettermcModBlocks.TINTED_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TINTED_LEAVES = block(BettermcModBlocks.TINTED_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TINTED_STAIRS = block(BettermcModBlocks.TINTED_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TINTED_SLAB = block(BettermcModBlocks.TINTED_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TINTED_FENCE = block(BettermcModBlocks.TINTED_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TINTED_FENCE_GATE = block(BettermcModBlocks.TINTED_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TINTED_PRESSURE_PLATE = block(BettermcModBlocks.TINTED_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TINTED_BUTTON = block(BettermcModBlocks.TINTED_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_OAK_SLAB = block(BettermcModBlocks.VERTICAL_OAK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_SPRUCE_SLAB = block(BettermcModBlocks.VERTICAL_SPRUCE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_BIRCH_SLAB = block(BettermcModBlocks.VERTICAL_BIRCH_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_JUNGLE_SLAB = block(BettermcModBlocks.VERTICAL_JUNGLE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_ACACIA_SLAB = block(BettermcModBlocks.VERTICAL_ACACIA_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_DARKOAK_SLAB = block(BettermcModBlocks.VERTICAL_DARKOAK_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_CRIMSON_SLAB = block(BettermcModBlocks.VERTICAL_CRIMSON_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_WARPED_SLAB = block(BettermcModBlocks.VERTICAL_WARPED_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_BAOBAB_SLAB = block(BettermcModBlocks.VERTICAL_BAOBAB_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_DOUGLAS_FIR_SLAB = block(BettermcModBlocks.VERTICAL_DOUGLAS_FIR_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_EUCALYPTUS_SLAB = block(BettermcModBlocks.VERTICAL_EUCALYPTUS_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_WILLOW_SLAB = block(BettermcModBlocks.VERTICAL_WILLOW_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_TINTED_SLAB = block(BettermcModBlocks.VERTICAL_TINTED_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERTICAL_RUSTED_SLAB = block(BettermcModBlocks.VERTICAL_RUSTED_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GERANIUM = block(BettermcModBlocks.GERANIUM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", () -> new ObsidianPickaxeItem());
	public static final RegistryObject<Item> OBSIDIAN_AXE = REGISTRY.register("obsidian_axe", () -> new ObsidianAxeItem());
	public static final RegistryObject<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", () -> new ObsidianSwordItem());
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = REGISTRY.register("obsidian_shovel", () -> new ObsidianShovelItem());
	public static final RegistryObject<Item> OBSIDIAN_HOE = REGISTRY.register("obsidian_hoe", () -> new ObsidianHoeItem());
	public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
	public static final RegistryObject<Item> PLATINUM_ORE = block(BettermcModBlocks.PLATINUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLATINUM_BLOCK = block(BettermcModBlocks.PLATINUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLATINUM_PICKAXE = REGISTRY.register("platinum_pickaxe", () -> new PlatinumPickaxeItem());
	public static final RegistryObject<Item> PLATINUM_AXE = REGISTRY.register("platinum_axe", () -> new PlatinumAxeItem());
	public static final RegistryObject<Item> PLATINUM_SWORD = REGISTRY.register("platinum_sword", () -> new PlatinumSwordItem());
	public static final RegistryObject<Item> PLATINUM_SHOVEL = REGISTRY.register("platinum_shovel", () -> new PlatinumShovelItem());
	public static final RegistryObject<Item> PLATINUM_HOE = REGISTRY.register("platinum_hoe", () -> new PlatinumHoeItem());
	public static final RegistryObject<Item> PLATINUM_ARMOR_HELMET = REGISTRY.register("platinum_armor_helmet", () -> new PlatinumArmorItem.Helmet());
	public static final RegistryObject<Item> PLATINUM_ARMOR_CHESTPLATE = REGISTRY.register("platinum_armor_chestplate",
			() -> new PlatinumArmorItem.Chestplate());
	public static final RegistryObject<Item> PLATINUM_ARMOR_LEGGINGS = REGISTRY.register("platinum_armor_leggings",
			() -> new PlatinumArmorItem.Leggings());
	public static final RegistryObject<Item> PLATINUM_ARMOR_BOOTS = REGISTRY.register("platinum_armor_boots", () -> new PlatinumArmorItem.Boots());
	public static final RegistryObject<Item> BIRD = REGISTRY.register("bird_spawn_egg",
			() -> new ForgeSpawnEggItem(BettermcModEntities.BIRD, -26317, -39322, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
