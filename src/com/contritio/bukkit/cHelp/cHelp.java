package com.contritio.bukkit.cHelp;

import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Alexander
 * Date: 2/2/12
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class cHelp extends JavaPlugin {
    Logger log = Logger.getLogger("Minecraft") ;
    private PlayerLoginEvent event;

    public void onEnable(){
        log.info("cHelp has been Enabled!");
    }
    public void onDisable(){
        log.info("cHelp has been Disabled!");
    }
}