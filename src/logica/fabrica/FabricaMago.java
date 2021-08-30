/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabrica;

import logica.personaje.*;


public class FabricaMago implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        Arma armaMago = new ArmaMago(50);
        return armaMago;
    }

    @Override
    public Armadura crearArmadura() {
        Armadura armaduraMago = new ArmaduraMago (30);
        return armaduraMago;
    }
    
}
