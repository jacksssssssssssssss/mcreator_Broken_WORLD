
package net.mcreator.brokensmpgodshards.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class HummanhazEntity extends Monster implements RangedAttackMob {

	public HummanhazEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(BrokenSmpGodShardsModEntities.HUMMANHAZ.get(), world);
	}

	public HummanhazEntity(EntityType<HummanhazEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);

		setCustomName(Component.literal("Hazmat BOT"));
		setCustomNameVisible(true);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(BrokenSmpGodShardsModItems.BASICREAMOTE.get()));
		this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(BrokenSmpGodShardsModItems.BASICREAMOTE.get()));

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Enity609animatedEntity.class, true, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Entity611Entity.class, true, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MimicanimatedEntity.class, true, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, ButcherEntity.class, true, false));
		this.goalSelector.addGoal(11, new BreakDoorGoal(this, e -> true));

		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 66, 9.1f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("broken_smp_god_shards:gasmask"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		HummanhazEntityProjectile entityarrow = new HummanhazEntityProjectile(BrokenSmpGodShardsModEntities.HUMMANHAZ_PROJECTILE.get(), this, this.level());
		double d0 = target.getY() + target.getEyeHeight() - 1.1;
		double d1 = target.getX() - this.getX();
		double d3 = target.getZ() - this.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1.6F, 12.0F);
		this.level().addFreshEntity(entityarrow);
	}

	public static void init() {
		SpawnPlacements.register(BrokenSmpGodShardsModEntities.HUMMANHAZ.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		return builder;
	}

}
