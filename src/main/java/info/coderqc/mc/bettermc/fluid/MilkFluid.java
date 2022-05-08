
package info.coderqc.mc.bettermc.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import info.coderqc.mc.bettermc.init.BettermcModItems;
import info.coderqc.mc.bettermc.init.BettermcModFluids;
import info.coderqc.mc.bettermc.init.BettermcModBlocks;

public abstract class MilkFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BettermcModFluids.MILK,
			BettermcModFluids.FLOWING_MILK,
			FluidAttributes.builder(new ResourceLocation("bettermc:blocks/milk"), new ResourceLocation("bettermc:blocks/milk"))

	).explosionResistance(100f)

			.bucket(BettermcModItems.MILK_BUCKET).block(() -> (LiquidBlock) BettermcModBlocks.MILK.get());

	private MilkFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MilkFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MilkFluid {
		public Flowing() {
			super();
		}

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
