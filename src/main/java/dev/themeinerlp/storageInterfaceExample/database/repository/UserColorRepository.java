package dev.themeinerlp.storageInterfaceExample.database.repository;

import dev.themeinerlp.storageInterfaceExample.database.model.UserColor;

import java.util.Optional;
import java.util.UUID;

public interface UserColorRepository extends Repository {
    Optional<UserColor> findByUniqueIdAndLabel(UUID uniqueId);
    void saveUserColors(UserColor userColors);
    void updateUserColors(UserColor userColors);
}
