package com.Harlefox.elementalfoxes.core.itemgroup;

import com.Harlefox.elementalfoxes.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ElementalFoxesItemGroup extends ItemGroup{
	
	public static final ElementalFoxesItemGroup ELEMENTAL_FOXES = new ElementalFoxesItemGroup(ItemGroup.getGroupCountSafe(), "elemental_foxes");

	public ElementalFoxesItemGroup(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.VULPESIUM_CRYSTAL.get());
	}

}
