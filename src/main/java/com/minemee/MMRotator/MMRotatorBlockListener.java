package com.minemee.MMRotator;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MMRotatorBlockListener implements Listener {
	private static boolean active = false;
	private static boolean selecting = false;
	private static boolean change = false;
	private boolean rotateBlocks = false;
	private boolean canModify = false;
	private static boolean rotateNorth = false;
	private static boolean rotateSouth = false;
	private static boolean rotateEast = false;
	private static boolean rotateWest = false;
	private int count = 0;
	private int x1 = 0;
	private int y1 = 0;
	private int z1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	private int z2 = 0;
	public static void setActive(boolean b){active = b;}
	public static void setSelecting(boolean b){selecting = b;}
	public static void setChange(boolean b){change = b;}
	public static void setRotateNorth(boolean b){rotateNorth = b; System.out.println("Ran setRotate " + "rotateNorth = " + rotateNorth + " change = " + change + " selecting = " + selecting);}
	public static void setRotateSouth(boolean b){rotateSouth = b;}
	public static void setRotateEast(boolean b){rotateEast = b;}
	public static void setRotateWest(boolean b){rotateWest = b;}
	private ArrayList<Location> selectedBlocksLocs = new ArrayList<Location>();
	World w = Bukkit.getServer().getWorld("world");
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void stairRotate(PlayerInteractEvent event){	
		final Player player = event.getPlayer();
	    Location LocOne = new Location(player.getLocation().getWorld(), x1, y1, z1);
		Location LocTwo = new Location(player.getLocation().getWorld(), x2, y2, z2);
			if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
			{
				if(active)
				{
					if(player.getItemInHand().getType().equals(Material.STICK))
					{
						Block block = event.getClickedBlock();
						if (MMRotator.WorldGuard != null) {
							try {
								if (MMRotator.WorldGuard.canBuild(player, block)) {
									canModify = true;
								}
								else
									canModify = false;
							} catch (NullPointerException e) {
								System.out.print(e);
							}
						}
					if(canModify)
					{
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
			if(selecting)
			{
				Block block = event.getClickedBlock();
				if(event.getAction() == Action.LEFT_CLICK_BLOCK)
				{
					if(player.getItemInHand().getType().equals(Material.STICK))
					{
						x1 = block.getX();
						y1 = block.getY();
						z1 = block.getZ();
						player.sendMessage("First Position set at: " + x1 + ", " + y1 + ", " + z1);
					}
				}
				else if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
				{
					if(player.getItemInHand().getType().equals(Material.STICK))
					{
						x2 = block.getX();
						y2 = block.getY();
						z2 = block.getZ();
						player.sendMessage("Second Position set at: " + x2 + ", " + y2 + ", " + z2);
					}
				}
				else
					player.sendMessage("Please select a block.");
			}
			if(!selecting && change)
			{
				getSelectedBlocksLocs(LocOne, LocTwo);
				setChange(false);
			}
			if(rotateBlocks && canModify)
			{
				if(rotateNorth)
				{
					for(int i=0;i<selectedBlocksLocs.size();i++)
					{
						Block block = selectedBlocksLocs.get(i).getBlock();
						if(block.getTypeId() == 53)
							block.setTypeIdAndData(53, (byte) 0x3, false);
						else if(block.getTypeId() == 67)
							block.setTypeIdAndData(67, (byte) 0x3, false);
						else if(block.getTypeId() == 108)
							block.setTypeIdAndData(108, (byte) 0x3, false);
						else if(block.getTypeId() == 109)
							block.setTypeIdAndData(109, (byte) 0x3, false);
						else if(block.getTypeId() == 114)
							block.setTypeIdAndData(114, (byte) 0x3, false);
						else if(block.getTypeId() == 128)
							block.setTypeIdAndData(128, (byte) 0x3, false);
						else if(block.getTypeId() == 134)
							block.setTypeIdAndData(134, (byte) 0x3, false);
						else if(block.getTypeId() == 135)
							block.setTypeIdAndData(135, (byte) 0x3, false);
						else if(block.getTypeId() == 136)
							block.setTypeIdAndData(136, (byte) 0x3, false);
						else if(block.getTypeId() == 156)
							block.setTypeIdAndData(156, (byte) 0x3, false);
						else if(block.getTypeId() == 163)
							block.setTypeIdAndData(163, (byte) 0x3, false);
						else if(block.getTypeId() == 164)
							block.setTypeIdAndData(164, (byte) 0x3, false);
						else
							block.setTypeId(block.getTypeId());
					}
				}
				else if(rotateSouth)
				{
					for(int i=0;i<selectedBlocksLocs.size();i++)
					{
						Block block = selectedBlocksLocs.get(i).getBlock();
						if(block.getTypeId() == 53)
							block.setTypeIdAndData(53, (byte) 0x2, false);
						else if(block.getTypeId() == 67)
							block.setTypeIdAndData(67, (byte) 0x2, false);
						else if(block.getTypeId() == 108)
							block.setTypeIdAndData(108, (byte) 0x2, false);
						else if(block.getTypeId() == 109)
							block.setTypeIdAndData(109, (byte) 0x2, false);
						else if(block.getTypeId() == 114)
							block.setTypeIdAndData(114, (byte) 0x2, false);
						else if(block.getTypeId() == 128)
							block.setTypeIdAndData(128, (byte) 0x2, false);
						else if(block.getTypeId() == 134)
							block.setTypeIdAndData(134, (byte) 0x2, false);
						else if(block.getTypeId() == 135)
							block.setTypeIdAndData(135, (byte) 0x2, false);
						else if(block.getTypeId() == 136)
							block.setTypeIdAndData(136, (byte) 0x2, false);
						else if(block.getTypeId() == 156)
							block.setTypeIdAndData(156, (byte) 0x2, false);
						else if(block.getTypeId() == 163)
							block.setTypeIdAndData(163, (byte) 0x2, false);
						else if(block.getTypeId() == 164)
							block.setTypeIdAndData(164, (byte) 0x2, false);
						else
							block.setTypeId(block.getTypeId());
					}
				}
				else if(rotateEast)
				{
					for(int i=0;i<selectedBlocksLocs.size();i++)
					{
						Block block = selectedBlocksLocs.get(i).getBlock();
						if(block.getTypeId() == 53)
							block.setTypeIdAndData(53, (byte) 0x0, false);
						else if(block.getTypeId() == 67)
							block.setTypeIdAndData(67, (byte) 0x0, false);
						else if(block.getTypeId() == 108)
							block.setTypeIdAndData(108, (byte) 0x0, false);
						else if(block.getTypeId() == 109)
							block.setTypeIdAndData(109, (byte) 0x0, false);
						else if(block.getTypeId() == 114)
							block.setTypeIdAndData(114, (byte) 0x0, false);
						else if(block.getTypeId() == 128)
							block.setTypeIdAndData(128, (byte) 0x0, false);
						else if(block.getTypeId() == 134)
							block.setTypeIdAndData(134, (byte) 0x0, false);
						else if(block.getTypeId() == 135)
							block.setTypeIdAndData(135, (byte) 0x0, false);
						else if(block.getTypeId() == 136)
							block.setTypeIdAndData(136, (byte) 0x0, false);
						else if(block.getTypeId() == 156)
							block.setTypeIdAndData(156, (byte) 0x0, false);
						else if(block.getTypeId() == 163)
							block.setTypeIdAndData(163, (byte) 0x0, false);
						else if(block.getTypeId() == 164)
							block.setTypeIdAndData(164, (byte) 0x0, false);
						else
							block.setTypeId(block.getTypeId());
					}
				}
				else if(rotateWest)
				{
					for(int i=0;i<selectedBlocksLocs.size();i++)
					{
						Block block = selectedBlocksLocs.get(i).getBlock();
						if(block.getTypeId() == 53)
							block.setTypeIdAndData(53, (byte) 0x1, false);
						else if(block.getTypeId() == 67)
							block.setTypeIdAndData(67, (byte) 0x1, false);
						else if(block.getTypeId() == 108)
							block.setTypeIdAndData(108, (byte) 0x1, false);
						else if(block.getTypeId() == 109)
							block.setTypeIdAndData(109, (byte) 0x1, false);
						else if(block.getTypeId() == 114)
							block.setTypeIdAndData(114, (byte) 0x1, false);
						else if(block.getTypeId() == 128)
							block.setTypeIdAndData(128, (byte) 0x1, false);
						else if(block.getTypeId() == 134)
							block.setTypeIdAndData(134, (byte) 0x1, false);
						else if(block.getTypeId() == 135)
							block.setTypeIdAndData(135, (byte) 0x1, false);
						else if(block.getTypeId() == 136)
							block.setTypeIdAndData(136, (byte) 0x1, false);
						else if(block.getTypeId() == 156)
							block.setTypeIdAndData(156, (byte) 0x1, false);
						else if(block.getTypeId() == 163)
							block.setTypeIdAndData(163, (byte) 0x1, false);
						else if(block.getTypeId() == 164)
							block.setTypeIdAndData(164, (byte) 0x1, false);
						else
							block.setTypeId(block.getTypeId());
					}
				}
				rotateBlocks = false;
			}
		
	}
	
	public void getSelectedBlocksLocs(Location a, Location b)
	{
		World world = Bukkit.getServer().getWorld("world");
		int xMin = Math.min(a.getBlockX(),b.getBlockX());
		int yMin = Math.min(a.getBlockY(),b.getBlockY());
		int zMin = Math.min(a.getBlockZ(),b.getBlockZ());
		int xMax = Math.max(a.getBlockX(),b.getBlockX());
		int yMax = Math.max(a.getBlockY(),b.getBlockY());
		int zMax = Math.max(a.getBlockZ(),b.getBlockZ());
		for (int x = xMin; x<=xMax; x++)
		{
		  for (int y = yMin; y<=yMax; y++)
		  {
		      for (int z = zMin; z<=zMax; z++)
		      {
		    	  Location blockLoc = new Location(world,(world.getBlockAt(x,y,z).getX()), (world.getBlockAt(x,y,z).getY()), (world.getBlockAt(x,y,z).getZ()));
		          selectedBlocksLocs.add(blockLoc);
		      }
		  }
		}
		rotateBlocks = true;
	}
}