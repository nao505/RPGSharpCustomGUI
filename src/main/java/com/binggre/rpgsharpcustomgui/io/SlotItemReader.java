package com.binggre.rpgsharpcustomgui.io;

import com.binggre.rpgsharpcustomgui.RPGSharpCustomGUI;
import com.binggre.rpgsharpcustomgui.objects.SlotItem;
import com.binggre.rpgsharpcustomgui.objects.SlotItemLoader;
import com.google.gson.JsonObject;
import com.hj.rpgsharp.rpg.apis.rpgsharp.utils.FileUtil;
import com.hj.rpgsharp.rpg.apis.rpgsharp.utils.ItemUtil;
import org.bukkit.inventory.ItemStack;

import java.io.File;

public class SlotItemReader {

    public static void read() {
        final String FILE_PATH = RPGSharpCustomGUI.getInstance().getDataFolder() + "\\SlotItems\\";
        File[] files = new File(FILE_PATH).listFiles();
        if (files == null) return;

        for (File file : files) {
            JsonObject json = FileUtil.read(file);
            String id = json.get("id").getAsString();
            int slot = json.get("slot").getAsInt();
            ItemStack item = ItemUtil.getItemStack("item", json);

            SlotItem slotItem = new SlotItem(id, slot, item);
            SlotItemLoader.put(slotItem);
        }
    }

}
