package com.Harlefox.elementalfoxes.core.init;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.core.itemgroup.ElementalFoxesItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ElementalFoxes.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));
	public static final RegistryObject<Item> VULPESIUM_CRYSTAL = ITEMS.register("vulpesium_crystal",
			() -> new Item(new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

}
