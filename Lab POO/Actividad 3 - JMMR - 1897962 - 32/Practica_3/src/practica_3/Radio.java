/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;

/**
 *
 * @author famtz
 */
public class Radio extends DispositivoElectronico implements Funciones{
    
    @Override
    public void encender() {
        System.out.println("Radio Enciende");
    }

    @Override
    public String apagar() {
        return "Radio Apagate";
    }

    @Override
    public String cambioCanal() {
        return "Radio Cambia de Canal";
    }

    @Override
    public void cambioVolumen() {
        System.out.println("Radio Cambia Volumen");
    }

    @Override
    public int variacion(int val) {
        return val;
    }
    
    @Override
    public int canal(int can) {
        return can;
    }

}
