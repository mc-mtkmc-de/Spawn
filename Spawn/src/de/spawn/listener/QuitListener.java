package de.spawn.listener;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


public class QuitListener implements Listener {
	
	@EventHandler
	public void handlePlayerRespawn(PlayerQuitEvent event) {
		event.setQuitMessage("");

	}

}
