/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad10;

import static actividad10.MarcadeVehiculo.FORD;
import static actividad10.MarcadeVehiculo.TOYOTA;
import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class Actividad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String vari;
        
        Vehiculo v = new Vehiculo();
        System.out.println("\t\tInsercion de datos.\n\n\n");
        System.out.print("Ingresa el tipo de automovil.\n\n1)FORD\n2)TOYOTA\n3)SUZUKI\n4)RENAULT\n5)SEAT\nPor favor ingresalo: ");
        
        vari = entrada.nextLine();     
        v.setMarca(MarcadeVehiculo.valueOf(vari.toUpperCase()));

        System.out.print("Ingresa la matricula del vehiculo: ");
        v.setMatricula(entrada.nextLine());
        System.out.print("Ingresa el precio del vehiculo: ");
        v.setPrecio(entrada.nextLine());
        System.out.print("Ingresa la fecha de salida del vehiculo: ");
        v.setAnio(entrada.nextLine());
        System.out.print("Ingresa el color del vehiculo: ");
        v.setColor(entrada.nextLine());
        
        System.out.println("\n\n\t\tDatos en pantalla.\n\n");
        System.out.println("El vehiculo tiene la matricula " + v.getMatricula() + " tiene el precio de $" + v.getPrecio() + " salio en el año de " + v.getAnio() + " es de color " + v.getColor() + " siendo este de marca " + v.getMarca());        
    }
    
}
