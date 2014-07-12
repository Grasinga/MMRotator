package com.minemee.MMRotator;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
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
	private boolean active = false;
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender; 	
		if(commandLabel.equalsIgnoreCase("mmrotateon")){
			player.sendMessage("Rotator Tool Activated");
			active = true;
			return true;
		}
		else if(commandLabel.equalsIgnoreCase("mmrotateoff"))
		{
			player.sendMessage("Rotator Tool De-activated");
			active = false;
			return true;
		}
		return false;
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void stickChange(PlayerInteractEvent event){	
		final Player player = event.getPlayer();
		if(active)
		{
			int count = 0;
			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)
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
