/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;


import java.awt.Color;

/**
 *
 * @author Isuru
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel5 = new javax.swing.JPanel();
        vlec = new javax.swing.JButton();
        lec = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vlec.setBackground(new java.awt.Color(0, 0, 12));
        vlec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visiting lec.png"))); // NOI18N
        vlec.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        vlec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vlecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vlecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vlecMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vlecMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vlecMouseReleased(evt);
            }
        });
        jPanel5.add(vlec, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 350, 430));

        lec.setBackground(new java.awt.Color(0, 0, 12));
        lec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lecturer.png"))); // NOI18N
        lec.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        lec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lecMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lecMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lecMouseReleased(evt);
            }
        });
        jPanel5.add(lec, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 350, 430));

        admin.setBackground(new java.awt.Color(0, 0, 12));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        admin.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adminMouseReleased(evt);
            }
        });
        jPanel5.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 350, 430));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/landingpage.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vlecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlecMousePressed
       
        // TODO add your handling code here:
        vlec.setBackground(new Color(255,63,0));
    }//GEN-LAST:event_vlecMousePressed

    private void vlecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlecMouseReleased
        // TODO add your handling code here:
        vlec.setBackground(new Color(0,0,12));
    }//GEN-LAST:event_vlecMouseReleased

    private void lecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecMousePressed
        // TODO add your handling code here:
        lec.setBackground(new Color(255,63,0));
    }//GEN-LAST:event_lecMousePressed

    private void lecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecMouseReleased
        // TODO add your handling code here:
        lec.setBackground(new Color(0,0,12));
    }//GEN-LAST:event_lecMouseReleased

    private void adminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMousePressed
        // TODO add your handling code here:
        admin.setBackground(new Color(255,63,0));
    }//GEN-LAST:event_adminMousePressed

    private void adminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseReleased
        // TODO add your handling code here:
        admin.setBackground(new Color(0,0,12));
    }//GEN-LAST:event_adminMouseReleased

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        // TODO add your handling code here:
        admin.setBackground(new Color(255,63,0));
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        // TODO add your handling code here:
        admin.setBackground(new Color(0,0,12));
    }//GEN-LAST:event_adminMouseExited

    private void lecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecMouseEntered
        // TODO add your handling code here:
        lec.setBackground(new Color(255,63,0));
    }//GEN-LAST:event_lecMouseEntered

    private void lecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecMouseExited
        // TODO add your handling code here:
         lec.setBackground(new Color(0,0,12));
        
    }//GEN-LAST:event_lecMouseExited

    private void vlecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlecMouseEntered
        // TODO add your handling code here:
         vlec.setBackground(new Color(255,63,0));
        
    }//GEN-LAST:event_vlecMouseEntered

    private void vlecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlecMouseExited
        // TODO add your handling code here:
        vlec.setBackground(new Color(0,0,12));
        
    }//GEN-LAST:event_vlecMouseExited

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        
        AdminHome a = new AdminHome();
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_adminMouseClicked

    private void lecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecMouseClicked
        // TODO add your handling code here:
        
        LecturerDashborad l = new LecturerDashborad();
        
        l.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_lecMouseClicked

    private void vlecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlecMouseClicked
        // TODO add your handling code here:
        
        VisitingLecturerDashborad v = new VisitingLecturerDashborad();
        
        v.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_vlecMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton lec;
    private javax.swing.JButton vlec;
    // End of variables declaration//GEN-END:variables
}
