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
public class Helicoptero extends Transporte{
    
    public Helicoptero(){
        
    }
    
    public Helicoptero(int gas){
        this.arrancar(gas);
        
    }
    
    //Esto tambien es una sobre escritura
    public Helicoptero(int gas, int numPasajeros){
        this.arrancar(gas, numPasajeros);
    }
    
    public String vuela(){
        return "Transporte volando";
    }
    
    public String avanza(){
        return "Helicoptero avanza";
    }
    
    //Mismo metodo, mismo tipo pero diferente firma
    private void arrancar(int gas){
        if(gas > 1)
        {
            System.out.println("Arranca Helicoptero");
        }
    }
    
    private void arrancar(int gas, int numPasajeros){
    if(gas > 1)
        {
            System.out.println("El numero de pasajeros es: " +numPasajeros);
            System.out.println("Arranca Helicoptero");
        }
    }
    
        public String fecha(){
        return "La fecha de lanzamiento es: ";
    }
        
            public String modelo(){
        return "El modelo es: ";
    }
    
}
