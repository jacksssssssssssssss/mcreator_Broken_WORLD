package net.mcreator.brokensmpgodshards.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModEntities;

public class AdminpcbuttenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenSmpGodShardsModItems.SUMMONMINNON.get())) : false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BrokenSmpGodShardsModEntities.ADMINEYE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH).copy();
				_setstack.setCount(20);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 100, 3, 3, 3, 0.01);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BrokenSmpGodShardsModItems.SUMMONMINNON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
