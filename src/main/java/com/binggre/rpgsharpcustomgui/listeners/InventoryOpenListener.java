package com.binggre.rpgsharpcustomgui.listeners;

import com.binggre.rpgsharpcustomgui.objects.InventoryOpen;
import com.binggre.rpgsharpcustomgui.objects.InventoryOpenLoader;
import com.binggre.rpgsharpcustomgui.objects.SlotItem;
import com.binggre.rpgsharpcustomgui.objects.SlotItemLoader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;

public class InventoryOpenListener implements Listener {

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        String title = event.getView().getTitle();
        if (!InventoryOpenLoader.containsKey(title)) return;

        Inventory inventory = event.getInventory();
        InventoryOpen inventoryOpen = InventoryOpenLoader.getObject(title);
        inventoryOpen.getSlotItemIdList().forEach(id -> {
            SlotItem slotItem = SlotItemLoader.getSlotItem(id);
            inventory.setItem(slotItem.getSlot(), slotItem.getItemStack());
        });
    }
}
