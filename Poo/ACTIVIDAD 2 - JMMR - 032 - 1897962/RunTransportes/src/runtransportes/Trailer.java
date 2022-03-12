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
public class Trailer extends Transporte{
    
    public Trailer(){
        
    }
    
    public Trailer(int cajas){
        this.cajuelas(cajas);
    }
    
    public void reversa(){
        System.out.println("Trailer en reversa");
    }
        
    // Sobre escritura de metodos //
    public String avanza() {
        return "Avanza Trailer";
    }
    
    public String suelo(){
        return "Trailer esta en el Suelo";
    }
    
    private void cajuelas(int cajas){
        if(cajas > 0)
        {System.out.println("El numero de cajas es: " +cajas);
            ;
        }
    }
    
        public String fecha(){
        return "La fecha de lanzamiento es: ";
    }
        
        public String modelo(){
        return "El modelo es: ";
    }
    
}
