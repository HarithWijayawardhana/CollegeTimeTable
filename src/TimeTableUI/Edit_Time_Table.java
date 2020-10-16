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
    
         setIconImage();
        
    }
    
       private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("timetable_60px.png")));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxSearchBy = new javax.swing.JComboBox<>();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPaneETT = new javax.swing.JScrollPane();
        jTableETT = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("         CLEAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
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
        jPanel1.add(jComboBoxSearchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 134, 190, 30));

        jComboBoxSearch.setToolTipText("Select Timetable ID");
        jPanel1.add(jComboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 134, 190, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 140, 70, 30));

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

        jPanel1.add(jScrollPaneETT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 196, 700, 370));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drop down bar.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 130, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drop down bar.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 130, -1, -1));

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
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 120));

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
        View1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View1ActionPerformed(evt);
            }
        });
        jPanel1.add(View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 410, 120));

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
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });
        jPanel1.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 410, 120));

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
        jPanel1.add(Edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 410, 120));

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
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 410, 120));

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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table frame.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 720, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time table management update.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
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

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jLabel2MouseExited

    private void View1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View1ActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add1ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:

        Create_Time_Table c = new Create_Time_Table();
         c.setVisible(true);
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Time_Table().setVisible(true);
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneETT;
    private javax.swing.JTable jTableETT;
    // End of variables declaration//GEN-END:variables
}
