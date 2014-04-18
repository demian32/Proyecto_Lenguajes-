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
public class Validar {
    public static void Validarnombrepassword(int password)throws Coincidencia{
        if( password != 123)throw new Coincidencia();
    }
    
}
