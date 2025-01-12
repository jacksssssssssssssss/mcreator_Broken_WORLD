package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokensmpgodshards.entity.Enity609animatedpicEntity;

public class Enity609animatedpicModel extends GeoModel<Enity609animatedpicEntity> {
	@Override
	public ResourceLocation getAnimationResource(Enity609animatedpicEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/609pic_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Enity609animatedpicEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/609pic_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Enity609animatedpicEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(Enity609animatedpicEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
