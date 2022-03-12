/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author famtz
 */
public class Perro extends Animal{

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    private String raza;
    
    public String ladrar(){
        return "Perro Ladrando";
    }
    
    public String caminar(){
        return "Perro Caminando";
    }
    
}
