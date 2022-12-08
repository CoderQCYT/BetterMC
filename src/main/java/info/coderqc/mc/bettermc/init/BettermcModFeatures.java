
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import info.coderqc.mc.bettermc.world.features.plants.GeraniumFeature;
import info.coderqc.mc.bettermc.world.features.ores.RockFeature;
import info.coderqc.mc.bettermc.world.features.ores.PlatinumOreFeature;
import info.coderqc.mc.bettermc.world.features.ores.AmberOreFeature;
import info.coderqc.mc.bettermc.world.features.lakes.AcidFeature;
import info.coderqc.mc.bettermc.world.features.DouglasFirTreeFeature;
import info.coderqc.mc.bettermc.world.features.BaobabTreeFeature;
import info.coderqc.mc.bettermc.BettermcMod;

@Mod.EventBusSubscriber
public class BettermcModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BettermcMod.MODID);
	public static final RegistryObject<Feature<?>> DOUGLAS_FIR_TREE = REGISTRY.register("douglas_fir_tree", DouglasFirTreeFeature::feature);
	public static final RegistryObject<Feature<?>> BAOBAB_TREE = REGISTRY.register("baobab_tree", BaobabTreeFeature::feature);
	public static final RegistryObject<Feature<?>> AMBER_ORE = REGISTRY.register("amber_ore", AmberOreFeature::feature);
	public static final RegistryObject<Feature<?>> ROCK = REGISTRY.register("rock", RockFeature::feature);
	public static final RegistryObject<Feature<?>> ACID = REGISTRY.register("acid", AcidFeature::feature);
	public static final RegistryObject<Feature<?>> GERANIUM = REGISTRY.register("geranium", GeraniumFeature::feature);
	public static final RegistryObject<Feature<?>> PLATINUM_ORE = REGISTRY.register("platinum_ore", PlatinumOreFeature::feature);
}
