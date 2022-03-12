/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;
import java.util.Scanner;
/**
 *
 * @author famtz
 */
public class PrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String palabra;
        
        Scanner entrada = new Scanner(System.in);
        
        Scanner scnPalabra = new Scanner(System.in);
        System.out.print("Ingresa un conjunto de caracteres: ");
        palabra = entrada.next();
    
    
        FuncionString dato = new FuncionString(palabra);
    }
    
}
