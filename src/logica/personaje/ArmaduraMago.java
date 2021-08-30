/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.personaje;

public class ArmaduraMago extends Armadura {

    public ArmaduraMago(int nivelProteccion) {
        super(nivelProteccion);
    }

    @Override
    public String lanzarHabilidad() {
        String lanzamiento = "Sientes que vinculas tu energia con"
            + " el entorno; aumentas tu proteccion a " 
            + (nivelProteccion + 15)
            + " puntos";
        
        return lanzamiento;    
    }
    
}
