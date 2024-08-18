package com.Harlefox.elementalfoxes.client.entity.model;

import com.Harlefox.elementalfoxes.common.entity.ExampleFox;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ExampleFoxModel<T extends ExampleFox> extends EntityModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Neck;
	private final ModelRenderer Neck_r1;
	private final ModelRenderer Head;
	private final ModelRenderer Snoot_r1;
	private final ModelRenderer LeftEar;
	private final ModelRenderer LEar2_r1;
	private final ModelRenderer LEar1_r1;
	private final ModelRenderer RightEar;
	private final ModelRenderer REar2_r1;
	private final ModelRenderer REar1_r1;
	private final ModelRenderer Jaw;
	private final ModelRenderer Chest;
	private final ModelRenderer Chest_r1;
	private final ModelRenderer Body1;
	private final ModelRenderer Body1_r1;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail1_r1;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail2_r1;
	private final ModelRenderer Tail3;
	private final ModelRenderer Tail3_r1;
	private final ModelRenderer Tail4;
	private final ModelRenderer Tail4_r1;
	private final ModelRenderer LeftHind;
	private final ModelRenderer LH1;
	private final ModelRenderer LH1_r1;
	private final ModelRenderer LH2;
	private final ModelRenderer LH2_r1;
	private final ModelRenderer LH3;
	private final ModelRenderer LH3_r1;
	private final ModelRenderer LHPaw;
	private final ModelRenderer RightHind;
	private final ModelRenderer RH1;
	private final ModelRenderer RH1_r1;
	private final ModelRenderer RH2;
	private final ModelRenderer RH2_r1;
	private final ModelRenderer RH3;
	private final ModelRenderer RH3_r1;
	private final ModelRenderer LeftFront;
	private final ModelRenderer LF1;
	private final ModelRenderer LF1_r1;
	private final ModelRenderer LF2;
	private final ModelRenderer LF2_r1;
	private final ModelRenderer LFPaw;
	private final ModelRenderer RightFront;
	private final ModelRenderer RF1;
	private final ModelRenderer RF1_r1;
	private final ModelRenderer RF2;
	private final ModelRenderer RF2_r1;
	private final ModelRenderer RFPaw;

	public ExampleFoxModel() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(3.0F, 10.0F, -9.0F);
		

		Body2 = new ModelRenderer(this);
		Body2.setPos(-3.0213F, -3.3313F, 2.0F);
		Body.addChild(Body2);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 6.0F, 20.0F);
		Body2.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 1.5708F, 0.0F);
		Body_r1.texOffs(0, 14).addBox(14.0213F, -6.1687F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setPos(-3.0F, 14.0F, 9.0F);
		Body.addChild(Neck);
		

		Neck_r1 = new ModelRenderer(this);
		Neck_r1.setPos(3.0F, -14.0F, -9.0F);
		Neck.addChild(Neck_r1);
		setRotationAngle(Neck_r1, 0.7854F, 0.0F, 0.0F);
		Neck_r1.texOffs(45, 42).addBox(-5.0F, -5.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -18.475F, -11.0F);
		Neck.addChild(Head);
		Head.texOffs(0, 31).addBox(-3.5F, -4.525F, -3.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);
		Head.texOffs(33, 0).addBox(-2.0F, -5.525F, -2.5F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.texOffs(3, 5).addBox(-0.5F, -1.425F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Snoot_r1 = new ModelRenderer(this);
		Snoot_r1.setPos(0.0F, 0.475F, -4.0F);
		Head.addChild(Snoot_r1);
		setRotationAngle(Snoot_r1, 0.0F, -3.1416F, 0.0F);
		Snoot_r1.texOffs(24, 15).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, true);

		LeftEar = new ModelRenderer(this);
		LeftEar.setPos(3.0F, -4.525F, 1.0F);
		Head.addChild(LeftEar);
		

		LEar2_r1 = new ModelRenderer(this);
		LEar2_r1.setPos(0.0F, -2.0F, 0.0F);
		LeftEar.addChild(LEar2_r1);
		setRotationAngle(LEar2_r1, 0.0F, 0.0F, 0.5236F);
		LEar2_r1.texOffs(0, 3).addBox(0.5F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		LEar1_r1 = new ModelRenderer(this);
		LEar1_r1.setPos(0.0F, 0.0F, 1.0F);
		LeftEar.addChild(LEar1_r1);
		setRotationAngle(LEar1_r1, 0.0F, 0.0F, 0.5236F);
		LEar1_r1.texOffs(0, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		RightEar = new ModelRenderer(this);
		RightEar.setPos(-3.0F, -4.525F, 1.0F);
		Head.addChild(RightEar);
		

		REar2_r1 = new ModelRenderer(this);
		REar2_r1.setPos(0.0F, -2.0F, 0.0F);
		RightEar.addChild(REar2_r1);
		setRotationAngle(REar2_r1, 0.0F, 0.0F, -0.5236F);
		REar2_r1.texOffs(0, 3).addBox(-1.5F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		REar1_r1 = new ModelRenderer(this);
		REar1_r1.setPos(0.0F, 0.0F, 1.0F);
		RightEar.addChild(REar1_r1);
		setRotationAngle(REar1_r1, 0.0F, 0.0F, -0.5236F);
		REar1_r1.texOffs(0, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		Jaw = new ModelRenderer(this);
		Jaw.setPos(1.0F, 0.975F, -3.0F);
		Head.addChild(Jaw);
		Jaw.texOffs(35, 19).addBox(-2.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		Chest = new ModelRenderer(this);
		Chest.setPos(-3.0F, 14.0F, 9.0F);
		Body.addChild(Chest);
		

		Chest_r1 = new ModelRenderer(this);
		Chest_r1.setPos(3.0F, -14.0F, -7.0F);
		Chest.addChild(Chest_r1);
		setRotationAngle(Chest_r1, -0.7854F, 0.0F, 0.0F);
		Chest_r1.texOffs(26, 37).addBox(-6.5F, -1.0F, -3.0F, 7.0F, 5.0F, 5.0F, 0.0F, false);

		Body1 = new ModelRenderer(this);
		Body1.setPos(-3.0F, 14.0F, 9.0F);
		Body.addChild(Body1);
		

		Body1_r1 = new ModelRenderer(this);
		Body1_r1.setPos(-0.0213F, -11.3313F, 13.0F);
		Body1.addChild(Body1_r1);
		setRotationAngle(Body1_r1, 0.0F, -1.5708F, 0.0F);
		Body1_r1.texOffs(0, 0).addBox(-14.0213F, -5.6687F, -3.5F, 13.0F, 7.0F, 7.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setPos(-3.0213F, -1.3313F, 21.0F);
		Body.addChild(Tail);
		

		Tail1 = new ModelRenderer(this);
		Tail1.setPos(0.0F, 0.0F, 0.0F);
		Tail.addChild(Tail1);
		

		Tail1_r1 = new ModelRenderer(this);
		Tail1_r1.setPos(0.0F, 4.0F, 1.0F);
		Tail1.addChild(Tail1_r1);
		setRotationAngle(Tail1_r1, -1.5708F, 1.309F, -1.5708F);
		Tail1_r1.texOffs(48, 3).addBox(-1.3227F, -4.8135F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		Tail2 = new ModelRenderer(this);
		Tail2.setPos(0.0F, 1.0F, 3.0F);
		Tail1.addChild(Tail2);
		

		Tail2_r1 = new ModelRenderer(this);
		Tail2_r1.setPos(0.0F, 3.0F, -2.0F);
		Tail2.addChild(Tail2_r1);
		setRotationAngle(Tail2_r1, -1.5708F, 1.0036F, -1.5708F);
		Tail2_r1.texOffs(35, 9).addBox(-8.4661F, -6.0898F, -2.5F, 9.0F, 5.0F, 5.0F, 0.0F, false);

		Tail3 = new ModelRenderer(this);
		Tail3.setPos(0.0F, 4.0F, 7.0F);
		Tail2.addChild(Tail3);
		

		Tail3_r1 = new ModelRenderer(this);
		Tail3_r1.setPos(0.0F, -1.0F, -9.0F);
		Tail3.addChild(Tail3_r1);
		setRotationAngle(Tail3_r1, -1.5708F, 1.309F, -1.5708F);
		Tail3_r1.texOffs(25, 23).addBox(-16.8278F, -4.8813F, -3.5F, 9.0F, 7.0F, 7.0F, 0.0F, false);

		Tail4 = new ModelRenderer(this);
		Tail4.setPos(0.0F, 2.0F, 7.0F);
		Tail3.addChild(Tail4);
		

		Tail4_r1 = new ModelRenderer(this);
		Tail4_r1.setPos(0.0F, -3.0F, -16.0F);
		Tail4.addChild(Tail4_r1);
		setRotationAngle(Tail4_r1, -1.5708F, 1.5272F, -1.5708F);
		Tail4_r1.texOffs(20, 47).addBox(-20.1514F, 0.5865F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		LeftHind = new ModelRenderer(this);
		LeftHind.setPos(3.0F, 1.0F, 17.5F);
		Body.addChild(LeftHind);
		

		LH1 = new ModelRenderer(this);
		LH1.setPos(0.0F, -1.0F, 1.5F);
		LeftHind.addChild(LH1);
		

		LH1_r1 = new ModelRenderer(this);
		LH1_r1.setPos(0.0F, 0.0F, 0.0F);
		LH1.addChild(LH1_r1);
		setRotationAngle(LH1_r1, 0.9599F, 0.0F, 0.0F);
		LH1_r1.texOffs(0, 43).addBox(-2.5F, -3.0F, -6.0F, 3.0F, 5.0F, 7.0F, 0.0F, true);

		LH2 = new ModelRenderer(this);
		LH2.setPos(-1.0F, 5.0F, -1.0F);
		LH1.addChild(LH2);
		

		LH2_r1 = new ModelRenderer(this);
		LH2_r1.setPos(0.0F, 0.0F, 0.0F);
		LH2.addChild(LH2_r1);
		setRotationAngle(LH2_r1, -2.1817F, 0.0F, 0.0F);
		LH2_r1.texOffs(13, 43).addBox(-1.0F, -4.9F, -0.7F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		LH3 = new ModelRenderer(this);
		LH3.setPos(0.0F, 3.0F, 2.0F);
		LH2.addChild(LH3);
		

		LH3_r1 = new ModelRenderer(this);
		LH3_r1.setPos(0.0F, 0.0F, 0.0F);
		LH3.addChild(LH3_r1);
		setRotationAngle(LH3_r1, 2.5307F, 0.0F, 0.0F);
		LH3_r1.texOffs(0, 14).addBox(-1.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		LHPaw = new ModelRenderer(this);
		LHPaw.setPos(1.0F, 6.0F, -4.0F);
		LH3.addChild(LHPaw);
		LHPaw.texOffs(45, 37).addBox(-2.5F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		RightHind = new ModelRenderer(this);
		RightHind.setPos(-9.0F, 1.0F, 17.5F);
		Body.addChild(RightHind);
		

		RH1 = new ModelRenderer(this);
		RH1.setPos(0.0F, -1.0F, 1.5F);
		RightHind.addChild(RH1);
		

		RH1_r1 = new ModelRenderer(this);
		RH1_r1.setPos(0.0F, 0.0F, 0.0F);
		RH1.addChild(RH1_r1);
		setRotationAngle(RH1_r1, 0.9599F, 0.0F, 0.0F);
		RH1_r1.texOffs(0, 43).addBox(-0.5F, -3.0F, -6.0F, 3.0F, 5.0F, 7.0F, 0.0F, false);

		RH2 = new ModelRenderer(this);
		RH2.setPos(1.0F, 5.0F, -1.0F);
		RH1.addChild(RH2);
		

		RH2_r1 = new ModelRenderer(this);
		RH2_r1.setPos(0.0F, 0.0F, 0.0F);
		RH2.addChild(RH2_r1);
		setRotationAngle(RH2_r1, -2.1817F, 0.0F, 0.0F);
		RH2_r1.texOffs(13, 43).addBox(-1.0F, -4.9F, -0.7F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		RH3 = new ModelRenderer(this);
		RH3.setPos(0.0F, 3.0F, 2.0F);
		RH2.addChild(RH3);
		RH3.texOffs(45, 37).addBox(-1.5F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		RH3_r1 = new ModelRenderer(this);
		RH3_r1.setPos(0.0F, 0.0F, 0.0F);
		RH3.addChild(RH3_r1);
		setRotationAngle(RH3_r1, 2.5307F, 0.0F, 0.0F);
		RH3_r1.texOffs(0, 14).addBox(-1.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		LeftFront = new ModelRenderer(this);
		LeftFront.setPos(3.0F, 1.0F, 4.0F);
		Body.addChild(LeftFront);
		

		LF1 = new ModelRenderer(this);
		LF1.setPos(-1.0F, -2.0F, 0.0F);
		LeftFront.addChild(LF1);
		

		LF1_r1 = new ModelRenderer(this);
		LF1_r1.setPos(0.0F, 0.0F, 0.0F);
		LF1.addChild(LF1_r1);
		setRotationAngle(LF1_r1, -2.7925F, 0.0F, 0.0F);
		LF1_r1.texOffs(36, 49).addBox(-1.5F, -8.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		LF2 = new ModelRenderer(this);
		LF2.setPos(0.0F, 7.0F, 2.0F);
		LF1.addChild(LF2);
		

		LF2_r1 = new ModelRenderer(this);
		LF2_r1.setPos(0.0F, 0.0F, 0.0F);
		LF2.addChild(LF2_r1);
		setRotationAngle(LF2_r1, 2.5307F, 0.0F, 0.0F);
		LF2_r1.texOffs(50, 19).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		LFPaw = new ModelRenderer(this);
		LFPaw.setPos(1.0F, 8.0F, -5.0F);
		LF2.addChild(LFPaw);
		LFPaw.texOffs(48, 52).addBox(-2.5F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		RightFront = new ModelRenderer(this);
		RightFront.setPos(-9.0F, 1.0F, 4.0F);
		Body.addChild(RightFront);
		

		RF1 = new ModelRenderer(this);
		RF1.setPos(1.0F, -2.0F, 0.0F);
		RightFront.addChild(RF1);
		

		RF1_r1 = new ModelRenderer(this);
		RF1_r1.setPos(0.0F, 0.0F, 0.0F);
		RF1.addChild(RF1_r1);
		setRotationAngle(RF1_r1, -2.7925F, 0.0F, 0.0F);
		RF1_r1.texOffs(36, 49).addBox(-1.5F, -8.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, true);

		RF2 = new ModelRenderer(this);
		RF2.setPos(0.0F, 7.0F, 2.0F);
		RF1.addChild(RF2);
		

		RF2_r1 = new ModelRenderer(this);
		RF2_r1.setPos(0.0F, 0.0F, 0.0F);
		RF2.addChild(RF2_r1);
		setRotationAngle(RF2_r1, 2.5307F, 0.0F, 0.0F);
		RF2_r1.texOffs(50, 19).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		RFPaw = new ModelRenderer(this);
		RFPaw.setPos(-1.0F, 8.0F, -5.0F);
		RF2.addChild(RFPaw);
		RFPaw.texOffs(48, 52).addBox(-0.5F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
	}
	

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		 this.Head.xRot = (headPitch * ((float)Math.PI / 180F));
	        this.Head.yRot = netHeadYaw * ((float)Math.PI / 180F);
	        this.RightHind.xRot = MathHelper.cos(limbSwing * 0.6F) * 1.0F * limbSwingAmount;
	        this.LeftHind.xRot = MathHelper.cos(limbSwing * 0.6F + (float)Math.PI) * 1.0F * limbSwingAmount;
	        this.RightFront.xRot = MathHelper.cos(limbSwing * 0.6F + (float)Math.PI) * 1.0F * limbSwingAmount;
	        this.LeftFront.xRot = MathHelper.cos(limbSwing * 0.6F) * 1.0F * limbSwingAmount;
		
	}

}