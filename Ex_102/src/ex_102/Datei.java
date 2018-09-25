/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_102;

import java.io.File;

/**
 *
 * @author oskar
 */
public class Datei extends File{
    
    public Datei(String pathname) {
        super(pathname);
    }

    @Override
    public String toString() {
        File dir = new File(".");
        if(dir.isDirectory()){
            return this.getName();
        }
        else{
            return String.format("%s    %s",this.getName(),);
        }
    }
    
    
    
}
