/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author famtz
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int i=0, num1, num2, opcion;
        
        Contactos con[] = new Contactos[2];
        Telefono tel[] = new Telefono[2];
        for(i=0; i<2; i++)
        {
            con[i] = new Contactos();
            tel[i] = new Telefono();
            System.out.print("Ingrese el nombre del contacto: ");
            con[i].setNom(entrada.nextLine());
            System.out.print("Ingrese el email del contacto: ");
            con[i].setEmail(entrada.nextLine());
            System.out.print("Ingrese el numero del contacto: ");
            con[i].setNumero(entrada.nextLine());
            System.out.print("Ingrese la marca del celular: ");
            tel[i].setMarca(entrada.nextLine());
            System.out.print("Ingrese el modelo de su celular: ");
            tel[i].setModelo(entrada.nextLine());
            System.out.print("Ingrese el color de su celular: ");
            tel[i].setColor(entrada.nextLine());
            System.out.print("Ingrese su precio: ");
            tel[i].setPrecio(entrada.nextLine());
            System.out.println("\n");
        }
    
    do
    {
        System.out.println("Menu Principal\n"+"1.-Consultar usuarios.\n"+"2.-Realizar una llamada.\n"+"3.-Salir.");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                for(i=0; i<2; i++)
                    {
                        System.out.print("Contacto: " + con[i].getNom());
                        System.out.print("\nEmail: " + con[i].getEmail());
                        System.out.print("\nNumero: " + con[i].getNumero());
                        System.out.print("\nMarca: " + tel[i].getMarca());
                        System.out.print("\nModelo: " + tel[i].getModelo());
                        System.out.print("\nColor: " + tel[i].getColor());
                        System.out.print("\nPrecio: "+ tel[i].getPrecio());
                        System.out.println("\n\n\n");
                    }
            break;
            
            case 2:
                System.out.print("Ingresa el lugar del numero remitente: ");
                num1 = entrada.nextInt();
                
                System.out.print("Ingresa el lugar del numero destinatario: ");
                num2 = entrada.nextInt();
                
                System.out.println("\n\n");
                
                for(i=0; i<2; i++)
                    {
                        if((num1-1) == i)
                            {
                                System.out.print("Marca: " + tel[i].getMarca());
                                System.out.print("\nModelo: " + tel[i].getModelo());
                                System.out.print("\nColor: " + tel[i].getColor());
                                System.out.print("\nPrecio: "+ tel[i].getPrecio());
                                System.out.println("");
                                tel[i].conexion();
                                System.out.println("");
                                tel[i].encender();
                                System.out.print("\nContesta llamada: " + con[i].getNom());
                                System.out.print("\nNumero: " + con[i].getNumero());
                                System.out.println("");
                                tel[i].apagar();
                                System.out.println("\n\n\n");
                            }
                        
                    }
                
                for(i=0; i<2; i++)
                    {
                        if((num2-1) == i)
                            {
                                System.out.print("Marca: " + tel[i].getMarca());
                                System.out.print("\nModelo: " + tel[i].getModelo());
                                System.out.print("\nColor: " + tel[i].getColor());
                                System.out.print("\nPrecio: "+ tel[i].getPrecio());
                                System.out.println("");
                                tel[i].encender();
                                System.out.print("\nContesta llamada: " + con[i].getNom());
                                System.out.print("\nNumero: " + con[i].getNumero());
                                System.out.println("");
                                tel[i].apagar();
                                System.out.println("\n\n\n");
                            }
                        
                    }
                
                System.out.println("Finalizar llamada de ambos.");

            break;
            
            case 3: 
                System.out.println("Adios");
                
            break;
            
        }
    
    }while(opcion!=3);
        
    }
    
}
