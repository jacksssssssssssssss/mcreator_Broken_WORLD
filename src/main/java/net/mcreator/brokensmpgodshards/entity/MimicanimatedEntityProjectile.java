
package net.mcreator.brokensmpgodshards.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class MimicanimatedEntityProjectile extends AbstractArrow implements ItemSupplier {

	public MimicanimatedEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(BrokenSmpGodShardsModEntities.MIMICANIMATED_PROJECTILE.get(), world);
	}

	public MimicanimatedEntityProjectile(EntityType<? extends MimicanimatedEntityProjectile> type, Level world) {
		super(type, world);
	}

	public MimicanimatedEntityProjectile(EntityType<? extends MimicanimatedEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public MimicanimatedEntityProjectile(EntityType<? extends MimicanimatedEntityProjectile> type, LivingEntity entity, Level world) {
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
		return new ItemStack(BrokenSmpGodShardsModItems.SCRAPBUNCH.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(BrokenSmpGodShardsModItems.SCRAPBUNCH.get());
	}
}
