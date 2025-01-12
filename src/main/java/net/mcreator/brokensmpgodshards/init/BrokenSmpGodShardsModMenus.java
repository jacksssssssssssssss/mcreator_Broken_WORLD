
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.brokensmpgodshards.world.inventory.ScrapmakerMenu;
import net.mcreator.brokensmpgodshards.world.inventory.BetweenanivilMenu;
import net.mcreator.brokensmpgodshards.world.inventory.AdminpcMenu;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<MenuType<ScrapmakerMenu>> BETWEEN_ANVIL = REGISTRY.register("between_anvil", () -> IForgeMenuType.create(ScrapmakerMenu::new));
	public static final RegistryObject<MenuType<BetweenanivilMenu>> BETWEENANIVIL = REGISTRY.register("betweenanivil", () -> IForgeMenuType.create(BetweenanivilMenu::new));
	public static final RegistryObject<MenuType<AdminpcMenu>> ADMINPC = REGISTRY.register("adminpc", () -> IForgeMenuType.create(AdminpcMenu::new));
}
