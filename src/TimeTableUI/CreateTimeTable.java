/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Isuru
 */

public class CreateTimeTable extends javax.swing.JFrame {

    /**
     * Creates new form CreateTimeTable
     */
    public CreateTimeTable() {
        initComponents();
        jComboBoxSaveBy.setBackground(new Color(240, 240, 240, 50));
        setSampleData();
   
        //Setting MultiLineTableCellRenderer for each column
        jTableCTT.getColumnModel().getColumn(0).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(1).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(4).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(5).setCellRenderer(new MultiLineTableCellRenderer());
        
        //Setting MultiLineTableCellEditor for each column
        jTableCTT.getColumnModel().getColumn(0).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(1).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(2).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(3).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(4).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(5).setCellEditor(new MultilineTableCellEditor());
        
        jTableCTT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        jTableCTT.setRowSelectionAllowed(false);
        jTableCTT.setColumnSelectionAllowed(false);
        jTableCTT.setCellSelectionEnabled(true);
        jTableCTT.setRowHeight(90);
        
        //Setting the table to JScrollPane
        jScrollPaneCTT.setViewportView(jTableCTT);
        
        AutoCompleteDecorator.decorate(jComboBoxID);
        populateJComboBoxSearch();
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSave = new javax.swing.JLabel();
        jLabelClear = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCreateTimeTable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxID = new javax.swing.JComboBox<>();
        jScrollPaneCTT = new javax.swing.JScrollPane();
        jTableCTT = new javax.swing.JTable();
        jComboBoxSaveBy = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelViewTimeTable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SaveTimeTable.png"))); // NOI18N
        jLabelSave.setToolTipText("Click to Save Timetable");
        jLabelSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 140, 50));

        jLabelClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ClearTimeTable.png"))); // NOI18N
        jLabelClear.setToolTipText("Click to Clear All Table Contents");
        jLabelClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClearMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 620, 140, 50));

        jPanel2.setBackground(new java.awt.Color(255, 184, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCreateTimeTable.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelCreateTimeTable.setForeground(new java.awt.Color(62, 70, 205));
        jLabelCreateTimeTable.setText("CRAETE TIME TABLE");
        jLabelCreateTimeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelCreateTimeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_to_50px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_50px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1240, 70));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxID.setToolTipText("Select Timetable ID");
        jPanel3.add(jComboBoxID, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 296, 30));

        jTableCTT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableCTT.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCTT.setToolTipText("Double Click on a Cell to Edit");
        jTableCTT.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPaneCTT.setViewportView(jTableCTT);

        jPanel3.add(jScrollPaneCTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 1020, 390));

        jComboBoxSaveBy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSaveBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Save by Lecturer", "Save by Batch", "Save by Lecture Hall" }));
        jComboBoxSaveBy.setToolTipText("Type of Timetable to be Saved As");
        jComboBoxSaveBy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxSaveBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSaveByActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxSaveBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 310, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_schedule_100px.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabelViewTimeTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelViewTimeTable.setForeground(new java.awt.Color(62, 70, 205));
        jLabelViewTimeTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/invisible_50px.png"))); // NOI18N
        jLabelViewTimeTable.setText("VIEW TIME TABLE");
        jLabelViewTimeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelViewTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelViewTimeTableViewTimeTableClicked(evt);
            }
        });
        jPanel3.add(jLabelViewTimeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1240, 540));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel model;
    
    private void setSampleData()
    {           
        model = (DefaultTableModel) jTableCTT.getModel();
        String[] cols = {"Time Slots","Monday","Tuesday","Wednesday", "Thursday", "Friday"};
        String[][] data = { 
                            {"8.30 - 10.30", "Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502"},
                            {"10.30 - 12.30", "Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502"},
                            {"12.30 - 1.30", "Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502"},
                            {"1.30 - 3.30", "Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502"},
                            {"3.30 - 5.30", "Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502","Human Computer Interface\nDr. Antoni Liang\nB502"},
                          };
        
        model.setDataVector(data, cols);
    }
    
    public void clearTable()
    {
        String[] cols = {"Time Slots","Monday","Tuesday","Wednesday", "Thursday", "Friday"};
        String[][] data = { 
                            {"", "", "", "", "", ""},
                            {"", "", "", "", "", ""},
                            {"", "", "", "", "", ""},
                            {"", "", "", "", "", ""},
                            {"", "", "", "", "", ""},
                          };
        
        model = (DefaultTableModel) jTableCTT.getModel();
        model.setDataVector(data, cols);
        
        jTableCTT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        
        //Setting MultiLineTableCellRenderer for each column
        jTableCTT.getColumnModel().getColumn(0).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(1).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(4).setCellRenderer(new MultiLineTableCellRenderer());
        jTableCTT.getColumnModel().getColumn(5).setCellRenderer(new MultiLineTableCellRenderer());
        
        //Setting MultiLineTableCellEditor for each column
        jTableCTT.getColumnModel().getColumn(0).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(1).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(2).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(3).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(4).setCellEditor(new MultilineTableCellEditor());
        jTableCTT.getColumnModel().getColumn(5).setCellEditor(new MultilineTableCellEditor());
                   
        //Setting row height
        jTableCTT.setRowHeight(100);
        //Setting the table to JScrollPane
        jScrollPaneCTT.setViewportView(jTableCTT);
    }

    private void populateJComboBoxSearch() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Hello");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root");
            
            PreparedStatement statement = null;
            ResultSet resultSet = null;
            String query = null;

            String searchBy = jComboBoxSaveBy.getSelectedItem().toString();

            if(searchBy != null){
                switch (searchBy) {
                    case "Save by Lecturer":
                        query = "SELECT lecturerID FROM LECTURER";
                        break;
                    case "Save by Lecture Hall":
                        query = "SELECT HID FROM LECTUREHALL";
                        break;
                    case "Save by Batch":
                        query = "SELECT BATCH_ID FROM BATCH";
                        break;
                    default:
                        break;
                }
            }

            statement = conn.prepareStatement(query);
            resultSet = statement.executeQuery(); 

            String id = null;
                                    
            switch (searchBy) {
                case "Save by Lecturer":
                    jComboBoxID.removeAllItems();
                    jComboBoxID.addItem("");
                    while(resultSet.next()){
                        id = resultSet.getString("lecturerID");
                        jComboBoxID.addItem(id);
                        System.out.println("HII");
                    }
                    break;
                case "Save by Lecture Hall":
                    jComboBoxID.removeAllItems();
                    jComboBoxID.addItem("");
                    while(resultSet.next()){
                        id = resultSet.getString("HID");
                        jComboBoxID.addItem(id);
                    }
                    break;
                case "Save by Batch":
                    jComboBoxID.removeAllItems();
                    jComboBoxID.addItem("");
                    while(resultSet.next()){
                        id = resultSet.getString("BATCH_ID");
                        jComboBoxID.addItem(id);
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
    
    private void jLabelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveMouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Hello");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root");
            
            if(jComboBoxID.getSelectedItem().toString().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a timetable id: Lecturer ID/Batch ID/Hall ID", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                int emptyCells = 0;                
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {                      
                        if(model.getValueAt(i, j).toString() == ""){
                            emptyCells++;
                        }                      
                    }
                }
                
                if(emptyCells != (model.getRowCount() * model.getColumnCount())){
                    PreparedStatement statement = null;
                    String query = null;
                    ResultSet resultSet;
                    String searchID = jComboBoxID.getSelectedItem().toString();
                    query = "SELECT 1 FROM TIMETABLES WHERE LECTURER_ID = '" + searchID + "' OR HALL_ID = '" + searchID + "' OR BATCH_ID = '" + searchID + "'";
                    statement = conn.prepareStatement(query);
                    resultSet = statement.executeQuery(); 

                    if(!resultSet.next()){                     
                        query = "INSERT INTO TIMETABLES(TABLE_LOCATION , LECTURER_ID , HALL_ID , BATCH_ID) values(?,?,?,?)";
                        statement = conn.prepareStatement(query);

                        String lecturerID = null;
                        String hallID = null;
                        String batchID = null;
                        String fileLocation = null;

                        statement.setString(2, null);
                        statement.setString(3, null);
                        statement.setString(4, null);

                        String saveBy = jComboBoxSaveBy.getSelectedItem().toString();
                        if(saveBy != null)
                            switch (saveBy) {
                                case "Save by Lecturer":
                                    lecturerID = jComboBoxID.getSelectedItem().toString();
                                    fileLocation = "C:\\Users\\Isuru\\Desktop\\hci2\\TimeTables\\" + lecturerID;
                                    statement.setString(1, fileLocation);
                                    statement.setString(2, lecturerID );
                                    break;
                                case "Save by Lecture Hall":
                                    hallID = jComboBoxID.getSelectedItem().toString();
                                    fileLocation = "C:\\Users\\Isuru\\Desktop\\hci2\\TimeTables\\" + hallID;
                                    statement.setString(1, fileLocation);
                                    statement.setString(3, hallID );
                                    break;
                                case "Save by Batch":
                                    batchID = jComboBoxID.getSelectedItem().toString();
                                    fileLocation = "C:\\Users\\Isuru\\Desktop\\hci2\\TimeTables\\" + batchID;
                                    statement.setString(1, fileLocation);
                                    statement.setString(4, batchID );
                                    break;
                                default:
                                    break;
                            }


                        exportDataToExcel(fileLocation);    

                        statement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Saved Successfully.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Timetable already exists", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Nothing has been entered to the timetable", "Empty Timetable", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);       
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jLabelSaveMouseClicked

    private void jLabelClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClearMouseClicked
        int confirmation = JOptionPane.showConfirmDialog(null, "Do you wish to continue?", "Clear Time Table", JOptionPane.YES_NO_OPTION);
        if(confirmation == 0)
            clearTable();        
    }//GEN-LAST:event_jLabelClearMouseClicked

    private void jComboBoxSaveByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSaveByActionPerformed
        populateJComboBoxSearch();
    }//GEN-LAST:event_jComboBoxSaveByActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        TimeTableManagement tablemng= new TimeTableManagement();
        tablemng.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Home mainui = new Home();
        mainui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelViewTimeTableViewTimeTableClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelViewTimeTableViewTimeTableClicked
        ViewTimeTable viewTimeTable = new ViewTimeTable();
        viewTimeTable.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelViewTimeTableViewTimeTableClicked
 
    //Method to export time table to an excelsheet
    private void exportDataToExcel(String fileLocation) {        
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;
        model = (DefaultTableModel) jTableCTT.getModel();
        try {
            //Import excel poi libraries to netbeans
            excelJTableExporter = new XSSFWorkbook();
            XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
            //Loop to get jtable columns and rows
            for (int i = 0; i < model.getRowCount(); i++) {
                XSSFRow excelRow = excelSheet.createRow(i);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    XSSFCell excelCell = excelRow.createCell(j);
                    excelCell.setCellValue(model.getValueAt(i, j).toString());
                }
            }   
            File excelFile = new File(fileLocation);
            excelFOU = new FileOutputStream(excelFile + ".xlsx");
            excelBOU = new BufferedOutputStream(excelFOU);
            excelJTableExporter.write(excelBOU);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (excelBOU != null) {
                    excelBOU.close();
                }
                if (excelFOU != null) {
                    excelFOU.close();
                }
                if (excelJTableExporter != null) {
                    excelJTableExporter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateTimeTable createTimeTable = new CreateTimeTable();
                createTimeTable.setSize(800, 400);
                createTimeTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                createTimeTable.show();
                //new CreateTimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxID;
    private javax.swing.JComboBox<String> jComboBoxSaveBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClear;
    private javax.swing.JLabel jLabelCreateTimeTable;
    private javax.swing.JLabel jLabelSave;
    private javax.swing.JLabel jLabelViewTimeTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPaneCTT;
    private javax.swing.JTable jTableCTT;
    // End of variables declaration//GEN-END:variables
}
