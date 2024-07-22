package com.Harlefox.elementalfoxes.core.util;

import com.Harlefox.elementalfoxes.ElementalFoxes;
import com.Harlefox.elementalfoxes.client.entity.ExampleFoxRenderer;
import com.Harlefox.elementalfoxes.client.screen.DisplayCaseScreen;
import com.Harlefox.elementalfoxes.client.ter.DisplayCaseTileEntityRenderer;
import com.Harlefox.elementalfoxes.core.init.ContainerTypesInit;
import com.Harlefox.elementalfoxes.core.init.EntityTypesInit;
import com.Harlefox.elementalfoxes.core.init.KeybindsInit;
import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ElementalFoxes.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		KeybindsInit.register(event);
		
		ScreenManager.register(ContainerTypesInit.DISPLAY_CASE_CONTAINER_TYPE.get(), DisplayCaseScreen::new);
		
		ClientRegistry.bindTileEntityRenderer(TileEntityTypesInit.DISPLAY_CASE_ENTITY_TYPE.get(), DisplayCaseTileEntityRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.EXAMPLE.get(), ExampleFoxRenderer::new);
	}

}
