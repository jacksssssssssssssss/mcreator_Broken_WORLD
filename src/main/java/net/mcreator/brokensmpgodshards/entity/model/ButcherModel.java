package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class ButcherModel extends GeoModel<ButcherEntity> {
	@Override
	public ResourceLocation getAnimationResource(ButcherEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/butchers.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ButcherEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/butchers.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ButcherEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

}