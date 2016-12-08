/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

/**
 *
 * @author educacionit
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        System.out.println(a+b); //Mostrar valores por consola.
        int resto = a % 2;
        boolean bandera = resto == 0;
        
        System.out.println(bandera ? "par" : "impar");
        
        if (a > b) {
            System.out.println("a es mayor");
        } else if(b > a) {
            System.out.println("b es mayor");
        } else {
            System.out.println("Igualesss!!");
        }
        
          
    }
    
}
