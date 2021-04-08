/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Batista
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        List<Funcionarios> func_list = new ArrayList<Funcionarios>();
        
        Vendedores v = new Vendedores("Astolfo", 12123, 1300);
        Producao p = new Producao("Rodosberto", 123122, 25);
        Administrativos a = new Administrativos("Aeronauta", 123122, 2100);
        
        func_list.add(v);
        func_list.add(p);
        func_list.add(a);
        
        System.out.println("Testes dos metodos unicos");
        
        v.registrarVenda(400.2);
        
        p.registrarHorasNoturnas(5);
        p.registrarHorasDiurnas(12);
        
        a.registrarFalta();
        a.registrarFalta();
        
        hollerith(func_list);
        
        System.out.println("Testes de zerar mês");
        
        a.novoMes();
        v.novoMes();
        p.novoMes();
        
        hollerith(func_list);
    }
    
    private static void hollerith(List<Funcionarios> func_list)
    {
        for(Funcionarios f : func_list)
        {
            f.hollerith();
            System.out.println("\n");
        }
    }
    
}
