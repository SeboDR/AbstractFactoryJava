/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabrica;

import logica.personaje.*;

/**
 *
 * @author sebas
 */
public interface FabricaAbstracta {
    public abstract Arma crearArma();
    public abstract Armadura crearArmadura();
}
