package net.mcreator.brokensmpgodshards.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgolm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("broken_smp_god_shards", "modelgolm"), "main");
	public final ModelPart rightleg;
	public final ModelPart bone;
	public final ModelPart rigtarm;
	public final ModelPart leftarm;
	public final ModelPart leftleg;
	public final ModelPart body;
	public final ModelPart bb_main;

	public Modelgolm(ModelPart root) {
		this.rightleg = root.getChild("rightleg");
		this.bone = root.getChild("bone");
		this.rigtarm = root.getChild("rigtarm");
		this.leftarm = root.getChild("leftarm");
		this.leftleg = root.getChild("leftleg");
		this.body = root.getChild("body");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(38, 18).addBox(-3.0F, 4.0F, -3.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 30).addBox(-3.0F, 12.0F, -7.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 10.0F, 0.0F));
		PartDefinition cube_r1 = rightleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 59).addBox(-1.0F, -9.0F, -3.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 14.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0F, 1.0F, 0.0F));
		PartDefinition rigtarm = partdefinition.addOrReplaceChild("rigtarm", CubeListBuilder.create(), PartPose.offset(-8.0F, 2.0F, 0.0F));
		PartDefinition cube_r2 = rigtarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 1.0F, -5.0F, 13.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 11.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(6.0F, 2.0F, 0.0F));
		PartDefinition cube_r3 = leftarm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 2.0F, -5.0F, 13.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 11.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(38, 0).addBox(-3.0F, 8.0F, -7.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 40).addBox(-3.0F, 0.0F, -3.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 14.0F, 0.0F));
		PartDefinition cube_r4 = leftleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 59).addBox(-1.0F, -9.0F, -3.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(6, 70).addBox(-9.0F, -4.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 36).addBox(-7.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 69)
						.addBox(-3.0F, -4.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-3.0F, -7.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 13.0F, 0.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 69).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.2654F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 69).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.9199F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 69).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.6581F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 69).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.5272F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 12).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 2.0508F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 66).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.3963F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 66).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.6581F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 36).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.789F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 65).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, -3.0107F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 2.618F));
		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 66).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 2.8798F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 3.0107F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 65).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(64, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 52).addBox(1.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(39, 62)
						.addBox(1.0F, -9.0F, 1.0F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -2.0F, -5.0F, 13.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-1.0F, -2.0F, -5.0F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 54).addBox(4.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(47, 62)
						.addBox(4.0F, -9.0F, 1.0F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(7.0F, -10.0F, -5.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 30).addBox(-5.0F, -26.0F, -5.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 18).addBox(4.0F, -30.0F, -5.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 58)
						.addBox(1.0F, -28.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 40).addBox(3.0F, -30.0F, -5.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 10)
						.addBox(-5.0F, -30.0F, -5.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 28).addBox(-5.0F, -28.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-3.0F, -28.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 50).addBox(-1.0F, -28.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rigtarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rigtarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
