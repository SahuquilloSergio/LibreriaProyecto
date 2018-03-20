package Juego;

import javax.swing.JOptionPane;

/**
 *
 * @author serxa
 */

/**
 * 
 * metodo que simula el lanzamiento de un dado mediante un math.random
 * y devuelve el valor de este.
 */
public class Metodos {
    public void tirarDado(){
       int num = (int) (Math.random()*6+1);
        JOptionPane.showMessageDialog(null, "ha salido un"+num);
    }
}
