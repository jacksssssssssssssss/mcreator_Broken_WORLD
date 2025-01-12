package net.mcreator.brokensmpgodshards.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.brokensmpgodshards.world.inventory.AdminpcMenu;
import net.mcreator.brokensmpgodshards.network.AdminpcButtonMessage;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AdminpcScreen extends AbstractContainerScreen<AdminpcMenu> {
	private final static HashMap<String, Object> guistate = AdminpcMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_admin;
	ImageButton imagebutton_server_icon;
	ImageButton imagebutton_sprite0004;
	ImageButton imagebutton_sprite00041;

	public AdminpcScreen(AdminpcMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 431;
		this.imageHeight = 250;
	}

	private static final ResourceLocation texture = new ResourceLocation("broken_smp_god_shards:textures/screens/adminpc.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_smp_god_shards.adminpc.label_the_admins_eye"), 178, 49, -6711040, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_smp_god_shards.adminpc.label_disk"), 185, 103, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_smp_god_shards.adminpc.label_mimion"), 145, 103, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_smp_god_shards.adminpc.label_day"), 229, 102, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_smp_god_shards.adminpc.label_night"), 261, 103, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_admin = new ImageButton(this.leftPos + 144, this.topPos + 72, 32, 32, 0, 0, 32, new ResourceLocation("broken_smp_god_shards:textures/screens/atlas/imagebutton_admin.png"), 32, 64, e -> {
			if (true) {
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new AdminpcButtonMessage(0, x, y, z));
				AdminpcButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_admin", imagebutton_admin);
		this.addRenderableWidget(imagebutton_admin);
		imagebutton_server_icon = new ImageButton(this.leftPos + 178, this.topPos + 71, 32, 32, 0, 0, 32, new ResourceLocation("broken_smp_god_shards:textures/screens/atlas/imagebutton_server_icon.png"), 32, 64, e -> {
			if (true) {
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new AdminpcButtonMessage(1, x, y, z));
				AdminpcButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_server_icon", imagebutton_server_icon);
		this.addRenderableWidget(imagebutton_server_icon);
		imagebutton_sprite0004 = new ImageButton(this.leftPos + 221, this.topPos + 71, 32, 32, 0, 0, 32, new ResourceLocation("broken_smp_god_shards:textures/screens/atlas/imagebutton_sprite0004.png"), 32, 64, e -> {
			if (true) {
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new AdminpcButtonMessage(2, x, y, z));
				AdminpcButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_sprite0004", imagebutton_sprite0004);
		this.addRenderableWidget(imagebutton_sprite0004);
		imagebutton_sprite00041 = new ImageButton(this.leftPos + 259, this.topPos + 71, 32, 32, 0, 0, 32, new ResourceLocation("broken_smp_god_shards:textures/screens/atlas/imagebutton_sprite00041.png"), 32, 64, e -> {
			if (true) {
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new AdminpcButtonMessage(3, x, y, z));
				AdminpcButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_sprite00041", imagebutton_sprite00041);
		this.addRenderableWidget(imagebutton_sprite00041);
	}
}
