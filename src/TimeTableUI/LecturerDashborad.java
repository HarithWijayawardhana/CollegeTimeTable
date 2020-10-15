/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Isuru
 */
public class LecturerDashborad extends javax.swing.JFrame {

    /**
     * Creates new form LecturerDashborad
     */
    public LecturerDashborad() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxSearchBy = new javax.swing.JComboBox<>();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPaneVTT = new javax.swing.JScrollPane();
        jTableVTT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 80, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("                          HOME");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 440, 120));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                            VIEW");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 156, 400, 110));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("             REPORT GENARATION");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 546, 400, 110));

        jComboBoxSearchBy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Lecturer", "Search by Batch", "Search by Lecture Hall" }));
        jComboBoxSearchBy.setToolTipText("Type of Timetable to be Searched");
        jComboBoxSearchBy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchByActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSearchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 200, 20));

        jComboBoxSearch.setToolTipText("Select Timetable ID");
        jPanel1.add(jComboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 200, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 60, 60));

        jTableVTT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableVTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time Slot", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableVTT.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPaneVTT.setViewportView(jTableVTT);

        jPanel1.add(jScrollPaneVTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 730, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lecturer's time table view.jpg"))); // NOI18N
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        AdminHome tablehome = new AdminHome();
        tablehome .setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        View_Time_Table view = new View_Time_Table();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        Time_Table_Report report = new Time_Table_Report();
        report.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jComboBoxSearchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchByActionPerformed
        populateJComboBoxSearch();
    }//GEN-LAST:event_jComboBoxSearchByActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Hello");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root");

            if(jComboBoxSearch.getSelectedItem().toString().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter a timetable id to the search field: Lecturer ID/Batch ID/Hall ID", "Error", JOptionPane.WARNING_MESSAGE);
            }
            else{
                PreparedStatement statement = null;
                ResultSet resultSet = null;
                String query = null;
                String fileLocation = null;

                String searchBy = jComboBoxSearchBy.getSelectedItem().toString();
                String searchID = jComboBoxSearch.getSelectedItem().toString();

                if(searchBy != null){
                    switch (searchBy) {
                        case "Search by Lecturer":
                        query = "SELECT TABLE_LOCATION FROM TIMETABLES WHERE LECTURER_ID = '" + searchID + "'";
                        break;
                        case "Search by Lecture Hall":
                        query = "SELECT TABLE_LOCATION FROM TIMETABLES WHERE HALL_ID = '" + searchID + "'";
                        break;
                        case "Search by Batch":
                        query = "SELECT TABLE_LOCATION FROM TIMETABLES WHERE BATCH_ID = '" + searchID + "'";
                        break;
                        default:
                        break;
                    }
                }

                statement = conn.prepareStatement(query);
                resultSet = statement.executeQuery();

                if(resultSet.next())
                {
                    fileLocation = resultSet.getString("TABLE_LOCATION");
                    importDataFromExcel(fileLocation);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No record found");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jLabel2MouseClicked

      private void populateJComboBoxSearch() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Hello");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root");
            
            PreparedStatement statement = null;
            ResultSet resultSet = null;
            String query = null;

            String searchBy = jComboBoxSearchBy.getSelectedItem().toString();

            if(searchBy != null){
                switch (searchBy) {
                    case "Search by Lecturer":
                        query = "SELECT LECTURER_ID FROM TIMETABLES WHERE LECTURER_ID IS NOT NULL";
                        break;
                    case "Search by Lecture Hall":
                        query = "SELECT HALL_ID FROM TIMETABLES WHERE HALL_ID IS NOT NULL";
                        break;
                    case "Search by Batch":
                        query = "SELECT BATCH_ID FROM TIMETABLES WHERE BATCH_ID IS NOT NULL";
                        break;
                    default:
                        break;
                }
            }

            statement = conn.prepareStatement(query);
            resultSet = statement.executeQuery(); 

            String id = null;
                                    
            switch (searchBy) {
                case "Search by Lecturer":
                    jComboBoxSearch.removeAllItems();
                    jComboBoxSearch.addItem("");
                    while(resultSet.next()){
                        id = resultSet.getString("LECTURER_ID");
                        jComboBoxSearch.addItem(id);
                    }
                    break;
                case "Search by Lecture Hall":
                    jComboBoxSearch.removeAllItems();
                    jComboBoxSearch.addItem("");
                    while(resultSet.next()){
                        id = resultSet.getString("HALL_ID");
                        jComboBoxSearch.addItem(id);
                    }
                    break;
                case "Search by Batch":
                    jComboBoxSearch.removeAllItems();
                    jComboBoxSearch.addItem("");
                    while(resultSet.next()){
                        id = resultSet.getString("BATCH_ID");
                        jComboBoxSearch.addItem(id);
                    }
                    break;
                default:
                    break;
            }                         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);       
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    DefaultTableModel model;
    
    private void importDataFromExcel(String fileLocation) {
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelImportToJTable = null; 
        model = (DefaultTableModel) jTableVTT.getModel();
        
        try {
            excelFile = new File(fileLocation + ".xlsx");
            excelFIS = new FileInputStream(excelFile);
            excelBIS = new BufferedInputStream(excelFIS);
            excelImportToJTable = new XSSFWorkbook(excelBIS);
            XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);

            for (int row = 0; row <= excelSheet.getLastRowNum(); row++) {
                XSSFRow excelRow = excelSheet.getRow(row);
                for (int column = 0; column < excelRow.getLastCellNum(); column++){
                    XSSFCell excelCell = excelRow.getCell(column);
                    model.setValueAt(excelCell.toString(), row, column);
                    System.out.println(row +" " +column);
                    System.out.println(excelCell);                   
                 }
            }
        }
        catch (IOException iOException) {
            JOptionPane.showMessageDialog(null, iOException.getMessage());
        } finally {
            try {
                if (excelFIS != null) {
                    excelFIS.close();
                }
                if (excelBIS != null) {
                    excelBIS.close();
                }
                if (excelImportToJTable != null) {
                    excelImportToJTable.close();
                }
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            }
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
            java.util.logging.Logger.getLogger(LecturerDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               LecturerDashborad viewTimeTable = new LecturerDashborad();
                viewTimeTable.setSize(800, 400);
                viewTimeTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                viewTimeTable.show();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JComboBox<String> jComboBoxSearchBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneVTT;
    private javax.swing.JTable jTableVTT;
    // End of variables declaration//GEN-END:variables
}
