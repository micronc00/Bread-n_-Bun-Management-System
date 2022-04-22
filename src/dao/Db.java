/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Ron Carl
 */
public class Db {

    static Connection c;

    public static Connection getCon() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/babms", "root", "1111");
        }

        return c;
    }

    public static void setData(String s) throws Exception {
        Db.getCon().createStatement().executeUpdate(s);
    }

    public static ResultSet getData(String s) throws Exception {

        return Db.getCon().createStatement().executeQuery(s);

    }

}
