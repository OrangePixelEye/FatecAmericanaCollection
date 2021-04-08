/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Batista
 */
public class Simulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        AlunosRegulares ar = new AlunosRegulares("Astolfo", 1231241);
        AlunosAssistentes aa = new AlunosAssistentes("Gerusberdo", 31241242);
        List<Alunos> alunos_list = new ArrayList<Alunos>();
        Alunos al = ar;
        al.historico();
        ar.registrarNotas(5, 9);
        
        alunos_list.add(ar);
        alunos_list.add(aa);
        
        historico(alunos_list);
        aa.receberResumo();
        historico(alunos_list);
        
        ar.registrarFaltas(8);
        historico(alunos_list);
        ar.abonarFaltas(5);
        historico(alunos_list);
    }
    
    private static void historico(List<Alunos> alunos_list)
    {
        for(Alunos em : alunos_list)
        {
            em.historico();
            System.out.println("\n");
        }
    }
}
