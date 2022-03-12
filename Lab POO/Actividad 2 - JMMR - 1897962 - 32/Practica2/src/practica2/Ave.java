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

// Permite conectar a la clase padre extends
public class Ave extends Animal{
    
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }
    
    @Override
    public String comer(){
        return "Ave comiendo";
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    private String raza;
    
    public String volar(){
        return "Ave Volando";
    }
    
    public String aletear(){
        return "Ave Aleteando";
    }
}
