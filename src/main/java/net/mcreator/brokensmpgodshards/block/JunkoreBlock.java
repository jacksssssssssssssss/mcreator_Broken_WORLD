
package net.mcreator.brokensmpgodshards.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class JunkoreBlock extends FallingBlock {
	public JunkoreBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1.35f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}