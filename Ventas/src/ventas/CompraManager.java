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
public class CompraManager {
    private static int NUMERADOR_TICKETS = 1;
    
    private Persona comprador;
    private Vendedor vendedor;
    private int numeroTicket;
    private Producto producto;
    
    public void realizarCompra(){
        System.out.println("Se realizxa la compra de " + producto.getNombre());
        System.out.println("Se abona " + producto.getPrecio());
        System.out.println("SU NUMERO DE TICKET ES " + NUMERADOR_TICKETS);
        comprador.setDinero(comprador.getDinero() - producto.getPrecio());
        vendedor.setDineroRecaudado(vendedor.getDineroRecaudado() + producto.getPrecio());
        System.out.println("El comprador quedo con " + comprador.getDinero());
        System.out.println("El vendedor quedo con " + vendedor.getDineroRecaudado());
        NUMERADOR_TICKETS++;
    }
    
    public boolean verificarMonto(){
        if (comprador.getDinero() >= producto.getPrecio()) {
            return true;
        }
        return false;
    }
    public void ajustarStock(Producto[] productos){
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre())) {
                
            }
        }
    }

    public static int getNUMERADOR_TICKETS() {
        return NUMERADOR_TICKETS;
    }

    public static void setNUMERADOR_TICKETS(int NUMERADOR_TICKETS) {
        CompraManager.NUMERADOR_TICKETS = NUMERADOR_TICKETS;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
