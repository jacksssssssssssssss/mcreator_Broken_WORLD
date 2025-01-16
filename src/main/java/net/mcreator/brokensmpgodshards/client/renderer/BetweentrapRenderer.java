
package net.mcreator.brokensmpgodshards.client.renderer;

public class BetweentrapRenderer extends MobRenderer<BetweentrapEntity, ModelBetween_trap<BetweentrapEntity>> {

	public BetweentrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBetween_trap(context.bakeLayer(ModelBetween_trap.LAYER_LOCATION)), 0.2f);

	}

	@Override
	public ResourceLocation getTextureLocation(BetweentrapEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/jaw_baretrap.png");
	}

}
