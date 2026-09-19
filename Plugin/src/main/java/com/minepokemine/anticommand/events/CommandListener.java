package com.minepokemine.anticommand.events;

import com.minepokemine.anticommand.logic.HandleCommand;
import com.minepokemine.anticommand.logic.parsing.ParsedCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class CommandListener implements Listener {
    @EventHandler
    public void onServerCommand(ServerCommandEvent event) {
        String commandStr = event.getCommand();
        ParsedCommand command = new ParsedCommand(commandStr);
        if (HandleCommand.H(command)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        String commandStr = event.getMessage();
        ParsedCommand command = new ParsedCommand(commandStr);
        if (HandleCommand.H(command)) {
            event.setCancelled(true);
        }
    }
}
