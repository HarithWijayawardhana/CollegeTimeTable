/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rota
 */
public class lecturerhallmanagementadd extends javax.swing.JFrame {

    /**
     * Creates new form lecturerhallmanagementadd
     */
    public lecturerhallmanagementadd() {
        initComponents();
           setIconImage();
        
    }
    
       private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("timetable_60px.png")));
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hallId1 = new javax.swing.JTextField();
        hallName1 = new javax.swing.JTextField();
        capacity1 = new javax.swing.JTextField();
        building1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        View1 = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();
        Edit1 = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1151, 609));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("          CLEAR");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 180, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("           SAVE");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 180, 60));

        hallId1.setBackground(new java.awt.Color(204, 204, 204));
        hallId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallId1ActionPerformed(evt);
            }
        });
        jPanel1.add(hallId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 206, 549, 44));

        hallName1.setBackground(new java.awt.Color(204, 204, 204));
        hallName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallName1ActionPerformed(evt);
            }
        });
        jPanel1.add(hallName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 309, 549, 44));

        capacity1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(capacity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 414, 549, 44));

        building1.setBackground(new java.awt.Color(204, 204, 204));
        building1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A400", "A410", "A510", "B500" }));
        jPanel1.add(building1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 517, 549, 42));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_to_50px.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 60, 60));

        View1.setBackground(new java.awt.Color(0, 0, 12));
        View1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        View1.setForeground(new java.awt.Color(255, 255, 255));
        View1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_1.png"))); // NOI18N
        View1.setText("LECTURE HALL VIEW");
        View1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        View1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        View1.setIconTextGap(-20);
        View1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        View1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        View1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View1MouseClicked(evt);
            }
        });
        jPanel1.add(View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 163, 410, 120));

        Add1.setBackground(new java.awt.Color(0, 0, 12));
        Add1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Add1.setForeground(new java.awt.Color(255, 255, 255));
        Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        Add1.setText("LECTURE HALL ADD");
        Add1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Add1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Add1.setIconTextGap(-20);
        Add1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Add1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 293, 410, 120));

        Edit1.setBackground(new java.awt.Color(0, 0, 12));
        Edit1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Edit1.setForeground(new java.awt.Color(255, 255, 255));
        Edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        Edit1.setText("LECTURE HALL EDIT");
        Edit1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Edit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Edit1.setIconTextGap(-20);
        Edit1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Edit1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit1MouseClicked(evt);
            }
        });
        jPanel1.add(Edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 423, 410, 120));

        Print.setBackground(new java.awt.Color(0, 0, 12));
        Print.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        Print.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Print.setIconTextGap(-20);
        Print.setLabel(" REPORT GENARATION");
        Print.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Print.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 553, 410, 120));

        Home.setBackground(new java.awt.Color(215, 82, 16));
        Home.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        Home.setText("HOME");
        Home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home.setIconTextGap(-20);
        Home.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 17, 430, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lecturer hall management ADD.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

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

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
          try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/collegetimetable?" + "user=root&password=Kushan@321");

            String sql = "insert into lecturerhallmanagement values(?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(hallId1.getText()));
            pstmt.setString(2, hallName1.getText());

            String bld;
            bld = building1.getSelectedItem().toString();
            pstmt.setString(3, bld);

            pstmt.setInt(4, Integer.parseInt(capacity1.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertion Successfully");
            conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        hallId1.setText("");
        hallName1.setText("");
        building1.setSelectedIndex(0);
        capacity1.setText("");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void hallId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallId1ActionPerformed

    private void hallName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallName1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(255,63,0));

    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:

        jButton1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void View1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View1MouseClicked
        // TODO add your handling code here:
        lecturerhallmanagementview addtoview = new lecturerhallmanagementview();
        addtoview.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_View1MouseClicked

    private void Edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit1MouseClicked
        // TODO add your handling code here:

        lecturermanagementupdate addtoupdate = new lecturermanagementupdate();
        addtoupdate.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Edit1MouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        // TODO add your handling code here:
        lecturermanagementreportgen addtorg = new lecturermanagementreportgen();
        addtorg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PrintMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
         Home hm = new Home();
        hm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

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
            java.util.logging.Logger.getLogger(lecturerhallmanagementadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturerhallmanagementadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturerhallmanagementadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturerhallmanagementadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturerhallmanagementadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JButton Edit1;
    private javax.swing.JButton Home;
    private javax.swing.JButton Print;
    private javax.swing.JButton View1;
    private javax.swing.JComboBox<String> building1;
    private javax.swing.JTextField capacity1;
    private javax.swing.JTextField hallId1;
    private javax.swing.JTextField hallName1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
