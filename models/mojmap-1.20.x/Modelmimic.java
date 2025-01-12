// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmimic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mimic"), "main");
	private final ModelPart base;
	private final ModelPart mouth;

	public Modelmimic(ModelPart root) {
		this.base = root.getChild("base");
		this.mouth = root.getChild("mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-6.0F, 0.0F, -4.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-4.0F, 10.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-4.0F, 10.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-4.0F, 10.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-4.0F, 10.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(5.0F, 10.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(5.0F, 10.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(5.0F, 10.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(5.0F, 10.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(0.0F, 10.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(3.0F, 10.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(5.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-4.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-2.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(0.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(3.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-2.0F, 10.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 24.0F, -1.0F, 0.0F, -1.5708F, 3.1416F));

		PartDefinition mouth = partdefinition.addOrReplaceChild("mouth",
				CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F, -3.0F, -12.0F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 12.0F, 16.0F, -1.5708F, -1.5708F, 0.0F));

		PartDefinition mouth_r1 = mouth
				.addOrReplaceChild("mouth_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -9.0F, 2.0F, 14.0F, 5.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-9.0F, -9.0F, 5.0F, 3.098F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.mouth.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}