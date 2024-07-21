package com.Harlefox.elementalfoxes.common.te;

import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public class SilkQuarryTileEntity extends TileEntity implements ITickableTileEntity {
	

	public SilkQuarryTileEntity(TileEntityType<?> TileEntityTypeIn) {
		super(TileEntityTypeIn);
	}

	public SilkQuarryTileEntity() {
		this(TileEntityTypesInit.SILK_QUARRY_TILE_ENTITY_TYPE.get());
	}

	private int counter = 240;

	@Override
	public void tick() {
		BlockPos pos = this.getBlockPos();
		if (this.level.getBlockState(pos.below()) == Blocks.AIR.defaultBlockState()) {
    		
    	} else {
    		
    		if (counter == 0) {		
    			CompoundNBT nbtData = new CompoundNBT();
    		    TileEntity tileEntity = level.getBlockEntity(pos.below());
    		    if (tileEntity != null) {
    		        nbtData = tileEntity.save(new CompoundNBT());
    		        level.removeBlockEntity(pos.below());
    		    }
    			BlockState b = level.getBlockState(pos.below());
    			ItemStack dropstack = new ItemStack(b.getBlock().asItem(), 1);
    			
    			if (nbtData != null) {
    				CompoundNBT blockTag = new CompoundNBT();
    				blockTag.put("BlockEntityTag", nbtData); // Use "BlockEntityTag" for container data
    				dropstack.setTag(blockTag);
    			}
    			
    			ItemEntity drop = new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5, dropstack);
    			drop.setDeltaMovement(0, 0, 0);
    			level.addFreshEntity(drop); 
    			
    			counter = (level.getBlockState(pos.below()).getHarvestLevel()*20)+50;
    			
    			level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 3);
    			
    			
    		} else {
			counter = counter - 1;
    		}
    	}	
	}

}
