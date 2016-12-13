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
public class Clase02_parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona pepe = new Persona();
        
        pepe.setDire(new Direccion());
        
        pepe.getDire().setCalle("Finochietto");
        
        pepe.setNombre("Nestor");
        pepe.Caminar();
        
        Persona p2 = new Persona();
        
        p2.setNombre("Horacio");
        p2.setDocumento("22667883");
        p2.setEdad(15);
        p2.Caminar();
        
        ValidadorDePersonas validador = new ValidadorDePersonas();
        
        System.out.println(validador.validarPersona(p2));
        
        
    }
    
}
