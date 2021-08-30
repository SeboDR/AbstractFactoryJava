/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.personaje;

public class ArmaGuerrero extends Arma {

    public ArmaGuerrero(int nivelDaño) {
        super(nivelDaño);
    }

    @Override
    public String atacar() {
        
        String ataque = "Atacas con tu arma; generas " 
                + super.getNivelDaño()
                + " puntos de daño"; 
        return ataque;
    }
}
