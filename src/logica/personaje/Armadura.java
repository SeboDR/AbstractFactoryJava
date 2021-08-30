/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.personaje;

/**
 *
 * @author sebas
 */
public abstract class Armadura {
    protected int nivelProteccion;
    
    public Armadura(int nivelProteccion){
        this.nivelProteccion = nivelProteccion;
    }
    
    public abstract String lanzarHabilidad(); 
}
