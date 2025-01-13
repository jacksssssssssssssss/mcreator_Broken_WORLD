
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<PaintingVariant> SPEEDMUSH_PAINTING = REGISTRY.register("speedmush_painting", () -> new PaintingVariant(16, 16));
}
