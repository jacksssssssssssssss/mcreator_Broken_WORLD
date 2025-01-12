package net.mcreator.brokensmpgodshards.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;

public class DiskdayProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenSmpGodShardsModItems.DAY_DISK.get())) : false) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(1000);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, y, z, 100, 3, 3, 3, 0.1);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BrokenSmpGodShardsModItems.DAY_DISK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
