
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
import info.coderqc.mc.bettermc.block.DouglasFirWoodBlock;
import info.coderqc.mc.bettermc.block.DouglasFirStairsBlock;
import info.coderqc.mc.bettermc.block.DouglasFirSlabBlock;
import info.coderqc.mc.bettermc.block.DouglasFirPressurePlateBlock;
import info.coderqc.mc.bettermc.block.DouglasFirPlanksBlock;
import info.coderqc.mc.bettermc.block.DouglasFirLogBlock;
import info.coderqc.mc.bettermc.block.DouglasFirLeavesBlock;
import info.coderqc.mc.bettermc.block.DouglasFirFenceGateBlock;
import info.coderqc.mc.bettermc.block.DouglasFirFenceBlock;
import info.coderqc.mc.bettermc.block.DouglasFirButtonBlock;
import info.coderqc.mc.bettermc.block.BaobabWoodBlock;
import info.coderqc.mc.bettermc.block.BaobabStairsBlock;
import info.coderqc.mc.bettermc.block.BaobabSlabBlock;
import info.coderqc.mc.bettermc.block.BaobabPressurePlateBlock;
import info.coderqc.mc.bettermc.block.BaobabPlanksBlock;
import info.coderqc.mc.bettermc.block.BaobabLogBlock;
import info.coderqc.mc.bettermc.block.BaobabLeavesBlock;
import info.coderqc.mc.bettermc.block.BaobabFenceGateBlock;
import info.coderqc.mc.bettermc.block.BaobabFenceBlock;
import info.coderqc.mc.bettermc.block.BaobabButtonBlock;
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
	public static final RegistryObject<Block> DOUGLAS_FIR_WOOD = REGISTRY.register("douglas_fir_wood", () -> new DouglasFirWoodBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_LOG = REGISTRY.register("douglas_fir_log", () -> new DouglasFirLogBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_PLANKS = REGISTRY.register("douglas_fir_planks", () -> new DouglasFirPlanksBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_LEAVES = REGISTRY.register("douglas_fir_leaves", () -> new DouglasFirLeavesBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_STAIRS = REGISTRY.register("douglas_fir_stairs", () -> new DouglasFirStairsBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_SLAB = REGISTRY.register("douglas_fir_slab", () -> new DouglasFirSlabBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_FENCE = REGISTRY.register("douglas_fir_fence", () -> new DouglasFirFenceBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_FENCE_GATE = REGISTRY.register("douglas_fir_fence_gate",
			() -> new DouglasFirFenceGateBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_PRESSURE_PLATE = REGISTRY.register("douglas_fir_pressure_plate",
			() -> new DouglasFirPressurePlateBlock());
	public static final RegistryObject<Block> DOUGLAS_FIR_BUTTON = REGISTRY.register("douglas_fir_button", () -> new DouglasFirButtonBlock());
	public static final RegistryObject<Block> BAOBAB_WOOD = REGISTRY.register("baobab_wood", () -> new BaobabWoodBlock());
	public static final RegistryObject<Block> BAOBAB_LOG = REGISTRY.register("baobab_log", () -> new BaobabLogBlock());
	public static final RegistryObject<Block> BAOBAB_PLANKS = REGISTRY.register("baobab_planks", () -> new BaobabPlanksBlock());
	public static final RegistryObject<Block> BAOBAB_LEAVES = REGISTRY.register("baobab_leaves", () -> new BaobabLeavesBlock());
	public static final RegistryObject<Block> BAOBAB_STAIRS = REGISTRY.register("baobab_stairs", () -> new BaobabStairsBlock());
	public static final RegistryObject<Block> BAOBAB_SLAB = REGISTRY.register("baobab_slab", () -> new BaobabSlabBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE = REGISTRY.register("baobab_fence", () -> new BaobabFenceBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE_GATE = REGISTRY.register("baobab_fence_gate", () -> new BaobabFenceGateBlock());
	public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = REGISTRY.register("baobab_pressure_plate",
			() -> new BaobabPressurePlateBlock());
	public static final RegistryObject<Block> BAOBAB_BUTTON = REGISTRY.register("baobab_button", () -> new BaobabButtonBlock());
}
