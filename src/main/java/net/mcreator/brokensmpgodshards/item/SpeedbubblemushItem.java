
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SpeedbubblemushItem extends Item {
	public SpeedbubblemushItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(6f).alwaysEat().build()));
	}
}
