/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housemanagerpro;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author param
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */

    public LoginPage() {
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

        jPanel2 = new javax.swing.JPanel();
        Panel_LoginPage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextField_Username = new javax.swing.JTextField();
        Button_Submit = new javax.swing.JButton();
        TextField_Password = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        Panel_LoginPage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("WELCOME TO HOUSE MANAGER PRO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Please login using your Username and Password ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Password:");

        TextField_Username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_UsernameActionPerformed(evt);
            }
        });
        TextField_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_UsernameKeyPressed(evt);
            }
        });

        Button_Submit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_Submit.setText("SUBMIT");
        Button_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SubmitActionPerformed(evt);
            }
        });
        Button_Submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button_SubmitKeyPressed(evt);
            }
        });

        TextField_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_PasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_LoginPageLayout = new javax.swing.GroupLayout(Panel_LoginPage);
        Panel_LoginPage.setLayout(Panel_LoginPageLayout);
        Panel_LoginPageLayout.setHorizontalGroup(
            Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginPageLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginPageLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginPageLayout.createSequentialGroup()
                        .addComponent(Button_Submit)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginPageLayout.createSequentialGroup()
                        .addGroup(Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(Panel_LoginPageLayout.createSequentialGroup()
                                .addGroup(Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextField_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(TextField_Password))))
                        .addGap(188, 188, 188))))
        );
        Panel_LoginPageLayout.setVerticalGroup(
            Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginPageLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField_Username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(66, 66, 66)
                .addComponent(Button_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_LoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_LoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static String USERNAME= "root";
    static String PASSWORD= "";
    static String CONN_STRING ="jdbc:mysql://localhost:3306/ourdb?zeroDateTimeBehavior=convertToNull";
    static Connection conn= null;
    static PreparedStatement pst =null;
    static ResultSet rs=null;
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

    
    
    private void Button_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SubmitActionPerformed
        try
        {    
            pst = conn.prepareStatement("SELECT * FROM credentials");
            rs= pst.executeQuery();
            String user="", pass="";
            while(rs.next())
            {
                user=rs.getString(1);
                pass=rs.getString(2);
            }
            if(TextField_Username.getText().equals(user)&&TextField_Password.getText().equals(pass))
            {
                JOptionPane.showMessageDialog(null,"Login successful!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                OverviewPage overview = new OverviewPage();
                overview.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password entered.\nPlease check the Username and Password entered and try again.", "Incorrect Username or Password", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        catch(Exception e)
        {
            System.out.println("error occured while accessing credentials");   
        }
        
    }//GEN-LAST:event_Button_SubmitActionPerformed

    private void TextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_UsernameActionPerformed

    private void TextField_UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_UsernameKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            TextField_Password.requestFocus();
        }
    }//GEN-LAST:event_TextField_UsernameKeyPressed

    private void TextField_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_PasswordKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            Button_Submit.requestFocus();
        }
    }//GEN-LAST:event_TextField_PasswordKeyPressed

    private void Button_SubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button_SubmitKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            Button_SubmitActionPerformed(null);
        }
    }//GEN-LAST:event_Button_SubmitKeyPressed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        MySQL();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Submit;
    private javax.swing.JPanel Panel_LoginPage;
    private javax.swing.JPasswordField TextField_Password;
    private javax.swing.JTextField TextField_Username;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
