/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_102;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author oskar
 */
public class MyListCellRenderer implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel(value.toString());
        label.setOpaque(true);
        
        if(value instanceof Datei){
            Datei datei  = (Datei)value;
            label.setForeground(datei.getColor());
        }
        label.setBackground(isSelected ? Color.LIGHT_GRAY:Color.white );
        return label;
    }
    
}
