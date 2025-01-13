
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.brokensmpgodshards.block.SpeedFlowerBlock;
import net.mcreator.brokensmpgodshards.block.Scrapmakerv1Block;
import net.mcreator.brokensmpgodshards.block.OrebringerBlock;
import net.mcreator.brokensmpgodshards.block.JunkoreBlock;
import net.mcreator.brokensmpgodshards.block.GrassbetweenBlock;
import net.mcreator.brokensmpgodshards.block.EyecoreBlock;
import net.mcreator.brokensmpgodshards.block.BetweenstoneBlock;
import net.mcreator.brokensmpgodshards.block.BetweenlogBlock;
import net.mcreator.brokensmpgodshards.block.BetweenBlockBlock;
import net.mcreator.brokensmpgodshards.block.BetweenAnvilBlock;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

public class BrokenSmpGodShardsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<Block> BETWEENSTONE = REGISTRY.register("betweenstone", () -> new BetweenstoneBlock());
	public static final RegistryObject<Block> OREBRINGER = REGISTRY.register("orebringer", () -> new OrebringerBlock());
	public static final RegistryObject<Block> BETWEENLOG = REGISTRY.register("betweenlog", () -> new BetweenlogBlock());
	public static final RegistryObject<Block> JUNKORE = REGISTRY.register("junkore", () -> new JunkoreBlock());
	public static final RegistryObject<Block> SCRAPMAKERV_1 = REGISTRY.register("scrapmakerv_1", () -> new Scrapmakerv1Block());
	public static final RegistryObject<Block> BETWEEN_ANVIL = REGISTRY.register("between_anvil", () -> new BetweenAnvilBlock());
	public static final RegistryObject<Block> EYECORE = REGISTRY.register("eyecore", () -> new EyecoreBlock());
	public static final RegistryObject<Block> GRASSBETWEEN = REGISTRY.register("grassbetween", () -> new GrassbetweenBlock());
	public static final RegistryObject<Block> BETWEEN_BLOCK = REGISTRY.register("between_block", () -> new BetweenBlockBlock());
	public static final RegistryObject<Block> SPEED_FLOWER = REGISTRY.register("speed_flower", () -> new SpeedFlowerBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GrassbetweenBlock.blockColorLoad(event);
		}
	}
}
