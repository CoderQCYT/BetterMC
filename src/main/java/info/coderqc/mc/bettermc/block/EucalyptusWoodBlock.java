
package info.coderqc.mc.bettermc.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EucalyptusWoodBlock extends Block {

	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

	public EucalyptusWoodBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1.9982f, 1.998559870353321f).requiresCorrectToolForDrops());

		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AXIS);
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
			if ((Direction.Axis) state.getValue(AXIS) == Direction.Axis.X) {
				return state.setValue(AXIS, Direction.Axis.Z);
			} else if ((Direction.Axis) state.getValue(AXIS) == Direction.Axis.Z) {
				return state.setValue(AXIS, Direction.Axis.X);
			}
		}
		return state;
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction.Axis axis = context.getClickedFace().getAxis();;
		return this.defaultBlockState().setValue(AXIS, axis);
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
