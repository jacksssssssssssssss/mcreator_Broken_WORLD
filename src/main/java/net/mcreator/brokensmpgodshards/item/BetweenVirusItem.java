
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.brokensmpgodshards.procedures.BetweenVirusRightclickedProcedure;

public class BetweenVirusItem extends Item {
	public BetweenVirusItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BetweenVirusRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
