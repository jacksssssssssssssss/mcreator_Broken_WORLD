package net.mcreator.brokensmpgodshards.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.brokensmpgodshards.network.BrokenSmpGodShardsModVariables;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModParticleTypes;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;

public class DeathbetweenOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randome01 = 0;
		if (BrokenSmpGodShardsModVariables.MapVariables.get(world).deathcooldown < 1) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenSmpGodShardsModItems.SCRIPT_OF_KNOCKBACK.get())) : false) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BrokenSmpGodShardsModParticleTypes.SCRIPT.get()), x, y, z, 100, 3, 3, 3, 0.1);
				BrokenSmpGodShardsModVariables.MapVariables.get(world).deathcooldown = 600;
				BrokenSmpGodShardsModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300, 3));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 300, 2));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 3));
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
			}
		}
	}
}
