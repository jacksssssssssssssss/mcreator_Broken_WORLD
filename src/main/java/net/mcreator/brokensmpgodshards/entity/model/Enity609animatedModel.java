package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class Enity609animatedModel extends GeoModel<Enity609animatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(Enity609animatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/309.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Enity609animatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/309.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Enity609animatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(Enity609animatedEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}