/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import logica.fabrica.*;
import logica.personaje.*;
/**
 *
 * @author sebas
 */
public class Cliente {
    private FabricaAbstracta fabricaPersonaje;
    private Arma armaPersonaje;
    private Armadura armaduraPersonaje;
    
    public Cliente(FabricaAbstracta fabrica){
        fabricaPersonaje = fabrica;
        armaPersonaje = fabricaPersonaje.crearArma();
        armaduraPersonaje = fabricaPersonaje.crearArmadura();
    }
    
    public void usarArma(){
        System.out.println(armaPersonaje.atacar());
    }
    
    public void usarArmadura(){
        System.out.println(armaduraPersonaje.lanzarHabilidad());
    }
}
