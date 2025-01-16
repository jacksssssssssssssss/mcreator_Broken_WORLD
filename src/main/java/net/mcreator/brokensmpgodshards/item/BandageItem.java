
package net.mcreator.brokensmpgodshards.item;

public class BandageItem extends Item {
	public BandageItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BandageRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}