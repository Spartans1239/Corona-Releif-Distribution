/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Upazilla1Releif extends javax.swing.JFrame {

    /**
     * Creates new form Upazilla1Releif
     */
    public Upazilla1Releif() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELEIF SECTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 330, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("NID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, 50));

        nid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });
        jPanel2.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 180, 40));

        rSMaterialButtonRectangle1.setText("BACK");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 120, 50));

        rSMaterialButtonRectangle2.setText("SUBMIT");
        rSMaterialButtonRectangle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle2MouseClicked(evt);
            }
        });
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 700, 320));

        setSize(new java.awt.Dimension(699, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        Upazilla1Central cent =new Upazilla1Central();
        cent.setVisible(true);
        cent.setResizable(false);
        dispose();
                
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void rSMaterialButtonRectangle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2MouseClicked
        // TODO add your handling code here:
        FileReader fr = null;
        
        try {
            fr = new FileReader("up1_people.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedReader br = new BufferedReader(fr);
        
        String str;
        
        String arr[][] = new String [100][10];
        int counter  = 0;
        int idx = 0;

        try {
            while((str = br.readLine())!=null)
            {
                arr[counter][idx] = str;
                if(idx == 4)
                {
                    idx = 0;
                    counter++;
                }
                else idx++;
                //System.out.println(counter);
            }
        } catch (IOException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FileReader fr1 = null;
        
        try {
            fr = new FileReader("left.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedReader br1 = new BufferedReader(fr);
        
        String str1;
        
        ArrayList<String> arr1 = new ArrayList<String>();
        
        try {
            while((str1 = br1.readLine())!=null)
            {
                arr1.add(str1);
            }
        } catch (IOException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            br1.close();
        } catch (IOException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String s = nid.getText();
        int dd = Integer.valueOf(s);

//        if(dd>counter){
//            Component icon = null;
//            JOptionPane.showMessageDialog(icon,"This id is not exist","Error",JOptionPane.ERROR_MESSAGE);
//            nid.setText("");
//        }
        
        try{
         if(dd>counter){
         throw new IDNotfound("Id not found");
         }
         }
         catch(IDNotfound e){
            Component icon = null;
            JOptionPane.showMessageDialog(icon,"This id does not exist","Error",JOptionPane.ERROR_MESSAGE);
            nid.setText("");
            }
        int xx  = --dd;
        int income = Integer.valueOf(arr[xx][3]);
        
        if(income>100000)
        {
             Component icon = null;
            JOptionPane.showMessageDialog(icon,"Your are not eligible for releif","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(arr[dd][4].equals("1"))
        {
            Component icon = null;
            JOptionPane.showMessageDialog(icon,"Delivery already done for this id","Error",JOptionPane.ERROR_MESSAGE);
            nid.setText("");
        }
        else
        {
            int paise = 0,baki = 0;
            for(int i=0;i<counter;i++) 
            {
                if(arr[i][4].equals("0") && income<=100000) baki++;
                else paise++;
            }

        int total = (60 - Integer.valueOf(arr1.get(1)));
        int ar_baki_ache = total -(8*paise);
        
        if(ar_baki_ache>=8){
        Component icon = null;
            JOptionPane.showMessageDialog(this, "Releif is delivered","INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
        
        arr[dd][4] = "1";
        nid.setText("");
        }
        else
        {
            Component icon = null;
            JOptionPane.showMessageDialog(icon,"Sufficient releif is not available","Error",JOptionPane.ERROR_MESSAGE);
            nid.setText("");
        }
        
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter("up1_people.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SendReleif.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<counter;i++)
        {
            for(int j = 0;j<5;j++)
            {
                outputFile.println(arr[i][j]);
            }
        }
         outputFile.close();
        }
        
    }//GEN-LAST:event_rSMaterialButtonRectangle2MouseClicked

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Releif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Releif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Releif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Releif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upazilla1Releif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nid;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    // End of variables declaration//GEN-END:variables
}
