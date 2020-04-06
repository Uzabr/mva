/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiFrames.framseDB;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;

/**
 *
 * @author user
 */
public class MainDialog extends JDialog{
    private enumForDialog dialog = enumForDialog.None;
    
    public enumForDialog  getEnum(){
        return dialog;
    }
    public void setEnum(enumForDialog dialog){
        this.dialog = dialog;
    }
    public enumForDialog showWindow(){
        setLocationRelativeTo(MainDialog.this.getParent());
        setModal(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                setEnum(enumForDialog.Cancel);
                dispose();
            }
        });
        setVisible(true);
        return getEnum();
    }
    public void close(){
        dispose();
    }
    
    
}
