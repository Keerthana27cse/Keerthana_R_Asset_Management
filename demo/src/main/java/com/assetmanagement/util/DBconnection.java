package com.assetmanagement.util;
import com.assetmanagement.model.Role;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnection 
{

    public static void main(String[] args) {
        {
        Connection con = null;//con obj
        PreparedStatement stmt = null;//sql obj
        ResultSet rs = null;//result obj
            try {
                /*Class.forName("com.mysql.cj.jdbc.Driver");//loader to method
                System.out.println("Driver is loaded");*/
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asset_management_system?user=root&password=Qwerty");//class ,static method
                System.out.println("Connection is established...");
                System.out.println("con:\t"+con);// obj of connection
                /*String query= "INSERT INTO Employee (name, gender, email, password, contact_number, address, role) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, "Keerthana");
                ps.setString(2, "Female");
                ps.setString(3, "keerthana@example.com");
                ps.setString(4, "password123");
                ps.setString(5, "9876543210"); 
                ps.setString(6, "Chennai, India");
                ps.setString(7, Role.ADMIN.name());      //enum to string    
                ps.executeUpdate();
                ps.close(); */

                String query2 = "SELECT * FROM employee";
                stmt = con.prepareStatement(query2);
                rs = stmt.executeQuery();

                System.out.println("\nEmployee Table Data:");//extract from resultset
                while (rs.next()) {
                    int id = rs.getInt("employee_id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    Role role = Role.valueOf(rs.getString("role"));//string to enum
                    System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Role: " + role);
                }
            } catch (SQLException e) {
                System.err.println("SQL Exception occurred");
                e.printStackTrace();
            } finally {
                try {
                    if (rs!=null) rs.close();
                    if (stmt!=null) stmt.close();
                    if (con !=null) con.close();
                    System.out.println("\nConnection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
    