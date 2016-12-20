/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author educacionit
 */
public class Programa {
    public static void main(String[] args) {
        Moto m = new Moto();
        m.setAnioFabricacion(2015);
        System.out.println(m.getAnioFabricacion());
        
        Auto a = new Auto();
        a.setTipoComputadora("hola");
        System.out.println(a.getTipoComputadora());
    }
}
