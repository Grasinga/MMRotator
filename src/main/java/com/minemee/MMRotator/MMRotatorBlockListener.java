package com.minemee.MMRotator;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MMRotatorBlockListener implements Listener {
	private static boolean active = false;
	private int count = 0;
	public static void setActive(boolean b){active = b;}
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
						if(block.getTypeId() == 53) // Oak
						{
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
						else if(block.getTypeId() == 67) // Cobble
						{
							if(count == 0)
								block.setTypeIdAndData(67, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(67, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(67, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(67, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 108) // Brick
						{
							if(count == 0)
								block.setTypeIdAndData(108, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(108, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(108, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(108, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 109) // StoneBrick
						{
							if(count == 0)
								block.setTypeIdAndData(109, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(109, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(109, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(109, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 114) // NetherBrick
						{
							if(count == 0)
								block.setTypeIdAndData(114, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(114, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(114, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(114, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 128) // Sandstone
						{
							if(count == 0)
								block.setTypeIdAndData(128, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(128, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(128, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(128, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 134) // Spruce
						{
							if(count == 0)
								block.setTypeIdAndData(134, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(134, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(134, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(134, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 135) // Birch
						{
							if(count == 0)
								block.setTypeIdAndData(135, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(135, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(135, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(135, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 136) // Jungle
						{
							if(count == 0)
								block.setTypeIdAndData(136, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(136, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(136, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(136, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 156) // Quartz
						{
							if(count == 0)
								block.setTypeIdAndData(156, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(156, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(156, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(156, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 163) // Acacia
						{
							if(count == 0)
								block.setTypeIdAndData(163, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(163, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(163, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(163, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else if(block.getTypeId() == 164) // Dark Oak
						{
							if(count == 0)
								block.setTypeIdAndData(164, (byte) 0x0, false);
							if(count == 1)
								block.setTypeIdAndData(164, (byte) 0x1, false);
							if(count == 2)
								block.setTypeIdAndData(164, (byte) 0x2, false);
							if(count == 3)
							{
								block.setTypeIdAndData(164, (byte) 0x3, false);
								count = -1;
							}
							count++;							
						}
						else
						{
							Player user = player.getPlayer();
							user.sendMessage("That is not a valid block!");
						}
					}
				}
			}
		
	}
}
