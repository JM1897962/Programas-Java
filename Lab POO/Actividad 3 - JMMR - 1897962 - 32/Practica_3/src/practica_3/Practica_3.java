/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;
import java.util.Scanner;
/**
 *
 * @author famtz
 */
public class Practica_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num1, num2, vol, ca;        
        String marca , color, modelo;
        
        //Scanf
        Television tvsony = new Television();
        Radio rd = new Radio();
        Calculadora casio = new Calculadora();
        
        
        System.out.print("La Television es de la Compañia: ");
        marca= entrada.next();
        System.out.print("La Television es Color: ");
        color = entrada.next();
        System.out.print("El modelo de la Television es: ");
        modelo = entrada.next();
        tvsony.encender();
        System.out.println(tvsony.cambioCanal());
        System.out.print("Ingresa el cambio del canal: ");
        ca = entrada.nextInt();
        tvsony.cambioVolumen();
        System.out.print("Ingresa el cambio del volumen: ");
        vol = entrada.nextInt();
        System.out.println(tvsony.apagar());
        System.out.println("\n");
        
        
        System.out.print("La Radio de la Compañia: ");
        marca= entrada.next();
        System.out.print("La Radio es Color: ");
        color = entrada.next();
        System.out.print("El modelo de la Radio es: ");
        modelo = entrada.next();
        rd.encender();
        System.out.println(rd.cambioCanal());
        System.out.print("Ingresa el cambio del canal: ");
        ca = entrada.nextInt();
        rd.cambioVolumen();
        System.out.print("Ingresa el cambio del volumen: ");
        vol = entrada.nextInt();
        System.out.println(rd.apagar());
        System.out.println("\n");
        
        
        
        
        System.out.print("La Calculadora de la Compañia: ");
        marca= entrada.next();
        System.out.print("La Calculadora es Color: ");
        color = entrada.next();
        System.out.print("El modelo de la Calculadora es: ");
        modelo = entrada.next();
        casio.encender();
        System.out.print("Ingresa el primer numero de la operacion numero 1: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero de la operacion numero 1: ");
        num2 = entrada.nextInt();
        System.out.println("La suma es: " +casio.suma(num1,num2));
        System.out.print("Ingresa el primer numero de la operacion numero 2: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero de la operacion numero 2: ");
        num2 = entrada.nextInt();
        System.out.println("La resta es: " +casio.resta(num1,num2));
        System.out.print("Ingresa el primer numero de la operacion numero 3: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero de la operacion numero 3: ");
        num2 = entrada.nextInt();
        System.out.println("La multiplicacion es: " +casio.multiplicacion(num1,num2));
        System.out.print("Ingresa el primer numero de la operacion numero 4: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero de la operacion numero 4: ");
        num2 = entrada.nextInt();
        System.out.println("La division es: " +casio.division(num1,num2));
        System.out.println(casio.apagar());
        System.out.println("\n");
    }
    
}
