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
public abstract class Aereo extends Transporte{
    
    public abstract void planea();
    
    @Override
    public void enciende() {
        System.out.println("Enciende Nave Voladora");
    }
    
    @Override
    public String apagar() {
        return "Apagate Nave voladora";
    }
    
    @Override
    public void modelo() {
        System.out.println("Escribe el modelo: ");
    }
    
    @Override
    public String serie() {
        return "Escribe la serie: ";
    }
}
