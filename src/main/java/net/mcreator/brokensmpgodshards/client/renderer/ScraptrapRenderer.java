
package net.mcreator.brokensmpgodshards.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokensmpgodshards.entity.ScraptrapEntity;
import net.mcreator.brokensmpgodshards.client.model.Modelrust;

public class ScraptrapRenderer extends MobRenderer<ScraptrapEntity, Modelrust<ScraptrapEntity>> {
	public ScraptrapRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrust(context.bakeLayer(Modelrust.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScraptrapEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/fda.png");
	}
}
