/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housemanagerpro;

import javax.swing.JOptionPane;
import java.sql.*;
import jdk.nashorn.internal.objects.NativeError;

/**
 *
 * @author param
 */
public class ChangePasswordPage extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordPage
     */
    public static final String USERNAME= "root";
    public static final String PASSWORD= "";
    public static final String CONN_STRING ="jdbc:mysql://localhost:3306/ourdb?zeroDateTimeBehavior=convertToNull";
    public static Connection conn= null;
    public static PreparedStatement pst =null;
    public static ResultSet rs=null;
    public static void MySQL()
    {
        try
        {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("connection successful!");
        } 
        catch (SQLException e)
        {
            System.out.println("error!");
        }
    }

    public ChangePasswordPage() {
        initComponents();
        MySQL();
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
        Label_ChangePassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_Old = new javax.swing.JPasswordField();
        TextField_New = new javax.swing.JPasswordField();
        TextField_NewConfirm = new javax.swing.JPasswordField();
        Button_Save = new javax.swing.JButton();
        Button_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Label_ChangePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_ChangePassword.setText("CHANGE PASSWORD");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Old Passoword:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Confirm New Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("New Password:");

        TextField_Old.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_Old.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_OldActionPerformed(evt);
            }
        });

        TextField_New.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NewActionPerformed(evt);
            }
        });

        TextField_NewConfirm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_NewConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NewConfirmActionPerformed(evt);
            }
        });

        Button_Save.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_Save.setText("SAVE CHANGES");
        Button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SaveActionPerformed(evt);
            }
        });

        Button_Back.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_Back.setText("<BACK");
        Button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(Button_Back)
                        .addGap(131, 131, 131)
                        .addComponent(Label_ChangePassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_Old, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_New, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_NewConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(Button_Save)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_ChangePassword)
                    .addComponent(Button_Back))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextField_Old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextField_New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextField_NewConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_OldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_OldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_OldActionPerformed

    private void TextField_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NewActionPerformed

    private void TextField_NewConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NewConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NewConfirmActionPerformed

    private void Button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BackActionPerformed
        int okOrCancel=JOptionPane.showConfirmDialog(null, "Are you sure you want to return to the Home Page? \nAny unsaved changes will be lost.", "Confirm Return", JOptionPane.OK_CANCEL_OPTION);
        if(okOrCancel==0)
        {
            this.dispose();
            OverviewPage overview= new OverviewPage();
            overview.setVisible(true);
        }
    }//GEN-LAST:event_Button_BackActionPerformed

    private void Button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SaveActionPerformed
        try
        {
            pst = conn.prepareStatement("SELECT * FROM credentials");
            rs= pst.executeQuery();
            String oldPassword=TextField_Old.getText();
            String newPassword=TextField_New.getText();
            String newConfirm=TextField_NewConfirm.getText();
            String password="";
            while(rs.next())
            {
                password=rs.getString(2);
            }
            if(oldPassword.equals(password))
            {
                if(newPassword.equals(newConfirm))
                {
                    pst=conn.prepareStatement("UPDATE credentials SET pass=? where user='Jaguars'");
                    pst.setString(1, newPassword);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Password updated successfully!\nYou can now use your new password to login into House Manager Pro.", "Password Updated", JOptionPane.INFORMATION_MESSAGE); 
                    pst.executeUpdate();
                    OverviewPage op= new OverviewPage();
                    op.setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The entered New Passwords do not match.\nPlease check both New Passowords and try again.", "New Passwords do not match", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The Old Password entered is incorrect.\nPlease check the Old Password and try again.", "Incorrect Old Password", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("error occured while accessing credentials");
            NativeError.printStackTrace(e);
            return;
        }
        
    }//GEN-LAST:event_Button_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Back;
    private javax.swing.JButton Button_Save;
    private javax.swing.JLabel Label_ChangePassword;
    private javax.swing.JPasswordField TextField_New;
    private javax.swing.JPasswordField TextField_NewConfirm;
    private javax.swing.JPasswordField TextField_Old;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
