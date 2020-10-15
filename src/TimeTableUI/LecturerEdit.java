/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Harith
 */
public class LecturerEdit extends javax.swing.JFrame {

    /**
     * Creates new form lecturerEdit
     */
    public LecturerEdit() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        emaitxt = new javax.swing.JTextField();
        viewLabel = new javax.swing.JLabel();
        updateLable = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 140, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                      HOME");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 16, 380, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                  VIEW LECTURER");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 176, 370, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("                    ADD LECTURER");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 306, 380, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 110, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("                    EDIT LECTURER");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 436, 380, 100));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 90, 80));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("               REPORT GENERATION");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 566, 390, 110));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 300, 30));

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 290, 30));
        jPanel1.add(gendertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 300, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 290, 30));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 572, 300, 30));
        jPanel1.add(emaitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 572, 290, 30));

        viewLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewLabel.setText("           VIEW");
        viewLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLabelMouseClicked(evt);
            }
        });
        jPanel1.add(viewLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 626, 170, 50));

        updateLable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateLable.setForeground(new java.awt.Color(255, 255, 255));
        updateLable.setText("          UPDATE");
        updateLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLableMouseClicked(evt);
            }
        });
        jPanel1.add(updateLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 626, 170, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("           DELETE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 180, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LECTURER ID", "NAME", "GENDER", "CONTACT NUMBER", "EMAIL", "SUBJECT"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 750, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lecturer management edit.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void viewLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLabelMouseClicked
        // TODO add your handling code here:

        try {
            DBconnect db = new DBconnect();
            Connection conn = db.getConnection();

            String sql2 = "select * from lecturerinfo";

            PreparedStatement pst = conn.prepareStatement(sql2);

//            pst.setString(1, jTextField1.getText());
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                String id = rs.getString("L_ID");
                
                String name = rs.getString("Name");

                String gender = rs.getString("Gender");

                String contactNo = rs.getString("ContactNo");

                String email = rs.getString("Email");

                String subjectVenue = rs.getString("Subject");

                String tbData[] = {id, name, gender, contactNo, email, subjectVenue};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

                if (tblModel.getRowCount() == tbData.length) {

                    System.out.println("error");
                    String message = "\"All information are viewed\"\n";

                    JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                            JOptionPane.ERROR_MESSAGE);

                    return;

                } else {
                    tblModel.addRow(tbData);

                }

            }

            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_viewLabelMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField1.setText(model.getValueAt(i, 0).toString());
        nametxt.setText(model.getValueAt(i, 1).toString());
        gendertxt.setText(model.getValueAt(i, 2).toString());
        jTextField5.setText(model.getValueAt(i, 3).toString());
        emaitxt.setText(model.getValueAt(i, 4).toString());
        jTextField4.setText(model.getValueAt(i, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void updateLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLableMouseClicked
        // TODO add your handling code here:
        
                try {

            System.out.println("Hello");

            DBconnect db = new DBconnect();
            Connection conn = db.getConnection();
            //username is root password is mysql1234

            String lecId = jTextField1.getText();
            String name = nametxt.getText();
            String gender = gendertxt.getText();
            String contact = jTextField5.getText();
            String email = emaitxt.getText();
            String subject = jTextField4.getText();
            

//            Statement stmt;
            String sql = "UPDATE lecturerinfo SET L_ID='" + lecId + "' ,Name='" + name + "' ,Gender='" + gender + "' ,ContactNo='" + contact + "' ,Email='" + email + "',Subject='" + subject + "' where L_ID='" + lecId + "' ";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.execute();

            TableModel model = jTable1.getModel();

            model.setValueAt(lecId, jTable1.getSelectedRow(), 0);
            model.setValueAt(name, jTable1.getSelectedRow(), 1);
            model.setValueAt(gender, jTable1.getSelectedRow(), 2);
            model.setValueAt(contact, jTable1.getSelectedRow(), 3);
            model.setValueAt(email, jTable1.getSelectedRow(), 4);
            model.setValueAt(subject, jTable1.getSelectedRow(), 5);

            System.out.println("Updated successfully");
            JOptionPane.showMessageDialog(null, "Updated successfully");

            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_updateLableMouseClicked

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
            java.util.logging.Logger.getLogger(LecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emaitxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel updateLable;
    private javax.swing.JLabel viewLabel;
    // End of variables declaration//GEN-END:variables
}
