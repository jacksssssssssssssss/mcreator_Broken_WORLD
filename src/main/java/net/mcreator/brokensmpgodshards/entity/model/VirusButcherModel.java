package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class VirusButcherModel extends GeoModel<VirusButcherEntity> {
	@Override
	public ResourceLocation getAnimationResource(VirusButcherEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/butchervirus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VirusButcherEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/butchervirus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VirusButcherEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

}