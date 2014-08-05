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
				MMRotatorBlockListener.setChange(false);
				return true;
			}
			else if(commandLabel.equalsIgnoreCase("rotateoff"))
			{
				player.sendMessage(ChatColor.RED + "Rotator Tool De-activated");
				MMRotatorBlockListener.setActive(false);
				MMRotatorBlockListener.setSelecting(false);
				MMRotatorBlockListener.setChange(false);
				return true;
			}
			else if(commandLabel.equalsIgnoreCase("rotateselect"))
			{
				player.sendMessage(ChatColor.AQUA + "Selection Tool Activated");
				MMRotatorBlockListener.setActive(false);
				MMRotatorBlockListener.setSelecting(true);
				MMRotatorBlockListener.setChange(false);
				return true;
			}
			else if(commandLabel.equalsIgnoreCase("rotateall"))
			{
				MMRotatorBlockListener.setActive(false);
				MMRotatorBlockListener.setSelecting(false);
				MMRotatorBlockListener.setChange(true);
				if(args[0].equalsIgnoreCase("North"))
				{
					MMRotatorBlockListener.setRotateNorth(true);
					player.sendMessage(ChatColor.GREEN + "Rotated stairs North!");
				}
				else if(args[0].equalsIgnoreCase("South"))
				{
					MMRotatorBlockListener.setRotateSouth(true);
					player.sendMessage(ChatColor.GREEN + "Rotated stairs South!");
				}
				else if(args[0].equalsIgnoreCase("East"))
				{
					MMRotatorBlockListener.setRotateEast(true);
					player.sendMessage(ChatColor.GREEN + "Rotated stairs East!");
				}
				else if(args[0].equalsIgnoreCase("West"))
				{
					MMRotatorBlockListener.setRotateWest(true);
					player.sendMessage(ChatColor.GREEN + "Rotated stairs West!");
				}
				else
					player.sendMessage("Please enter /rotateall <direction>");
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
