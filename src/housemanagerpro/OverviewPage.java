/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housemanagerpro;

import javax.swing.JOptionPane;
import com.sun.glass.events.KeyEvent;
import javax.swing.JLabel;


/**
 *
 * @author param
 */
public class OverviewPage extends javax.swing.JFrame {

    /**
     * Creates new form OverviewPage
     */
    public OverviewPage() {
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

        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Panel_OverviewPage = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Button_NewList = new javax.swing.JButton();
        Button_ViewDatabase = new javax.swing.JButton();
        Button_EditDatabase = new javax.swing.JButton();
        Button_ChangePassword = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Please login using your Username and Password ");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setText("LOAD AN EXISTING LIST");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_OverviewPage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("HELLO JAGUAR HOUSE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("What would you like to do?");

        Button_NewList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_NewList.setText("MAKE A NEW LIST");
        Button_NewList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NewListActionPerformed(evt);
            }
        });
        Button_NewList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button_NewListKeyPressed(evt);
            }
        });

        Button_ViewDatabase.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_ViewDatabase.setText("VIEW STUDENT DATABASE");
        Button_ViewDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ViewDatabaseActionPerformed(evt);
            }
        });

        Button_EditDatabase.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_EditDatabase.setText("EDIT STUDENT DATABASE");
        Button_EditDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EditDatabaseActionPerformed(evt);
            }
        });

        Button_ChangePassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_ChangePassword.setText("CHANGE PASSWORD");
        Button_ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ChangePasswordActionPerformed(evt);
            }
        });
        Button_ChangePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button_ChangePasswordKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/housemanagerpro/rsz_jaguarlogosmaller.png"))); // NOI18N

        javax.swing.GroupLayout Panel_OverviewPageLayout = new javax.swing.GroupLayout(Panel_OverviewPage);
        Panel_OverviewPage.setLayout(Panel_OverviewPageLayout);
        Panel_OverviewPageLayout.setHorizontalGroup(
            Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_OverviewPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(240, 240, 240))
            .addGroup(Panel_OverviewPageLayout.createSequentialGroup()
                .addGroup(Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_OverviewPageLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel11))
                    .addGroup(Panel_OverviewPageLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_EditDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_NewList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_ChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_ViewDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel_OverviewPageLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        Panel_OverviewPageLayout.setVerticalGroup(
            Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_OverviewPageLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_NewList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_ViewDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(Panel_OverviewPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_EditDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_ChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_OverviewPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_OverviewPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_NewListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NewListActionPerformed
        String listname=JOptionPane.showInputDialog(null, "Enter list name:", "List Name", JOptionPane.INFORMATION_MESSAGE);
        if(listname.equals(null)||listname.trim().equals("")){
            JOptionPane.showMessageDialog(null, "The List Name cannot be left blank.\nPlease enter a valid List Name and try again.", "Invalid List Name", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
           ListPage list= new ListPage(listname);
           list.setVisible(true);
           this.dispose();
        }
    }//GEN-LAST:event_Button_NewListActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Button_EditDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EditDatabaseActionPerformed
        EditDatabasePage edp=new EditDatabasePage();
        edp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_EditDatabaseActionPerformed

    private void Button_ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ChangePasswordActionPerformed
        ChangePasswordPage change=new ChangePasswordPage();
        change.setVisible(true);
    }//GEN-LAST:event_Button_ChangePasswordActionPerformed

    private void Button_NewListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button_NewListKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            Button_NewListActionPerformed(null);
        }        
    }//GEN-LAST:event_Button_NewListKeyPressed

    private void Button_ChangePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button_ChangePasswordKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            Button_ChangePasswordActionPerformed(null);
        }        

    }//GEN-LAST:event_Button_ChangePasswordKeyPressed

    private void Button_ViewDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ViewDatabaseActionPerformed
        ViewDatabasePage vdb= new ViewDatabasePage();
        vdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_ViewDatabaseActionPerformed

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
            java.util.logging.Logger.getLogger(OverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OverviewPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_ChangePassword;
    private javax.swing.JButton Button_EditDatabase;
    private javax.swing.JButton Button_NewList;
    private javax.swing.JButton Button_ViewDatabase;
    private javax.swing.JPanel Panel_OverviewPage;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}