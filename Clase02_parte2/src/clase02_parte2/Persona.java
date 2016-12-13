/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02_parte2;

/**
 *
 * @author educacionit
 */
public class Persona {

    private String nombre;
    private String documento;
    private int edad;
    private Direccion dire;
    

    public void Caminar() {
        System.out.println(nombre + " Estoy Caminando " + edad + " " + documento);
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDire() {
        return dire;
    }

    public void setDire(Direccion dire) {
        this.dire = dire;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad debe ser positiva para " + this.nombre);
        }
    }

    //Click derecho insertcode.
}
