package com.minepokemine.anticommand;

import com.minepokemine.anticommand.events.CommandListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCommands extends JavaPlugin {
    public static AntiCommands INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

        getServer().getPluginManager().registerEvents(new CommandListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
