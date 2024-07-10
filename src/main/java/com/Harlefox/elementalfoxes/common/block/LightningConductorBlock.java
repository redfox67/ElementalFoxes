package com.Harlefox.elementalfoxes.common.block;

import java.util.Random;

import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LightningConductorBlock extends RedstoneLampBlock {
	
	public static final Property<Boolean> LIT = RedstoneTorchBlock.LIT;
	
	public boolean bool = false;


	public LightningConductorBlock() {
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(7f, 25)
				.sound(SoundType.METAL));
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypesInit.LIGHTNING_CONDUCTOR_ENTITY_TYPE.get().create();
	}
	
	public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
	      return this.defaultBlockState().setValue(LIT, Boolean.valueOf(p_196258_1_.getLevel().hasNeighborSignal(p_196258_1_.getClickedPos())));
	   }

    public void neighborChanged(BlockState state, World level, BlockPos pos, Block p_220069_4_, BlockPos p_220069_5_, boolean p_220069_6_) {
       if (!level.isClientSide) {
          boolean flag = state.getValue(LIT);
          if (flag != level.hasNeighborSignal(pos)) {
             if (flag) {
                level.getBlockTicks().scheduleTick(pos, this, 4);
                if (bool) {
           		    bool = false;
                } 
             } else {
            	 if (!bool) {
                 	bool = true;
            	 
            	 }
                 level.setBlock(pos, state.cycle(LIT), 2);
                
             }
         }

      }
   }

   public void tick(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, Random p_225534_4_) {
      if (p_225534_1_.getValue(LIT) && !p_225534_2_.hasNeighborSignal(p_225534_3_)) {
         p_225534_2_.setBlock(p_225534_3_, p_225534_1_.cycle(LIT), 2);
      }

   }

   protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
      p_206840_1_.add(LIT);
   }
	
	

}
