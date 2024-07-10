package com.Harlefox.elementalfoxes.core.init;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.common.block.DisplayCaseBlock;
import com.Harlefox.elementalfoxes.common.block.LightningConductorBlock;
import com.Harlefox.elementalfoxes.common.block.QuarryBlock;
import com.Harlefox.elementalfoxes.common.block.SilkQuarryBlock;

import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ElementalFoxes.MOD_ID);

	public static final RegistryObject<Block> LIGHTNING_CONDUCTOR = BLOCKS.register("lightning_conductor",
			() -> new LightningConductorBlock());

	public static final RegistryObject<Block> VULPESIUM_ORE = BLOCKS.register("vulpesium_ore",
			() -> new Block(Properties.copy(Blocks.IRON_ORE)));
	
	public static final RegistryObject<Block> VULPESIUM = BLOCKS.register("vulpesium",
			() -> new Block(Properties.copy(Blocks.QUARTZ_BLOCK)));
	
	public static final RegistryObject<Block> VULPESIUM_METAL = BLOCKS.register("vulpesium_metal",
			() -> new Block(Properties.copy(Blocks.IRON_BLOCK)));

	public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock());

	public static final RegistryObject<Block> SILK_QUARRY = BLOCKS.register("silk_quarry", () -> new SilkQuarryBlock());
	
	public static final RegistryObject<Block> DISPLAY_CASE = BLOCKS.register("display_case", () -> new DisplayCaseBlock());

//	public void onNeighborChange(BlockState powered, World world, BlockPos pos, Block neighborBlock, BlockPos neighborPos) {
//		int power = world.getSignal(pos, Direction.NORTH);
//		if (power >= 1) {
	// The block is powered by redstone
	// Add your code here to run when the block is powered
	// For example, you can print a message to the console
//			System.out.println("Block powered by redstone!");

	// You can also perform other actions or spawn entities, etc.
//		}   	     
//    }
}
