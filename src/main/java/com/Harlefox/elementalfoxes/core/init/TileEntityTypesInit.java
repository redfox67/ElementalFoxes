package com.Harlefox.elementalfoxes.core.init;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.common.te.DisplayCaseTileEntity;
import com.Harlefox.elementalfoxes.common.te.LightningConductorTileEntity;
import com.Harlefox.elementalfoxes.common.te.QuarryTileEntity;
import com.Harlefox.elementalfoxes.common.te.SilkQuarryTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, ElementalFoxes.MOD_ID);
	
	public static final RegistryObject<TileEntityType<LightningConductorTileEntity>> LIGHTNING_CONDUCTOR_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("lightning_conductor",
					() -> TileEntityType.Builder.of(LightningConductorTileEntity::new, BlockInit.LIGHTNING_CONDUCTOR.get()).build(null));

	public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("quarry",
					() -> TileEntityType.Builder.of(QuarryTileEntity::new, BlockInit.QUARRY.get()).build(null));
	
	public static final RegistryObject<TileEntityType<SilkQuarryTileEntity>> SILK_QUARRY_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("silk_quarry",
					() -> TileEntityType.Builder.of(SilkQuarryTileEntity::new, BlockInit.SILK_QUARRY.get()).build(null));
	
	public static final RegistryObject<TileEntityType<DisplayCaseTileEntity>> DISPLAY_CASE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("display_case",
					() -> TileEntityType.Builder.of(DisplayCaseTileEntity::new, BlockInit.DISPLAY_CASE.get()).build(null));
}
