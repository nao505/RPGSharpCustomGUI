package com.binggre.rpgsharpcustomgui.io;

import com.binggre.CustomInventory;
import com.binggre.objects.InventoryOpen;
import com.binggre.objects.InventoryOpenLoader;
import com.hj.rpgsharp.rpg.apis.rpgsharp.utils.FileUtil;

import java.io.File;

public class InventoryOpenReader {

    public static void read() {
        final String FILE_PATH =
                CustomInventory.getInstance().getDataFolder() + "\\InventoryOpen\\";
        File[] files = new File(FILE_PATH).listFiles();
        if (files == null) return;

        for (File file : files) {
            InventoryOpen inventoryOpen = (InventoryOpen) FileUtil.read(file, InventoryOpen.class);
            InventoryOpenLoader.put(inventoryOpen);
        }
    }
}