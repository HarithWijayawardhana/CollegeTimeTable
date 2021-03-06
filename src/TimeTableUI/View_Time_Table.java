/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Isuru
 */
public class View_Time_Table extends javax.swing.JFrame {

    /**
     * Creates new form View_Time_Table
     */
    public View_Time_Table() {
        initComponents();
        
          jComboBoxSearchBy.setBackground(new Color(240, 240, 240, 50));
           setSampleData();
        
        //Setting MultiLineTableCellRenderer for each column
        jTableVTT.getColumnModel().getColumn(0).setCellRenderer(new MultiLineTableCellRenderer());
        jTableVTT.getColumnModel().getColumn(1).setCellRenderer(new MultiLineTableCellRenderer());
        jTableVTT.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
        jTableVTT.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        jTableVTT.getColumnModel().getColumn(4).setCellRenderer(new MultiLineTableCellRenderer());
        jTableVTT.getColumnModel().getColumn(5).setCellRenderer(new MultiLineTableCellRenderer());
        
        //Setting MultiLineTableCellEditorForVTT for each column
        jTableVTT.getColumnModel().getColumn(0).setCellEditor(new MultilineTableCellEditor());
        jTableVTT.getColumnModel().getColumn(1).setCellEditor(new MultilineTableCellEditor());
        jTableVTT.getColumnModel().getColumn(2).setCellEditor(new MultilineTableCellEditor());
        jTableVTT.getColumnModel().getColumn(3).setCellEditor(new MultilineTableCellEditor());
        jTableVTT.getColumnModel().getColumn(4).setCellEditor(new MultilineTableCellEditor());
        jTableVTT.getColumnModel().getColumn(5).setCellEditor(new MultilineTableCellEditor());
        
        jTableVTT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        jTableVTT.setRowSelectionAllowed(false);
        jTableVTT.setColumnSelectionAllowed(false);
        jTableVTT.setCellSelectionEnabled(true);
        jTableVTT.setRowHeight(90);
        
        //Setting the table to JScrollPane
        jScrollPaneVTT.setViewportView(jTableVTT);   
        
        AutoCompleteDecorator.decorate(jComboBoxSearch);
        populateJComboBoxSearch();
          setIconImage();
        
    }
    
       private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("timetable_60px.png")));
    }
    
     private void setSampleData()
    {           
      
        
        model = (DefaultTableModel) jTableVTT.getModel();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxSearchBy = new javax.swing.JComboBox<>();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPaneVTT = new javax.swing.JScrollPane();
        jTableVTT = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        View1 = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();
        Edit1 = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxSearchBy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Lecturer", "Search by Batch", "Search by Lecture Hall" }));
        jComboBoxSearchBy.setToolTipText("Type of Timetable to be Searched");
        jComboBoxSearchBy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchByActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSearchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 143, 200, 30));

        jComboBoxSearch.setToolTipText("Select Timetable ID");
        jPanel1.add(jComboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 143, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, 60, 60));

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

        jPanel1.add(jScrollPaneVTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 700, 370));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drop down bar.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 140, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drop down bar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 140, -1, -1));

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

        View1.setBackground(new java.awt.Color(0, 0, 12));
        View1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        View1.setForeground(new java.awt.Color(255, 255, 255));
        View1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_1.png"))); // NOI18N
        View1.setText("VIEW TIME TABLE");
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
        Add1.setText("ADD TIME TABLE");
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
        Edit1.setText("EDIT TIME TABLE");
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
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 410, 120));

        jButton5.setBackground(new java.awt.Color(0, 0, 12));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table frame.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 720, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time table management view table.jpg"))); // NOI18N
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

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:

      Time_Table_Info v = new Time_Table_Info();
         v.setVisible(true);
         this.setVisible(false);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:

        jButton5.setBackground(new Color(255,63,0));

    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setBackground(new Color(0,0,12));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
         Home h = new Home();
         h.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void View1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View1MouseClicked
        // TODO add your handling code here:
        View_Time_Table v = new View_Time_Table();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_View1MouseClicked

    private void Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add1MouseClicked
        // TODO add your handling code here:
        Create_Time_Table c = new Create_Time_Table();
         c.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_Add1MouseClicked

    private void Edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit1MouseClicked
        // TODO add your handling code here:
         Edit_Time_Table e = new Edit_Time_Table();
         e.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_Edit1MouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        // TODO add your handling code here:
         Time_Table_Report r = new Time_Table_Report();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PrintMouseClicked

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
            java.util.logging.Logger.getLogger(View_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                View_Time_Table viewTimeTable = new View_Time_Table();
                viewTimeTable.setSize(800, 400);
                viewTimeTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                viewTimeTable.show();
                //new ViewTimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JButton Edit1;
    private javax.swing.JButton Home;
    private javax.swing.JButton Print;
    private javax.swing.JButton View1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JComboBox<String> jComboBoxSearchBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneVTT;
    private javax.swing.JTable jTableVTT;
    // End of variables declaration//GEN-END:variables
}
