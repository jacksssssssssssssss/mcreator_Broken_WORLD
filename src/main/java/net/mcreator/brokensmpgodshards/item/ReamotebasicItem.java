
package net.mcreator.brokensmpgodshards.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ReamotebasicItem extends RecordItem {
	public ReamotebasicItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("broken_smp_god_shards:basicreamote")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 200);
	}
}
