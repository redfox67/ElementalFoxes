package com.Harlefox.elementalfoxes.client.entity;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.client.entity.model.ExampleEntityModel;
import com.Harlefox.elementalfoxes.common.entity.ExampleEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExampleEntityRenderer extends MobRenderer<ExampleEntity, ExampleEntityModel<ExampleEntity>>{
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(ElementalFoxes.MOD_ID, "textures/entity/example/example.png");

	public ExampleEntityRenderer(EntityRendererManager manager) {
		super(manager, new ExampleEntityModel<>(), 0.7f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResourceLocation getTextureLocation(ExampleEntity p_110775_1_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}
