
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import info.coderqc.mc.bettermc.block.EucalyptusWoodBlock;
import info.coderqc.mc.bettermc.block.EucalyptusStairsBlock;
import info.coderqc.mc.bettermc.block.EucalyptusSlabBlock;
import info.coderqc.mc.bettermc.block.EucalyptusPressurePlateBlock;
import info.coderqc.mc.bettermc.block.EucalyptusPlanksBlock;
import info.coderqc.mc.bettermc.block.EucalyptusLogBlock;
import info.coderqc.mc.bettermc.block.EucalyptusLeavesBlock;
import info.coderqc.mc.bettermc.block.EucalyptusFenceGateBlock;
import info.coderqc.mc.bettermc.block.EucalyptusFenceBlock;
import info.coderqc.mc.bettermc.block.EucalyptusButtonBlock;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BettermcMod.MODID);
	public static final RegistryObject<Block> EUCALYPTUS_WOOD = REGISTRY.register("eucalyptus_wood", () -> new EucalyptusWoodBlock());
	public static final RegistryObject<Block> EUCALYPTUS_LOG = REGISTRY.register("eucalyptus_log", () -> new EucalyptusLogBlock());
	public static final RegistryObject<Block> EUCALYPTUS_PLANKS = REGISTRY.register("eucalyptus_planks", () -> new EucalyptusPlanksBlock());
	public static final RegistryObject<Block> EUCALYPTUS_LEAVES = REGISTRY.register("eucalyptus_leaves", () -> new EucalyptusLeavesBlock());
	public static final RegistryObject<Block> EUCALYPTUS_STAIRS = REGISTRY.register("eucalyptus_stairs", () -> new EucalyptusStairsBlock());
	public static final RegistryObject<Block> EUCALYPTUS_SLAB = REGISTRY.register("eucalyptus_slab", () -> new EucalyptusSlabBlock());
	public static final RegistryObject<Block> EUCALYPTUS_FENCE = REGISTRY.register("eucalyptus_fence", () -> new EucalyptusFenceBlock());
	public static final RegistryObject<Block> EUCALYPTUS_FENCE_GATE = REGISTRY.register("eucalyptus_fence_gate",
			() -> new EucalyptusFenceGateBlock());
	public static final RegistryObject<Block> EUCALYPTUS_PRESSURE_PLATE = REGISTRY.register("eucalyptus_pressure_plate",
			() -> new EucalyptusPressurePlateBlock());
	public static final RegistryObject<Block> EUCALYPTUS_BUTTON = REGISTRY.register("eucalyptus_button", () -> new EucalyptusButtonBlock());
}
