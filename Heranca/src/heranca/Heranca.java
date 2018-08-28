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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Visitante v1 = new Visitante();
       Aluno a1 = new Aluno();
       Bolsista b1 = new Bolsista();
       Professor p1 = new Professor();
       Tecnico t1 = new Tecnico();
       
       a1.setNome("Claudio");
       a1.setMatricula(1111);
       a1.setIdade(16);
       a1.setCurso("Informatica");
       a1.pagarMensalidade();
       
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
       
       p1.setNome("Joao");
       p1.setIdade(35);
       p1.setSexo("M");
       p1.setSalario(500.0f);
       p1.setEspecialidade("Historia");
       p1.receberAumento();
       
       v1.setNome("Juvenal");
       v1.setIdade(22);
       v1.setSexo("Masculino");
       System.out.println(v1.toString());
        
       t1.setNome("Amanda");
       t1.setIdade(25);
       t1.setSexo("F");
       t1.setRegistroprofissional("TI");
       t1.praticar();
    }
    
}
