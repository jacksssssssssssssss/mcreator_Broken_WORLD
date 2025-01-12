
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.brokensmpgodshards.block.entity.Scrapmakerv1BlockEntity;
import net.mcreator.brokensmpgodshards.block.entity.BetweenAnvilBlockEntity;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SCRAPMAKERV_1 = register("scrapmakerv_1", BrokenSmpGodShardsModBlocks.SCRAPMAKERV_1, Scrapmakerv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BETWEEN_ANVIL = register("between_anvil", BrokenSmpGodShardsModBlocks.BETWEEN_ANVIL, BetweenAnvilBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
