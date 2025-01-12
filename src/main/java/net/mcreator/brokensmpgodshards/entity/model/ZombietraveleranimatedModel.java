package net.mcreator.brokensmpgodshards.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokensmpgodshards.entity.ZombietraveleranimatedEntity;

public class ZombietraveleranimatedModel extends GeoModel<ZombietraveleranimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZombietraveleranimatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "animations/zombiesurvor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZombietraveleranimatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "geo/zombiesurvor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZombietraveleranimatedEntity entity) {
		return new ResourceLocation("broken_smp_god_shards", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ZombietraveleranimatedEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
