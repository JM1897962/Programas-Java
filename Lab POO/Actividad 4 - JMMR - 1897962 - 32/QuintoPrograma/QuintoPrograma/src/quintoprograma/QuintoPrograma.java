/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quintoprograma;
import java.util.Scanner;
/**
 *
 * @author famtz
 */
public class QuintoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        
        Scanner entrada = new Scanner(System.in);
        
        Scanner scnFrase = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        frase = entrada.nextLine();
    
    
        ConteoPalabras dato = new ConteoPalabras(frase);
    
    }
    
}
