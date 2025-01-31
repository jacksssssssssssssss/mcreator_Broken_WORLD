package net.mcreator.brokensmpgodshards.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltaze_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("broken_smp_god_shards", "modeltaze_converted"), "main");
	public final ModelPart bone;

	public Modeltaze_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 4).addBox(-10.0F, -6.0F, 5.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 13).addBox(-10.0F, -7.0F, 5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 4)
						.addBox(-10.0F, -5.0F, 4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-10.0F, -6.0F, 5.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(15, 0)
						.addBox(-10.0F, -5.0F, 5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 8).addBox(-10.0F, -6.0F, 5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-10.0F, -6.0F, 5.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 7).addBox(-8.0F, -7.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-8.0F, -7.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 16).mirror().addBox(-9.0F, -7.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 7).mirror()
						.addBox(-9.0F, -7.0F, 10.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).addBox(-8.0F, -7.0F, 12.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 6).mirror()
						.addBox(-10.0F, -7.0F, 12.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 4).addBox(-10.0F, -6.0F, 10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -7.0F, 12.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 16).addBox(-10.0F, -7.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 7)
						.addBox(-10.0F, -7.0F, 7.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
