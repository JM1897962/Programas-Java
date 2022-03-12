/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author famtz
 */
public class LeerArchivos{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int i = 0, j=0;
        
        ManejoArchivo ma = new ManejoArchivo();

        ArrayList<String> palabras = new ArrayList<>(); 

        String cadena[] = ma.leerinfo("E:\\Archivos\\Lab POO\\Actividad 7 - JMMR - 1897962 - 32\\Actividad #7\\txt\\Autos.txt").split("-");
        palabras.addAll(Arrays.asList(cadena));
        
        Automovil auto[] = new Automovil[10];
        ArrayList<Transporte> car = new ArrayList<>();

        while(i != 50)
        {
            auto[j] = new Automovil();
            auto[j].setMarca(palabras.get(i));
            i++;
            auto[j].setModelo(palabras.get(i));
            i++;
            auto[j].setPrecio(palabras.get(i));
            i++;
            auto[j].setGasolina(palabras.get(i));
            i++;
            auto[j].setMovimiento(palabras.get(i));
            i++;
            car.add(auto[j]);
            j++;
        }
        
        System.out.println("\n\nDatos de los Automoviles.\n");
        
        for(j=0;j<10; j++)
        {  
            System.out.println("Automovil #" + (j+1));
            auto[j].encender();
            System.out.println("Marca: " + car.get(j).getMarca());
            System.out.println("Modelo: " + car.get(j).getModelo());
            System.out.println("Precio: " + car.get(j).getPrecio());
            System.out.println("Tiene " + car.get(j).getGasolina() + " cantidad de gasolina.");
            System.out.println("Dara vuelta a la " + car.get(j).getMovimiento());
            auto[j].apagar();
            System.out.println("");
        }
        
        Deprecated persona1 = new Deprecated("juan", 22);
        System.out.println(persona1.retornarNombre());
        System.out.println(persona1.getNombre());
        
    } 
}
