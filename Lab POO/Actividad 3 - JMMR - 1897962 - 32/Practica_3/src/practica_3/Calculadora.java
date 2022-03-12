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
public class Calculadora extends DispositivoElectronico implements OperacionesAritmeticas{

    @Override
    public void encender() {
        System.out.println("Calculadora Enciende");
    }

    @Override
    public String apagar() {
        return "Calculadora Apagate";
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }
    
    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }
    
    @Override
    public int division(int a, int b) {
        return a/b;
    }
    
}
