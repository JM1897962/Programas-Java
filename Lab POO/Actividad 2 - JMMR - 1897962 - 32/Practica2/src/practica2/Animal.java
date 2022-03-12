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
public abstract class Animal {
    
    public abstract String comer();

    public String respirar(){
        return "Animal respirando";
    }
    
    public String dormir(){
        return "Animal durmiendo";
    }
    
    public String beber(){
        return "Animal bebiendo agua";
    }
    
    
}
