package com.Harlefox.elementalfoxes.core.init;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.common.entity.ExampleEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {
	
	public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ElementalFoxes.MOD_ID);
	
	public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE = ENTITY_TYPES.register("example", () -> EntityType.Builder.of(ExampleEntity::new, EntityClassification.MONSTER).sized(1.0f,1.0f).build(new ResourceLocation(ElementalFoxes.MOD_ID, "example").toString()));

}
