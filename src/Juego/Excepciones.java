/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author serxa
 */
public class Excepciones extends Exception {
    
    public Excepciones(String msg) throws Excepciones {
        super(msg);
        throw new Excepciones("Faltan Quesitos por Conseguir, sigue Jugando");
    }
}
