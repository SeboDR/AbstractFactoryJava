/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.personaje;

public class ArmaduraGuerrero extends Armadura {

    public ArmaduraGuerrero(int nivelProteccion) {
        super(nivelProteccion);
    }

    @Override
    public String lanzarHabilidad() {
        String lanzamiento = "Sientes salir de tu armadura una fuerza"
                + " descomunal; aumentas tu proteccion a " 
                + (nivelProteccion + 10)
                + " puntos";
        
        return lanzamiento;
    }
    
}
