/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectito;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class GuardarImagen {
    
    public synchronized static ArrayList<Imagen> leer()throws Exception{
   File file=new File("Imagenes.system");    
 
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  ArrayList<Imagen> u=(ArrayList<Imagen>)  ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Imagen u)throws Exception{
        ArrayList imagensita=new ArrayList<Imagen>();
        
       File file=new File("Imagenes.system");    
         if(file.exists()){
           imagensita=  leer();
         }
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
    imagensita.add(u);
     ois.writeObject(imagensita); 
    ois.close();
  System.out.println("Guardado");
    }
    
}
