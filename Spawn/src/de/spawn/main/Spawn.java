package de.spawn.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.spawn.commands.SpawnCommand;
import de.spawn.listener.JoinListener;
import de.spawn.commands.SetSpawn;




public class Spawn extends JavaPlugin {
	
	private static Spawn plugin;
	
	public void onEnable() {
		plugin = this;
		
		
		getCommand("SetSpawn").setExecutor(new SetSpawn());
		getCommand("Spawn").setExecutor(new SpawnCommand());
		
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new JoinListener(), this);
		
	}

	public static Spawn getPlugin() {
		return plugin;
	}


}
