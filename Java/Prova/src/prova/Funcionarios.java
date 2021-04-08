/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Felipe Batista
 */
public abstract class Funcionarios 
{
    private String nome;
    private int rg;
    protected double salario_base = 0;

    public Funcionarios(String nome, int rg, double salario_base) 
    {
        this.nome = nome;
        this.rg = rg;
        this.salario_base = salario_base;
    }
    
    protected abstract double salarioLiquido();
    public abstract void novoMes();
    
    public void hollerith()
    {
        System.out.println("Nome : " + nome);
        System.out.println("RG : " + rg);
        System.out.println("Salario base : " + String.format("%,.2f", salario_base));
    }
}
