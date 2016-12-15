/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author educacionit
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        Producto p1 = new Producto();
        
        p1.setNombre("Caramelos");
        p1.setPrecio(15);
        p1.setStock(8);
        
        Producto p2 = new Producto();
        
        p2.setNombre("Alfajor");
        p2.setPrecio(12);
        p2.setStock(5);
        
        Producto p3 = new Producto();
        
        p3.setNombre("Gomitas");
        p3.setPrecio(12);
        p3.setStock(5);
        
        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        
        Persona persona1 = new Persona();
        persona1.setNombre("Fidel");
        persona1.setDinero((35));
        
        Vendedor vend = new Vendedor();
        vend.setDineroRecaudado(0);
        vend.setNombre("Fito");
        
        CompraManager cm = new CompraManager();
        cm.setComprador(persona1);
        cm.setVendedor(vend);
        cm.setProducto(productos[1]);
        
        if (cm.verificarMonto()) {
            cm.realizarCompra();
            cm.ajustarStock(productos);
            
        }
        
    }
    
}
