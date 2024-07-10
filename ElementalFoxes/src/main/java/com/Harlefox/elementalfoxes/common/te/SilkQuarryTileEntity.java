package com.Harlefox.elementalfoxes.common.te;

import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public class SilkQuarryTileEntity extends TileEntity implements ITickableTileEntity {

	public SilkQuarryTileEntity(TileEntityType<?> TileEntityTypeIn) {
		super(TileEntityTypeIn);
		// TODO Auto-generated constructor stub
	}

	public SilkQuarryTileEntity() {
		this(TileEntityTypesInit.SILK_QUARRY_TILE_ENTITY_TYPE.get());
	}

	private int counter = 240;

	@Override
	public void tick() {
		BlockPos pos = this.getBlockPos();
		if (counter == 0) {
//			SilkQuarryBlock.dropResources(drop, level, pos.above());
			BlockState b = level.getBlockState(pos.below());
			ItemStack dropstack = new ItemStack(b.getBlock(), 1);
			ItemEntity drop = new ItemEntity(level, pos.getX()+1, pos.getY()+1, pos.getZ()+1, dropstack);
			level.addFreshEntity(drop); 
			counter = (level.getBlockState(pos.below()).getHarvestLevel()*20)+50;
		} else {
			counter = counter - 1;
		}
	}

}
