
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

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
	public static final RegistryObject<Item> EMERALDZ_PICKAXE = REGISTRY.register("emeraldz_pickaxe", () -> new EmeraldzPickaxeItem());
	public static final RegistryObject<Item> EMERALDZ_AXE = REGISTRY.register("emeraldz_axe", () -> new EmeraldzAxeItem());
	public static final RegistryObject<Item> EMERALDZ_SWORD = REGISTRY.register("emeraldz_sword", () -> new EmeraldzSwordItem());
	public static final RegistryObject<Item> EMERALDZ_SHOVEL = REGISTRY.register("emeraldz_shovel", () -> new EmeraldzShovelItem());
	public static final RegistryObject<Item> EMERALDZ_HOE = REGISTRY.register("emeraldz_hoe", () -> new EmeraldzHoeItem());
	public static final RegistryObject<Item> EMERALDZ_ARMOR_HELMET = REGISTRY.register("emeraldz_armor_helmet", () -> new EmeraldzArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALDZ_ARMOR_CHESTPLATE = REGISTRY.register("emeraldz_armor_chestplate",
			() -> new EmeraldzArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALDZ_ARMOR_LEGGINGS = REGISTRY.register("emeraldz_armor_leggings",
			() -> new EmeraldzArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALDZ_ARMOR_BOOTS = REGISTRY.register("emeraldz_armor_boots", () -> new EmeraldzArmorItem.Boots());
}
