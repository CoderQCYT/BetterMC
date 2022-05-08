
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
