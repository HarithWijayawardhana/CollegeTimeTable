/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Edit_Time_Table extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Time_Table
     * 
     */
    public String fileLocation = null;
    public Edit_Time_Table() {
        initComponents();
        
          jComboBoxSearchBy.setBackground(new Color(240, 240, 240, 50));
        
        //Setting MultiLineTableCellRenderer for each column
        jTableETT.getColumnModel().getColumn(0).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(1).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(4).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(5).setCellRenderer(new MultiLineTableCellRenderer());
        
        //Setting MultiLineTableCellEditor for each column
        jTableETT.getColumnModel().getColumn(0).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(1).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(2).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(3).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(4).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(5).setCellEditor(new MultilineTableCellEditor());
        
        jTableETT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        jTableETT.setRowSelectionAllowed(false);
        jTableETT.setColumnSelectionAllowed(false);
        jTableETT.setCellSelectionEnabled(true);
        jTableETT.setRowHeight(90);
        
        //Setting the table to JScrollPane
        jScrollPaneETT.setViewportView(jTableETT);
        
        AutoCompleteDecorator.decorate(jComboBoxSearch);
        populateJComboBoxSearch();
    
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
        
        model = (DefaultTableModel) jTableETT.getModel();
        model.setDataVector(data, cols);
        
        jTableETT.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        
        //Setting MultiLineTableCellRenderer for each column
        jTableETT.getColumnModel().getColumn(0).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(1).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(4).setCellRenderer(new MultiLineTableCellRenderer());
        jTableETT.getColumnModel().getColumn(5).setCellRenderer(new MultiLineTableCellRenderer());
        
        //Setting MultiLineTableCellEditor for each column
        jTableETT.getColumnModel().getColumn(0).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(1).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(2).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(3).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(4).setCellEditor(new MultilineTableCellEditor());
        jTableETT.getColumnModel().getColumn(5).setCellEditor(new MultilineTableCellEditor());
                   
        //Setting row height
        jTableETT.setRowHeight(100);
        //Setting the table to JScrollPane
        jScrollPaneETT.setViewportView(jTableETT);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxSearchBy = new javax.swing.JComboBox<>();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPaneETT = new javax.swing.JScrollPane();
        jTableETT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 90, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("                           INSERT");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 286, 400, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("                            EDIT");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 390, 100));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("         CLEAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 170, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("       UPDATE");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 170, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("        DELETE");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 170, 60));

        jComboBoxSearchBy.setBackground(new java.awt.Color(0, 102, 255));
        jComboBoxSearchBy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Lecturer", "Search by Batch", "Search by Lecture Hall" }));
        jComboBoxSearchBy.setToolTipText("Type of Timetable to be Searched");
        jComboBoxSearchBy.setAutoscrolls(true);
        jComboBoxSearchBy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchByActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSearchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 190, 20));

        jComboBoxSearch.setToolTipText("Select Timetable ID");
        jPanel1.add(jComboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 190, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, 60, 40));

        jTableETT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableETT.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableETT.setToolTipText("Double Click on a Cell to Edit");
        jTableETT.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPaneETT.setViewportView(jTableETT);

        jPanel1.add(jScrollPaneETT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 720, 380));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time table management update.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 680));

        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
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
                
                String searchBy = jComboBoxSearchBy.getSelectedItem().toString();
                String searchID = jComboBoxSearch.getSelectedItem().toString();   
                
                if(null != searchBy)
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
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        if(jComboBoxSearch.getSelectedItem().toString().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter a timetable id to the search field: Lecturer ID/Batch ID/Hall ID", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            exportDataToExcel(fileLocation);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
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
                int confirmation = JOptionPane.showConfirmDialog(null, "Do you wish to continue?", "Delete Time Table", JOptionPane.YES_NO_OPTION);
                if(confirmation == 0){
                    PreparedStatement statement = null;
                    ResultSet resultSet = null;
                    String query = null;

                    String searchBy = jComboBoxSearchBy.getSelectedItem().toString();
                    String searchID = jComboBoxSearch.getSelectedItem().toString();

                    if(searchBy != null)
                    switch (searchBy) {
                        case "Search by Lecturer":
                            query = "DELETE FROM TIMETABLES WHERE LECTURER_ID = '" + searchID + "'";
                            break;
                        case "Search by Lecture Hall":
                            query = "DELETE FROM TIMETABLES WHERE HALL_ID = '" + searchID + "'";
                            break;
                        case "Search by Batch":
                            query = "DELETE FROM TIMETABLES WHERE BATCH_ID = '" + searchID + "'";
                            break;
                        default:
                            break;
                    }

                    statement = conn.prepareStatement(query);
                    statement.executeUpdate();
                    
                    try  
                    {         
                        File f= new File(fileLocation + ".xlsx"); 
                        if(f.delete())
                        {
                           JOptionPane.showMessageDialog(null, "Successfully Deleted.");
                           populateJComboBoxSearch();
                           clearTable();
                        }  
                        else  
                        {  
                            JOptionPane.showMessageDialog(null, "Failed to Delete", "Error", JOptionPane.ERROR_MESSAGE);  
                        }  
                    }  
                    catch(Exception e)  
                    {  
                        e.printStackTrace();  
                    }                                
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);       
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "Do you wish to continue?", "Clear Time Table", JOptionPane.YES_NO_OPTION);
        if(confirmation == 0)
            clearTable(); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        View_Time_Table view = new View_Time_Table();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        Create_Time_Table create = new Create_Time_Table();
        create.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         Edit_Time_Table update = new Edit_Time_Table();
        update.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        Time_Table_Report report = new Time_Table_Report();
        report.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         AdminHome tablehome = new AdminHome();
        tablehome .setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked
      
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
    
    private void exportDataToExcel(String fileLocation) {
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;
        model = (DefaultTableModel) jTableETT.getModel();
        
        try {
            //Import excel poi libraries to netbeans
            excelJTableExporter = new XSSFWorkbook();
            XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Excel Sheet");

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
            JOptionPane.showMessageDialog(null, "Updated Successfully.");
        } catch (FileNotFoundException FNFException) {
            JOptionPane.showMessageDialog(null, FNFException.getMessage());
        } catch (IOException iOException) {
             JOptionPane.showMessageDialog(null, iOException.getMessage());
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
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            }
        }
    }
    
    private void importDataFromExcel(String fileLocation) {
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelImportToJTable = null; 
        model = (DefaultTableModel) jTableETT.getModel();
        
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
            java.util.logging.Logger.getLogger(Edit_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Time_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Time_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JComboBox<String> jComboBoxSearchBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneETT;
    private javax.swing.JTable jTableETT;
    // End of variables declaration//GEN-END:variables
}
