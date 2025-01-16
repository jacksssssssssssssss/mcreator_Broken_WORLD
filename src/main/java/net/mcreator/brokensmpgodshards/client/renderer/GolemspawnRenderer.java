
package net.mcreator.brokensmpgodshards.client.renderer;

public class GolemspawnRenderer extends MobRenderer<GolemspawnEntity, Modelgolm<GolemspawnEntity>> {

	public GolemspawnRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolm(context.bakeLayer(Modelgolm.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(GolemspawnEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/texture.png");
	}

}
