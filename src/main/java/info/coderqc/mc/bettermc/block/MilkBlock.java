
package info.coderqc.mc.bettermc.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MilkBlock extends LiquidBlock {
	public MilkBlock() {
		super(() -> (FlowingFluid) BettermcModFluids.MILK.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}