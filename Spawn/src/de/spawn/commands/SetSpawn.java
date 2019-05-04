package de.spawn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.spawn.main.Spawn;

public class SetSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("spawn.setspawn")) {
				if(args.length == 0) {
					
					FileConfiguration config = Spawn.getPlugin().getConfig();
					
					config.set("Spawn.World", player.getWorld().getName());
					config.set("Spawn.X", player.getLocation().getX());
					config.set("Spawn.Y", player.getLocation().getY());
					config.set("Spawn.Z", player.getLocation().getZ());
					config.set("Spawn.Yaw", player.getLocation().getYaw());
					config.set("Spawn.Pitch", player.getLocation().getPitch());
					Spawn.getPlugin().saveConfig();
					player.sendMessage("§aDu hast den §6Spawnpunkt §aumgesetzt");
					
				}else
					player.sendMessage("§cBitte benutze §6/setspawn§c!");
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
			
		} 
		
		return false;
	}
 
}
