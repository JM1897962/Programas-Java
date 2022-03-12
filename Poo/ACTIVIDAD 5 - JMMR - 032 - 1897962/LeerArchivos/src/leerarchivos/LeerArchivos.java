/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author famtz
 */
public class LeerArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ManejoArchivo ma = new ManejoArchivo();
        String dato;
        
        System.out.print("Ingresa archivodeactividad para mostrarte un resultado: ");
        dato = entrada.next();
        
        System.out.println(ma.leerinfo("E:\\Archivos\\Poo\\ACTIVIDAD 5 - JMMR - 032 - 1897962\\txt\\"+dato+".txt"));
    }
    
}
