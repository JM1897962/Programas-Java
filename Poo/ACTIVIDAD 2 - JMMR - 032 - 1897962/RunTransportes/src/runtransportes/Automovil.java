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
public class Automovil extends Transporte{
    
    public void reversa(){
        System.out.println("Transporte en reversa");
    }
        
    // Sobre escritura de metodos //
    public String avanza() {
        return "Avanza automovil";
    }
    
    public String suelo(){
        return "Auto esta en el Suelo";
    }
    
        public String fecha(){
        return "La fecha de lanzamiento es: ";
    }
        
        
    public String modelo(){
        return "El modelo es: ";
    }
}
