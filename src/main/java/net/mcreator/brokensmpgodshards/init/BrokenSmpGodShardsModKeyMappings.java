
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.brokensmpgodshards.network.StaffofTimeMessage;
import net.mcreator.brokensmpgodshards.network.GolemMessage;
import net.mcreator.brokensmpgodshards.network.DeathbetweenMessage;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BrokenSmpGodShardsModKeyMappings {
	public static final KeyMapping DEATHBETWEEN = new KeyMapping("key.broken_smp_god_shards.deathbetween", GLFW.GLFW_KEY_DELETE, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DEATHBETWEEN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DEATHBETWEEN_LASTPRESS);
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new DeathbetweenMessage(1, dt));
				DeathbetweenMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GOLEM = new KeyMapping("key.broken_smp_god_shards.golem", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GOLEM_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - GOLEM_LASTPRESS);
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new GolemMessage(1, dt));
				GolemMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STAFFOF_TIME = new KeyMapping("key.broken_smp_god_shards.staffof_time", GLFW.GLFW_KEY_4, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new StaffofTimeMessage(0, 0));
				StaffofTimeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long DEATHBETWEEN_LASTPRESS = 0;
	private static long GOLEM_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DEATHBETWEEN);
		event.register(GOLEM);
		event.register(STAFFOF_TIME);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DEATHBETWEEN.consumeClick();
				GOLEM.consumeClick();
				STAFFOF_TIME.consumeClick();
			}
		}
	}
}
