
package net.mcreator.brokensmpgodshards.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TurretBetweenEntityProjectile extends AbstractArrow implements ItemSupplier {

	public TurretBetweenEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(BrokenSmpGodShardsModEntities.TURRET_BETWEEN_PROJECTILE.get(), world);
	}

	public TurretBetweenEntityProjectile(EntityType<? extends TurretBetweenEntityProjectile> type, Level world) {
		super(type, world);
	}

	public TurretBetweenEntityProjectile(EntityType<? extends TurretBetweenEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TurretBetweenEntityProjectile(EntityType<? extends TurretBetweenEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(BrokenSmpGodShardsModItems.BULLET.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(BrokenSmpGodShardsModItems.BULLET.get());
	}
}
