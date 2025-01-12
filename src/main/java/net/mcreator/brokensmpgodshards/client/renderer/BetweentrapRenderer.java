
package net.mcreator.brokensmpgodshards.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokensmpgodshards.entity.BetweentrapEntity;
import net.mcreator.brokensmpgodshards.client.model.ModelBetween_trap;

public class BetweentrapRenderer extends MobRenderer<BetweentrapEntity, ModelBetween_trap<BetweentrapEntity>> {
	public BetweentrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBetween_trap(context.bakeLayer(ModelBetween_trap.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BetweentrapEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/jaw_baretrap.png");
	}
}
