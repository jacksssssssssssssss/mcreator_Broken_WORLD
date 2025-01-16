
package net.mcreator.brokensmpgodshards.item;

public class BetweenfleshbitsItem extends Item {
	public BetweenfleshbitsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(1f).meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 20;
	}
}