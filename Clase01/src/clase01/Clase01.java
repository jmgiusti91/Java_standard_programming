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
        System.out.println(a + b); //Mostrar valores por consola.
        int resto = a % 2;
        boolean bandera = resto == 0;

        System.out.println(bandera ? "par" : "impar");

        if (a > b) {
            System.out.println("a es mayor");
        } else if (b > a) {
            System.out.println("b es mayor");
        } else {
            System.out.println("Igualesss!!");
        }
        //Shift + alt + F tabula el codigo;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] arraycito = new int[3];

        arraycito[0] = 31;
        arraycito[1] = 32;
        arraycito[2] = 35;

        for (int i = 0; i < arraycito.length; i++) {
            System.out.println("Posicion: " + i + " Valor: " + arraycito[i]);
        }

        for (int elemento : arraycito) {
            System.out.println(elemento);
        }

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(" El numero " + i + " es par");
            } else {

                System.out.println(" El numero " + i + " es impar");
            }

        }

        int i = 0;

        while (i < arraycito.length) {

            System.out.println(arraycito[i]);
            i++;
            /*
                comentario largo..
             */
        }

        int contador = 0;
        int numero = 1;

        while (contador != 200) {

            if (numero % 3 == 0) {
                System.out.println(numero); // forma abreviada sout
                contador++;
            }

            numero++;

        }
        
        
        //Lo ultimo que vimos es break y continue;
        
        //Dado un numero N decir si es primo o no... Primo: numero divisible por 1 y por si mismo.
        
        //Entrar a alumni.educacionit.com... Si no nos llega correo mandar mail a info@educacionit.com
        
        //Descargar IDE de netbeans.org
        
        //Descargar jdk de java.. Poner en google oracle jdk de java... segundo link.. Descargar version 8 (y dijo algo de 11)
        
        
        

    }

}
