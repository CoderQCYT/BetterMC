
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BettermcMod.MODID);
	public static final RegistryObject<Potion> LEVITATION = REGISTRY.register("levitation",
			() -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 3600, 1, false, true)));
}
