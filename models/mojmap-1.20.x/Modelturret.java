// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelturret<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "turret"), "main");
	private final ModelPart bone;

	public Modelturret(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(38, 48)
						.addBox(-10.0F, 13.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 56)
						.addBox(-6.0F, 13.0F, 5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 60)
						.addBox(-6.0F, 13.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -2.0F, -1.0F, 11.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-5.0F, -2.0F, 0.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.0F, -5.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 34)
						.addBox(-11.0F, -2.0F, -1.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-9.0F, -4.0F, 3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 40)
						.addBox(-11.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-9.0F, -4.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 9)
						.addBox(-11.0F, -4.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-11.0F, -5.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 34)
						.addBox(-9.0F, -5.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 35)
						.addBox(-5.0F, -5.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.0F, -5.0F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 5)
						.addBox(-4.0F, -5.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(-4.0F, -4.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 9.0F, 4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 12).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -2.0F, 3.0F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 5).addBox(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -2.0F, -2.0F, -1.5708F, -1.3963F, 1.5708F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(45, 30).addBox(-3.0F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 15.0F, 0.0F, 0.0163F, -0.0231F, 0.033F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 11.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 1.0F, -0.3096F, -1.4757F, 0.0016F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(8, 20).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 11.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 15.0F, 1.0F, 0.3096F, -1.4757F, 0.0016F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 5).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 11.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 6.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 11.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, -4.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}