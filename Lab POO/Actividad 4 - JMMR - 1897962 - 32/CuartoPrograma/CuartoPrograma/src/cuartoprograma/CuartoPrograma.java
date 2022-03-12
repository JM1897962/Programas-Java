/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartoprograma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 

public class CuartoPrograma {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 

        int i, con=1;
        String cadena, palabra="";

 

        System.out.println("Ingrese la cadena a evaluar: ");
        cadena=br.readLine();
        for(i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                con++;
            }
        }
        System.out.println("La cadena contiene "+con+" palabras");       
    }

 

}
