/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sextoprograma;
import java.util.Scanner;
/**
 *
 * @author famtz
 */
public class SextoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom;
        
        Scanner entrada = new Scanner(System.in);
        
        Scanner scnNom = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: ");
        nom = entrada.nextLine();
    
    
        ApellidosyNombres dato = new ApellidosyNombres(nom);
    
    }
}
