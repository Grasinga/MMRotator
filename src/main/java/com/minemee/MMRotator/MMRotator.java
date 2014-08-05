package com.minemee.MMRotator;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MMRotator extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");
	
	public static WorldGuardPlugin WorldGuard = null;

	public final MMRotatorBlockListener blockListener = new MMRotatorBlockListener();

	public void onEnable(){
		log.info("MMRotator enabled!");

		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(this.blockListener, this);
		
		Plugin guard = getServer().getPluginManager().getPlugin("WorldGuard");
		

		if (guard != null && guard instanceof WorldGuardPlugin) {
			WorldGuard = (WorldGuardPlugin) guard;
		}
		
		// Commands:
		getCommand("rotateon").setExecutor(new MMRotatorCommands());
		getCommand("rotateoff").setExecutor(new MMRotatorCommands());
		getCommand("rotateselect").setExecutor(new MMRotatorCommands());
		getCommand("rotateall").setExecutor(new MMRotatorCommands());
	}
 
	public void onDisable(){
		log.info("MMRotator disabled.");
	}

}
