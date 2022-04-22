/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;
/**
 *
 * @author Ron Carl
 */
public class ProductDao {
    
    public static void save(Product product){
        String query = "insert into product(productName,price,quantity,dateManufactured,expirationDate) values('"+product.getProductName()+"','"+product.getPrice()+"','"+product.getQuantity()+"','"+product.getDateManufactured()+"','"+product.getExpirationDate()+"')";
        DbOperations.setDataOrDelete(query, "Product Added Successfully");
    }
    
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from product");
            while(rs.next()){
                Product product = new Product();
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getString("price"));
                product.setQuantity(rs.getString("quantity"));
                product.setDateManufactured(rs.getString("dateManufactured"));
                product.setExpirationDate(rs.getString("expirationDate"));
                arrayList.add(product);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
