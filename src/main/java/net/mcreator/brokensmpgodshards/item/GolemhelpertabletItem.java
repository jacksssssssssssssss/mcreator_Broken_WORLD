
package net.mcreator.brokensmpgodshards.item;

public class GolemhelpertabletItem extends Item {
	public GolemhelpertabletItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}