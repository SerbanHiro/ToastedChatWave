package me.serbob.toastedchatwave.Listeners.priorities;

import me.serbob.toastedchatwave.Listeners.ChatWave;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class LowestPriorityChatWave implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        ChatWave.executeChatWave(event);
    }
}