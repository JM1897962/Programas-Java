/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimoprograma;
import java.util.Scanner;
/**
 *
 * @author famtz
 */
public class DecimoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabra;
        
        Scanner entrada = new Scanner(System.in);
        
        Scanner scnPalabra = new Scanner(System.in);
        System.out.print("Ingresa un conjunto de caracteres que formen un palindromo (sin espacios): ");
        palabra = entrada.next();
        
        palabra = palabra.toUpperCase();
    
    
        Palindromo dato = new Palindromo(palabra);
    
    
    }
    
}
