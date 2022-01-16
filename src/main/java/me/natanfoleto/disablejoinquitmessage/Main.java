package me.natanfoleto.disablejoinquitmessage;

import me.natanfoleto.disablejoinquitmessage.listeners.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a[DisableJoinQuitMessage] carregado com sucesso!");

        registerEvents();
    }

    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new Listeners(), this);
    }
}
