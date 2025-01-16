package net.mcreator.brokensmpgodshards.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Death_609Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = BrokenSmpGodShardsModEntities.ENITY_609ANIMATED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}
