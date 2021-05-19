/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author User
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        welcome wel = new welcome();
        wel.setVisible(true);
        wel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        wel.setResizable(false);
      }
    
}
