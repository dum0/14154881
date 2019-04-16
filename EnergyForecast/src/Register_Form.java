/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import guests_ui.guest_ui;

public class Register_Form extends javax.swing.JFrame {

    /**
     * Creates new form Register_Form
     */
    public Register_Form() {
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
        jlbllogi = new javax.swing.JLabel();
        jlblclos = new javax.swing.JLabel();
        jlblminimise = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlblfna = new javax.swing.JLabel();
        jlblpwd = new javax.swing.JLabel();
        jTxtfna = new javax.swing.JTextField();
        jPasswordFieldnupass = new javax.swing.JPasswordField();
        jBtnregg = new javax.swing.JButton();
        jBtncancel4 = new javax.swing.JButton();
        jlblnlogi2 = new javax.swing.JLabel();
        jlbllname = new javax.swing.JLabel();
        jTxtlna = new javax.swing.JTextField();
        jlbluna2 = new javax.swing.JLabel();
        jTxtuna1 = new javax.swing.JTextField();
        jlblpwd1 = new javax.swing.JLabel();
        jPasswordFieldrnupass = new javax.swing.JPasswordField();
        jlbladdress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtaddre = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jPanel1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jlbllogi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbllogi.setForeground(new java.awt.Color(255, 255, 255));
        jlbllogi.setText("Register");

        jlblclos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblclos.setForeground(new java.awt.Color(255, 255, 255));
        jlblclos.setText("X");
        jlblclos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblclos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblclosMouseClicked(evt);
            }
        });

        jlblminimise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblminimise.setForeground(new java.awt.Color(255, 255, 255));
        jlblminimise.setText("-");
        jlblminimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblminimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblminimiseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbllogi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jlblminimise)
                .addGap(18, 18, 18)
                .addComponent(jlblclos))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbllogi)
                    .addComponent(jlblminimise)
                    .addComponent(jlblclos)))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jlblfna.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblfna.setForeground(new java.awt.Color(255, 255, 255));
        jlblfna.setText("Forename:");

        jlblpwd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblpwd.setForeground(new java.awt.Color(255, 255, 255));
        jlblpwd.setText("Password:");

        jTxtfna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPasswordFieldnupass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordFieldnupass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldnupassActionPerformed(evt);
            }
        });

        jBtnregg.setBackground(new java.awt.Color(0, 153, 51));
        jBtnregg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnregg.setForeground(new java.awt.Color(255, 255, 255));
        jBtnregg.setText("REGISTER");
        jBtnregg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnregg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnreggActionPerformed(evt);
            }
        });

        jBtncancel4.setBackground(new java.awt.Color(204, 0, 0));
        jBtncancel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtncancel4.setForeground(new java.awt.Color(255, 255, 255));
        jBtncancel4.setText("CANCEL");
        jBtncancel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtncancel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtncancel4ActionPerformed(evt);
            }
        });

        jlblnlogi2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblnlogi2.setForeground(new java.awt.Color(255, 255, 255));
        jlblnlogi2.setText("Click here to login");
        jlblnlogi2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblnlogi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblnlogi2MouseClicked(evt);
            }
        });

        jlbllname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbllname.setForeground(new java.awt.Color(255, 255, 255));
        jlbllname.setText("Surname:");

        jTxtlna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlbluna2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbluna2.setForeground(new java.awt.Color(255, 255, 255));
        jlbluna2.setText("Username:");

        jTxtuna1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlblpwd1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblpwd1.setForeground(new java.awt.Color(255, 255, 255));
        jlblpwd1.setText("Retype:");

        jPasswordFieldrnupass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordFieldrnupass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldrnupassActionPerformed(evt);
            }
        });

        jlbladdress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbladdress.setForeground(new java.awt.Color(255, 255, 255));
        jlbladdress.setText("Address:");

        jTxtaddre.setColumns(20);
        jTxtaddre.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTxtaddre.setRows(5);
        jScrollPane1.setViewportView(jTxtaddre);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblpwd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldnupass, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblpwd1)
                            .addComponent(jlbladdress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBtncancel4)
                                .addGap(30, 30, 30)
                                .addComponent(jBtnregg))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordFieldrnupass)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblfna)
                                    .addComponent(jlbllname))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtlna, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtfna, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbluna2)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtuna1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblnlogi2)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblfna)
                    .addComponent(jTxtfna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbllname)
                    .addComponent(jTxtlna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbluna2)
                    .addComponent(jTxtuna1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblpwd)
                    .addComponent(jPasswordFieldnupass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblpwd1)
                    .addComponent(jPasswordFieldrnupass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbladdress)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtncancel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnregg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblnlogi2)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblclosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblclosMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblclosMouseClicked

    private void jlblminimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblminimiseMouseClicked
        this.setState(JFrame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblminimiseMouseClicked

    private void jPanel1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jPanel1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1CaretPositionChanged

    private void jPasswordFieldnupassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldnupassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldnupassActionPerformed

    private void jlblnlogi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblnlogi2MouseClicked
        Login_Form lgf = new Login_Form();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblnlogi2MouseClicked

    private void jPasswordFieldrnupassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldrnupassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldrnupassActionPerformed

    private void jBtnreggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnreggActionPerformed
        String forename = jTxtfna.getText();
        String suname = jTxtlna.getText();
        String usrname = jTxtuna1.getText();
        String passw = String.valueOf(jPasswordFieldnupass.getPassword());
        String re_passw = String.valueOf(jPasswordFieldrnupass.getPassword());
        String addressing = jTxtaddre.getText();
        
        if(forename.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Forename");
        }
        
        else if(suname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Surname");
        }
         
        else if(usrname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Username");
        }
        else if(passw.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Password"); 
        }
        
        else if(!passw.equals(re_passw))
        {
            JOptionPane.showMessageDialog(null, "Passwords do not match"); 
        }
        
        else if(addressing.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Address");
        }
        
        else if (checkUsername(usrname)){
            JOptionPane.showMessageDialog(null, "Username Already Exists!");
        }
        
        else{
        PreparedStatement as;
        String query = "INSERT INTO `registered_users`( `user_fname`, `user_lname`, `user_address`, `user_uname`, `user_pass`) VALUES (?,?,?,?,?)";
        
        try {
            as = NumyConnection.getConnection().prepareStatement(query);
            
            as.setString(1, forename);
            as.setString(2, suname);
            as.setString(3, addressing);
            as.setString(4, usrname);
            as.setString(5, passw);
            
            
            if(as.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "New User Added");
            }
                  

        } catch (SQLException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jBtnreggActionPerformed
     //Check if user exists
            public boolean checkUsername(String username)
            {
                PreparedStatement as;
                ResultSet sr;
                boolean checkUname = false;
                String query = "SELECT * FROM `registered_users` WHERE `user_uname`=?";
        try {
            as = NumyConnection.getConnection().prepareStatement(query);
            as.setString(1, username); 
            sr = as.executeQuery();
            
            if(sr.next())   
            {
              checkUname = true;  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUname;
                
            }
    private void jBtncancel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtncancel4ActionPerformed
    System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtncancel4ActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtncancel4;
    private javax.swing.JButton jBtnregg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldnupass;
    private javax.swing.JPasswordField jPasswordFieldrnupass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtaddre;
    private javax.swing.JTextField jTxtfna;
    private javax.swing.JTextField jTxtlna;
    private javax.swing.JTextField jTxtuna1;
    private javax.swing.JLabel jlbladdress;
    private javax.swing.JLabel jlblclos;
    private javax.swing.JLabel jlblfna;
    private javax.swing.JLabel jlbllname;
    private javax.swing.JLabel jlbllogi;
    private javax.swing.JLabel jlblminimise;
    private javax.swing.JLabel jlblnlogi2;
    private javax.swing.JLabel jlblpwd;
    private javax.swing.JLabel jlblpwd1;
    private javax.swing.JLabel jlbluna2;
    // End of variables declaration//GEN-END:variables
}
