package dev.themeinerlp.storageInterfaceExample.database.repository;

import java.sql.Connection;

public interface Repository {

    Connection getConnection();
}
