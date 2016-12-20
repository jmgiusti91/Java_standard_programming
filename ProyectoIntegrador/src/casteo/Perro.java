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
public class Perro extends Canino {

    private String apodo;

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public void Ladrar() {
        //super.Ladrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("LADRIDO DE PERRO");
    }
    
    public void LadradCanino(){
        super.Ladrar();
    }
    
    

}
