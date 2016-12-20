/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casteo;

/**
 *
 * @author educacionit
 */
public class Canino extends Animal{

    private int cantidadPatas;

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }
    
    public void Ladrar(){
        System.out.println("LADRIDO DE CANINO");
    }

}
