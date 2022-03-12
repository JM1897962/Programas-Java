/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtransportes;


/**
 *
 * @author famtz
 */
public class RunTransportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i;
       
       Automovil car = new Automovil();
       Tren caja = new Tren();
       Trailer grande = new Trailer();
       Avion ala = new Avion();
       Helicoptero combat = new Helicoptero();
       Barco proa = new Barco();
       Bote remo = new Bote();
       
       Lista def[] = new Lista[14];
       for(i=0; i<14; i++){
           
           if(i==0 || i== 1)
           {
               System.out.println("Datos de Autos.");
           }
           
           if(i==2 || i == 3)
           {
               System.out.println("Datos de Tren.");
           }
           
           if(i==4 || i == 5)
           {
               System.out.println("Datos de Trailer.");
           }
           
           if(i==6 || i == 7)
           {
               System.out.println("Datos de Avion.");
           }
           
           if(i==8 || i ==9)
           {
               System.out.println("Datos de Helicoptero");
           }
           
           if(i==10 || i==11)
           {
               System.out.println("Datos de Barco.");
           }
           
           if(i==12 || i == 13)
           {
               System.out.println("Datos de Bote.");
           }
           def[i] = new Lista();
           def[i].addTransporte();
       }
       
       
       for(i=0; i<14; i++){
         
         if(i==0 || i == 1)
         {
             System.out.println("Automovil: ");
             car.avanzar();
             car.suelo();
            car.bajarVentana();
            car.frenos();
            car.subirVentana();
             System.out.println("");
         }
         
         if(i==2 || i == 3)
         {
             System.out.println("Tren: ");
             caja.avanzar();
            caja.suelo();
            caja.humo();
            caja.bajarVentana();
            caja.vias();
            caja.subirVentana();
            caja.frenos();
             System.out.println("");
         }
         
         if(i==4 || i == 5)
         {
             System.out.println("Trailer: ");
             grande.avanzar();
            grande.bajarVentana();
            grande.suelo();
            grande.subirVentana();
            grande.subirVentana();
             System.out.println("");
         }
         
         if(i==6 || i == 7)
         {
             System.out.println("Avion: ");
             ala.avanzar();
            ala.asciende();
            ala.planea();
            ala.volar();
            ala.desciende();
            ala.frenos();
             System.out.println("");
         }
         
         if(i==8 || i == 9)
         {
             System.out.println("Helicoptero: ");
             combat.asciende();
            combat.volar();
            combat.planea();
            combat.desciende();
             System.out.println("");
         }
         
         if(i==10 || i ==11)
         {
             System.out.println("Barco: ");
             proa.zarpar();
            proa.avanzar();
            proa.flota();
            proa.arribar();
            proa.frenos();
             System.out.println("");
         }
         
         if(i==12 || i == 13)
         {
             System.out.println("Bote: ");
            remo.zarpar();
            remo.avanzar();
            remo.flota();
            remo.arribar();
            remo.frenos();
             System.out.println("");
         }
         
         def[i].getTransporte();  
       }
       
    }
    
}
