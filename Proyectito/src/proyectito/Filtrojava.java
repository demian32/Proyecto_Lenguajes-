/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectito;

import java.io.File;
import javax.swing.filechooser.*;

/**
 *
 * @author Deyanira
 */
public class Filtrojava extends FileFilter {
   private static final String JPG ="jpg";
   private static final char PUNTO = '.';
   
   public boolean accept(File f){
       if(f.isDirectory()){
           return true;
       }
       if(extension(f).equalsIgnoreCase(JPG)){
           return true;
       }else{
           return false;
       }
   }
   
   public String getDescription(){
       return "archivos fuente JPG (.jpg)";
   }
   private String extension(File f){
       String nombre=f.getName();
       int loc=nombre.lastIndexOf(PUNTO);
       if(loc >0 && loc < nombre.length() -1){
           return nombre.substring(loc +1);
       }else{
           return "";
       }
   }
    
}
