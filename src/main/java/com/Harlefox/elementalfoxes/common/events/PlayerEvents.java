package com.Harlefox.elementalfoxes.common.events;

import com.Harlefox.elementalfoxes.ElementalFoxes;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ElementalFoxes.MOD_ID, bus = Bus.FORGE)
public class PlayerEvents {
	
//	@SubscribeEvent
//	public static void onPlayerTick(PlayerTickEvent event) {
//		PlayerEntity player = event.player;
//		
//		player.inventory.offhand.set(0, new ItemStack(Items.TORCH));
//	}
	@SubscribeEvent
	public void onPlayerUseEvent(PlayerInteractEvent.RightClickItem event) {
		PlayerEntity player = event.getPlayer();
		if (event.getItemStack() == new ItemStack(Items.TORCH)) {
			if (true) {
				player.inventory.add(1, new ItemStack(Items.TORCH));
			}
		}
	}
}
