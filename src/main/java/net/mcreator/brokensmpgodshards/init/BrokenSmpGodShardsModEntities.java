
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.brokensmpgodshards.entity.ZombietraveleranimatedEntity;
import net.mcreator.brokensmpgodshards.entity.VirusButcherEntity;
import net.mcreator.brokensmpgodshards.entity.TurretBetweenEntityProjectile;
import net.mcreator.brokensmpgodshards.entity.TurretBetweenEntity;
import net.mcreator.brokensmpgodshards.entity.TheSpitterEntityProjectile;
import net.mcreator.brokensmpgodshards.entity.TheSpitterEntity;
import net.mcreator.brokensmpgodshards.entity.SliceEntity;
import net.mcreator.brokensmpgodshards.entity.ScraptrapEntity;
import net.mcreator.brokensmpgodshards.entity.RusticCrosbowEntity;
import net.mcreator.brokensmpgodshards.entity.MimicanimatedEntityProjectile;
import net.mcreator.brokensmpgodshards.entity.MimicanimatedEntity;
import net.mcreator.brokensmpgodshards.entity.KnifeEntity;
import net.mcreator.brokensmpgodshards.entity.HummanhazEntityProjectile;
import net.mcreator.brokensmpgodshards.entity.HummanhazEntity;
import net.mcreator.brokensmpgodshards.entity.GuradBOTEntity;
import net.mcreator.brokensmpgodshards.entity.GrappalEntity;
import net.mcreator.brokensmpgodshards.entity.GolemspawnEntity;
import net.mcreator.brokensmpgodshards.entity.Entity611Entity;
import net.mcreator.brokensmpgodshards.entity.Enity609animatedpicEntity;
import net.mcreator.brokensmpgodshards.entity.Enity609animatedEntity;
import net.mcreator.brokensmpgodshards.entity.ButcherEntity;
import net.mcreator.brokensmpgodshards.entity.BoltEntity;
import net.mcreator.brokensmpgodshards.entity.BetweentrapEntity;
import net.mcreator.brokensmpgodshards.entity.BetweenfishEntity;
import net.mcreator.brokensmpgodshards.entity.AdmineyeEntity;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrokenSmpGodShardsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<EntityType<Entity611Entity>> ENTITY_611 = register("entity_611", EntityType.Builder.<Entity611Entity>of(Entity611Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(Entity611Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GolemspawnEntity>> GOLEMSPAWN = register("golemspawn", EntityType.Builder.<GolemspawnEntity>of(GolemspawnEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(GolemspawnEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HummanhazEntity>> HUMMANHAZ = register("hummanhaz",
			EntityType.Builder.<HummanhazEntity>of(HummanhazEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HummanhazEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HummanhazEntityProjectile>> HUMMANHAZ_PROJECTILE = register("projectile_hummanhaz", EntityType.Builder.<HummanhazEntityProjectile>of(HummanhazEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(HummanhazEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BetweenfishEntity>> BETWEENFISH = register("betweenfish",
			EntityType.Builder.<BetweenfishEntity>of(BetweenfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BetweenfishEntity::new)

					.sized(0.3f, 0.6f));
	public static final RegistryObject<EntityType<ScraptrapEntity>> SCRAPTRAP = register("scraptrap",
			EntityType.Builder.<ScraptrapEntity>of(ScraptrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScraptrapEntity::new)

					.sized(0.6f, 0.3f));
	public static final RegistryObject<EntityType<BetweentrapEntity>> BETWEENTRAP = register("betweentrap", EntityType.Builder.<BetweentrapEntity>of(BetweentrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BetweentrapEntity::new).fireImmune().sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<TurretBetweenEntity>> TURRET_BETWEEN = register("turret_between",
			EntityType.Builder.<TurretBetweenEntity>of(TurretBetweenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TurretBetweenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TurretBetweenEntityProjectile>> TURRET_BETWEEN_PROJECTILE = register("projectile_turret_between",
			EntityType.Builder.<TurretBetweenEntityProjectile>of(TurretBetweenEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(TurretBetweenEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RusticCrosbowEntity>> RUSTIC_CROSBOW = register("rustic_crosbow",
			EntityType.Builder.<RusticCrosbowEntity>of(RusticCrosbowEntity::new, MobCategory.MISC).setCustomClientFactory(RusticCrosbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BoltEntity>> BOLT = register("bolt",
			EntityType.Builder.<BoltEntity>of(BoltEntity::new, MobCategory.MISC).setCustomClientFactory(BoltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AdmineyeEntity>> ADMINEYE = register("admineye",
			EntityType.Builder.<AdmineyeEntity>of(AdmineyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdmineyeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SliceEntity>> SLICE = register("slice",
			EntityType.Builder.<SliceEntity>of(SliceEntity::new, MobCategory.MISC).setCustomClientFactory(SliceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KnifeEntity>> KNIFE = register("knife",
			EntityType.Builder.<KnifeEntity>of(KnifeEntity::new, MobCategory.MISC).setCustomClientFactory(KnifeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrappalEntity>> GRAPPAL = register("grappal",
			EntityType.Builder.<GrappalEntity>of(GrappalEntity::new, MobCategory.MISC).setCustomClientFactory(GrappalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZombietraveleranimatedEntity>> ZOMBIETRAVELERANIMATED = register("zombietraveleranimated",
			EntityType.Builder.<ZombietraveleranimatedEntity>of(ZombietraveleranimatedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ZombietraveleranimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ButcherEntity>> BUTCHER = register("butcher",
			EntityType.Builder.<ButcherEntity>of(ButcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ButcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Enity609animatedEntity>> ENITY_609ANIMATED = register("enity_609animated",
			EntityType.Builder.<Enity609animatedEntity>of(Enity609animatedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Enity609animatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Enity609animatedpicEntity>> ENITY_609ANIMATEDPIC = register("enity_609animatedpic",
			EntityType.Builder.<Enity609animatedpicEntity>of(Enity609animatedpicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Enity609animatedpicEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MimicanimatedEntity>> MIMICANIMATED = register("mimicanimated",
			EntityType.Builder.<MimicanimatedEntity>of(MimicanimatedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MimicanimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MimicanimatedEntityProjectile>> MIMICANIMATED_PROJECTILE = register("projectile_mimicanimated",
			EntityType.Builder.<MimicanimatedEntityProjectile>of(MimicanimatedEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(MimicanimatedEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GuradBOTEntity>> GURAD_BOT = register("gurad_bot",
			EntityType.Builder.<GuradBOTEntity>of(GuradBOTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GuradBOTEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheSpitterEntity>> THE_SPITTER = register("the_spitter",
			EntityType.Builder.<TheSpitterEntity>of(TheSpitterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(76).setUpdateInterval(3).setCustomClientFactory(TheSpitterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheSpitterEntityProjectile>> THE_SPITTER_PROJECTILE = register("projectile_the_spitter", EntityType.Builder.<TheSpitterEntityProjectile>of(TheSpitterEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(TheSpitterEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VirusButcherEntity>> VIRUS_BUTCHER = register("virus_butcher",
			EntityType.Builder.<VirusButcherEntity>of(VirusButcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VirusButcherEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Entity611Entity.init();
			GolemspawnEntity.init();
			HummanhazEntity.init();
			BetweenfishEntity.init();
			ScraptrapEntity.init();
			BetweentrapEntity.init();
			TurretBetweenEntity.init();
			AdmineyeEntity.init();
			ZombietraveleranimatedEntity.init();
			ButcherEntity.init();
			Enity609animatedEntity.init();
			Enity609animatedpicEntity.init();
			MimicanimatedEntity.init();
			GuradBOTEntity.init();
			TheSpitterEntity.init();
			VirusButcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENTITY_611.get(), Entity611Entity.createAttributes().build());
		event.put(GOLEMSPAWN.get(), GolemspawnEntity.createAttributes().build());
		event.put(HUMMANHAZ.get(), HummanhazEntity.createAttributes().build());
		event.put(BETWEENFISH.get(), BetweenfishEntity.createAttributes().build());
		event.put(SCRAPTRAP.get(), ScraptrapEntity.createAttributes().build());
		event.put(BETWEENTRAP.get(), BetweentrapEntity.createAttributes().build());
		event.put(TURRET_BETWEEN.get(), TurretBetweenEntity.createAttributes().build());
		event.put(ADMINEYE.get(), AdmineyeEntity.createAttributes().build());
		event.put(ZOMBIETRAVELERANIMATED.get(), ZombietraveleranimatedEntity.createAttributes().build());
		event.put(BUTCHER.get(), ButcherEntity.createAttributes().build());
		event.put(ENITY_609ANIMATED.get(), Enity609animatedEntity.createAttributes().build());
		event.put(ENITY_609ANIMATEDPIC.get(), Enity609animatedpicEntity.createAttributes().build());
		event.put(MIMICANIMATED.get(), MimicanimatedEntity.createAttributes().build());
		event.put(GURAD_BOT.get(), GuradBOTEntity.createAttributes().build());
		event.put(THE_SPITTER.get(), TheSpitterEntity.createAttributes().build());
		event.put(VIRUS_BUTCHER.get(), VirusButcherEntity.createAttributes().build());
	}
}
