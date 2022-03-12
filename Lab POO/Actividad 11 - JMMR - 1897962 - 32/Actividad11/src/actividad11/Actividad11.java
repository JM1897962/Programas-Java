/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import static actividad11.Clases.Romanos;
import static actividad11.Clases.ciclo;
import static actividad11.Clases.ciclo2;
import static actividad11.Clases.ciclo3;
import static actividad11.Clases.random;
import static actividad11.Clases.suma;
import static actividad11.Clases.tran1;
import static actividad11.Clases.tran2;
import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class Actividad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String str = null; 
        int i, in=0, numero, total=0, z=0, cant=0, alea=0;
        
        System.out.println("1.- Funcion convertir int a string y viceversa.");
        System.out.print("Ingresa que deseas hacer, de (1)int a string o (2)viceversa\nPor favor, ingresalo: ");
        i = entrada.nextInt();
        switch(i)
            {
            case 1:
                
                System.out.print("Ingresa el int que deseas convertir: ");
                in = entrada.nextInt();
                tran1(in, str);
                break;
                
            case 2:
                
                System.out.print("Ingresa el string que deseas convertir: ");
                str = entrada.next();
                tran2(str, in);
                
            break;
            }
        
        System.out.println("\n");
        System.out.println("2.- Suma de n numeros elegidos por el usuario.");
        System.out.print("Ingresa cuantos numeros vas a sumar: ");
        numero = entrada.nextInt();
        suma(i, numero, in, total);
        
        System.out.println("\n");
        System.out.println("3.- Generar X numeros random y contar cuantos numeros terminan en dicha X.");
        random(i, cant, total, alea);
        
        i = 0;
        System.out.println("\n");
        System.out.println("4.- Generar numeros del x al y con while.");
        ciclo(i , z);
        
        i=0;
        System.out.println("\n");
        System.out.println("5.- Generar numeros del 1 al 100 con do while.");  
        ciclo2(i);
        
        System.out.println("\n");
        System.out.println("6.- Generar numeros del 1 al 100 con for.");
        ciclo3(i);

        
        System.out.println("\n");
        System.out.println("7.- Convertir numeros enteros a numeros romanos.");
        System.out.print("Ingresa el numero entero que deseas hacer en romano: ");
        numero = entrada.nextInt();
        System.out.println("El numero que ingresaste en romano es " + Romanos(numero));
        
    }

}
    
