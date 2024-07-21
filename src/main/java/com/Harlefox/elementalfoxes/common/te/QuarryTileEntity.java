package com.Harlefox.elementalfoxes.common.te;

import java.util.List;
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
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

    private int counter = 100;
    
    public void dropItemsWithoutVelocity(World level, BlockPos pos, BlockState blockState) {
        if (!level.isClientSide) {
            ServerWorld ServerWorld = (ServerWorld) level;
            List<ItemStack> drops = Block.getDrops(blockState, ServerWorld, pos, null);
            level.removeBlockEntity(pos);

            for (ItemStack drop : drops) {
                ItemEntity itemEntity = new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, drop);
                itemEntity.setDeltaMovement(0, 0, 0); // Set velocity to zero
                level.addFreshEntity(itemEntity);
            }
        }
    }

    public QuarryTileEntity(TileEntityType<?> TileEntityTypeIn) {
        super(TileEntityTypeIn);
    }

    public QuarryTileEntity() {
        this(TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get());
    }

    @Override
    public void tick() {
        if (this.level != null) {
            BlockPos pos = this.getBlockPos();
        	if (this.level.getBlockState(pos.below()) == Blocks.AIR.defaultBlockState()) {
        		
        	} else {
        		
        		if (counter == 0) {
        			this.dropItemsWithoutVelocity(level, pos.above(), this.level.getBlockState(pos.below()));;
        			
        			counter = (this.level.getBlockState(pos.below()).getHarvestLevel() * 10) + 20;
        			this.level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 3);
        		} else {
                counter = counter - 1;
        		}
        	}
        }
    }
}
