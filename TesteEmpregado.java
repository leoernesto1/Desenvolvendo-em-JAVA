/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empregado;

/**
 *
 * @author Pedro
 */
public class TesteEmpregado {
    public static void main (String [] args){
        Empregado empregado1 = new Empregado();
        empregado1.setNome("Jose");
        empregado1.setSobrenome("da Silva");
        empregado1.setSalario(1350);
        Empregado empregado2 = new Empregado();
        empregado2.setNome("Maria");
        empregado2.setSobrenome("da Silva");
        empregado2.setSalario(1650);
        System.out.println(empregado1.getNome()+" "+empregado1.getSobrenome()+"= "+empregado1.getSalario());
        System.out.println(empregado2.getNome()+" "+empregado2.getSobrenome()+"= "+empregado2.getSalario());
        double novoSalario = empregado1.getSalario()+(empregado1.getSalario())*0.1;
        empregado1.setSalario(novoSalario);
        System.out.println(empregado1.getSalario());
        novoSalario = empregado2.getSalario()+(empregado2.getSalario())*0.1;
        empregado2.setSalario(novoSalario);
        System.out.println(empregado2.getSalario());
    }
}
