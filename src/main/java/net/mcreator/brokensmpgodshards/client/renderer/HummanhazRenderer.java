
package net.mcreator.brokensmpgodshards.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokensmpgodshards.entity.HummanhazEntity;
import net.mcreator.brokensmpgodshards.client.model.Modelhummanhaz;

public class HummanhazRenderer extends MobRenderer<HummanhazEntity, Modelhummanhaz<HummanhazEntity>> {
	public HummanhazRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhummanhaz(context.bakeLayer(Modelhummanhaz.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HummanhazEntity entity) {
		return new ResourceLocation("broken_smp_god_shards:textures/entities/haz2.png");
	}
}
