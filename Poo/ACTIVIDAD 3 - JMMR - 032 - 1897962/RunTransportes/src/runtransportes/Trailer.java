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
public class Trailer extends Terrestre implements SistemaElectrico, SistemaMecanico{

    @Override
    public void suelo() {
        System.out.println("Este Vehiculo viaja en el Suelo");
    }

    @Override
    public String subirVentana() {
        return "Subir Ventana";
    }

    @Override
    public String bajarVentana() {
        return "Bajar Ventana";
    }

    @Override
    public void avanzar() {
        System.out.println("Avanza Trailer");
    }

    @Override
    public String frenos() {
        return "Frena Trailer";
    }
    
}
