package com.minemee.MMRotator;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class MMRotatorCommands implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (sender instanceof Player) 
		{
			Player player = (Player) sender;
	   		if(commandLabel.equalsIgnoreCase("rotateon")){
	   			player.sendMessage(ChatColor.GREEN + "Rotator Tool Activated");
				MMRotatorBlockListener.setActive(true);
				MMRotatorBlockListener.setSelecting(false);
				return true;
			}
			else if(commandLabel.equalsIgnoreCase("rotateoff"))
			{
				player.sendMessage(ChatColor.RED + "Rotator Tool De-activated");
				MMRotatorBlockListener.setActive(false);
				MMRotatorBlockListener.setSelecting(false);
				return true;
			}
			else if(commandLabel.equalsIgnoreCase("rotateselect"))
			{
				player.sendMessage(ChatColor.AQUA + "Selection Tool Activated");
				MMRotatorBlockListener.setActive(false);
				MMRotatorBlockListener.setSelecting(true);
				return true;
			}
		}
		else
		{
			sender.sendMessage("Only players can use this command.");
			return false;
		}
	           
		return false;
	}
	
}
