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
public class Avion extends Aereo implements SistemaMecanico, SistemaAereo{
    
    @Override
    public String frenos() {
        return "Avion Frena";
    }

    @Override
    public void avanzar() {
        System.out.println("Avion Avanza");
    }

    @Override
    public void volar() {
        System.out.println("Avion Vuela");
    }

    @Override
    public String asciende() {
        return "Avion Asciende";
    }

    @Override
    public String desciende() {
        return "Avion Desciende";
    }

    @Override
    public void planea() {
        System.out.println("Este vehiculo planea por el aire");
    }
}
