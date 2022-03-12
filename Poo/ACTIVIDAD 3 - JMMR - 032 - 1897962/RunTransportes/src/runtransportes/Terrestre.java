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
public abstract class Terrestre extends Transporte{

    public abstract void suelo();
    
    @Override
    public void enciende() {
        System.out.println("Enciende Vehiculo Terrestre");
    }
    
    @Override
    public String apagar() {
        return "Apagate Vehiculo Terrestre";
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
