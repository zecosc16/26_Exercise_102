/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_102;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author oskar
 */
public class Datei extends File{
    
    private Color color;
    
    public Datei(String pathname) {
        super(pathname);
        
        if(this.isDirectory())
            color=Color.RED;
        else
            color=Color.blue;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        File dir = new File(".");
        if(this.isDirectory()){
            return this.getName();
        }
        else{
            String Att="";
            if(this.canRead())
                Att+="R";
            if(this.canWrite())
                Att+="W";
            if(this.isHidden())
                Att+="H";
            if(this.canExecute())
                Att+="X";
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM-yyyy hh:mm");
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(this.lastModified()/1000,0,ZoneOffset.UTC);
            return String.format("%-35s  %-25s  %dKB   %8s",this.getName(),dtf.format(ldt),this.length()/1024,Att);
        }
    }
    
    
    
}
