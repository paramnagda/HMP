/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housemanagerpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author param
 */
public class EditStudent extends javax.swing.JFrame {

    /**
     * Creates new form EditStudent
     */
    int rowindex=-1;
    Student s=new Student();
    ArrayList<Student> students= new ArrayList<Student>();
    boolean flag=false;
    static String USERNAME= "root";
    static String PASSWORD= "";
    static String CONN_STRING ="jdbc:mysql://localhost:3306/ourdb?zeroDateTimeBehavior=convertToNull";
    static Connection conn= null;
    static PreparedStatement pst =null;
    static ResultSet rs=null;
    String e="";
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
    
    public void getStudentsList()
    {
        students=new ArrayList<Student>();
        try 
       {
           pst=conn.prepareStatement("SELECT * FROM students");
           rs=pst.executeQuery();
           while(rs.next())
           {
                Student student= new Student(rs.getString("Name"),rs.getString("Gender"),rs.getString("Grade"),
                        rs.getString("Section"),rs.getString("DOB"),rs.getString("EmailID"),rs.getString("Phone"));
                students.add(student);
           }

       } 
       catch (Exception e) 
       {
           System.out.println("error accessing database");
       }
    }
    
    public void Display()
    {
        getStudentsList();
        sortStudents();
        DefaultTableModel model= (DefaultTableModel)Table_Database.getModel();
        int noOfRows=Table_Database.getRowCount();
        if(noOfRows!=0)
        {
            for(int i=(noOfRows-1); i>=0; i--)
                model.removeRow(i);
        }
        Object [] row= new Object[7];
        for(int i=0; i<students.size();i++)
        {
            row[0]=students.get(i).Name;
            row[1]=students.get(i).Gender;
            row[2]=students.get(i).Grade;
            row[3]=students.get(i).Section;
            row[4]=students.get(i).DOB;
            row[5]=students.get(i).Email;
            row[6]=students.get(i).Phone;   
            
            model.addRow(row);
        }
        System.out.println("displayed user database");
    }
    
    public void sortStudents()
    {
        if(students.isEmpty() || students.size()==1)
        {
            return;
        }
        else
        {
            for(int i=0;i<students.size();i++)
            {
                for(int j=0; j<(students.size()-i-1);j++)
                {
                    if(Integer.parseInt(students.get(j).Grade)<Integer.parseInt(students.get(j+1).Grade))
                    {
                        String tempName=students.get(j).Name;
                        String tempGender=students.get(j).Gender;
                        String tempGrade=students.get(j).Grade;
                        String tempSection=students.get(j).Section;
                        String tempDOB=students.get(j).DOB;
                        String tempEmail=students.get(j).Email;
                        String tempPhone=students.get(j).Phone;
                        students.get(j).Name=students.get(j+1).Name;
                        students.get(j).Gender=students.get(j+1).Gender;
                        students.get(j).Grade=students.get(j+1).Grade;
                        students.get(j).Section=students.get(j+1).Section;
                        students.get(j).DOB=students.get(j+1).DOB; 
                        students.get(j).Email=students.get(j+1).Email;
                        students.get(j).Phone=students.get(j+1).Phone; 
                        students.get(j+1).Name=tempName;
                        students.get(j+1).Gender=tempGender;
                        students.get(j+1).Grade=tempGrade;
                        students.get(j+1).Section=tempSection;
                        students.get(j+1).DOB=tempDOB; 
                        students.get(j+1).Email=tempEmail; 
                        students.get(j+1).Phone=tempPhone; 
                    }
                }
            }
        }
    }
    public EditStudent() {
        initComponents();
        MySQL();
        Display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup_Gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Label_ChangePassword = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Database = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TextField_DOB = new javax.swing.JTextField();
        TextField_EmailID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextField_Phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextField_Name = new javax.swing.JTextField();
        Button_Update = new javax.swing.JButton();
        Button_Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboBox_Grade = new javax.swing.JComboBox<>();
        ComboBox_Section = new javax.swing.JComboBox<>();
        RadioButton_Male = new javax.swing.JRadioButton();
        RadioButton_Female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Label_ChangePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_ChangePassword.setText("EDIT A STUDENT");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Select a student to edit from the database, edit details using the form and then click \"UPDATE\"");

        Table_Database.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Database.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Grade", "Section", "DOB", "EmailID", "Phone"
            }
        ));
        Table_Database.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_DatabaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Database);
        if (Table_Database.getColumnModel().getColumnCount() > 0) {
            Table_Database.getColumnModel().getColumn(1).setPreferredWidth(15);
            Table_Database.getColumnModel().getColumn(2).setPreferredWidth(15);
            Table_Database.getColumnModel().getColumn(3).setPreferredWidth(15);
            Table_Database.getColumnModel().getColumn(4).setPreferredWidth(40);
            Table_Database.getColumnModel().getColumn(5).setPreferredWidth(90);
            Table_Database.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Name:");

        TextField_DOB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_DOBActionPerformed(evt);
            }
        });

        TextField_EmailID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_EmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_EmailIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("DOB (dd/mm/yyyy):");

        TextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PhoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Email ID:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Phone:");

        TextField_Name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NameActionPerformed(evt);
            }
        });

        Button_Update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_Update.setText("UPDATE");
        Button_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UpdateActionPerformed(evt);
            }
        });

        Button_Back.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Button_Back.setText("<BACK");
        Button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Grade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Section:");

        ComboBox_Grade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox_Grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no Grade selected>", "5", "6", "7", "8", "9", "10", "11", "12" }));
        ComboBox_Grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_GradeActionPerformed(evt);
            }
        });

        ComboBox_Section.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox_Section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<no Section selected>", "A", "B", "C" }));
        ComboBox_Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_SectionActionPerformed(evt);
            }
        });

        ButtonGroup_Gender.add(RadioButton_Male);
        RadioButton_Male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioButton_Male.setText("Male");
        RadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_MaleActionPerformed(evt);
            }
        });

        ButtonGroup_Gender.add(RadioButton_Female);
        RadioButton_Female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioButton_Female.setText("Female");
        RadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_FemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_ChangePassword)
                        .addGap(538, 538, 538))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextField_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextField_EmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RadioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ComboBox_Section, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ComboBox_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(RadioButton_Female, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(65, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_Update)
                                .addGap(147, 147, 147))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_ChangePassword)
                    .addComponent(Button_Back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton_Female)
                            .addComponent(RadioButton_Male)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ComboBox_Section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextField_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextField_EmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(TextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(Button_Update)))
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void Table_DatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_DatabaseMouseClicked
        DefaultTableModel model=(DefaultTableModel) Table_Database.getModel();
        rowindex=Table_Database.getSelectedRow();
        s.Name=model.getValueAt(rowindex, 0).toString();
        s.Gender=model.getValueAt(rowindex, 1).toString();
        s.Grade=model.getValueAt(rowindex, 2).toString();
        s.Section=model.getValueAt(rowindex, 3).toString();
        s.DOB=model.getValueAt(rowindex, 4).toString();
        s.Email=model.getValueAt(rowindex,5).toString();
        s.Phone=model.getValueAt(rowindex,6).toString();
        TextField_Name.setText(s.Name);
        if(s.Gender.equals("M"))
        {
            RadioButton_Male.setSelected(true);
        }
        else
        {
            RadioButton_Female.setSelected(true);
        }
        ComboBox_Grade.setSelectedItem(s.Grade);
        ComboBox_Section.setSelectedItem(s.Section);
        TextField_DOB.setText(s.DOB);
        TextField_EmailID.setText(s.Email);
        TextField_Phone.setText(s.Phone);
        e=s.Email;
        flag=true;
    }//GEN-LAST:event_Table_DatabaseMouseClicked

    private void TextField_DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_DOBActionPerformed

    private void TextField_EmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_EmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_EmailIDActionPerformed

    private void TextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PhoneActionPerformed

    private void TextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NameActionPerformed

    }//GEN-LAST:event_TextField_NameActionPerformed

    private void Button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UpdateActionPerformed
        if(flag)
        {
            RadioButton_Male.setActionCommand("M");
            RadioButton_Female.setActionCommand("F");
            String N=TextField_Name.getText();
            String Ge="";
            if(ButtonGroup_Gender.getSelection()!=null)
            {
                Ge=ButtonGroup_Gender.getSelection().getActionCommand();
                System.out.println("there is a selection it is "+Ge+" vv");
            }
            String Gr=ComboBox_Grade.getSelectedItem().toString();
            String S=ComboBox_Section.getSelectedItem().toString();
            String D=TextField_DOB.getText();
            String E=TextField_EmailID.getText();
            String P=TextField_Phone.getText();
            if(N.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Invalid Name entered.\nPlease enter a valid Name and try again.", "Invalid Name", JOptionPane.ERROR_MESSAGE);
                return;            
            }
            if(ButtonGroup_Gender.getSelection()==null)
            {
                JOptionPane.showMessageDialog(null, "Invalid Gender entered.\nPlease choose a valid Gender ('Male' or 'Female') and try again.", "Invalid Gender", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int g=-1;
            try
            {
                g=Integer.parseInt(Gr);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Grade entered.\nPlease enter a valid Grade (5-12) and try again.", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(g<5||g>12)
            {
                JOptionPane.showMessageDialog(null, "Invalid Grade entered.\nPlease enter a valid Grade (5-12) and try again.", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!S.equals("A")&&!S.equals("B")&&!S.equals("C"))
            {
                JOptionPane.showMessageDialog(null, "Invalid Section entered.\nPlease enter a valid section ('A' or 'B' or 'C') and try again.", "Invalid Section", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!validateJavaDate(D))
            {
                JOptionPane.showMessageDialog(null, "Invalid Date of Birth entered.\nPlease enter a valid Date of Birth (dd/mm/yyyy) and try again.", "Invalid Date of Birth", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(E.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Invalid Email ID entered.\nPlease enter a valid Email ID and try again.", "Invalid Email ID", JOptionPane.ERROR_MESSAGE);
                return;  
            }
            for(int i=0; i<students.size();i++)
            {
                if(E.equals(students.get(i).Email)&&!E.equals(s.Email))
                {
                    JOptionPane.showMessageDialog(null, "The Email ID entered belongs to an existing student in the database.\nPlease check the student details and try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; 
                }
            }
            if(P.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone entered.\nPlease enter a valid Phone and try again.", "Invalid Phone", JOptionPane.ERROR_MESSAGE);
                return;  
            }   

            try
            {
                pst=conn.prepareStatement("UPDATE students SET Name=?, Gender=?, Grade=?, Section=?, DOB=?, EmailID=?, Phone=? WHERE EmailID=?");
                pst.setString(1, N);
                pst.setString(2, Ge);
                pst.setString(3, Gr);
                pst.setString(4, S);
                pst.setString(5, D);
                pst.setString(6, E);
                pst.setString(7, P);
                pst.setString(8, s.Email);
                pst.executeUpdate();
                Display();
                System.out.println("updated successfully");
                EditStudent es= new EditStudent();
                es.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"The student details have been updated in the student database.", "Student details updated successfully!", JOptionPane.INFORMATION_MESSAGE);
                flag=false;                
            }
            catch(Exception e)
            {
                System.out.println("error while adding student");
                JOptionPane.showMessageDialog(this,e);

            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No student selected.\nPlease select a student from the Database and try again.", "No student selected", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_Button_UpdateActionPerformed

    private void Button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BackActionPerformed
        int okOrCancel=JOptionPane.showConfirmDialog(null, "Are you sure you want to go back? \nAny unsaved changes will be lost.", "Confirm Return", JOptionPane.OK_CANCEL_OPTION);
        if(okOrCancel==0)
        {
            this.dispose();
            EditDatabasePage edp= new EditDatabasePage();
            edp.setVisible(true);
        }
    }//GEN-LAST:event_Button_BackActionPerformed

    private void ComboBox_GradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_GradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_GradeActionPerformed

    private void ComboBox_SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_SectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_SectionActionPerformed

    private void RadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_MaleActionPerformed

    private void RadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_FemaleActionPerformed

    public static boolean validateJavaDate(String strDate)
    {
	if (strDate.trim().equals(""))
	{
	    return false;
	}
	/* Date is not 'null' */
	else
	{
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
	    sdfrmt.setLenient(false);
	    try
	    {
	        java.util.Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}
   }
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
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup_Gender;
    private javax.swing.JButton Button_Back;
    private javax.swing.JButton Button_Update;
    private javax.swing.JComboBox<String> ComboBox_Grade;
    private javax.swing.JComboBox<String> ComboBox_Section;
    private javax.swing.JLabel Label_ChangePassword;
    private javax.swing.JRadioButton RadioButton_Female;
    private javax.swing.JRadioButton RadioButton_Male;
    private javax.swing.JTable Table_Database;
    private javax.swing.JTextField TextField_DOB;
    private javax.swing.JTextField TextField_EmailID;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JTextField TextField_Phone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
