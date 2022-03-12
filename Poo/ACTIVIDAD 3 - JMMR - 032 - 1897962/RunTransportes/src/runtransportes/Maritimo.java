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
public abstract class Maritimo extends Transporte{
    
    public abstract void flota();
    
    @Override
    public void enciende() {
        System.out.println("Enciende Vehiculo Flotante");
    }
    
    @Override
    public String apagar() {
        return "Apagate Vehiculo Flotante";
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
