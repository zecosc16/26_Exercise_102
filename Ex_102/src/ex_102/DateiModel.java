/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_102;

import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author oskar
 */
public class DateiModel extends AbstractListModel{

    private ArrayList<Datei> files = new ArrayList<>();
    private ArrayList<Datei> filtered = new ArrayList<>();
    
    public void add(Datei d){
        files.add(d);
        filtered.add(d);
        fireContentsChanged(this, 0, filtered.size()-1);
    }

    @Override
    public int getSize() {
        return filtered.size();
    }

    @Override
    public Object getElementAt(int index) {
        return filtered.get(index);
    }
    
    
    
}
