/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author vinicius.oliveira
 */
public class Tecnico extends Aluno {
    private String registroprofissional;

    public String getRegistroprofissional() {
        return registroprofissional;
    }

    public void setRegistroprofissional(String registroprofissional) {
        this.registroprofissional = registroprofissional;
    }
    
    
    
    public void praticar(){
        
        System.out.println(this.nome + " vai praticar " + this.registroprofissional + "!!!");
        
    }
    
    
}
