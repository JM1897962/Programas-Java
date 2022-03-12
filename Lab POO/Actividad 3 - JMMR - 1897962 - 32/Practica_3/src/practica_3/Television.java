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
public class Television extends DispositivoElectronico implements Funciones{

    @Override
    public void encender() {
        System.out.println("Television Enciende");
    }

    @Override
    public String apagar() {
        return "Television Apagate";
    }

    @Override
    public String cambioCanal() {
        return "Television Cambia de Canal";
    }

    @Override
    public void cambioVolumen() {
        System.out.println("Television Cambia Volumen");
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
