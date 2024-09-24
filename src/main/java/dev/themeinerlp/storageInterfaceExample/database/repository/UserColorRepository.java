package dev.themeinerlp.storageInterfaceExample.database.repository;

import dev.themeinerlp.storageInterfaceExample.database.model.UserColor;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface UserColorRepository extends Repository {
    Optional<UserColor> findByUniqueIdAndLabel(UUID uniqueId);
    CompletableFuture<UserColor> asyncFindByUniqueIdAndLabel(UUID uniqueId);
    CompletableFuture<UserColor> saveUserColor(UserColor userColor);
    void saveUserColors(UserColor userColors);
    void updateUserColors(UserColor userColors);
}
