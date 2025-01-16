
package net.mcreator.brokensmpgodshards.item;

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