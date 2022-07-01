/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sig.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LAPTOP
 */
public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
           System.out.println("Action Handling Called!");
                
                switch (e.getActionCommand()){
                    
                    case "New Invoice" ;
                    System.out.println("New Invoice");
                    newInv();
                    break;
                    
                       case  "Delete Invoice";
                     System.out.println("Delete Invoice");
                     deleteInv();
                    break;
                    
                    case "New Item";
                     System.out.println("New Item");
                     newItem();
                    break;
                    
                    case "Delete Item";
                     System.out.println("Delete Item");
                     deleteItem();
                    break;
                    
                    case "Load File";
                     System.out.println("Load File");
                     loadFile();
                    break;
                    
                    case "Save File";
                     System.out.println("Save File");
                     saveFile();
                    break;
                    
                }
    }

    private void newInv() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteInv() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void newItem() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteItem() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadFile() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveFile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
