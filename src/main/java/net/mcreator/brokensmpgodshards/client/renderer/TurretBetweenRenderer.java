
package net.mcreator.brokensmpgodshards.client.renderer;

public class TurretBetweenRenderer extends MobRenderer<TurretBetweenEntity, Modelturret<TurretBetweenEntity>> {

	public TurretBetweenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelturret(context.bakeLayer(Modelturret.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TurretBetweenEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/turret.png");
	}

}
