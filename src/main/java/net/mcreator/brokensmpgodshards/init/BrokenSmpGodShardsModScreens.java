
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.brokensmpgodshards.client.gui.ScrapmakerScreen;
import net.mcreator.brokensmpgodshards.client.gui.BetweenanivilScreen;
import net.mcreator.brokensmpgodshards.client.gui.AdminpcScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BrokenSmpGodShardsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BrokenSmpGodShardsModMenus.BETWEEN_ANVIL.get(), ScrapmakerScreen::new);
			MenuScreens.register(BrokenSmpGodShardsModMenus.BETWEENANIVIL.get(), BetweenanivilScreen::new);
			MenuScreens.register(BrokenSmpGodShardsModMenus.ADMINPC.get(), AdminpcScreen::new);
		});
	}
}
