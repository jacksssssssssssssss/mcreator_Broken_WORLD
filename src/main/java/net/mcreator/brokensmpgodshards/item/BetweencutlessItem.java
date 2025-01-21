
package net.mcreator.brokensmpgodshards.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.brokensmpgodshards.procedures.BetweencutlessRightclickedProcedure;
import net.mcreator.brokensmpgodshards.init.BrokenSmpGodShardsModItems;

public class BetweencutlessItem extends SwordItem {
	public BetweencutlessItem() {
		super(new Tier() {
			public int getUses() {
				return 1245;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return 2.6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BrokenSmpGodShardsModItems.BETWEEN_INGOT.get()));
			}
		}, 3, -1.7f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BetweencutlessRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}
