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
public class AlunosRegulares extends Alunos {
    private double nota1 = 0;
    private double nota2 = 0;
    private int ra;
    private int faltas_abonadas;

    public AlunosRegulares(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }
    
    @Override
    public boolean aprovado() {
        if((media()>= 6.0) && (frequencia() >= 75.0))
            return true;
        return false;
    }
    
    @Override
    public void historico()
    {
        super.historico();
        System.out.println("Prova 1 : " + nota1);
        System.out.println("Prova 2 : " + nota2);
        System.out.println("Media : " + media());
    }
    
    public void registrarNotas(double nota1, double nota2)
    {
        if( validarNota(nota1) )
            this.nota1 = nota1;
        else
            System.out.println("nota 1 invalida");
        if( validarNota(nota2) )
            this.nota2 = nota2;
        else
            System.out.println("nota 2 invalida");
    }
    
    private boolean validarNota(double nota)
    {
        if(nota >= 0 && nota <= 10 )
            return true;
        return false;
    }
    
    public double media()
    {
        return ((nota1 + nota2) / 2);
    }
    
    public void abonarFaltas(int qtd)
    {
        faltas_abonadas += qtd;
        
        if(faltas_abonadas > 5)
            faltas_abonadas = 5;
        else
            faltas -= faltas_abonadas;
    }
}
