/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtransportes;
import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class RunTransportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        String modelo, serie;
        
        Avion ave = new  Avion();
        ave.enciende();
        ave.modelo();
        modelo = entrada.next();
        System.out.println(ave.serie());
        serie = entrada.next();
        ave.avanzar();
        System.out.println(ave.asciende());
        ave.volar();
        ave.planea();
        System.out.println(ave.desciende());
        System.out.println(ave.frenos());
        System.out.println(ave.apagar());
        
        
        System.out.println("");
        
        
        Helicoptero hel = new Helicoptero();
        hel.enciende();
        hel.modelo();
        modelo = entrada.next();
        System.out.println(hel.serie());
        serie = entrada.next();
        System.out.println(hel.asciende());
        hel.volar();
        hel.planea();
        System.out.println(hel.desciende());
        System.out.println(hel.apagar());
        
        
        System.out.println("");
        
        
        Automovil auto = new Automovil();
        auto.enciende();
        auto.modelo();
        modelo = entrada.next();
        System.out.println(auto.serie());
        serie = entrada.next();
        auto.avanzar();
        auto.bajarVentana();
        auto.suelo();
        System.out.println(ave.frenos());
        auto.subirVentana();
        System.out.println(auto.apagar());
        
        
        System.out.println("");
        
        
        Trailer trai = new Trailer();
        trai.enciende();
        trai.modelo();
        modelo = entrada.next();
        System.out.println(trai.serie());
        serie = entrada.next();
        trai.avanzar();
        trai.bajarVentana();
        trai.suelo();
        System.out.println(trai.frenos());
        trai.subirVentana();
        System.out.println(trai.apagar());
        
        
        System.out.println("");
        
        
        Tren cajas = new Tren();
        cajas.enciende();
        cajas.modelo();
        modelo = entrada.next();
        System.out.println(cajas.serie());
        serie = entrada.next();
        cajas.avanzar();
        cajas.humo();
        cajas.bajarVentana();
        System.out.println(cajas.vias());
        cajas.suelo();
        System.out.println(cajas.frenos());
        cajas.subirVentana();
        System.out.println(cajas.apagar());
        
        
         System.out.println("");
        
         
         Barco b1 = new Barco();
         b1.enciende();
         b1.modelo();
         modelo = entrada.next();
         System.out.println(b1.serie());
         serie = entrada.next();
         b1.avanzar();
         b1.zarpar();
         b1.flota();
         System.out.println(b1.frenos());
         b1.arribar();
         System.out.println(b1.apagar());
         
         
         System.out.println("");
         
         
         Bote bb1 = new Bote();
         bb1.enciende();
         bb1.modelo();
         modelo = entrada.next();
         System.out.println(bb1.serie());
         serie = entrada.next();
         bb1.avanzar();
         bb1.zarpar();
         bb1.flota();
         System.out.println(bb1.frenos());
         bb1.arribar();
         System.out.println(bb1.apagar());
    }
    
}
