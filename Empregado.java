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
public class Empregado {
    String nome;
    String sobrenome;
    double salario;
    public void Empregado(String nome, String sobrenome, double salario){
        nome="";
        sobrenome="";
        salario=0;                
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public double getSalario(){
        return salario;
    }
    }
