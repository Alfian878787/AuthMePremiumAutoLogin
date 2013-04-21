/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kolorafa.bukkit.AuthMePremiumAutoLogin;

import org.bukkit.entity.Player;

/**
 *
 * @author kolorafa
 */
public class delayPlayerLogin implements Runnable {

    AuthMePremiumAutoLogin plugin;
    Player p;
    
    public delayPlayerLogin(AuthMePremiumAutoLogin plugin, Player pp){
        this.plugin = plugin;
        this.p = pp;
    }
    
    @Override
    public void run() {
            plugin.log("Run player delay");
            Player player = plugin.getServer().getPlayerExact(p.getName());
            if(player!=null && player.isOnline())plugin.check(player);
            else plugin.log("Player "+p.getPlayerListName()+" is offline");
    }
    
}