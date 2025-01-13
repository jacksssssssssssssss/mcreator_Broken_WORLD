
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.brokensmpgodshards.item.TurretItem;
import net.mcreator.brokensmpgodshards.item.ToolsItem;
import net.mcreator.brokensmpgodshards.item.ThebetweenItem;
import net.mcreator.brokensmpgodshards.item.SummonminnonItem;
import net.mcreator.brokensmpgodshards.item.SpeedbubblemushItem;
import net.mcreator.brokensmpgodshards.item.ScrapbunchItem;
import net.mcreator.brokensmpgodshards.item.SchamaticknifesItem;
import net.mcreator.brokensmpgodshards.item.ReamotebasicItem;
import net.mcreator.brokensmpgodshards.item.RarereamoteItem;
import net.mcreator.brokensmpgodshards.item.NightDiskItem;
import net.mcreator.brokensmpgodshards.item.JunktrapSchematicItem;
import net.mcreator.brokensmpgodshards.item.JunkpickaxeItem;
import net.mcreator.brokensmpgodshards.item.JunkItem;
import net.mcreator.brokensmpgodshards.item.HookItem;
import net.mcreator.brokensmpgodshards.item.HerbCrusherItem;
import net.mcreator.brokensmpgodshards.item.GrappelItem;
import net.mcreator.brokensmpgodshards.item.GolemhelpertabletItem;
import net.mcreator.brokensmpgodshards.item.FishItem;
import net.mcreator.brokensmpgodshards.item.EyeCoreherbsItem;
import net.mcreator.brokensmpgodshards.item.DndenergyItem;
import net.mcreator.brokensmpgodshards.item.DetonatorItem;
import net.mcreator.brokensmpgodshards.item.DeathbrigerItem;
import net.mcreator.brokensmpgodshards.item.DayDiskItem;
import net.mcreator.brokensmpgodshards.item.Damage5x5FlopydiskItem;
import net.mcreator.brokensmpgodshards.item.CrowbarItem;
import net.mcreator.brokensmpgodshards.item.CrosbowrusticItem;
import net.mcreator.brokensmpgodshards.item.CoinsItem;
import net.mcreator.brokensmpgodshards.item.ButcherkniferesItem;
import net.mcreator.brokensmpgodshards.item.ButcherknifeItem;
import net.mcreator.brokensmpgodshards.item.BulletItem;
import net.mcreator.brokensmpgodshards.item.BetweenturretschematicItem;
import net.mcreator.brokensmpgodshards.item.BetweenthrowingknifeItem;
import net.mcreator.brokensmpgodshards.item.BetweenthrowingItem;
import net.mcreator.brokensmpgodshards.item.BetweenfleshbitsItem;
import net.mcreator.brokensmpgodshards.item.BetweenVirusItem;
import net.mcreator.brokensmpgodshards.item.BetweenIngotItem;
import net.mcreator.brokensmpgodshards.item.BetweenBearTrapSchematicItem;
import net.mcreator.brokensmpgodshards.item.BasicreamoteItem;
import net.mcreator.brokensmpgodshards.item.BandageItem;
import net.mcreator.brokensmpgodshards.item.AdminStaffofTimeItem;
import net.mcreator.brokensmpgodshards.item.AcidItem;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BrokenSmpGodShardsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BrokenSmpGodShardsMod.MODID);
	public static final RegistryObject<Item> BASICREAMOTE = REGISTRY.register("basicreamote", () -> new BasicreamoteItem());
	public static final RegistryObject<Item> BETWEENSTONE = block(BrokenSmpGodShardsModBlocks.BETWEENSTONE);
	public static final RegistryObject<Item> THEBETWEEN = REGISTRY.register("thebetween", () -> new ThebetweenItem());
	public static final RegistryObject<Item> SCRIPT_OF_KNOCKBACK = REGISTRY.register("script_of_knockback", () -> new DeathbrigerItem());
	public static final RegistryObject<Item> BETWEEN_INGOT = REGISTRY.register("between_ingot", () -> new BetweenIngotItem());
	public static final RegistryObject<Item> OREBRINGER = block(BrokenSmpGodShardsModBlocks.OREBRINGER);
	public static final RegistryObject<Item> DNDENERGY = REGISTRY.register("dndenergy", () -> new DndenergyItem());
	public static final RegistryObject<Item> TOOLS = REGISTRY.register("tools", () -> new ToolsItem());
	public static final RegistryObject<Item> REAMOTEBASIC = REGISTRY.register("reamotebasic", () -> new ReamotebasicItem());
	public static final RegistryObject<Item> RAREREAMOTE = REGISTRY.register("rarereamote", () -> new RarereamoteItem());
	public static final RegistryObject<Item> ENTITY_611_SPAWN_EGG = REGISTRY.register("entity_611_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.ENTITY_611, -1, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMSPAWN_SPAWN_EGG = REGISTRY.register("golemspawn_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.GOLEMSPAWN, -10066330, -1, new Item.Properties()));
	public static final RegistryObject<Item> GOLEMHELPERTABLET = REGISTRY.register("golemhelpertablet", () -> new GolemhelpertabletItem());
	public static final RegistryObject<Item> HUMMANHAZ_SPAWN_EGG = REGISTRY.register("hummanhaz_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.HUMMANHAZ, -16777216, -205, new Item.Properties()));
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> BETWEENFISH_SPAWN_EGG = REGISTRY.register("betweenfish_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.BETWEENFISH, -65281, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> FISH = REGISTRY.register("fish", () -> new FishItem());
	public static final RegistryObject<Item> JUNK = REGISTRY.register("junk", () -> new JunkItem());
	public static final RegistryObject<Item> BETWEENLOG = block(BrokenSmpGodShardsModBlocks.BETWEENLOG);
	public static final RegistryObject<Item> JUNKORE = block(BrokenSmpGodShardsModBlocks.JUNKORE);
	public static final RegistryObject<Item> BUTCHERKNIFE = REGISTRY.register("butcherknife", () -> new ButcherknifeItem());
	public static final RegistryObject<Item> BETWEENFLESHBITS = REGISTRY.register("betweenfleshbits", () -> new BetweenfleshbitsItem());
	public static final RegistryObject<Item> JUNKPICKAXE = REGISTRY.register("junkpickaxe", () -> new JunkpickaxeItem());
	public static final RegistryObject<Item> SCRAPMAKERV_1 = block(BrokenSmpGodShardsModBlocks.SCRAPMAKERV_1);
	public static final RegistryObject<Item> SCRAPTRAP_SPAWN_EGG = REGISTRY.register("scraptrap_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.SCRAPTRAP, -13159, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> BETWEEN_ANVIL = block(BrokenSmpGodShardsModBlocks.BETWEEN_ANVIL);
	public static final RegistryObject<Item> BETWEENTRAP_SPAWN_EGG = REGISTRY.register("betweentrap_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.BETWEENTRAP, -52480, -6750157, new Item.Properties()));
	public static final RegistryObject<Item> BETWEEN_BEAR_TRAP_SCHEMATIC = REGISTRY.register("between_bear_trap_schematic", () -> new BetweenBearTrapSchematicItem());
	public static final RegistryObject<Item> JUNKTRAP_SCHEMATIC = REGISTRY.register("junktrap_schematic", () -> new JunktrapSchematicItem());
	public static final RegistryObject<Item> TURRET_BETWEEN_SPAWN_EGG = REGISTRY.register("turret_between_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.TURRET_BETWEEN, -16711681, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> TURRET = REGISTRY.register("turret", () -> new TurretItem());
	public static final RegistryObject<Item> BETWEENTURRETSCHEMATIC = REGISTRY.register("betweenturretschematic", () -> new BetweenturretschematicItem());
	public static final RegistryObject<Item> BUTCHERKNIFERES = REGISTRY.register("butcherkniferes", () -> new ButcherkniferesItem());
	public static final RegistryObject<Item> CROSBOWRUSTIC = REGISTRY.register("crosbowrustic", () -> new CrosbowrusticItem());
	public static final RegistryObject<Item> SCHAMATICKNIFES = REGISTRY.register("schamaticknifes", () -> new SchamaticknifesItem());
	public static final RegistryObject<Item> SCRAPBUNCH = REGISTRY.register("scrapbunch", () -> new ScrapbunchItem());
	public static final RegistryObject<Item> DETONATOR = REGISTRY.register("detonator", () -> new DetonatorItem());
	public static final RegistryObject<Item> ADMINEYE_SPAWN_EGG = REGISTRY.register("admineye_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.ADMINEYE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DAMAGE_5X_5_FLOPYDISK = REGISTRY.register("damage_5x_5_flopydisk", () -> new Damage5x5FlopydiskItem());
	public static final RegistryObject<Item> SUMMONMINNON = REGISTRY.register("summonminnon", () -> new SummonminnonItem());
	public static final RegistryObject<Item> DAY_DISK = REGISTRY.register("day_disk", () -> new DayDiskItem());
	public static final RegistryObject<Item> NIGHT_DISK = REGISTRY.register("night_disk", () -> new NightDiskItem());
	public static final RegistryObject<Item> ADMIN_STAFFOF_TIME = REGISTRY.register("admin_staffof_time", () -> new AdminStaffofTimeItem());
	public static final RegistryObject<Item> BETWEENTHROWINGKNIFE = REGISTRY.register("betweenthrowingknife", () -> new BetweenthrowingknifeItem());
	public static final RegistryObject<Item> BETWEENTHROWING = REGISTRY.register("betweenthrowing", () -> new BetweenthrowingItem());
	public static final RegistryObject<Item> BANDAGE = REGISTRY.register("bandage", () -> new BandageItem());
	public static final RegistryObject<Item> HERB_CRUSHER = REGISTRY.register("herb_crusher", () -> new HerbCrusherItem());
	public static final RegistryObject<Item> EYE_COREHERBS = REGISTRY.register("eye_coreherbs", () -> new EyeCoreherbsItem());
	public static final RegistryObject<Item> EYECORE = block(BrokenSmpGodShardsModBlocks.EYECORE);
	public static final RegistryObject<Item> GRAPPEL = REGISTRY.register("grappel", () -> new GrappelItem());
	public static final RegistryObject<Item> HOOK = REGISTRY.register("hook", () -> new HookItem());
	public static final RegistryObject<Item> COINS = REGISTRY.register("coins", () -> new CoinsItem());
	public static final RegistryObject<Item> CROWBAR = REGISTRY.register("crowbar", () -> new CrowbarItem());
	public static final RegistryObject<Item> GRASSBETWEEN = block(BrokenSmpGodShardsModBlocks.GRASSBETWEEN);
	public static final RegistryObject<Item> ZOMBIETRAVELERANIMATED_SPAWN_EGG = REGISTRY.register("zombietraveleranimated_spawn_egg",
			() -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.ZOMBIETRAVELERANIMATED, -10066432, -3394816, new Item.Properties()));
	public static final RegistryObject<Item> BUTCHER_SPAWN_EGG = REGISTRY.register("butcher_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.BUTCHER, -6710887, -3381760, new Item.Properties()));
	public static final RegistryObject<Item> ENITY_609ANIMATED_SPAWN_EGG = REGISTRY.register("enity_609animated_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.ENITY_609ANIMATED, -10092391, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> ENITY_609ANIMATEDPIC_SPAWN_EGG = REGISTRY.register("enity_609animatedpic_spawn_egg",
			() -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.ENITY_609ANIMATEDPIC, -3394816, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> MIMICANIMATED_SPAWN_EGG = REGISTRY.register("mimicanimated_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.MIMICANIMATED, -6711040, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> GURAD_BOT_SPAWN_EGG = REGISTRY.register("gurad_bot_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.GURAD_BOT, -10092340, -3407668, new Item.Properties()));
	public static final RegistryObject<Item> THE_SPITTER_SPAWN_EGG = REGISTRY.register("the_spitter_spawn_egg", () -> new ForgeSpawnEggItem(BrokenSmpGodShardsModEntities.THE_SPITTER, -3407668, -52480, new Item.Properties()));
	public static final RegistryObject<Item> ACID = REGISTRY.register("acid", () -> new AcidItem());
	public static final RegistryObject<Item> BETWEEN_VIRUS = REGISTRY.register("between_virus", () -> new BetweenVirusItem());
	public static final RegistryObject<Item> BETWEEN_BLOCK = block(BrokenSmpGodShardsModBlocks.BETWEEN_BLOCK);
	public static final RegistryObject<Item> SPEED_FLOWER = block(BrokenSmpGodShardsModBlocks.SPEED_FLOWER);
	public static final RegistryObject<Item> SPEEDBUBBLEMUSH = REGISTRY.register("speedbubblemush", () -> new SpeedbubblemushItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(ADMIN_STAFFOF_TIME.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
