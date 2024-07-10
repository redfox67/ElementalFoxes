package com.Harlefox.elementalfoxes.core.init;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.common.material.VulpesiumArmorMaterial;
import com.Harlefox.elementalfoxes.common.material.VulpesiumToolMaterial;
import com.Harlefox.elementalfoxes.core.itemgroup.ElementalFoxesItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ElementalFoxes.MOD_ID);
// materials
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

	public static final RegistryObject<Item> VULPESIUM_CRYSTAL = ITEMS.register("vulpesium_crystal",
			() -> new Item(new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

	public static final RegistryObject<Item> VULPESIUM_INGOT = ITEMS.register("vulpesium_ingot",
			() -> new Item(new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

// tools
	public static final RegistryObject<Item> VULPESIUM_SWORD = ITEMS.register("vulpesium_sword",
			() -> new SwordItem(VulpesiumToolMaterial.VULPESIUM_SWORD, 6, -1f,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

	public static final RegistryObject<Item> VULPESIUM_AXE = ITEMS.register("vulpesium_axe",
			() -> new AxeItem(VulpesiumToolMaterial.VULPESIUM_AXE, 6, -1f,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

	public static final RegistryObject<Item> VULPESIUM_PICKAXE = ITEMS.register("vulpesium_pickaxe",
			() -> new PickaxeItem(VulpesiumToolMaterial.VULPESIUM_PICK, 6, -1f,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

	public static final RegistryObject<Item> VULPESIUM_SHOVEL = ITEMS.register("vulpesium_shovel",
			() -> new ShovelItem(VulpesiumToolMaterial.VULPESIUM_SHOVEL, 6, -1f,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

	public static final RegistryObject<Item> VULPESIUM_HOE = ITEMS.register("vulpesium_hoe",
			() -> new HoeItem(VulpesiumToolMaterial.VULPESIUM_HOE, 6, -1f,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

//armor
	public static final RegistryObject<Item> VULPESIUM_HELMET = ITEMS.register("vulpesium_helmet",
			() -> new ArmorItem(VulpesiumArmorMaterial.VULPESIUM, EquipmentSlotType.HEAD,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));
	
	public static final RegistryObject<Item> VULPESIUM_CHESTPLATE = ITEMS.register("vulpesium_chestplate",
			() -> new ArmorItem(VulpesiumArmorMaterial.VULPESIUM, EquipmentSlotType.CHEST,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));
	
	public static final RegistryObject<Item> VULPESIUM_LEGGINGS = ITEMS.register("vulpesium_leggings",
			() -> new ArmorItem(VulpesiumArmorMaterial.VULPESIUM, EquipmentSlotType.LEGS,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));
	
	public static final RegistryObject<Item> VULPESIUM_BOOTS = ITEMS.register("vulpesium_boots",
			() -> new ArmorItem(VulpesiumArmorMaterial.VULPESIUM, EquipmentSlotType.FEET,
					new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES)));

}
