package com.nocde.movie_reservation_system.dataAccessLayer;

/* This is a database utility class used to handle the database connection. This ensures
    the application uses single connection configuration.
*/ 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseManager {
    // This connection URL string used by jdbc to connect to an SQLite database 
    private static final String URL = "jdbc:sqlite:C:/ProgramData/MySQL/MySQL Server 8.0/Data/movie_reservation_db";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL);
    }
}
