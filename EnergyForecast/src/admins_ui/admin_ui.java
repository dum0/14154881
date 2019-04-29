/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins_ui;



import NusConnection.NuConnection;
import foresreg.forereg;
import guests_ui.guest_ui;
import static java.lang.ProcessBuilder.Redirect.to;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User1
 */
public class admin_ui extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet sr = null;
    
        
    

    /**
     * Creates new form admin_ui
     */
    public admin_ui() {
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

        jPnllogo3 = new javax.swing.JPanel();
        jlbllogo2 = new javax.swing.JLabel();
        jBtnvuab = new javax.swing.JButton();
        jBtnvuap = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jproTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTxtsearch = new javax.swing.JTextField();
        jBtnsearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBtnadnu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextadfor = new javax.swing.JTextField();
        jTxtadsur = new javax.swing.JTextField();
        jtxtadusrn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtaduaddr = new javax.swing.JTextArea();
        jPasswordField1ad = new javax.swing.JPasswordField();
        jBtnadclear = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jubillTable = new javax.swing.JTable();
        jBtnadminlo = new javax.swing.JButton();
        jBtnrmov = new javax.swing.JButton();
        jBtnupdate = new javax.swing.JButton();
        jBtndelbi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnllogo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images pr/Energy Forecast logo.png"))); // NOI18N

        javax.swing.GroupLayout jPnllogo3Layout = new javax.swing.GroupLayout(jPnllogo3);
        jPnllogo3.setLayout(jPnllogo3Layout);
        jPnllogo3Layout.setHorizontalGroup(
            jPnllogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnllogo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbllogo2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPnllogo3Layout.setVerticalGroup(
            jPnllogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnllogo3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbllogo2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jBtnvuab.setBackground(new java.awt.Color(204, 204, 255));
        jBtnvuab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnvuab.setText("View User's Bills (VUB)");
        jBtnvuab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnvuab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnvuabActionPerformed(evt);
            }
        });

        jBtnvuap.setBackground(new java.awt.Color(204, 204, 255));
        jBtnvuap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnvuap.setText("View User's Profiles (VUP)");
        jBtnvuap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnvuap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnvuapActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jproTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_id", "user_fname", "user_lname", "user_address", "user_address", "user_pass"
            }
        ));
        jScrollPane3.setViewportView(jproTable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Search for users' ID:");

        jTxtsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jBtnsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnsearch.setText("Search");
        jBtnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnsearch)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnsearch))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("View User Profiles", jPanel2);

        jBtnadnu.setBackground(new java.awt.Color(204, 255, 0));
        jBtnadnu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnadnu.setText("Add New User");
        jBtnadnu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnadnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnadnuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jBtnadnu, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jBtnadnu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add users", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Forename:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Surname:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Username");

        jTextadfor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTxtadsur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtadusrn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTxtaduaddr.setColumns(20);
        jTxtaduaddr.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTxtaduaddr.setRows(5);
        jScrollPane2.setViewportView(jTxtaduaddr);

        jPasswordField1ad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jBtnadclear.setBackground(new java.awt.Color(255, 51, 51));
        jBtnadclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnadclear.setText("Clear");
        jBtnadclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnadclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnadclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextadfor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1ad))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtadsur, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtadusrn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(3, 3, 3)))))
                .addGap(18, 18, 18)
                .addComponent(jBtnadclear)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextadfor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtadsur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtadusrn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1ad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnadclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Update users", jPanel4);

        jubillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_ID", "Bill_Read_1", "Bill_Read_2", "Bill_Reads_Consumption", "Bills_Cost", "User_ID"
            }
        ));
        jScrollPane1.setViewportView(jubillTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View User Bills", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jBtnadminlo.setBackground(new java.awt.Color(255, 51, 51));
        jBtnadminlo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnadminlo.setText("Logout");
        jBtnadminlo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnadminlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnadminloActionPerformed(evt);
            }
        });

        jBtnrmov.setBackground(new java.awt.Color(255, 0, 51));
        jBtnrmov.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnrmov.setText("Remove User");
        jBtnrmov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnrmov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnrmovActionPerformed(evt);
            }
        });

        jBtnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnupdate.setText("Update User Data");
        jBtnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnupdateActionPerformed(evt);
            }
        });

        jBtndelbi.setBackground(new java.awt.Color(204, 0, 0));
        jBtndelbi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtndelbi.setText("Delete Incorrect Bills");
        jBtndelbi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtndelbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtndelbiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnllogo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnupdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnrmov, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnvuab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnvuap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtndelbi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnadminlo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPnllogo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBtnvuap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnvuab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnrmov, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jBtndelbi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jBtnadminlo)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnadminloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnadminloActionPerformed
    guest_ui ur = new guest_ui();
    ur.setVisible(true);
    ur.pack();
    ur.setLocationRelativeTo(null);
    ur.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnadminloActionPerformed

    private void jBtnvuapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnvuapActionPerformed
        showTable();

  // TODO add your handling code here:
    }//GEN-LAST:event_jBtnvuapActionPerformed

    private void jBtnrmovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnrmovActionPerformed
    
    //Selected row function
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/energy_forecast_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        int row = jproTable.getSelectedRow();
        String value = (jproTable.getModel().getValueAt(row, 0).toString());
        String uquery = "DELETE FROM `registered_users` WHERE user_id="+value;
        PreparedStatement pts = con.prepareStatement(uquery);
        pts.executeUpdate();
        DefaultTableModel model = (DefaultTableModel)jproTable.getModel();  
        model.setRowCount(0);
        showTable();
        JOptionPane.showMessageDialog(null, "User Deleted From System");
    }catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, ex + "...NO USER SELECTED!");
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnrmovActionPerformed

    private void jBtnvuabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnvuabActionPerformed
    showBillsTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnvuabActionPerformed

    private void jBtnadnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnadnuActionPerformed
        forereg rgfu = new forereg();
        rgfu.setVisible(true);
        rgfu.pack();
        rgfu.setLocationRelativeTo(null);
        rgfu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnadnuActionPerformed

    private void jBtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnupdateActionPerformed
    String firsname = jTextadfor.getText();
    String suname = jTxtadsur.getText();
    String address3 = jTxtaduaddr.getText();
    String usrnname = jtxtadusrn.getText();
    String nuupass = String.valueOf(jPasswordField1ad.getPassword());
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/energy_forecast_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        int row = jproTable.getSelectedRow();
        String value = (jproTable.getModel().getValueAt(row, 0).toString());
        String uquery = "UPDATE `registered_users` SET `user_fname`=?,`user_lname`=?,`user_address`=?,`user_uname`=?,`user_pass`=? where user_id="+value;
        PreparedStatement pts = con.prepareStatement(uquery);
        pts.setString(1, firsname);
        pts.setString(2, suname);
        pts.setString(3, address3);
        pts.setString(4, usrnname);
        pts.setString(5, nuupass);
        pts.executeUpdate();
        DefaultTableModel model = (DefaultTableModel)jproTable.getModel();
        model.setRowCount(0);
        showTable();
        JOptionPane.showMessageDialog(null, "Updated successfully!");
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnupdateActionPerformed

    private void jBtnadclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnadclearActionPerformed
    jTextadfor.setText("");
    jTxtadsur.setText("");
    jTxtaduaddr.setText("");
    jtxtadusrn.setText("");
    jPasswordField1ad.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnadclearActionPerformed

    private void jBtndelbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtndelbiActionPerformed
     try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/energy_forecast_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        int row = jubillTable.getSelectedRow();
        String value = (jubillTable.getModel().getValueAt(row, 0).toString());
         String uquery = "DELETE FROM `bills` WHERE b_id="+value;
        PreparedStatement pts = con.prepareStatement(uquery);
        pts.executeUpdate();
        DefaultTableModel model = (DefaultTableModel)jubillTable.getModel();  
        model.setRowCount(0);
        showBillsTable();
        JOptionPane.showMessageDialog(null, "Bill Deleted From System");
    }catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, ex + "...NO BILL SELECTED!");
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtndelbiActionPerformed

    private void jBtnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsearchActionPerformed
    PreparedStatement ps;
    ResultSet sr;
    String uid = jTxtsearch.getText();
    String una = jTxtsearch.getText();
    
    String usquery = "SELECT * FROM `registered_users` WHERE `user_id`=? OR `user_uname`=?";
    try {
            ps = NuConnection.getConnection().prepareStatement(usquery);
            ps.setString(1, uid);
            ps.setString(2, una);
            sr = ps.executeQuery();
             if(sr.next())
                {
               JOptionPane.showMessageDialog(null, "User exists");
            }
             else
            {
                JOptionPane.showMessageDialog(null, "User does not exist in system");
                
            }
            } catch (SQLException ex) {
            Logger.getLogger(admin_ui.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnsearchActionPerformed
 public void showTable(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/energy_forecast_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM `registered_users`";
            pst = con.prepareStatement(sql);
            sr = pst.executeQuery();
            jproTable.setModel(DbUtils.resultSetToTableModel(sr));
            
           
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
            
            
        }}
 
  public void showBillsTable(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/energy_forecast_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM `bills`";
            pst = con.prepareStatement(sql);
            sr = pst.executeQuery();
            jubillTable.setModel(DbUtils.resultSetToTableModel(sr));
            
           
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
            
            
        }}
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
            java.util.logging.Logger.getLogger(admin_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnadclear;
    private javax.swing.JButton jBtnadminlo;
    private javax.swing.JButton jBtnadnu;
    private javax.swing.JButton jBtndelbi;
    private javax.swing.JButton jBtnrmov;
    private javax.swing.JButton jBtnsearch;
    private javax.swing.JButton jBtnupdate;
    private javax.swing.JButton jBtnvuab;
    private javax.swing.JButton jBtnvuap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1ad;
    private javax.swing.JPanel jPnllogo3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextadfor;
    private javax.swing.JTextField jTxtadsur;
    private javax.swing.JTextArea jTxtaduaddr;
    private javax.swing.JTextField jTxtsearch;
    private javax.swing.JLabel jlbllogo2;
    private javax.swing.JTable jproTable;
    private javax.swing.JTextField jtxtadusrn;
    private javax.swing.JTable jubillTable;
    // End of variables declaration//GEN-END:variables
}
