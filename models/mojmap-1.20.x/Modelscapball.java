// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelscapball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "scapball"), "main");
	private final ModelPart bb_main;

	public Modelscapball(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 11)
						.addBox(2.0F, -4.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(-1.1F, -4.0F, -2.0F, 3.1F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-1.0F, -4.0F, 2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 16)
						.addBox(-2.0F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 16)
						.addBox(2.0F, -4.0F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, -5.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}