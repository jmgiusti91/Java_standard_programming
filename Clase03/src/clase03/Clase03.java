/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author educacionit
 */
public class Clase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a = new Auto();
        a.acelerar();
        a.acelerar();
        a.acelerar(23);

        JFrame v  = new JFrame();
        v.show();
//        System.out.println(b.getNombre());
    }

}
