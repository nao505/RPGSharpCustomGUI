package com.binggre.rpgsharpcustomgui.objects;

import org.bukkit.inventory.ItemStack;

public class SlotItem {

    private final String id;
    private final int slot;
    private final ItemStack itemStack;

    public SlotItem(String id, int slot, ItemStack itemStack) {
        this.id = id;
        this.slot = slot;
        this.itemStack = itemStack;
    }

    public String getId() {
        return id;
    }

    public int getSlot() {
        return slot;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}