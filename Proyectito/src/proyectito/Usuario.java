/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectito;

/**
 *
 * @author Deyanira
 */
public class Usuario {
    private String nombre;
    private int password;

    public Usuario(String nombre, int password)throws Coincidencia {
        Validar.Validarnombrepassword(password);
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
       
        this.password = password;
    }
    
    
}
