/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examb;

import javax.swing.JOptionPane;

/**
 *
 * @author bushra
 */
public class ViewStudentLoginPage extends javax.swing.JFrame {

    /**
     * Creates new form ViewStudentLoginPage
     */
    public ViewStudentLoginPage() {
        initComponents();
        this.setLocationRelativeTo(null); // for centering form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnjoin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2_s = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 500, 770, 522));
        setPreferredSize(new java.awt.Dimension(770, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        btnjoin.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        btnjoin.setText("Join");
        btnjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjoinActionPerformed(evt);
            }
        });
        getContentPane().add(btnjoin);
        btnjoin.setBounds(270, 290, 200, 80);

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Enter Your Student-ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 190, 250, 57);
        getContentPane().add(jTextField2_s);
        jTextField2_s.setBounds(390, 180, 260, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examb/examb_images/backarrow copy.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 410, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examb/examb_images/bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-5, -4, 780, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjoinActionPerformed
        // TODO add your handling code here:
        Student student= new Student(jTextField2_s.getText());
        
        boolean loginStatus = student.StudentLogin("PSTStudents");
        
        
        if(loginStatus == true)
        {
            JOptionPane.showMessageDialog(rootPane, "Login successful!, welcome "+ student.name);
        
                    new ViewStudent_MainPage(student).setVisible(true);
                    this.setVisible(false); //to close current window
        }
        else if (loginStatus = student.StudentLogin("EnglishStudents"))
        {
            JOptionPane.showMessageDialog(rootPane, "Login successful!, welcome "+ student.name);
                    new ViewStudent_MainPage(student).setVisible(true);
                    this.setVisible(false); //to close current window
        }
        else if (loginStatus = student.StudentLogin("MathsStudent"))
        {
            JOptionPane.showMessageDialog(rootPane, "Login successful!, welcome "+ student.name);
                    new ViewStudent_MainPage(student).setVisible(true);
                    this.setVisible(false); //to close current window
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Student does not exist, please try again!");
        }
    }//GEN-LAST:event_btnjoinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewStartpage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjoin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2_s;
    // End of variables declaration//GEN-END:variables
}
