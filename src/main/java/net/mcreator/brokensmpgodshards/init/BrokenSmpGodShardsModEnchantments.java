
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.brokensmpgodshards.enchantment.ThebutcherEnchantment;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<Enchantment> THEBUTCHER = REGISTRY.register("thebutcher", () -> new ThebutcherEnchantment());
}
