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
public class Automovil implements SistemaElectrico, SistemaMecanico{

    public void suelo() {
        System.out.println("Este Vehiculo viaja en el Suelo");
    }

    @Override
    public void subirVentana() {
        System.out.println("Subir Ventana");
    }

    @Override
    public void bajarVentana() {
        System.out.println("Bajar Ventana");
    }

    @Override
    public void avanzar() {
        System.out.println("Avanza Automovil");
    }

    @Override
    public void frenos() {
        System.out.println("Frena Automovil");
    }
    
}
