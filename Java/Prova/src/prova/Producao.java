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
public class Producao extends Funcionarios
{
    private int horas_noturnas = 0;
    private int horas_diurnas = 0;

    public Producao(String nome, int rg, double salario_base) 
    {
        super(nome, rg, salario_base);
    }
    
    @Override
    public void hollerith() 
    {
        super.hollerith();
        System.out.print("Horas Diurnas : " + horas_diurnas + "\n");
        System.out.print("Horas Noturnas : " + horas_noturnas + "\n");
        System.out.print("Salario Liquido : " + String.format("%,.2f", salarioLiquido()) + "\n");
    }
    
    @Override
    protected double salarioLiquido() 
    {
        double salario = 0;
        salario += horas_diurnas * salario_base;
        salario += horas_noturnas * (salario_base * 1.3);
        return salario;
    }

    @Override
    public void novoMes() 
    {
        horas_noturnas = 0;
        horas_diurnas = 0;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        horas_diurnas += horas;
    }
    
    public void registrarHorasNoturnas(int horas) 
    {
        horas_noturnas += horas;
    }
}
