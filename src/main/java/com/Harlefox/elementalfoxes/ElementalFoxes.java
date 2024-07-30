package com.Harlefox.elementalfoxes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Harlefox.elementalfoxes.common.Item.ExampleFoxSpawnEgg;
import com.Harlefox.elementalfoxes.common.entity.ExampleFox;
import com.Harlefox.elementalfoxes.core.init.BlockInit;
import com.Harlefox.elementalfoxes.core.init.ContainerTypesInit;
import com.Harlefox.elementalfoxes.core.init.EntityTypesInit;
import com.Harlefox.elementalfoxes.core.init.FeatureInit;
import com.Harlefox.elementalfoxes.core.init.ItemInit;
import com.Harlefox.elementalfoxes.core.init.TileEntityTypesInit;
import com.Harlefox.elementalfoxes.core.itemgroup.ElementalFoxesItemGroup;
import com.Harlefox.elementalfoxes.core.network.TutorialNetwork;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("deprecation")
@Mod("elementalfoxes")
@Mod.EventBusSubscriber(modid = ElementalFoxes.MOD_ID, bus = Bus.MOD)
public class ElementalFoxes {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "elementalfoxes";

	public ElementalFoxes() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		bus.addListener(this::commonSetup);;
		
		EntityTypesInit.ENTITY_TYPES.register(bus);
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
		ContainerTypesInit.CONTAINER_TYPES.register(bus);
		
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry()
					.register(new BlockItem(block, new Item.Properties().tab(ElementalFoxesItemGroup.ELEMENTAL_FOXES))
							.setRegistryName(block.getRegistryName()));
		});

	}
	
	@SubscribeEvent
	public static void onRegisterEntities (final RegistryEvent.Register<EntityType<?>> event) {
		ExampleFoxSpawnEgg.initSpawnEggs();
	}
	
	public void commonSetup(final FMLCommonSetupEvent event) {
		TutorialNetwork.init();
		DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(EntityTypesInit.EXAMPLE.get(), ExampleFox.setAttributes());
        });
	}
	
}