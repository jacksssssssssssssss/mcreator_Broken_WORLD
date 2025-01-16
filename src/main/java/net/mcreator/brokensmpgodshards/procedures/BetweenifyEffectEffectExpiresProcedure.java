package net.mcreator.brokensmpgodshards.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BetweenifyEffectEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 380, 2, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 190, 2, false, false));
		BrokenSmpGodShardsMod.queueServerWork(10, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(x, y, z, 1);
		});
	}
}
