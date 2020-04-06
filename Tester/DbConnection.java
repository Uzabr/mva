/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author user
 */
public class DbConnection {
        private Connection connect;
        //private Statement state;
       // private ResultSet result;
    public void togetData() throws SQLException{  
        
    }
   public Connection getConnection(){
       return connect;
   }
   public void setConnection(Connection connect){
       this.connect = connect;
   }
   
   public String getVersion() throws SQLException{
       String ver = null;
       Statement stm;
       ResultSet rst;
       
       try{
           stm = connect.createStatement();
           rst = stm.executeQuery("SELECT VERSION()");
           while(rst.next()){
               ver = rst.getString(1);
           }
       }
       catch (SQLException e){
           e.printStackTrace();
       }
       return ver;
   }
       
}
