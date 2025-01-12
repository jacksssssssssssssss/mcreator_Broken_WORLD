
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BetweenIngotItem extends Item {
	public BetweenIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
