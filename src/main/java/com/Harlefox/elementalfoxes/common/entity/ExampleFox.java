package com.Harlefox.elementalfoxes.common.entity;

import com.Harlefox.elementalfoxes.core.init.EntityTypesInit;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ExampleFox extends FoxEntity {
	
	public static final Ingredient TEMPTATION_ITEMS = Ingredient.of(Items.CHICKEN);

    public ExampleFox(EntityType<? extends FoxEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap setAttributes() {
        return createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D) // Add maximum health attribute
                .add(Attributes.FOLLOW_RANGE, 16.0D) // Add follow range attribute
                .add(Attributes.ATTACK_KNOCKBACK, 1.0D) // Add attack knockback attribute
                .add(Attributes.JUMP_STRENGTH, 16.0D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .build(); // Build and return AttributeModifierMap
    }
    
    @Override
    protected void registerGoals() {
    	super.registerGoals();
    	this.goalSelector.addGoal(0, new SwimGoal(this));
    	this.goalSelector.addGoal(1, new PanicGoal(this, 1.1D));
    	this.goalSelector.addGoal(2, new BreedGoal(this, 1.0f));
    	this.goalSelector.addGoal(3, new TemptGoal(this, 0.7D, false, TEMPTATION_ITEMS));
    	this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.12D));
    	this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
    	this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 1.0F));
    	this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
    }
    
    protected int getExperienceReward(PlayerEntity player) {
    	return 5;
    }
    
    @Override
    protected SoundEvent getDeathSound() {
    	return SoundEvents.FOX_DEATH;
    }
    
    @Override
    protected SoundEvent getAmbientSound() {
    	return SoundEvents.FOX_AMBIENT;
    }
    
	@Override
	public FoxEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
		// TODO Auto-generated method stub
		return EntityTypesInit.EXAMPLE.get().create(world);
	}
}