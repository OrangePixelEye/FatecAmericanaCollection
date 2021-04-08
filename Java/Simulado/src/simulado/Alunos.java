/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado;

/**
 *
 * @author Felipe Batista
 */
public abstract class Alunos {
    private String nome = "";
    protected int faltas = 0;

    public Alunos(String nome)
    {
        this.nome = nome;
    }

    public void registrarFaltas(int qtd)
    {
        faltas += qtd;
    }
    
    public double frequencia()
    {
        if(faltas == 0)
            return 100;
        return (60 - faltas) * 100 / faltas;
    }
    
    public abstract boolean aprovado();
    
    public void historico()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Faltas: " + faltas);
        System.out.println("Aprovado : " + aprovado());
    }
    
}
