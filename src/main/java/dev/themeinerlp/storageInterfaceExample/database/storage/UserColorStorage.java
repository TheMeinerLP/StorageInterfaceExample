package dev.themeinerlp.storageInterfaceExample.database.storage;

import dev.themeinerlp.storageInterfaceExample.database.model.UserColor;
import dev.themeinerlp.storageInterfaceExample.database.repository.UserColorRepository;

import java.sql.Connection;
import java.util.Optional;
import java.util.UUID;

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
