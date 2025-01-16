package net.mcreator.brokensmpgodshards.client.renderer;

import com.mojang.math.Axis;

public class SliceRenderer extends EntityRenderer<SliceEntity> {

	private static final ResourceLocation texture = new ResourceLocation("broken_smp_god_shards:textures/entities/slashss.png");

	private final Modelslash model;

	public SliceRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelslash(context.bakeLayer(Modelslash.LAYER_LOCATION));
	}

	@Override
	public void render(SliceEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(SliceEntity entity) {
		return texture;
	}

}
