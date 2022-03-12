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
public class Bote extends Maritimo implements SistemaMaritimo, SistemaMecanico{

    @Override
    public void flota() {
        System.out.println("Este vehiculo flota");
    }

    @Override
    public void avanzar() {
        System.out.println("Bote Avanza");
    }

    @Override
    public String frenos() {
        return "Bote Frena";
    }

    @Override
    public void zarpar() {
        System.out.println("Bote Zarpa");
    }

    @Override
    public String arribar() {
        return "Bote Arriba";
    }
    
}
