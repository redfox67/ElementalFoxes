package com.Harlefox.elementalfoxes.client.entity.model;

import com.Harlefox.elementalfoxes.common.entity.ExampleEntity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ExampleEntityModel<T extends ExampleEntity> extends EntityModel<T> {
	private final ModelRenderer bb_main;
	private final ModelRenderer REar2_r1;
	private final ModelRenderer LEar2_r1;
	private final ModelRenderer REar1_r1;
	private final ModelRenderer LEar1_r1;
	private final ModelRenderer Snoot_r1;
	private final ModelRenderer Neck_r1;
	private final ModelRenderer RH3_r1;
	private final ModelRenderer LF2_r1;
	private final ModelRenderer RF1_r1;
	private final ModelRenderer Chest_r1;
	private final ModelRenderer RH2_r1;
	private final ModelRenderer RH1_r1;
	private final ModelRenderer Tail4_r1;
	private final ModelRenderer Tail3_r1;
	private final ModelRenderer Tail2_r1;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body1_r1;

	public ExampleEntityModel() {
		texWidth = 64;
		texHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(22, 49).addBox(3.5F, -2.0F, 6.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.texOffs(22, 49).addBox(-6.5F, -2.0F, -9.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.texOffs(22, 49).addBox(3.5F, -2.0F, -9.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		bb_main.texOffs(22, 49).addBox(-6.5F, -2.0F, 6.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		bb_main.texOffs(40, 0).addBox(-3.0F, -22.0F, -14.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(3, 5).addBox(-0.5F, -19.9F, -17.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(35, 19).addBox(-2.0F, -23.0F, -13.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		REar2_r1 = new ModelRenderer(this);
		REar2_r1.setPos(-2.0F, -25.0F, -12.0F);
		bb_main.addChild(REar2_r1);
		setRotationAngle(REar2_r1, 0.0F, 0.0F, -0.5236F);
		REar2_r1.texOffs(0, 3).addBox(-1.5F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		LEar2_r1 = new ModelRenderer(this);
		LEar2_r1.setPos(2.0F, -25.0F, -12.0F);
		bb_main.addChild(LEar2_r1);
		setRotationAngle(LEar2_r1, 0.0F, 0.0F, 0.5236F);
		LEar2_r1.texOffs(0, 3).addBox(0.5F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		REar1_r1 = new ModelRenderer(this);
		REar1_r1.setPos(-2.0F, -23.0F, -11.0F);
		bb_main.addChild(REar1_r1);
		setRotationAngle(REar1_r1, 0.0F, 0.0F, -0.5236F);
		REar1_r1.texOffs(0, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		LEar1_r1 = new ModelRenderer(this);
		LEar1_r1.setPos(2.0F, -23.0F, -11.0F);
		bb_main.addChild(LEar1_r1);
		setRotationAngle(LEar1_r1, 0.0F, 0.0F, 0.5236F);
		LEar1_r1.texOffs(0, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		Snoot_r1 = new ModelRenderer(this);
		Snoot_r1.setPos(0.0F, -18.0F, -15.0F);
		bb_main.addChild(Snoot_r1);
		setRotationAngle(Snoot_r1, 0.0F, 3.1416F, 0.0F);
		Snoot_r1.texOffs(0, 50).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		Neck_r1 = new ModelRenderer(this);
		Neck_r1.setPos(3.0F, -14.0F, -9.0F);
		bb_main.addChild(Neck_r1);
		setRotationAngle(Neck_r1, 0.7854F, 0.0F, 0.0F);
		Neck_r1.texOffs(41, 37).addBox(-5.0F, -5.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		RH3_r1 = new ModelRenderer(this);
		RH3_r1.setPos(-5.0F, -6.0F, 11.0F);
		bb_main.addChild(RH3_r1);
		setRotationAngle(RH3_r1, 2.5307F, 0.0F, 0.0F);
		RH3_r1.texOffs(14, 48).addBox(-1.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		RH3_r1.texOffs(14, 48).addBox(9.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		LF2_r1 = new ModelRenderer(this);
		LF2_r1.setPos(5.0F, -8.0F, -3.0F);
		bb_main.addChild(LF2_r1);
		setRotationAngle(LF2_r1, 2.5307F, 0.0F, 0.0F);
		LF2_r1.texOffs(14, 48).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);
		LF2_r1.texOffs(14, 48).addBox(-11.0F, -8.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		RF1_r1 = new ModelRenderer(this);
		RF1_r1.setPos(-5.0F, -15.0F, -5.0F);
		bb_main.addChild(RF1_r1);
		setRotationAngle(RF1_r1, -2.7925F, 0.0F, 0.0F);
		RF1_r1.texOffs(38, 47).addBox(-1.5F, -8.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, true);
		RF1_r1.texOffs(38, 47).addBox(8.5F, -8.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		Chest_r1 = new ModelRenderer(this);
		Chest_r1.setPos(3.0F, -10.0F, -8.0F);
		bb_main.addChild(Chest_r1);
		setRotationAngle(Chest_r1, 0.7854F, 0.0F, 0.0F);
		Chest_r1.texOffs(35, 9).addBox(-6.5F, -5.0F, -1.0F, 7.0F, 5.0F, 5.0F, 0.0F, false);

		RH2_r1 = new ModelRenderer(this);
		RH2_r1.setPos(-5.0F, -9.0F, 9.0F);
		bb_main.addChild(RH2_r1);
		setRotationAngle(RH2_r1, -2.1817F, 0.0F, 0.0F);
		RH2_r1.texOffs(50, 19).addBox(-1.0F, -4.9F, -0.7F, 2.0F, 5.0F, 2.0F, 0.0F, true);
		RH2_r1.texOffs(50, 19).addBox(9.0F, -4.9F, -0.7F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		RH1_r1 = new ModelRenderer(this);
		RH1_r1.setPos(-6.0F, -14.0F, 10.0F);
		bb_main.addChild(RH1_r1);
		setRotationAngle(RH1_r1, 0.9599F, 0.0F, 0.0F);
		RH1_r1.texOffs(21, 37).addBox(-0.5F, -3.0F, -6.0F, 3.0F, 5.0F, 7.0F, 0.0F, false);
		RH1_r1.texOffs(21, 37).addBox(9.5F, -3.0F, -6.0F, 3.0F, 5.0F, 7.0F, 0.0F, true);

		Tail4_r1 = new ModelRenderer(this);
		Tail4_r1.setPos(-0.0213F, -11.3313F, 13.0F);
		bb_main.addChild(Tail4_r1);
		setRotationAngle(Tail4_r1, -1.5708F, 1.5272F, -1.5708F);
		Tail4_r1.texOffs(0, 42).addBox(-20.1514F, 0.5865F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		Tail3_r1 = new ModelRenderer(this);
		Tail3_r1.setPos(-0.0213F, -11.3313F, 13.0F);
		bb_main.addChild(Tail3_r1);
		setRotationAngle(Tail3_r1, -1.5708F, 1.309F, -1.5708F);
		Tail3_r1.texOffs(25, 23).addBox(-16.8278F, -4.8813F, -3.5F, 9.0F, 7.0F, 7.0F, 0.0F, false);
		Tail3_r1.texOffs(24, 16).addBox(-1.3227F, -4.8135F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		Tail2_r1 = new ModelRenderer(this);
		Tail2_r1.setPos(-0.0213F, -11.3313F, 13.0F);
		bb_main.addChild(Tail2_r1);
		setRotationAngle(Tail2_r1, -1.5708F, 1.0036F, -1.5708F);
		Tail2_r1.texOffs(0, 32).addBox(-8.4661F, -6.0898F, -2.5F, 9.0F, 5.0F, 5.0F, 0.0F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(-0.0213F, -11.3313F, 13.0F);
		bb_main.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 1.5708F, 0.0F);
		Body_r1.texOffs(0, 14).addBox(14.0213F, -6.1687F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Body1_r1 = new ModelRenderer(this);
		Body1_r1.setPos(-0.0213F, -11.3313F, 13.0F);
		bb_main.addChild(Body1_r1);
		setRotationAngle(Body1_r1, 0.0F, -1.5708F, 0.0F);
		Body1_r1.texOffs(0, 0).addBox(-14.0213F, -5.6687F, -3.5F, 13.0F, 7.0F, 7.0F, 0.0F, false);
	}

	

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void setupAnim(ExampleEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
			float p_225597_5_, float p_225597_6_) {
		// TODO Auto-generated method stub
		
	}

}