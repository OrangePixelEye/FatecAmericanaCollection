package sistema_de_pagamento;

/**
 *
 * @author Felipe Batista
 */
public class Professor extends Empregado
{
    private String curso;

    public Professor(String nome, int rg, int qtd, double valor_base, String curso) 
    {
        super(nome, rg, qtd, valor_base);
        this.curso = curso;
        
    }
    public void registraAulas(int qtd)
    {
        acumulado += qtd;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("  Aulas acumuladas: " + acumulado);
        System.out.println("  Formula do salario: (valor_base * acumulado) + Auxilio");
    }

    
    
    @Override
    public double calculaSalario() 
    {
        double resultado = (valor_base * acumulado) + auxilioProcriacao();
        return resultado;
    }
}
