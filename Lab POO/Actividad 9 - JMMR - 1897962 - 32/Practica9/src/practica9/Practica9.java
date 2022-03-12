/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;
import Archivo.Registro;
import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Registro r = new Registro() {};
        
        String nom;
        String num;
        String dir;
        String cor;
        
        System.out.print("Ingresa tu nombre: ");
        nom = entrada.nextLine();
        System.out.print("Ingresa tu numero de telefono: ");
        num = entrada.nextLine();
        System.out.print("Ingresa tu correo: ");
        cor = entrada.nextLine();
        System.out.print("Ingresa tu direccion: ");
        dir = entrada.nextLine();
        
        r.crearXML(nom, num, cor, dir);
        
        System.out.println("\n\nLos datos que se guardaron son.\n");
        
        System.out.println("Tu nombre es: " + nom);
        System.out.println("Tu numero de telefono es: " + num);
        System.out.println("Tu correo electronico es: " + cor);
        System.out.println("Tu direccion es: " + dir);
        
    }
    
}
