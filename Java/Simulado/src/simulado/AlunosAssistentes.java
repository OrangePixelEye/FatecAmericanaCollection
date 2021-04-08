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
public class AlunosAssistentes extends Alunos{
    private int rg;
    private boolean entregou_resumo = false;

    public AlunosAssistentes(String nome, int rg) {
        super(nome);
        this.rg = rg;
    }
    
    @Override
    public boolean aprovado() 
    {
        if(frequencia() > 75.0 && entregou_resumo)
            return true;
        return false;
    }
    
    @Override
    public void historico()
    {
        super.historico();
        System.out.println("Entegou resumo : " + entregou_resumo);
        System.out.println("rg : " + rg);
    }
    
    public void receberResumo()
    {
        entregou_resumo = true;
    }
}
