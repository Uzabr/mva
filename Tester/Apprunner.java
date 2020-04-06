/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import GuiFrames.framseDB.MainDialog;
import GuiFrames.framseDB.MainGUI;
import GuiFrames.framseDB.SignGUI;
import GuiFrames.framseDB.enumForDialog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Apprunner {
    
    private DbConnection manage = null;
    
    public Apprunner(){
        
    }
    public void run(){
        if (showMainWindow()){
            windowLoad();
        }
        else {
                 System.exit(0);

        }
   }
    private boolean showMainWindow(){
        try{
            manage = new DbConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        SignGUI sign = new SignGUI(manage);
        enumForDialog rdb = sign.showWindow();
        rdb = enumForDialog.OK;
        
        
    return true;
    }
   
    public void windowLoad(){
        MainGUI mainWindow = null;
        try{
            mainWindow = createMainWindow();
            
            mainWindow.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosed(WindowEvent e){
                    closeApplication();
                    
                }
            });
           mainWindow.setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
//            mainWindow.setVisible(false);
//            mainWindow.dispose();
        }
    }
    private MainGUI createMainWindow() throws ClassNotFoundException, SQLException{
        return new MainGUI();
    }
    private void closeApplication(){
        System.exit(0);
    }
   
        public static void main(String[] args){
        Apprunner runner = new Apprunner();
        runner.run();
    }
    
}
