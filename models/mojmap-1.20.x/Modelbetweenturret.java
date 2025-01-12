// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbetweenturret<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "betweenturret"), "main");
	private final ModelPart bb_main;

	public Modelbetweenturret(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(37, 48)
						.addBox(-7.0F, -1.0F, -1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 53)
						.addBox(-2.0F, -1.0F, 4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 58)
						.addBox(-2.0F, -1.0F, -6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 29)
						.addBox(2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, -1.0F, 11.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, -17.0F, 0.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(2.0F, -20.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 34)
						.addBox(-7.0F, -17.0F, -1.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-5.0F, -19.0F, 3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 40)
						.addBox(-7.0F, -19.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-5.0F, -19.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 9)
						.addBox(-7.0F, -19.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-7.0F, -20.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 34)
						.addBox(-5.0F, -20.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 35)
						.addBox(-1.0F, -20.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(0.0F, -20.0F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 5)
						.addBox(0.0F, -20.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(0.0F, -19.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 12).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -17.0F, 3.0F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 5).addBox(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -17.0F, -2.0F, -1.5708F, -1.3963F, 1.5708F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, -0.3096F, -1.4757F, 0.0016F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 20).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 1.0F, 0.3096F, -1.4757F, 0.0016F));

		PartDefinition cube_r5 = bb_main
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(16, 5).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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