package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokensmpgodshards.entity.TheSpitterEntity;

public class TheSpitterModel extends GeoModel<TheSpitterEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheSpitterEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/the_spitter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheSpitterEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/the_spitter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheSpitterEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

}
