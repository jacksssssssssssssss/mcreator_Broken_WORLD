package net.mcreator.brokensmpgodshards.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.brokensmpgodshards.network.BrokenSmpGodShardsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CountdownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		BrokenSmpGodShardsModVariables.MapVariables.get(world).deathcooldown = BrokenSmpGodShardsModVariables.MapVariables.get(world).deathcooldown - 1;
		BrokenSmpGodShardsModVariables.MapVariables.get(world).syncData(world);
	}
}
