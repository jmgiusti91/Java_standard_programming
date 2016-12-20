/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author map53733
 */
public class Programa {

    public static void main(String[] args) {
        Empresa ee = new Empresa();
        ee.setNombre("Arcor");
        ee.setApoderado("Emilio");
        ee.setCalle("25 de mayo");
        ee.setCantidadEmpleados(2000);
        ee.setCuit("205588696326");
        ee.setDepartamento("2");
        ee.setNumeroCalle("123");
        ee.setPiso("asd");
        System.out.println(ee.serializar(ee));
        Empresa salida = ee.deserializar("archivo.xml");
        System.out.println(salida.getNombre());
    }
}
