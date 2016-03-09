package TiOPO;

/**
 * Created by Egor P on 09.03.2016.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import TiOPO.Interface.ConnectInterface;

public class Connect implements ConnectInterface{
    public void driverRegistration()
    {
        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("PostgreSQL JDBC Driver not found");
            e.printStackTrace();
            return;
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
    }

    public void getConnection()
    {
        conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/StringTables", "postgres", "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection()
    {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement createState()
    {
        Statement stat = null;
        try {
            stat = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stat;
    }

    private Connection conn;
}

