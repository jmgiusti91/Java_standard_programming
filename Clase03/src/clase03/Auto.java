/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

/**
 *
 * @author educacionit
 */
public class Auto {

    public Auto() {
        System.out.println("LLAMADA AL CONSTRUCTOR");
    }

    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Auto(String marca, String nombre) {
        this.marca = marca;
        this.nombre = nombre;
    }

    /**
     *
     * @param marca
     * @param nombre
     * @param velocidad TIENE QUE SER MAYOR QUE CERO
     */
    public Auto(String marca, String nombre, int velocidad) {
        this.marca = marca;
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public Auto(String elNombre) {
        System.out.println("SE LLAMA AL CONSTRUCTOR CON NOMBRE");
        this.nombre = elNombre;
    }

    private String marca;
    private String nombre;
    private int velocidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void acelerar() {
        this.velocidad = velocidad + 5;
        System.out.println("SE ACELERA A " + this.velocidad);
    }

    public void acelerar(int velocidad) {
        this.velocidad = this.velocidad + velocidad;
        System.out.println("SE ACELERA A " + this.velocidad);
    }

}
