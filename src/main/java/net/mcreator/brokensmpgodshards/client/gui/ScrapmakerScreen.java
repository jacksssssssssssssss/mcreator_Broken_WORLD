package net.mcreator.brokensmpgodshards.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.brokensmpgodshards.world.inventory.ScrapmakerMenu;
import net.mcreator.brokensmpgodshards.network.ScrapmakerButtonMessage;
import net.mcreator.brokensmpgodshards.BrokenSmpGodShardsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ScrapmakerScreen extends AbstractContainerScreen<ScrapmakerMenu> {
	private final static HashMap<String, Object> guistate = ScrapmakerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_scrapify;

	public ScrapmakerScreen(ScrapmakerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 285;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("broken_smp_god_shards:textures/screens/between_anvil.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_smp_god_shards.between_anvil.label_scrap_maker"), 107, 18, -6711040, false);
	}

	@Override
	public void init() {
		super.init();
		button_scrapify = Button.builder(Component.translatable("gui.broken_smp_god_shards.between_anvil.button_scrapify"), e -> {
			if (true) {
				BrokenSmpGodShardsMod.PACKET_HANDLER.sendToServer(new ScrapmakerButtonMessage(0, x, y, z));
				ScrapmakerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 33, 67, 20).build();
		guistate.put("button:button_scrapify", button_scrapify);
		this.addRenderableWidget(button_scrapify);
	}
}
