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
public class Tren extends Transporte{

    public Tren(){
        
    }
    
    public Tren(int humo){
        this.soltar(humo);
    }
    
    public void reversa() {
        System.out.println("Reversa de tren");
    }
    
    public void via(){
        System.out.println("Tren va en vias");
    }
    
    public String avanza() {
        return "Tren avanza";
    }
    
    private void soltar (int humo){
        if(humo == 0)
        {
            System.out.println("Tren suelta humo");
        }
        
        else if(humo == 1)
        {
            System.out.println("Tren no suelta humo");
        }
    }
    
        public String fecha(){
        return "La fecha de lanzamiento es: ";
    }
        
        public String modelo(){
        return "El modelo es: ";
    }
    
}
