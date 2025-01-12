
package net.mcreator.brokensmpgodshards.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokensmpgodshards.entity.Entity611Entity;
import net.mcreator.brokensmpgodshards.client.model.Modeltuffven;

public class Entity611Renderer extends MobRenderer<Entity611Entity, Modeltuffven<Entity611Entity>> {
	public Entity611Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeltuffven(context.bakeLayer(Modeltuffven.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Entity611Entity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/tuff7.png");
	}
}
