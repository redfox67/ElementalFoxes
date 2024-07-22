package com.Harlefox.elementalfoxes.client.entity;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.client.entity.model.ExampleFoxModel;
import com.Harlefox.elementalfoxes.common.entity.ExampleFox;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExampleFoxRenderer extends MobRenderer<ExampleFox, ExampleFoxModel<ExampleFox>>{
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(ElementalFoxes.MOD_ID, "textures/entity/example/example.png");

	public ExampleFoxRenderer(EntityRendererManager manager) {
		super(manager, new ExampleFoxModel<>(), 0.7f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResourceLocation getTextureLocation(ExampleFox p_110775_1_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}
