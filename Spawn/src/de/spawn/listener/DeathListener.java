package de.spawn.listener;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

	@EventHandler
	public void handlePlayerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		event.setDeathMessage("");
		if(player.hasPermission("spawn.keep")){
		event.setKeepInventory(true);
		}
	
	}
	
	

}
