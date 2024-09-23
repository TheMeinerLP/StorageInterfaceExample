package dev.themeinerlp.storageInterfaceExample;

import dev.themeinerlp.storageInterfaceExample.database.model.UserColor;
import dev.themeinerlp.storageInterfaceExample.database.repository.UserColorRepository;
import dev.themeinerlp.storageInterfaceExample.database.storage.UserColorStorage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class StorageInterfaceExample extends JavaPlugin implements Listener {

    private UserColorRepository userColorRepository;

    @Override
    public void onEnable() {
        this.userColorRepository = new UserColorStorage(null);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        var result = this.userColorRepository.findByUniqueIdAndLabel(event.getPlayer().getUniqueId())
                .orElse(UserColor.fromBukkitPlayerWithDefaults(event.getPlayer()));
        this.userColorRepository.saveUserColors(result);
    }
}
