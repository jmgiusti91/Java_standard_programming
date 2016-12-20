
import com.thoughtworks.xstream.XStream;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author map53733
 */
public class Empresa {
    private String nombre;
    private String calle;
    private String numeroCalle;
    private String piso;
    private String departamento;
    private String cuit;
    private int cantidadEmpleados;
    private String apoderado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }
    
    
    public Empresa deserializar(String nombreArchivo) {
        XStream xstream = new XStream();
        File file = new File(nombreArchivo);
        System.out.println(file.getAbsolutePath());
        Empresa c = (Empresa) xstream.fromXML(file);
        return c;
    }

    public String serializar(Empresa empresa) {
        XStream xstream = new XStream();
        String salida = xstream.toXML(empresa);
        return salida;
    }
}
