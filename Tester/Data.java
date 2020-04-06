/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.Document;


/**
 *
 * @author user
 */
public class Data {
        private Connection con;
        private Statement stm;   
        private ResultSet rst;
        public  void toGetConnect() throws SQLException{
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kursValyut?zeroDateTimeBehavior=convertToNull", "root", "toor");
               stm = con.createStatement();
               rst = stm.executeQuery("Select * from Client");
               
               while (rst.next()){
                   System.out.println(rst.getString(2));
               }
        }
        public static void main(String[] args) throws SQLException{
            Data d = new Data();
            d.toGetConnect();
        }
}
           
        
        
   

