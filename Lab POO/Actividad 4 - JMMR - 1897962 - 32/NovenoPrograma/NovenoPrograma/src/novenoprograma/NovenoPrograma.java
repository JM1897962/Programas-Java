/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenoprograma;

import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class NovenoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String texto, Subcad;
        Scanner inn = new Scanner(System.in);
        
         Buscador b = new Buscador();
        System.out.print("Ingresa el texto principal: ");
        texto = inn.nextLine();
        System.out.println("Ingrese la palabra a buscar: ");
        Subcad = inn.nextLine();
        b.getTexto();
        b.getSubcad();
        
        System.out.println(""+ b.Buscarsub(texto, Subcad));
    
    }
    
}
