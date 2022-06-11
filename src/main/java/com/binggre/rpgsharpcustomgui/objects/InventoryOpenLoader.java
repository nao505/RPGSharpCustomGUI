package com.binggre.rpgsharpcustomgui.objects;

import java.util.HashMap;
import java.util.Map;

public class InventoryOpenLoader {

    private static final Map<String, InventoryOpen> inventoryOpen = new HashMap<>();

    public static Map<String, InventoryOpen> getMap() {
        return inventoryOpen;
    }

    public static void put(InventoryOpen inventoryOpen) {
        getMap().put(inventoryOpen.getGUIName(), inventoryOpen);
    }

    public static boolean containsKey(String guiName) {
        return getMap().containsKey(guiName);
    }

    public static InventoryOpen getObject(String guiName) {
        return getMap().get(guiName);
    }
}
