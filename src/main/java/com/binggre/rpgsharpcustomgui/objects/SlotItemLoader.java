package com.binggre.rpgsharpcustomgui.objects;

import java.util.HashMap;
import java.util.Map;

public class SlotItemLoader {

    private static final Map<String, SlotItem> slotItem = new HashMap<>();

    public static Map<String, SlotItem> getMap() {
        return slotItem;
    }
    public static void put(SlotItem slotItem) {
        SlotItemLoader.slotItem.put(slotItem.getId(), slotItem);
    }

    public static SlotItem getSlotItem(String id) {
        return slotItem.get(id);
    }
}