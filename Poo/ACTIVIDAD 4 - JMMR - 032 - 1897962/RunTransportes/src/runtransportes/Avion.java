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
public class Avion implements SistemaMecanico, SistemaAereo{

    @Override
    public void avanzar() {
        System.out.println("Avanza Avion");
    }

    @Override
    public void frenos() {
        System.out.println("Frena Avion");
    }

    @Override
    public void volar() {
        System.out.println("Avion Vuela");
    }

    @Override
    public void asciende() {
        System.out.println("Avion Aciende");
    }

    @Override
    public void desciende() {
        System.out.println("Avion Desciende");
    }

    public void planea() {
        System.out.println("Este vehiculo planea por el aire");
    }
}
