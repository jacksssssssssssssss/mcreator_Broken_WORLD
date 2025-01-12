
package net.mcreator.brokensmpgodshards.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.brokensmpgodshards.world.inventory.AdminpcMenu;
import net.mcreator.brokensmpgodshards.procedures.NightdiskproProcedure;
import net.mcreator.brokensmpgodshards.procedures.DiskdayProcedure;
import net.mcreator.brokensmpgodshards.procedures.AreaeffectProcedure;
import net.mcreator.brokensmpgodshards.procedures.AdminpcbuttenProcedure;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdminpcButtonMessage {
	private final int buttonID, x, y, z;

	public AdminpcButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AdminpcButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AdminpcButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AdminpcButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AdminpcMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AdminpcbuttenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			AreaeffectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			DiskdayProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			NightdiskproProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BrokenSmpGodShardsMod.addNetworkMessage(AdminpcButtonMessage.class, AdminpcButtonMessage::buffer, AdminpcButtonMessage::new, AdminpcButtonMessage::handler);
	}
}
