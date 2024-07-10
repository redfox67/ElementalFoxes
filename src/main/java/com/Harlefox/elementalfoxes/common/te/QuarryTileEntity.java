package com.Harlefox.elementalfoxes.common.te;

import com.Harlefox.elementalfoxes.common.block.QuarryBlock;
import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

    private int counter = 100;
    private int num = 10;

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
            if (counter == 0) {
                if (num > 0) {
                    QuarryBlock.dropResources(this.level.getBlockState(pos.below()), this.level, pos.above());
                    counter = (this.level.getBlockState(pos.below()).getHarvestLevel() * 10) + 20;
                    num = num - 1;
                } else {
                    this.level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 3);
                    num = 10;
                }
            } else {
                counter = counter - 1;
            }
        }
    }
}
