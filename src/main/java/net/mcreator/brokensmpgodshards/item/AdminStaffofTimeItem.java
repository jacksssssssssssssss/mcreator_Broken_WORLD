
package net.mcreator.brokensmpgodshards.item;

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
