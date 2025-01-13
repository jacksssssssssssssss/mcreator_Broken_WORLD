
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.brokensmpgodshards.client.renderer.ZombietraveleranimatedRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.VirusButcherRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.TurretBetweenRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.TheSpitterRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.SliceRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.ScraptrapRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.RusticCrosbowRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.MimicanimatedRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.KnifeRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.HummanhazRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.GuradBOTRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.GolemspawnRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.Entity611Renderer;
import net.mcreator.brokensmpgodshards.client.renderer.Enity609animatedpicRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.Enity609animatedRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.ButcherRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.BetweentrapRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.BetweenfishRenderer;
import net.mcreator.brokensmpgodshards.client.renderer.AdmineyeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BrokenSmpGodShardsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.ENTITY_611.get(), Entity611Renderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.GOLEMSPAWN.get(), GolemspawnRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.HUMMANHAZ.get(), HummanhazRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.HUMMANHAZ_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.BETWEENFISH.get(), BetweenfishRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.SCRAPTRAP.get(), ScraptrapRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.BETWEENTRAP.get(), BetweentrapRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.TURRET_BETWEEN.get(), TurretBetweenRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.TURRET_BETWEEN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.RUSTIC_CROSBOW.get(), RusticCrosbowRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.BOLT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.ADMINEYE.get(), AdmineyeRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.SLICE.get(), SliceRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.KNIFE.get(), KnifeRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.GRAPPAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.ZOMBIETRAVELERANIMATED.get(), ZombietraveleranimatedRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.BUTCHER.get(), ButcherRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.ENITY_609ANIMATED.get(), Enity609animatedRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.ENITY_609ANIMATEDPIC.get(), Enity609animatedpicRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.MIMICANIMATED.get(), MimicanimatedRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.MIMICANIMATED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.GURAD_BOT.get(), GuradBOTRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.THE_SPITTER.get(), TheSpitterRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.THE_SPITTER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BrokenSmpGodShardsModEntities.VIRUS_BUTCHER.get(), VirusButcherRenderer::new);
	}
}
