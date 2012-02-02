package com.contritio.bukkit.cHelp;

import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Alexander
 * Date: 2/2/12
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class myPlayerListener implements Listener {
    Logger log = Logger.getLogger("Minecraft");
    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerLogin(PlayerLoginEvent event){
        log.info("Player has Logged in!");
    }
}