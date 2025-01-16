
package net.mcreator.brokensmpgodshards.client.renderer;

public class Entity611Renderer extends MobRenderer<Entity611Entity, Modeltuffven<Entity611Entity>> {

	public Entity611Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeltuffven(context.bakeLayer(Modeltuffven.LAYER_LOCATION)), 1f);

	}

	@Override
	public ResourceLocation getTextureLocation(Entity611Entity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/tuff7.png");
	}

}
