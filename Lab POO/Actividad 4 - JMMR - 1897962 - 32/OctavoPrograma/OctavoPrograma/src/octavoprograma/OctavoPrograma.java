/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavoprograma;

import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class OctavoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String palabra;
        Scanner inn = new Scanner(System.in);
        
         MAYmin p = new MAYmin();
        System.out.print("Ingresa una palabra (sin espacios): ");
        palabra = inn.nextLine();
        
        p.getPalabra();
       
        System.out.println("" + palabra.toUpperCase());
        System.out.println("" + palabra.toLowerCase());
    
    
    
    }
    
}
