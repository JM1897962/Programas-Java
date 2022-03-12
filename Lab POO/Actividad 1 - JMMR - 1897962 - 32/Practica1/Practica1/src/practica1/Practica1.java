/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;

/**
 *
 * @author famtz
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        double money;
        
        System.out.println("\tRegistro de Cliente.\n");
        
        Cuenta cli1 = new Cuenta();
        
        Scanner scnNom = new Scanner(System.in);
        System.out.print("Titular de la cuenta: ");
        String nom = scnNom.nextLine();
        
        Scanner scnNumCuen = new Scanner(System.in);
        System.out.print("Numero de la cuenta: ");
        Double numcuen = scnNumCuen.nextDouble();
        
        Scanner scnInteres = new Scanner(System.in);
        System.out.print("Interes de la cuenta: ");
        Double interes = scnInteres.nextDouble();
        
        Scanner scnSaldo = new Scanner(System.in);
        System.out.print("Saldo de la cuenta: ");
        Double saldo = scnSaldo.nextDouble();
        
        cli1.setNomCliente(nom);
        cli1.setNumCuenta(numcuen);
        cli1.setTipinter(interes);
        cli1.setSaldo(saldo);
        
        
        Cuenta cli2 = new Cuenta("Juan Manuel", 1897962, 2.5, 2500);
        
        System.out.println("\n\n\tClientes registrados.\n");
        
        System.out.println("\n\tCliente numero 1.\n");
        System.out.println("Nombre del cliente: "+cli1.getNomCliente());
        System.out.println("Nombre del cliente: "+cli1.getNumCuenta());
        System.out.println("Nombre del cliente: "+cli1.getTipinter());
        System.out.println("Nombre del cliente: "+cli1.getSaldo());
        
        System.out.println("\n\tCliente numero 2.\n");
        System.out.println("Nombre del cliente: "+cli2.getNomCliente());
        System.out.println("Nombre del cliente: "+cli2.getNumCuenta());
        System.out.println("Nombre del cliente: "+cli2.getTipinter());
        System.out.println("Nombre del cliente: "+cli2.getSaldo());
        
        
        System.out.print("\n\n\tDeposito en Cuenta 1.\n");
     
        System.out.println("Cuanto dinero va a depositar: ");
        money = entrada.nextDouble();
        
        cli1.deposito(money);
        
        System.out.println("\n\tCliente numero 1.\n");
        System.out.println("Nombre del cliente: "+cli1.getNomCliente());
        System.out.println("Nombre del cliente: "+cli1.getNumCuenta());
        System.out.println("Nombre del cliente: "+cli1.getTipinter());
        System.out.println("Nombre del cliente: "+cli1.getSaldo());
        
        
        System.out.println("\n\n\tRetiro en Cuenta 2.\n");
     
        System.out.print("Cuanto dinero va a retirar: ");
        money = entrada.nextDouble();
        
        cli2.retiro(money);
        
        System.out.println("\n\tCliente numero 2.\n");
        System.out.println("Nombre del cliente: "+cli2.getNomCliente());
        System.out.println("Nombre del cliente: "+cli2.getNumCuenta());
        System.out.println("Nombre del cliente: "+cli2.getTipinter());
        System.out.println("Nombre del cliente: "+cli2.getSaldo());
        
        
        System.out.println("\n\n\tTransferencia de Cuenta 1 a la 2.\n");
     
        System.out.print("Cuanto dinero va a transferir: ");
        money = entrada.nextDouble();
        
        cli1.transferir(cli2, money);
        
        System.out.println("\n\tCliente numero 1.\n");
        System.out.println("Nombre del cliente: "+cli1.getNomCliente());
        System.out.println("Nombre del cliente: "+cli1.getNumCuenta());
        System.out.println("Nombre del cliente: "+cli1.getTipinter());
        System.out.println("Nombre del cliente: "+cli1.getSaldo());
        
        System.out.println("\n\tCliente numero 2.\n");
        System.out.println("Nombre del cliente: "+cli2.getNomCliente());
        System.out.println("Nombre del cliente: "+cli2.getNumCuenta());
        System.out.println("Nombre del cliente: "+cli2.getTipinter());
        System.out.println("Nombre del cliente: "+cli2.getSaldo());
    }
    
}
