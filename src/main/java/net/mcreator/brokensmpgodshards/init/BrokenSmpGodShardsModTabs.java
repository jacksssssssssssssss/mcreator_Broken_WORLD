
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrokenSmpGodShardsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<CreativeModeTab> BROKENWORLD = REGISTRY.register("brokenworld",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.broken_smp_god_shards.brokenworld")).icon(() -> new ItemStack(BrokenSmpGodShardsModItems.BETWEEN_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BrokenSmpGodShardsModItems.BASICREAMOTE.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.BETWEENSTONE.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.THEBETWEEN.get());
				tabData.accept(BrokenSmpGodShardsModItems.SCRIPT_OF_KNOCKBACK.get());
				tabData.accept(BrokenSmpGodShardsModItems.DNDENERGY.get());
				tabData.accept(BrokenSmpGodShardsModItems.TOOLS.get());
				tabData.accept(BrokenSmpGodShardsModItems.REAMOTEBASIC.get());
				tabData.accept(BrokenSmpGodShardsModItems.RAREREAMOTE.get());
				tabData.accept(BrokenSmpGodShardsModItems.ENTITY_611_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.GOLEMSPAWN_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.GOLEMHELPERTABLET.get());
				tabData.accept(BrokenSmpGodShardsModItems.HUMMANHAZ_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.BULLET.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEENFISH_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.FISH.get());
				tabData.accept(BrokenSmpGodShardsModItems.JUNK.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.BETWEENLOG.get().asItem());
				tabData.accept(BrokenSmpGodShardsModBlocks.JUNKORE.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.BUTCHERKNIFE.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEENFLESHBITS.get());
				tabData.accept(BrokenSmpGodShardsModItems.JUNKPICKAXE.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.SCRAPMAKERV_1.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.SCRAPTRAP_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.BETWEEN_ANVIL.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEENTRAP_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEEN_BEAR_TRAP_SCHEMATIC.get());
				tabData.accept(BrokenSmpGodShardsModItems.JUNKTRAP_SCHEMATIC.get());
				tabData.accept(BrokenSmpGodShardsModItems.TURRET_BETWEEN_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.TURRET.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEENTURRETSCHEMATIC.get());
				tabData.accept(BrokenSmpGodShardsModItems.BUTCHERKNIFERES.get());
				tabData.accept(BrokenSmpGodShardsModItems.CROSBOWRUSTIC.get());
				tabData.accept(BrokenSmpGodShardsModItems.SCHAMATICKNIFES.get());
				tabData.accept(BrokenSmpGodShardsModItems.SCRAPBUNCH.get());
				tabData.accept(BrokenSmpGodShardsModItems.DETONATOR.get());
				tabData.accept(BrokenSmpGodShardsModItems.ADMINEYE_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.DAMAGE_5X_5_FLOPYDISK.get());
				tabData.accept(BrokenSmpGodShardsModItems.SUMMONMINNON.get());
				tabData.accept(BrokenSmpGodShardsModItems.DAY_DISK.get());
				tabData.accept(BrokenSmpGodShardsModItems.NIGHT_DISK.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEENTHROWINGKNIFE.get());
				tabData.accept(BrokenSmpGodShardsModItems.BANDAGE.get());
				tabData.accept(BrokenSmpGodShardsModItems.HERB_CRUSHER.get());
				tabData.accept(BrokenSmpGodShardsModItems.EYE_COREHERBS.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.EYECORE.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.GRAPPEL.get());
				tabData.accept(BrokenSmpGodShardsModItems.HOOK.get());
				tabData.accept(BrokenSmpGodShardsModItems.COINS.get());
				tabData.accept(BrokenSmpGodShardsModItems.CROWBAR.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.GRASSBETWEEN.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.ZOMBIETRAVELERANIMATED_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.BUTCHER_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.ENITY_609ANIMATED_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.ENITY_609ANIMATEDPIC_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.MIMICANIMATED_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.GURAD_BOT_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.THE_SPITTER_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEEN_VIRUS.get());
				tabData.accept(BrokenSmpGodShardsModBlocks.BETWEEN_BLOCK.get().asItem());
				tabData.accept(BrokenSmpGodShardsModItems.VIRUS_BUTCHER_SPAWN_EGG.get());
				tabData.accept(BrokenSmpGodShardsModItems.BETWEENCUTLESS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(BrokenSmpGodShardsModBlocks.BETWEENSTONE.get().asItem());
			tabData.accept(BrokenSmpGodShardsModBlocks.JUNKORE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(BrokenSmpGodShardsModItems.SCRIPT_OF_KNOCKBACK.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(BrokenSmpGodShardsModItems.ENTITY_611_SPAWN_EGG.get());
			tabData.accept(BrokenSmpGodShardsModItems.HUMMANHAZ_SPAWN_EGG.get());
			tabData.accept(BrokenSmpGodShardsModItems.BETWEENFISH_SPAWN_EGG.get());
			tabData.accept(BrokenSmpGodShardsModItems.ADMINEYE_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(BrokenSmpGodShardsModItems.BETWEEN_INGOT.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(BrokenSmpGodShardsModItems.BASICREAMOTE.get());
			tabData.accept(BrokenSmpGodShardsModItems.THEBETWEEN.get());
			tabData.accept(BrokenSmpGodShardsModItems.TOOLS.get());
			tabData.accept(BrokenSmpGodShardsModItems.REAMOTEBASIC.get());
			tabData.accept(BrokenSmpGodShardsModItems.RAREREAMOTE.get());
			tabData.accept(BrokenSmpGodShardsModItems.ADMIN_STAFFOF_TIME.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(BrokenSmpGodShardsModBlocks.OREBRINGER.get().asItem());
			tabData.accept(BrokenSmpGodShardsModBlocks.BETWEENLOG.get().asItem());
			tabData.accept(BrokenSmpGodShardsModBlocks.SPEED_FLOWER.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(BrokenSmpGodShardsModItems.DNDENERGY.get());
			tabData.accept(BrokenSmpGodShardsModItems.FISH.get());

		}
	}
}
