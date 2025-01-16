
package net.mcreator.brokensmpgodshards.client.renderer;

public class BetweenfishRenderer extends MobRenderer<BetweenfishEntity, Modeltropicalfishbetween<BetweenfishEntity>> {

	public BetweenfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltropicalfishbetween(context.bakeLayer(Modeltropicalfishbetween.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BetweenfishEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/tropicalbetween.png");
	}

}
