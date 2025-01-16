
package net.mcreator.brokensmpgodshards.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GrassbetweenBlock extends Block {
	public GrassbetweenBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE).sound(SoundType.GRAVEL).strength(0.5f, 10f).lightLevel(s -> 2).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, BrokenSmpGodShardsModBlocks.GRASSBETWEEN.get());
	}
}