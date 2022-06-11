package com.binggre.rpgsharpcustomgui;

import com.binggre.rpgsharpcustomgui.io.InventoryOpenReader;
import com.binggre.rpgsharpcustomgui.io.SlotItemReader;
import com.binggre.rpgsharpcustomgui.listeners.InventoryOpenListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPGSharpCustomGUI extends JavaPlugin {

    private static RPGSharpCustomGUI instance;
    public static RPGSharpCustomGUI getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        registerEvents();
        saveResources();
        readAll();
    }

    @Override
    public void onDisable() {
    }

    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new InventoryOpenListener(), this);
    }

    private void saveResources() {
        saveResource("InventoryOpen\\", false);
        saveResource("SlotItems\\", false);
    }

    private void readAll() {
        InventoryOpenReader.read();
        SlotItemReader.read();
    }
}
