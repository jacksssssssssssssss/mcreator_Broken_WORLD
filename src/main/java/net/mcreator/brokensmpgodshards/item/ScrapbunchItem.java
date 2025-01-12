
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScrapbunchItem extends Item {
	public ScrapbunchItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
