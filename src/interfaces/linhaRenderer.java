package interfaces;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class linhaRenderer extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
    
    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        setBackground(Color.YELLOW);
    

        return this;
    }
    
    
    
}
