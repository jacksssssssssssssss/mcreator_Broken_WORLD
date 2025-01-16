
package net.mcreator.brokensmpgodshards.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BetweenBlockBlock extends SlabBlock {
	public BetweenBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).strength(1.75f, 10f));
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		BetweenBlockEntityCollidesInTheBlockProcedure.execute(entity);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		BetweenBlockEntityCollidesInTheBlockProcedure.execute(entity);
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		BetweenBlockEntityCollidesInTheBlockProcedure.execute(entity);
	}
}