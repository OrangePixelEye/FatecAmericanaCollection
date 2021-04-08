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
public class Vendedores extends Funcionarios
{
    private double total_vendas = 0;

    public Vendedores(String nome, int rg, double salario_base) 
    {
        super(nome, rg, salario_base);
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.print("Total Vendas : " + total_vendas + "\n");
        System.out.print("Salario Liquido : " + String.format("%,.2f", salarioLiquido()) + "\n");
    }
    
    @Override
    protected double salarioLiquido() 
    {
        return (salario_base + (total_vendas * 0.03));
    }

    @Override
    public void novoMes() 
    {
        total_vendas = 0;
    }
    
    public void registrarVenda(double valor)
    {
        total_vendas += valor;
    } 
}
