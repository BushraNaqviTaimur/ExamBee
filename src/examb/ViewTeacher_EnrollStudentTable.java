/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examb;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author bushra
 */
public class ViewTeacher_EnrollStudentTable extends javax.swing.JFrame {

    /**
     * Creates new form ViewTeacher_EnrollStudentTable
     */
     
    ResultSet rs; 
    Teacher teacher;
      
      public ViewTeacher_EnrollStudentTable() 
        {}

    public ViewTeacher_EnrollStudentTable(Teacher teacher) 
    {
        initComponents();
        this.teacher=teacher;
        this.setLocationRelativeTo(null); // for centering form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
        
        
        if("Math01".equals(teacher.courseCode))
        {
            
            //Teacher teacherr =new Teacher(teacher.courseCode,teacher.userName,teacher.password);
            try
                {

                rs = teacher.ShowAllMathsStudents();
                    
                while(jTable_showallstudents.getRowCount() > 0) 
                {
                    ((DefaultTableModel) jTable_showallstudents.getModel()).removeRow(0);

                }


                /* 
                Whenever you query the database using a statement like for
                example SELECT, the result given back from database is stored in
                ResetSet type object. Every ResultSet consists of meta data. A meta data
                is basically a blueprint of ResultSet having info like how many rows and
                columns does a ResultSet have, what data type these rows and columns have,
                name of table, rows and columns names etc. Whenever we need this kind of info
                from a ResultSet, we make use of its meta data.             
                */
                int columns = rs.getMetaData().getColumnCount();


                while(rs.next())
                {  

                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++)
                    {  
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable_showallstudents.getModel()).insertRow(rs.getRow()-1,row);
                }

            }
        catch (Exception e)
        {
                
        }  
        }
        
        if("PST03".equals(teacher.courseCode))
        {
            try
                {

                rs = teacher.ShowAllPSTStudents();
                    
                while(jTable_showallstudents.getRowCount() > 0) 
                {
                    ((DefaultTableModel) jTable_showallstudents.getModel()).removeRow(0);

                }


                
                int columns = rs.getMetaData().getColumnCount();


                while(rs.next())
                {  

                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++)
                    {  
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable_showallstudents.getModel()).insertRow(rs.getRow()-1,row);
                }

            }
        catch (Exception e)
        {
                
        }  
        }
        
        if("English02".equals(teacher.courseCode))
        {
            try
                {

                rs = teacher.ShowAllENGStudents();
                    
                while(jTable_showallstudents.getRowCount() > 0) 
                {
                    ((DefaultTableModel) jTable_showallstudents.getModel()).removeRow(0);

                }


                
                int columns = rs.getMetaData().getColumnCount();


                while(rs.next())
                {  

                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++)
                    {  
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable_showallstudents.getModel()).insertRow(rs.getRow()-1,row);
                }

            }
        catch (Exception e)
        {
                
        }  
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_showallstudents = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1_search = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1_file = new javax.swing.JMenu();
        jMenuItem_refresh = new javax.swing.JMenuItem();
        jMenu_insert = new javax.swing.JMenu();
        jMenuItem1_Add = new javax.swing.JMenuItem();
        jMenuItem2_Update = new javax.swing.JMenuItem();
        jMenuItem3_delete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_showallstudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course_ID", "Student_ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable_showallstudents);

        jButton1_search.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_search.setText("Search");
        jButton1_search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_searchActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(121, 228, 255));

        jMenu1_file.setText("File");

        jMenuItem_refresh.setText("Refresh");
        jMenuItem_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_refreshActionPerformed(evt);
            }
        });
        jMenu1_file.add(jMenuItem_refresh);

        jMenuBar1.add(jMenu1_file);

        jMenu_insert.setText("Functions");

        jMenuItem1_Add.setText("Add new record");
        jMenuItem1_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_AddActionPerformed(evt);
            }
        });
        jMenu_insert.add(jMenuItem1_Add);

        jMenuItem2_Update.setText("Update existing record");
        jMenuItem2_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_UpdateActionPerformed(evt);
            }
        });
        jMenu_insert.add(jMenuItem2_Update);

        jMenuItem3_delete.setText("Delete record");
        jMenuItem3_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_deleteActionPerformed(evt);
            }
        });
        jMenu_insert.add(jMenuItem3_delete);

        jMenuBar1.add(jMenu_insert);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_AddActionPerformed
        new AddnewStudent(teacher).setVisible(true);
    }//GEN-LAST:event_jMenuItem1_AddActionPerformed

    private void jMenuItem2_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_UpdateActionPerformed

       // if(jTable1_patientshistory.getRowCount() == 1)
        //{
         //   Patient patient = new Patient();
         //   patient.ID = Integer.parseInt(jTable1_patientshistory.getValueAt(0,0).toString());
         //   patient.name = jTable1_patientshistory.getValueAt(0,1).toString();
         //   patient.phoneNumber = Integer.parseInt(jTable1_patientshistory.getValueAt(0,2).toString());
         //   patient.pastDentalhistory = jTable1_patientshistory.getValueAt(0,3).toString();
          //  patient.pastMedicalhistory = jTable1_patientshistory.getValueAt(0,4).toString();
          //  patient.pastSurgicalhistory = jTable1_patientshistory.getValueAt(0,5).toString();
           // patient.pastDrughistory = jTable1_patientshistory.getValueAt(0,6).toString();

          //  Receptionist recept = new  Receptionist(user.userName,user.password,user.userType);

          //  recept.UpdatePatientData(patient);

          //  JOptionPane.showMessageDialog(rootPane, "Record updated successfully.");
       // }
       // else
       // {
        //    JOptionPane.showMessageDialog(rootPane, "You must first search for a specific patient to update.");
       // }
    }//GEN-LAST:event_jMenuItem2_UpdateActionPerformed

    private void jMenuItem3_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_deleteActionPerformed
        //new DeletePatientData(user).setVisible(true);

        //int inputID = Integer.parseInt(JOptionPane.showInputDialog("Enter patient ID"));

       // Patient patient = new Patient();
       // patient.ID = inputID;

        //Receptionist recept = new  Receptionist(user.userName,user.password,user.userType);

       // recept.DeletePatient(patient);

    }//GEN-LAST:event_jMenuItem3_deleteActionPerformed

    private void jButton1_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_searchActionPerformed

        if("Math01".equals(teacher.courseCode)) 
        {
           
            rs = teacher.SearchMathStudentsData(jTextField1.getText());
        }
       
        if("English02".equals(teacher.courseCode)) 
        {
           
            rs = teacher.SearchENGStudentsData(jTextField1.getText());
        }
        if("PST03".equals(teacher.courseCode)) 
        {
           
            rs = teacher.SearchPSTStudentsData(jTextField1.getText());
        }
        try
        {

            while(jTable_showallstudents.getRowCount() > 0)
            {
                ((DefaultTableModel) jTable_showallstudents.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) jTable_showallstudents.getModel()).insertRow(rs.getRow()-1,row);
            }

        }
        catch (Exception e)
        {

        }
    }//GEN-LAST:event_jButton1_searchActionPerformed

    private void jMenuItem_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_refreshActionPerformed
        jTextField1.setText("");
        this.jButton1_searchActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTeacher_EnrollStudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTeacher_EnrollStudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTeacher_EnrollStudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTeacher_EnrollStudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTeacher_EnrollStudentTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_search;
    private javax.swing.JMenu jMenu1_file;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_Add;
    private javax.swing.JMenuItem jMenuItem2_Update;
    private javax.swing.JMenuItem jMenuItem3_delete;
    private javax.swing.JMenuItem jMenuItem_refresh;
    private javax.swing.JMenu jMenu_insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_showallstudents;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
