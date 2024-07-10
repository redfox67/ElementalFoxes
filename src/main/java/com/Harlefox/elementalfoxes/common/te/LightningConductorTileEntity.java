package com.Harlefox.elementalfoxes.common.te;

import com.Harlefox.elementalfoxes.common.block.LightningConductorBlock;
import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class LightningConductorTileEntity extends TileEntity implements ITickableTileEntity {

	public LightningConductorTileEntity(TileEntityType<?> TileEntityTypeIn) {
		super(TileEntityTypeIn);
		// TODO Auto-generated constructor stub
	}

	public LightningConductorTileEntity() {
		this(TileEntityTypesInit.LIGHTNING_CONDUCTOR_ENTITY_TYPE.get());
	}
	
	public static Vector3d getBlockPosition(World world, BlockPos pos) {
        Vector3d blockState = getBlockPosition(world, pos);
        return blockState;
	} 
	
	
	
	private int counter = 10;
	
	@Override
	public void tick() {
		if (counter == 0) {
			if (this.getBlockState().getValue(LightningConductorBlock.LIT)) {
				BlockPos pos = this.getBlockPos();
				LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, level);
				bolt.moveTo(pos.getX(), pos.getY()+1, pos.getZ(), 0, 0);
				level.addFreshEntity(bolt);
				counter = 40;
			} else {
				counter = 10;
			}
		} else {
			counter = counter - 1;
		}
	}
}
