package net.mcreator.brokensmpgodshards.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.brokensmpgodshards.network.BrokenSmpGodShardsModVariables;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModParticleTypes;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModEntities;

public class GolemOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (BrokenSmpGodShardsModVariables.MapVariables.get(world).golmcooldown < 1) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenSmpGodShardsModItems.GOLEMHELPERTABLET.get())) : false) {
				BrokenSmpGodShardsModVariables.MapVariables.get(world).golmcooldown = 600;
				BrokenSmpGodShardsModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BrokenSmpGodShardsModParticleTypes.SCRIPT.get()), x, y, z, 100, 3, 3, 3, 1);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BrokenSmpGodShardsModEntities.GOLEMSPAWN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BrokenSmpGodShardsModEntities.GOLEMSPAWN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 2));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 3));
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BrokenSmpGodShardsModItems.GOLEMHELPERTABLET.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
