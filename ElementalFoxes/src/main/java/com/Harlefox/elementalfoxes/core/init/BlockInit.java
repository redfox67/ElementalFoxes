package com.Harlefox.elementalfoxes.core.init;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.common.block.DisplayCaseBlock;
import com.Harlefox.elementalfoxes.common.block.QuarryBlock;
import com.Harlefox.elementalfoxes.common.block.SilkQuarryBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ElementalFoxes.MOD_ID);

	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(6f, 6f)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.ANVIL)));

	public static final RegistryObject<Block> VULPESIUM = BLOCKS.register("vulpesium",
			() -> new Block(Properties.copy(Blocks.IRON_ORE)));

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
