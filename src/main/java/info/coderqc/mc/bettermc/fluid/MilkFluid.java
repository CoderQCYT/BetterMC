
package info.coderqc.mc.bettermc.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import info.coderqc.mc.bettermc.init.BettermcModItems;
import info.coderqc.mc.bettermc.init.BettermcModFluids;
import info.coderqc.mc.bettermc.init.BettermcModFluidTypes;
import info.coderqc.mc.bettermc.init.BettermcModBlocks;

public abstract class MilkFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BettermcModFluidTypes.MILK_TYPE.get(),
			() -> BettermcModFluids.MILK.get(), () -> BettermcModFluids.FLOWING_MILK.get()).explosionResistance(100f)
			.bucket(() -> BettermcModItems.MILK_BUCKET.get()).block(() -> (LiquidBlock) BettermcModBlocks.MILK.get());

	private MilkFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MilkFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MilkFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
