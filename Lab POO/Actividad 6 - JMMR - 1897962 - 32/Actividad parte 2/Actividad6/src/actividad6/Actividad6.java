/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author famtz
 */
public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner entrada = new Scanner(System.in);
        
        int i;
        
        Automovil auto[] = new Automovil[5];
        Tren tomas[] = new Tren[5];
        ArrayList<Transporte> t = new ArrayList<>();
        
        System.out.println("Recibimiento de datos.");
        
        System.out.println("Automovil.");

        for(i=0; i<5; i++){

            auto[i] = new Automovil();
            System.out.print("Ingresa la marca del carro: ");
            auto[i].setMarca(entrada.nextLine());
            System.out.print("Ingresa el modelo del carro: ");
            auto[i].setModelo(entrada.nextLine());
            System.out.print("Ingresa el color del carro: ");
            auto[i].setColor(entrada.nextLine());
            System.out.print("Ingresa el numero de serie: ");
            auto[i].setSerie(entrada.nextLine());
            System.out.print("Ingresa la cantidad de gasolina: ");
            auto[i].setGasolina(entrada.nextLine());
            System.out.print("Ingresa la direccion a la que girara: ");
            auto[i].setVuelta(entrada.nextLine());
            System.out.println("");
            t.add(auto[i]);

        }
        
        System.out.println("Trenes.");
        for(i=0; i<5; i++){

            tomas[i] = new Tren();
            System.out.print("Ingresa la marca del tren: ");
            tomas[i].setMarca(entrada.nextLine());
            System.out.print("Ingresa el modelo del tren: ");
            tomas[i].setModelo(entrada.nextLine());
            System.out.print("Ingresa el color del tren: ");
            tomas[i].setColor(entrada.nextLine());
            System.out.print("Ingresa el numero de tren: ");
            tomas[i].setSerie(entrada.nextLine());
            System.out.print("Ingresa la cantidad de gasolina: ");
            tomas[i].setGasolina(entrada.nextLine());
            System.out.print("Ingresa la direccion a la que girara: ");
            tomas[i].setVuelta(entrada.nextLine());
            System.out.println("");
            t.add(tomas[i]);

        }
        
        
        
        System.out.println("Impresion de Datos");
        
        for(i=0;i<10; i++)
        {
            
            System.out.println("Marca: " + t.get(i).getMarca());
            System.out.println("Modelo: " + t.get(i).getModelo());
            System.out.println("Color: " + t.get(i).getColor());
            System.out.println("Serie: " + t.get(i).getSerie());
            System.out.println("Dara vuelta a la " + t.get(i).getVuelta());
            System.out.println("Tiene " + t.get(i).getGasolina() + " cantidad de gasolina.");
            System.out.println("");
        }
    }
}
