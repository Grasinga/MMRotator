package com.minemee.MMRotator;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MMRotator extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");

	public final MMRotatorBlockListener blockListener = new MMRotatorBlockListener();

	public void onEnable(){
		log.info("MMRotator enabled!");

		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(this.blockListener, this);
		
		getCommand("rotateon").setExecutor(new MMRotatorCommands());
		getCommand("rotateoff").setExecutor(new MMRotatorCommands());
	}
 
	public void onDisable(){
		log.info("MMRotator disabled.");
	}

}
