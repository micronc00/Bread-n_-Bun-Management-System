/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
/**
 *
 * @author Ron Carl
 */
public class UserDao {
    
    public static void save(User user){
        String query = "insert into user(name,mobileNumber,birthDate,email,position,userName,password,status) values('"+user.getName()+"','"+user.getMobileNumber()+"','"+user.getBirthDate()+"','"+user.getEmail()+"','"+user.getPosition()+"','"+user.getUserName()+"','"+user.getPassword()+"','true')";
        DbOperations.setDataOrDelete(query, "Registered Successfully");
    }
    
    public static User login(String userName,String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where userName='"+userName+"' and password='"+password+"'");
            while(rs.next()){
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
}
