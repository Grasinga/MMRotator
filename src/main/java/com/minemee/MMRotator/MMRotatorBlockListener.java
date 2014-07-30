package com.minemee.MMRotator;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MMRotatorBlockListener implements Listener {
	private boolean active = true;
	private int count = 0;
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender; 	
		if(label.equalsIgnoreCase("rotateon")){
			player.sendMessage(ChatColor.GREEN + "Rotator Tool Activated");
			active = true;
			return true;
		}
		else if(label.equalsIgnoreCase("rotateoff"))
		{
			player.sendMessage(ChatColor.RED + "Rotator Tool De-activated");
			active = false;
			return true;
		}
		else if(label.equalsIgnoreCase("rotateon") || label.equalsIgnoreCase("rotateoff") && (!(sender instanceof Player)))
		{
			sender.sendMessage("This command can only be used by a player.");
			return true;
		}
		return false;
	}
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void stickChange(PlayerInteractEvent event){	
		final Player player = event.getPlayer();
			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)
			{
				if(active)
				{
					if(player.getItemInHand().getType().equals(Material.STICK))
					{
						Block block = event.getClickedBlock();
						if(count == 0)
							block.setTypeIdAndData(53, (byte) 0x0, false);
						if(count == 1)
							block.setTypeIdAndData(53, (byte) 0x1, false);
						if(count == 2)
							block.setTypeIdAndData(53, (byte) 0x2, false);
						if(count == 3)
						{
							block.setTypeIdAndData(53, (byte) 0x3, false);
							count = -1;
						}
						count++;
					}
				}
			}
		
	}
}
