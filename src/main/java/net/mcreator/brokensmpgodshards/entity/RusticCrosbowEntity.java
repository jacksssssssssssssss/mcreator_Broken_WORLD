
package net.mcreator.brokensmpgodshards.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RusticCrosbowEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(BrokenSmpGodShardsModItems.SCRAPBUNCH.get());

	public RusticCrosbowEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(BrokenSmpGodShardsModEntities.RUSTIC_CROSBOW.get(), world);
	}

	public RusticCrosbowEntity(EntityType<? extends RusticCrosbowEntity> type, Level world) {
		super(type, world);
	}

	public RusticCrosbowEntity(EntityType<? extends RusticCrosbowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RusticCrosbowEntity(EntityType<? extends RusticCrosbowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		RusticCrosbowProjectileHitsLivingEntityProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static RusticCrosbowEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1.2f, 2.5, 4);
	}

	public static RusticCrosbowEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1.2f, 2.5, 4);
	}

	public static RusticCrosbowEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RusticCrosbowEntity entityarrow = new RusticCrosbowEntity(BrokenSmpGodShardsModEntities.RUSTIC_CROSBOW.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lantern.break")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static RusticCrosbowEntity shoot(LivingEntity entity, LivingEntity target) {
		RusticCrosbowEntity entityarrow = new RusticCrosbowEntity(BrokenSmpGodShardsModEntities.RUSTIC_CROSBOW.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2.5);
		entityarrow.setKnockback(4);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lantern.break")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
