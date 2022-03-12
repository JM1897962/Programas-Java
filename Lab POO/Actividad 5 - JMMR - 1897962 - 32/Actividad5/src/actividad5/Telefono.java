/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

/**
 *
 * @author famtz
 */
public class Telefono extends DispositivoElectronico implements IWifiConexion{

    public Telefono(){
        
    }
    
    public Telefono(String marca, String precio, String modelo, String color){
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.color = color;
    }
    
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    private String marca;
    private String precio;
    private String modelo;
    private String color;

    @Override
    public void encender() {
        System.out.println("Encender Telefono");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Telefono");
    }

    @Override
    public void conexion() {
        System.out.println("Conexion WIFI = TRUE");
    }

    
    
}
