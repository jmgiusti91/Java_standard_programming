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
public class Programa {

    public static void main(String[] args) {
        
        Perro perrop = new Perro();
        perrop.Ladrar();
        perrop.LadradCanino();
        Canino canino = new Canino();
        canino.Ladrar();
        Lobo lobop = new Lobo();
        lobop.Ladrar();
        
        System.out.println("=============");
        
        Canino caninoFalso = new Perro();
        
        caninoFalso.Ladrar();
        
        System.out.println("=====================");
        
        Perro p = new Perro();
        p.setNombre("MAURICIO");
        escribir(p);
        Lobo lobo = new Lobo();
        lobo.setNombre("LOBITO");
        Animal m = lobo;
        escribir(m);
        
        long l = 12345678915809L;
        int i = (int) l ;
        System.out.println(i);
        
    }
    
    public static void  escribir(Animal p){
        System.out.println(p.getNombre());
        System.out.println(p instanceof Lobo);
        if (p instanceof Lobo){
            Lobo lobo = (Lobo) p;
            System.out.println(lobo.getAullido());
        }
        System.out.println(p.getClass());
    }
}
