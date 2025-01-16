
package net.mcreator.brokensmpgodshards.item;

public class SpeedbubblemushItem extends Item {
	public SpeedbubblemushItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(6f).alwaysEat().build()));
	}
}