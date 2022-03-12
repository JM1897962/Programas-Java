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
public class Deprecated {
    
    private String nombre;
    private int edad;

    public Deprecated(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Deprecated //Aqui nos muestra una falla, ya que deberia ser getNombre al ser retornarNombre una instruccion obsoleta
    public String retornarNombre() {
        return this.nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
