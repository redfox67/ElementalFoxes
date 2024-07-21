package com.Harlefox.elementalfoxes.common.container;

import java.util.Objects;

import com.Harlefox.elementalfoxes.common.te.DisplayCaseTileEntity;
import com.Harlefox.elementalfoxes.core.init.BlockInit;
import com.Harlefox.elementalfoxes.core.init.ContainerTypesInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DisplayCaseContainer extends Container {

    public final DisplayCaseTileEntity te;
    private final IWorldPosCallable canInteractWithCallable;

    public DisplayCaseContainer(final int windowId, final PlayerInventory playerInv, final DisplayCaseTileEntity te) {
        super(ContainerTypesInit.DISPLAY_CASE_CONTAINER_TYPE.get(), windowId);
        this.te = te;
        this.canInteractWithCallable = IWorldPosCallable.create(te.getLevel(), te.getBlockPos());

        // Tile Entity Slot
        this.addSlot(new Slot((IInventory) te, 0, 80, 35) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return te.canPlaceItem(0, stack);
            }
        });

        // Main Player Inventory
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }

        // Player Hotbar
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));
        }
    }

    public DisplayCaseContainer(final int windowId, final PlayerInventory playerInv, final PacketBuffer data) {
        this(windowId, playerInv, getTileEntity(playerInv, data));
    }

    private static DisplayCaseTileEntity getTileEntity(final PlayerInventory playerInv, final PacketBuffer data) {
        Objects.requireNonNull(playerInv, "Player Inventory cannot be null.");
        Objects.requireNonNull(data, "Packet Buffer cannot be null.");
        final TileEntity te = playerInv.player.level.getBlockEntity(data.readBlockPos());
        if (te instanceof DisplayCaseTileEntity) {
            return (DisplayCaseTileEntity) te;
        }
        throw new IllegalStateException("Tile Entity Is Not Correct");
    }

    @Override
    public boolean stillValid(PlayerEntity playerIn) {
        return stillValid(canInteractWithCallable, playerIn, BlockInit.DISPLAY_CASE.get());
    }

    @Override
    public ItemStack quickMoveStack(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();

            if (index < te.getContainerSize()) {
                if (!this.moveItemStackTo(itemstack1, te.getContainerSize(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, te.getContainerSize(), false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }
    
    public ITextComponent getTitle() {
        return new TranslationTextComponent("container.display_case");
    }
}
