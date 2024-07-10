package com.Harlefox.elementalfoxes.common.block;

import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class QuarryBlock extends Block {

	public QuarryBlock() {
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(7f, 25)
				.sound(SoundType.METAL));
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get().create();
	}

}
