package sistema_de_pagamento;

/**
 *
 * @author Felipe Batista
 */
public abstract class Empregado 
{
    protected String nome = "";
    protected int rg = 0;
    protected int qtd_filhos = 0;
    protected double valor_base = 0;
    /*
        Funcionario -> Faltas
        Professor -> aulas
    */
    protected int acumulado = 0;

    public Empregado(String nome, int rg, int qtd, double valor_base) 
    {
        this.nome = nome;
        this.rg = rg;
        this.qtd_filhos = qtd;
        this.valor_base = valor_base;
    }

    public String getNome() 
    {
        return nome;
    }
    
    public abstract double calculaSalario();
    
    public void hollerith()
    {
        System.out.println("Dados do empregado: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Quantidade de filhos " + qtd_filhos);
        System.out.println("Salario: " + calculaSalario());
        System.out.println("  Usando o valor base: " + valor_base);
        System.out.println("  E o auxilio procriacao: " + auxilioProcriacao() + "\n\n");
    }
    public void zerarMes()
    {
        acumulado = 0;
    }
    
    protected int auxilioProcriacao()
    {
        return qtd_filhos * 100;
    }
}
