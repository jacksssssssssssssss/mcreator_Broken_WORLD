package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokensmpgodshards.entity.MimicanimatedEntity;

public class MimicanimatedModel extends GeoModel<MimicanimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicanimatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/mimic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicanimatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/mimic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicanimatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

}
