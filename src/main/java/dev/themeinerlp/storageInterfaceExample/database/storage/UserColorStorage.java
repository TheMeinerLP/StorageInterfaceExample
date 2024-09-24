package dev.themeinerlp.storageInterfaceExample.database.storage;

import dev.themeinerlp.storageInterfaceExample.database.model.UserColor;
import dev.themeinerlp.storageInterfaceExample.database.repository.UserColorRepository;

import java.sql.Connection;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class UserColorStorage implements UserColorRepository {

    private final Connection connection;

    public UserColorStorage(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Optional<UserColor> findByUniqueIdAndLabel(UUID uniqueId) {
        return Optional.empty();
    }

    @Override
    public CompletableFuture<UserColor> asyncFindByUniqueIdAndLabel(UUID uniqueId) {
        return CompletableFuture.supplyAsync(() -> {
            //DB Anfrage
            return new UserColor(UUID.randomUUID(), "primary", "accent");
        });
    }

    @Override
    public CompletableFuture<UserColor> saveUserColor(UserColor userColor) {
        return CompletableFuture.supplyAsync(() -> userColor);
    }

    @Override
    public void saveUserColors(UserColor userColors) {

    }

    @Override
    public void updateUserColors(UserColor userColors) {

    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }
}
