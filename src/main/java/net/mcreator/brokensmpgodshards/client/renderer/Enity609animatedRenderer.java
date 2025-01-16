
package net.mcreator.brokensmpgodshards.client.renderer;

public class Enity609animatedRenderer extends GeoEntityRenderer<Enity609animatedEntity> {
	public Enity609animatedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new Enity609animatedModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(Enity609animatedEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, Enity609animatedEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}