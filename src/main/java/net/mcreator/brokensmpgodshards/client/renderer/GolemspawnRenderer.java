
package net.mcreator.brokensmpgodshards.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokensmpgodshards.entity.GolemspawnEntity;
import net.mcreator.brokensmpgodshards.client.model.Modelgolm;

public class GolemspawnRenderer extends MobRenderer<GolemspawnEntity, Modelgolm<GolemspawnEntity>> {
	public GolemspawnRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolm(context.bakeLayer(Modelgolm.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GolemspawnEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/texture.png");
	}
}
