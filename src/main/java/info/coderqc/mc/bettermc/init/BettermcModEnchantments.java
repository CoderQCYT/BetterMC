
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import info.coderqc.mc.bettermc.enchantment.VoidStrikeEnchantment;
import info.coderqc.mc.bettermc.enchantment.PowerCurseEnchantment;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BettermcMod.MODID);
	public static final RegistryObject<Enchantment> POWER_CURSE = REGISTRY.register("power_curse", () -> new PowerCurseEnchantment());
	public static final RegistryObject<Enchantment> VOID_STRIKE = REGISTRY.register("void_strike", () -> new VoidStrikeEnchantment());
}
