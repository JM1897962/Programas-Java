/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;

/**
 *
 * @author famtz
 */
public class Automovil extends Transporte{

    /**
     * @return the gasolina
     */
    @Override
    public String getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    @Override
    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }
        /**
     * @return the marca
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    @Override
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    @Override
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    @Override
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the movimiento
     */
    @Override
    public String getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    @Override
    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    
    private String marca;
    private String modelo;
    private String precio;
    private String movimiento;
    private String gasolina;
    
    
    public Automovil(){
        
    }
    
    public Automovil(String marca, String modelo, String precio, String movimiento){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.movimiento = movimiento;
    }
}
