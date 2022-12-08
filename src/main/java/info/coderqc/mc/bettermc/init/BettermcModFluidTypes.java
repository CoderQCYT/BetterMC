
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import info.coderqc.mc.bettermc.fluid.types.MilkFluidType;
import info.coderqc.mc.bettermc.fluid.types.AcidFluidType;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BettermcMod.MODID);
	public static final RegistryObject<FluidType> MILK_TYPE = REGISTRY.register("milk", () -> new MilkFluidType());
	public static final RegistryObject<FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
