package dev.themeinerlp.storageInterfaceExample.database.model;

import org.bukkit.entity.Player;

import java.util.UUID;

public record UserColor(UUID uuid, String primaryColor, String accentColor) {

    public static UserColor fromBukkitPlayerWithDefaults(Player player) {
        return new UserColor(player.getUniqueId(), "primary", "accent");
    }

}
