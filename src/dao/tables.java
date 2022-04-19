/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Ron Carl
 */
public class tables {
    public static void main(String[] args) {
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(20),mobileNumber varchar(11),birthDate varchar(20),email varchar(20),position varchar(20),userName varchar(20),password varchar(20),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,mobileNumber,birthDate,email,position,userName,password,status) values('Admin','09387106780','November','admin@gmail.com','Cashier','admin','admin','true')";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
