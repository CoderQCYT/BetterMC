
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import info.coderqc.mc.bettermc.block.entity.UsableFletchingTableBlockEntity;
import info.coderqc.mc.bettermc.BettermcMod;

public class BettermcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BettermcMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> USABLE_FLETCHING_TABLE = register("usable_fletching_table",
			BettermcModBlocks.USABLE_FLETCHING_TABLE, UsableFletchingTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
