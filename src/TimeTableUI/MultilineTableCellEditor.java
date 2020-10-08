/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class MultilineTableCellEditor extends DefaultCellEditor {
   protected JScrollPane scrollPane;
   protected JTextArea textArea;
   
   public MultilineTableCellEditor() {
      super(new JCheckBox());
      setClickCountToStart( 2 );
      scrollPane = new JScrollPane();
      textArea = new JTextArea();
      textArea.setLineWrap(true);
      textArea.setWrapStyleWord(true);
      scrollPane.getViewport().add(textArea);
   }
   public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
      textArea.setText((String) value);
      return scrollPane;
   }
   public Object getCellEditorValue() {
      return textArea.getText();
   } 
}
