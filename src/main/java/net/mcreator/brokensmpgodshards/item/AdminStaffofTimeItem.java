
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.brokensmpgodshards.procedures.CodestaffItemInHandTickProcedure;

public class AdminStaffofTimeItem extends ShieldItem {
	public AdminStaffofTimeItem() {
		super(new Item.Properties().durability(10000));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CodestaffItemInHandTickProcedure.execute(entity);
	}
}
