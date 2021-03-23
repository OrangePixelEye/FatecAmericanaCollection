package sistema_de_pagamento;

/**
 *
 * @author Felipe Batista
 */
public class Funcionario extends Empregado 
{
    private String departamento;

    public Funcionario(String nome, int rg, int qtd, double valor_base, String departamento) 
    {
        super(nome, rg, qtd, valor_base);
        this.departamento = departamento;
    }
    
    @Override
    public void hollerith() 
    {
        super.hollerith(); 
        System.out.println("  Faltas acumuladas: " + acumulado);
        System.out.println("  Formula do salario: valor_base - ((faltas * 0.05) * valor_base) + Auxilio + vale coxinha");
    }

    @Override
    public double calculaSalario() 
    {
        //valor fixo mas se faltar tira 1/20
        // 1/20 = 0,05
        //valor base - (porcentagem q sera retirada * valor base)
        double resultado = valor_base - ((acumulado * 0.05) * valor_base);
        resultado += auxilioProcriacao();
        //vale-coxinha
        resultado += 42;
        return resultado;
    }
    
    public void registraFalta()
    {
        acumulado++;
    }
}
