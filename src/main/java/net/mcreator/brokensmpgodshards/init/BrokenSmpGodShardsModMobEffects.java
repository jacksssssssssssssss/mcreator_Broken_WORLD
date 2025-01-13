
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.brokensmpgodshards.potion.BleedingMobEffect;
import net.mcreator.brokensmpgodshards.potion.BetweenifyEffectMobEffect;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> BETWEENIFY_EFFECT = REGISTRY.register("betweenify_effect", () -> new BetweenifyEffectMobEffect());
}
