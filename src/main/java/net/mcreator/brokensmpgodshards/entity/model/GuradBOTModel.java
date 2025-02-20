package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokensmpgodshards.entity.GuradBOTEntity;

public class GuradBOTModel extends GeoModel<GuradBOTEntity> {
	@Override
	public ResourceLocation getAnimationResource(GuradBOTEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/guard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GuradBOTEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/guard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GuradBOTEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

}
