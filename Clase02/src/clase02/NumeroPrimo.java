/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;

/**
 *
 * @author educacionit
 */
public class NumeroPrimo {

    static void escribir(String palabra) {
        System.out.println(palabra);
    }
    
    
    //Tool - options - keymap.. configuracion de shortcuts

    static boolean esPrimo(int numero, int divi) {
        boolean esPrimo = true;
        int divisor = numero;
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                esPrimo = false;
                divisor = j;
                break;
            }
        }
        divi = divisor;
        return esPrimo;
    }

    public static void main(String[] args) {
        int n = 1333;
        int divisor = 0;
        boolean esPrimo = esPrimo(n, divisor);
        
        

        escribir(esPrimo ? "ES PRIMO" : "NO ES PRIMO, EL DIVISOR ES " + divisor);
        escribir("FIN");
        //Procedimiento.. Es un pedazo de codigo que es reutilizable. Algo asi como un alias.
    }

}
