package sistema_de_pagamento;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Felipe Batista
 */
public class Sistema_de_pagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Professor professor = new Professor("Roberto", 12324864, 3, 102, "Engenharia");
        Funcionario funcionario = new Funcionario("Alberto", 12321864, 1, 1200.8, "Pedagógico");
        List<Empregado> empregados_list = new ArrayList<Empregado>();
        
        //registraAulas(int)
        professor.registraAulas(4);
        //registraFalta
        funcionario.registraFalta();
        funcionario.registraFalta();
        
        empregados_list.add(professor);
        empregados_list.add(funcionario);
        
        showSalario(empregados_list);
        System.out.println("\n");
        
        //hollerith
        showHollerith(empregados_list);
        
        //zerar mês
        zerarMes(empregados_list);
        showHollerith(empregados_list);       
    }
    private static void showHollerith(List<Empregado> empregados_list)
    {
        for(Empregado em : empregados_list)
        {
            em.hollerith();
        }
    }
    
    private static void zerarMes(List<Empregado> empregados_list)
    {
        for(Empregado em : empregados_list)
        {
            em.zerarMes();
        }
    }
    
    private static void showSalario(List<Empregado> empregados_list)
    {
        for(Empregado em : empregados_list)
        {
            System.out.println("Salario de: " + em.getNome() + " :" + em.calculaSalario());
        }
    }
    
}
