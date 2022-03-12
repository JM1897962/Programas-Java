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
public class Helicoptero extends Aereo implements SistemaAereo{ 

    @Override
    public void volar() {
        System.out.println("Helicoptero Vuela");
    }

    @Override
    public String asciende() {
        return "Helicoptero Asciende";
    }

    @Override
    public String desciende() {
        return "Helicoptero Desciende";
    }
    
    @Override
    public void planea() {
        System.out.println("Este vehiculo planea por el aire");
    }
}
