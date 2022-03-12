/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtransportes;

/**
 *
 * @author famtz
 */
public class Barco extends Transporte{
    
    public String avanza() {
        return "Barco Avanza";
    }
    
    public String agua(){
        return "El Barco esta en el agua";
    }
    
    public String fecha(){
        return "La fecha de lanzamiento es: ";
    }
    
    public String modelo(){
        return "El modelo es: ";
    }
    
    
}
