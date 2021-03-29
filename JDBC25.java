package com.example;

//ex25

import java.sql.*;

public class JDBC25
{
    static final String URL = "jdbc:sqlite:C:/SQLite/HW7.db";

    public static void createNewDatabase()
    {
        try (Connection conn = DriverManager.getConnection(URL))
        {
            if (conn != null)
            {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void selectAll()
    {
        try (Connection conn = DriverManager.getConnection(URL))
        {
            if (conn != null)
            {
                String sql = "SELECT * FROM EMPLOYEES";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next())
                {
                    System.out.println(rs.getInt("id") + "\t" +
                            rs.getString("name") + "\t" +
                            rs.getDouble("salary"));
                }
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args)
    {
        selectAll();
    }


}

