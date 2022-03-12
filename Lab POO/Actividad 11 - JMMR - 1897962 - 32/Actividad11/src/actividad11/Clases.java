/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class Clases {
      public static String Romanos(int numero) {
      int i, miles, centenas, decenas, unidades;
      String romano = "";
      
      //obtenemos cada cifra del número
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

      //millar
      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }

      //centenas
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                 romano = romano + "D";
                 for (i = 6; i <= centenas; i++) {
                      romano = romano + "C";
                 }
      } else if (centenas == 4) {
                 romano = romano + "CD";
      } else {
                 for (i = 1; i <= centenas; i++) {
                      romano = romano + "C";
             }
      }

      //decenas
      if (decenas == 9) {
          romano = romano + "XC";
      } else if (decenas >= 5) {
                 romano = romano + "L";
                 for (i = 6; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      } else if (decenas == 4) {
                 romano = romano + "XL";
      } else {
                 for (i = 1; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      }

      //unidades
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
  }
      
      public static int ciclo(int i, int z){
      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingresa el numero inicial: ");
      i = entrada.nextInt();
      System.out.print("Ingresa el numero final: ");
      z = entrada.nextInt();
         
          while(i<z+1)
            {
                System.out.println("Numero: " + (i));
                i++;
            }
          return 0;
      }
      
    public static int ciclo2(int i){
        do{
                System.out.println("Numero: " + (i+1));
                i++;
            }while(i!=100);
        return 0;
    }
    
    public static int ciclo3(int i){
                for(i=0; i<100; i++)
            {
                System.out.println("Numero: " + (i+1));
            }
        return 0;
    }
    
    public static int tran1(int in, String str){
        str= String.valueOf(in);
        System.out.println("La conversion es de int a string es: " + str);
        return 0;
    }
    
    public static int tran2(String str, int in){
        in = Integer.parseInt(str);
        System.out.println("La conversion es de string a int es: " + in);
        return 0;
    }
    
    public static int suma(int i, int numero, int in, int total){
    Scanner entrada = new Scanner(System.in);
    
        for(i=0; i<numero; i++)
        {
            System.out.print("Ingresa el numero que deseas sumar: ");
            in = entrada.nextInt();
            total = total+in;
        }
        System.out.print("El total es " + total);
        
        return 0;
    }
    
    public static int random(int i, int cant, int total, int alea){
        Scanner entrada = new Scanner(System.in);
        
        do
        {
            System.out.print("Ingresa cuantos aleatorios quieres: ");
            cant = entrada.nextInt();
        }while(cant<0 && cant>10);
        
        for(i=0; i<cant; i++)
        {
            alea = (int)(Math.random()*1000+1);
            System.out.println("El numero#" + (i+1) + " es " + alea);
            while(alea>10)
                {
                    alea = alea/10;
                    if(alea<10 && alea == cant)
                        {
                            total = total + 1;
                        }
                }
        }
        
        
        System.out.print("El total es " + total);
        return 0;
    }
}
