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
        
        String modelo;
        int anio;
       
        System.out.println("\t\tCosas de la clase con detalles agregados.\n");
        
        
        
        System.out.println("Automovil. \n");
        
        Automovil topaz = new Automovil();
        System.out.println(topaz.avanza());
        topaz.reversa();
        System.out.println(topaz.suelo());
        System.out.print(topaz.modelo());
        modelo = entrada.next();
        System.out.print(topaz.fecha());
        anio = entrada.nextInt();
        System.out.println("\n\n");
        
        
        
        System.out.println("Avion. \n");
        
        Avion av = new Avion();
        System.out.println(av.avanza());
        av.vuela();
        System.out.print(av.modelo());
        modelo = entrada.next();
        System.out.print(av.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        Avion av1 = new Avion(3);
        System.out.print(av1.modelo());
        modelo = entrada.next();
        System.out.print(av1.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        Avion av2 = new Avion(5, 5);
        System.out.print(av2.modelo());
        modelo = entrada.next();
        System.out.print(av2.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        System.out.println("\t\t\tTarea.\n");
        
        System.out.println("Tren. \n");
        
        Tren vias = new Tren(0);
        System.out.println(vias.avanza());
        vias.reversa();
        vias.via();
        System.out.print(vias.modelo());
        modelo = entrada.next();
        System.out.print(vias.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        Tren vias1 = new Tren(1);
        vias1.via();
        System.out.print(vias1.modelo());
        modelo = entrada.next();
        System.out.print(vias1.fecha());
        anio = entrada.nextInt();
        System.out.print("\n");
        
        
        
        System.out.println("Trailer. \n");
        
        Trailer caja = new Trailer(3);
        System.out.println(caja.avanza());
        caja.reversa();
        System.out.println(caja.suelo());
        caja.suelo();
        System.out.print(caja.modelo());
        modelo = entrada.next();
        System.out.print(caja.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        Trailer caja1 = new Trailer();
        System.out.println(caja.suelo());
        System.out.print(caja1.modelo());
        modelo = entrada.next();
        System.out.print(caja1.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
                
        
        
        System.out.println("Barco. \n");
        
        Barco bote = new Barco();
        System.out.println(bote.avanza());
        System.out.println(bote.agua());
        System.out.print(bote.modelo());
        modelo = entrada.next();
        System.out.print(bote.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
                
        
        
        System.out.println("Helicoptero. \n");
        
        Helicoptero h = new Helicoptero();
        System.out.println(h.avanza());
        h.vuela();
        System.out.print(h.modelo());
        modelo = entrada.next();
        System.out.print(h.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        Helicoptero h1 = new Helicoptero(3);
        System.out.print(h1.modelo());
        modelo = entrada.next();
        System.out.print(h1.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
        
        Helicoptero h2 = new Helicoptero(5, 5);
        System.out.print(h2.modelo());
        modelo = entrada.next();
        System.out.print(h2.fecha());
        anio = entrada.nextInt();
        System.out.println("\n");
    }
    
}
