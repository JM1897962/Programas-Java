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

// Transporte es clase padre
public abstract class Transporte {
    
    public abstract String avanza(); //Abstract: Da mas libertad para hacer algo //
    
    public void encender(){
        System.out.println("Transporte enciente");
    }
    
    public abstract String fecha();
    
    public abstract String modelo();
    
}
