
package net.mcreator.brokensmpgodshards.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokensmpgodshards.entity.AdmineyeEntity;
import net.mcreator.brokensmpgodshards.client.model.Modelzero;

public class AdmineyeRenderer extends MobRenderer<AdmineyeEntity, Modelzero<AdmineyeEntity>> {
	public AdmineyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzero(context.bakeLayer(Modelzero.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AdmineyeEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/download278932681.png");
	}
}
