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
public class ValidadorDePersonas {
    
    public boolean validarPersona(Persona p){
        
        if (p.getEdad() > 18) {
            return true;
        }
        
        return false;
    }
    
}
