// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart betweenthrowinpng;

	public ModelCustomModel(ModelPart root) {
		this.betweenthrowinpng = root.getChild("betweenthrowinpng");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition betweenthrowinpng = partdefinition.addOrReplaceChild("betweenthrowinpng",
				CubeListBuilder.create().texOffs(8, 6)
						.addBox(1.5F, -10.0F, 0.0F, 1.0F, 6.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(1.0F, -7.5F, 0.0F, 0.5F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 12)
						.addBox(2.0F, -4.0F, 0.0F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		betweenthrowinpng.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}