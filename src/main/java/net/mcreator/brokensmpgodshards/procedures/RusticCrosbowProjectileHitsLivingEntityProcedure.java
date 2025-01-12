package net.mcreator.brokensmpgodshards.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModMobEffects;

public class RusticCrosbowProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(BrokenSmpGodShardsModMobEffects.BLEEDING.get(), 360, 1));
	}
}
