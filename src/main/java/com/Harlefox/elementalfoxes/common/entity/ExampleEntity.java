package com.Harlefox.elementalfoxes.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ExampleEntity extends MobEntity {

    public ExampleEntity(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap setAttributes() {
        return createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D) // Add maximum health attribute
                .add(Attributes.FOLLOW_RANGE, 16.0D) // Add follow range attribute
                .add(Attributes.ATTACK_KNOCKBACK, 1.0D) // Add attack knockback attribute
                .build(); // Build and return AttributeModifierMap
    }
    
    @Override
    protected void registerGoals() {
    	super.registerGoals();
    	
    	this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
    	this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 8.0f));
    	
    	this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }
    
    protected int getExperienceReward(PlayerEntity player) {
    	return 5;
    }
    
    @Override
    protected SoundEvent getDeathSound() {
    	return SoundEvents.FOX_DEATH;
    }
}