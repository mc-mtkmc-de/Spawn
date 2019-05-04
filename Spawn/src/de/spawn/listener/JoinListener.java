package de.spawn.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.spawn.main.Spawn;

public class JoinListener implements Listener {
	
	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("§aDer Spieler §6" + player.getName() + "§a hat den Server betreten.");
		
		FileConfiguration config = Spawn.getPlugin().getConfig();
		
		World world = Bukkit.getWorld(config.getString("Spawn.World"));
		double x = config.getDouble("Spawn.X");
		double y = config.getDouble("Spawn.Y");
		double z = config.getDouble("Spawn.Z");
		float yaw = (float) config.getDouble("Spawn.Yaw");
		float pitch = (float) config.getDouble("Spawn.Pitch");
		Location location = new Location(world, x, y, z, yaw, pitch);
		
		player.teleport(location);
		
	}

}
