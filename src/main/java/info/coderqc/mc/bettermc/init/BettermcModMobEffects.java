
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import info.coderqc.mc.bettermc.potion.NonexistentMobEffect;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BettermcMod.MODID);
	public static final RegistryObject<MobEffect> NONEXISTENT = REGISTRY.register("nonexistent", () -> new NonexistentMobEffect());
}
