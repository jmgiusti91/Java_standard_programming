/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02_tp;

/**
 *
 * @author educacionit
 */
public class Auto {

    private String marca;
    private int velocidad;
    private String color;

    public void MostrarInfo() {

        System.out.println("Marca" + marca + " Color " + color + " Velocidad " + velocidad);
    }

    public void Acelerar(int velocidad) {
        this.velocidad = velocidad;

        System.out.println("Velocidad actual " + this.velocidad);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
