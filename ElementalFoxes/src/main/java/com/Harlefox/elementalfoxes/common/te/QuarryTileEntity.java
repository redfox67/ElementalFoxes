package com.Harlefox.elementalfoxes.common.te;

import com.Harlefox.elementalfoxes.common.block.QuarryBlock;
import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

	public QuarryTileEntity(TileEntityType<?> TileEntityTypeIn) {
		super(TileEntityTypeIn);
		// TODO Auto-generated constructor stub
	}

	public QuarryTileEntity() {
		this(TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get());
	}

	private int counter = 100;

	@Override
	public void tick() {
		BlockPos pos = this.getBlockPos();
		if (counter == 0) {
			QuarryBlock.dropResources(level.getBlockState(pos.below()), level, pos.above());
			counter = 100; 
		} else {
			counter = counter - 1;
		}
	}

}
