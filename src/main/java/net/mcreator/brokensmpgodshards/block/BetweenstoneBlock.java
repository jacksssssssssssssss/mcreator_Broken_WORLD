
package net.mcreator.brokensmpgodshards.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BetweenstoneBlock extends Block {
	public BetweenstoneBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(3.45f, 6.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}