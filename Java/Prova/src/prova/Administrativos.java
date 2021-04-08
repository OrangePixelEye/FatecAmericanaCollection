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
public class Administrativos extends Funcionarios
{
    private int faltas = 0;

    public Administrativos(String nome, int rg, double salario_base) 
    {
        super(nome, rg, salario_base);
    }
    
    @Override
    public void hollerith() 
    {
        super.hollerith(); 
        System.out.print("Faltas : " + faltas + "\n");
        System.out.print("Salario Liquido : " + String.format("%,.2f", salarioLiquido()) + "\n");
    }

    @Override
    protected double salarioLiquido() 
    {
        double salario = 0;
        salario = salario_base - (faltas * 0.033);
        if(salario <= 0 )
        {
            salario = 0;
        }
        return salario;
    }
    
    @Override
    public void novoMes() 
    {
        faltas = 0;
    }
    
    public void registrarFalta()
    {
        faltas++;
    }
}
