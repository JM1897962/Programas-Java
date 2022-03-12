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
public class Tren implements SistemaElectrico, SistemaMecanico, SistemasVias{

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
        System.out.println("Avanza Tren");
    }

    @Override
    public void frenos() {
        System.out.println("Frena Tren");
    }

    @Override
    public void humo() {
        System.out.println("Este Tren, suelta Humo");
    }

    @Override
    public void vias() {
        System.out.println("Este Tren, va en vias");
    }
    
}
