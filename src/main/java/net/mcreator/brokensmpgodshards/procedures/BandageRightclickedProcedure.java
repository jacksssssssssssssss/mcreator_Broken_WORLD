package net.mcreator.brokensmpgodshards.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModMobEffects;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;

public class BandageRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenSmpGodShardsModItems.BANDAGE.get())) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 90, 4));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BrokenSmpGodShardsModItems.BANDAGE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(BrokenSmpGodShardsModMobEffects.BLEEDING.get());
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 160);
		}
	}
}
