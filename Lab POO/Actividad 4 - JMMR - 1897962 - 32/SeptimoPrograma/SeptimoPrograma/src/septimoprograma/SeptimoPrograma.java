/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package septimoprograma;

import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class SeptimoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String texto, Car1, Car2;
        Scanner inn = new Scanner(System.in);
        
        Buscador b = new Buscador();
        System.out.print("Ingresa una palabra: ");
        texto = inn.nextLine();
        System.out.println("Ingrese el caracter a buscar: ");
        Car1 = inn.nextLine();
        System.out.println("Ingrese el caracter de reemplazo: ");
        Car2 = inn.nextLine();
        b.getCar1();
        b.getCar2();
        b.getTexto();
       
    
        System.out.println(""+ b.Buscarsub(texto, Car1,Car2));
        System.out.println();
        if(b.Buscarsub(texto, Car1, Car2)== true){
            System.out.println();
            System.out.println("Nueva Cadena:   " +texto.replace(Car1,Car2));
        }
       
    }
    
}
