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
 * @author Isuru
 */
public class LecturerAdd extends javax.swing.JFrame {

    /**
     * Creates new form LecturerAdd
     */
    public LecturerAdd() {
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
        ContactNo = new javax.swing.JTextField();
        L_ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Gender = new javax.swing.JTextField();
        Subject = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        lectureradd = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        View1 = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();
        Edit1 = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContactNo.setBackground(new java.awt.Color(204, 204, 204));
        ContactNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoActionPerformed(evt);
            }
        });
        jPanel1.add(ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 540, 30));

        L_ID.setBackground(new java.awt.Color(204, 204, 204));
        L_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_IDActionPerformed(evt);
            }
        });
        jPanel1.add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 540, 30));

        Name.setBackground(new java.awt.Color(204, 204, 204));
        Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 262, 540, -1));

        Gender.setBackground(new java.awt.Color(204, 204, 204));
        Gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 540, 30));

        Subject.setBackground(new java.awt.Color(204, 204, 204));
        Subject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectActionPerformed(evt);
            }
        });
        jPanel1.add(Subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 540, -1));

        Email.setBackground(new java.awt.Color(204, 204, 204));
        Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 540, 30));

        lectureradd.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lectureradd.setText("          ADD");
        lectureradd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lectureraddMouseClicked(evt);
            }
        });
        jPanel1.add(lectureradd, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 626, 170, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("        CLEAR");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 626, 170, 60));

        View1.setBackground(new java.awt.Color(0, 0, 12));
        View1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        View1.setForeground(new java.awt.Color(255, 255, 255));
        View1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_1.png"))); // NOI18N
        View1.setText("VIEW");
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
        jPanel1.add(View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 410, 120));

        Add1.setBackground(new java.awt.Color(0, 0, 12));
        Add1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Add1.setForeground(new java.awt.Color(255, 255, 255));
        Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        Add1.setText("ADD");
        Add1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Add1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Add1.setIconTextGap(-20);
        Add1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Add1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add1MouseClicked(evt);
            }
        });
        jPanel1.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 410, 120));

        Edit1.setBackground(new java.awt.Color(0, 0, 12));
        Edit1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Edit1.setForeground(new java.awt.Color(255, 255, 255));
        Edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        Edit1.setText("EDIT");
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
        jPanel1.add(Edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 410, 120));

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
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 410, 120));

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

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_to_50px.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lecturer management add.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoActionPerformed

    private void L_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_IDActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void lectureraddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectureraddMouseClicked
        // TODO add your handling code here:
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root");

            String sql = "insert into lecturerinfo values(?, ?, ?, ?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, L_ID.getText());
            pstmt.setString(2, Name.getText());
            pstmt.setString(3, Gender.getText());
            pstmt.setString(4, Subject.getText());
            pstmt.setString(5, Email.getText());
            pstmt.setString(6, ContactNo.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertion Successfully");
            conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lectureraddMouseClicked

    private void View1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View1MouseClicked
        // TODO add your handling code here:

        LecturerView v = new LecturerView();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_View1MouseClicked

    private void Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add1MouseClicked
        // TODO add your handling code here:

        LecturerAdd v = new LecturerAdd();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Add1MouseClicked

    private void Edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit1MouseClicked
        // TODO add your handling code here:

        LecturerEdit v = new LecturerEdit();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Edit1MouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        // TODO add your handling code here:

        visitingLecturerReportgen v = new visitingLecturerReportgen();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PrintMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:

        Home h = new Home();

        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:

        LecturerView h = new LecturerView();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:

        jButton5.setBackground(new Color(255,63,0));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JTextField ContactNo;
    private javax.swing.JButton Edit1;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Gender;
    private javax.swing.JButton Home;
    private javax.swing.JTextField L_ID;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Print;
    private javax.swing.JTextField Subject;
    private javax.swing.JButton View1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lectureradd;
    // End of variables declaration//GEN-END:variables
}
