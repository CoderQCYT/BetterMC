
package info.coderqc.mc.bettermc.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VerticalDarkoakSlabBlock extends Block {

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public VerticalDarkoakSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));

		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return box(0, 0, 0, 16, 16, 8)

						.move(offset.x, offset.y, offset.z);
			case NORTH :
				return box(0, 0, 8, 16, 16, 16)

						.move(offset.x, offset.y, offset.z);
			case EAST :
				return box(0, 0, 0, 8, 16, 16)

						.move(offset.x, offset.y, offset.z);
			case WEST :
				return box(8, 0, 0, 16, 16, 16)

						.move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BettermcModBlocks.VERTICAL_DARKOAK_SLAB.get(), renderType -> renderType == RenderType.cutout());
	}

}
