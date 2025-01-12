
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.brokensmpgodshards.client.particle.ScriptParticle;
import net.mcreator.brokensmpgodshards.client.particle.BloodParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BrokenSmpGodShardsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(BrokenSmpGodShardsModParticleTypes.BLOOD.get(), BloodParticle::provider);
		event.registerSpriteSet(BrokenSmpGodShardsModParticleTypes.SCRIPT.get(), ScriptParticle::provider);
	}
}
