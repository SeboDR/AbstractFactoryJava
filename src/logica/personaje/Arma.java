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
public abstract class Arma {
    
    private int nivelDaño;
    
    public Arma(int nivelDaño){
        this.nivelDaño = nivelDaño;
    }
    
    public abstract String atacar();
    
    public int getNivelDaño(){
        return nivelDaño;
    }
}
