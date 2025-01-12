package net.mcreator.brokensmpgodshards.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;

public class NightdiskproProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenSmpGodShardsModItems.NIGHT_DISK.get())) : false) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(13000);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 50, 3, 3, 3, 1);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BrokenSmpGodShardsModItems.NIGHT_DISK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
