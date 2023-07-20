package com.Harlefox.elementalfoxes.common.block;

import com.Harlefox.elementalfoxes.common.te.DisplayCaseTileEntity;
import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class DisplayCaseBlock extends Block {
	public DisplayCaseBlock() {
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
				.sound(SoundType.METAL));
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypesInit.DISPLAY_CASE_ENTITY_TYPE.get().create();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (!worldIn.isClientSide()) {
			TileEntity te = worldIn.getBlockEntity(pos);
			if (te instanceof DisplayCaseTileEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (DisplayCaseTileEntity) te, pos);
				return ActionResultType.SUCCESS; 
			}
		}
		return super.use(state, worldIn, pos, player, handIn, hit);
	}
}