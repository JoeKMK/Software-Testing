package com.example.accounts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

    public static void main(String[] args) {
        final String CONNECTION = "jdbc:sqlite:AccountDatabase.db";

        try (Connection conn = DriverManager.getConnection(CONNECTION);
             Statement statement = conn.createStatement()) {

            statement.executeUpdate("drop table ACCOUNTS");
            System.out.println("ACCOUNTS table dropped.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
