/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabrica;

import logica.personaje.*;

public class FabricaGuerrero implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        Arma armaGuerrero = new ArmaGuerrero(32);
        return armaGuerrero;
    }

    @Override
    public Armadura crearArmadura() {
        Armadura armaduraGuerrero = new ArmaduraGuerrero (60);
        return armaduraGuerrero;
    }
    
}
