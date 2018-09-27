/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_102;

import java.util.Comparator;

/**
 *
 * @author oskar
 */
public class FileComparer implements Comparator<Datei>{

    @Override
    public int compare(Datei o1, Datei o2) {
         if(o1.isDirectory()&&o2.isDirectory()){
           return o1.getName().compareToIgnoreCase(o2.getName());
        }
         else if(o1.isFile()&&o2.isFile()){
             return o1.getName().compareToIgnoreCase(o2.getName());
         }
             
         else if(o1.isDirectory())
             return -1;
         return 1;
    
    }
}
