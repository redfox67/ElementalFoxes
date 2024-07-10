package com.Harlefox.elementalfoxes.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {

	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.VULPESIUM_ORE.get().defaultBlockState(), 5,
				0, 60, 3);
	}

	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize,
			int minheight, int maxheight, int amount) { 
		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize))
						.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minheight, 0, maxheight)))
						.squared().count(amount));
	}

}
