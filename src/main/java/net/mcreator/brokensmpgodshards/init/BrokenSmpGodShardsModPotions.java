
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<Potion> BUTCHERSRAGE = REGISTRY.register("butchersrage",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 3600, 1, false, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 4, false, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2, false, false)));
	public static final RegistryObject<Potion> NAILSINABOTTEL = REGISTRY.register("nailsinabottel", () -> new Potion(new MobEffectInstance(BrokenSmpGodShardsModMobEffects.BLEEDING.get(), 320, 3, false, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 320, 1, false, true), new MobEffectInstance(MobEffects.CONFUSION, 320, 1, false, true)));
}
