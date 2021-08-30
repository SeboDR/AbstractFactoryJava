/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import logica.fabrica.*;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Main {

    public static void main(String[] args) {
        
        boolean fabricaEscogida = false;
        Scanner s = new Scanner(System.in);
        
        Cliente cliente;
        FabricaAbstracta fabrica;
        
        System.out.println("¿Qué personaje quieres elegir?");
        System.out.println("(1)Guerrero || (2)Mago");
        String value = s.next();
        
        if(value.equals("1")){
            fabrica = new FabricaGuerrero();
            fabricaEscogida = true;
        }else if(value.equals("2")){
            fabrica = new FabricaMago();
            fabricaEscogida = true;
        }else{
            System.out.println("Input incorrecto");
            fabrica = null;
        }
        
        if(fabricaEscogida){
            cliente = new Cliente(fabrica);
            cliente.usarArma();
            cliente.usarArmadura();
        }
    }
    
}
