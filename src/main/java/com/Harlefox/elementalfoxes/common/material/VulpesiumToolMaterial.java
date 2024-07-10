package com.Harlefox.elementalfoxes.common.material;

import java.util.function.Supplier;

import com.Harlefox.elementalfoxes.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum VulpesiumToolMaterial implements IItemTier{
	
	VULPESIUM_PICK(4, 2000, 15f, 2f, 17, () -> Ingredient.of(ItemInit.VULPESIUM_INGOT.get())),
	VULPESIUM_HOE(4, 2000, 15f, 2f, 17, () -> Ingredient.of(ItemInit.VULPESIUM_INGOT.get())),
	VULPESIUM_AXE(4, 2000, 15f, 2f, 17, () -> Ingredient.of(ItemInit.VULPESIUM_INGOT.get())),
	VULPESIUM_SHOVEL(4, 2000, 15f, 2f, 17, () -> Ingredient.of(ItemInit.VULPESIUM_INGOT.get())),
	VULPESIUM_SWORD(0, 2000, 1f, 8f, 17, () -> Ingredient.of(ItemInit.VULPESIUM_INGOT.get()));
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	VulpesiumToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}
	

	@Override
	public int getUses() {
		// TODO Auto-generated method stub
		return this.maxUses;
	}

	@Override
	public float getSpeed() {
		// TODO Auto-generated method stub
		return this.efficiency;
	}

	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return this.attackDamage;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.harvestLevel;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return (Ingredient) this.repairMaterial;
	}

}
