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
public class Helicoptero implements SistemaAereo{ 

    @Override
    public void volar() {
        System.out.println("Helicoptero Vuela");
    }

    @Override
    public void asciende() {
        System.out.println("Helicoptero Aciende");
    }

    @Override
    public void desciende() {
        System.out.println("Helicoptero Desciende");
    }
    
    public void planea() {
        System.out.println("Este vehiculo planea por el aire");
    }
}
