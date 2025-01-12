
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HookItem extends Item {
	public HookItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
