/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import estacionamento.controller.ListaCarros;
import estacionamento.model.*;
import java.util.Calendar;
/**
 *
 * @author Felipe Batista
 */
public class Estacionamento {

    /**     
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ListaCarros lista = new ListaCarros(2);
        
        //add car
        lista.add(new Terceiros(4, 1986, 19050.9f, "aaaab", "Sr. Cleison"));
        lista.add(new Proprios(14, 1982, 12000.1f, "babab", randomDate(1984)));
        
        lista.listagem("Carros adicionados", true, false);
        
        lista.venderCarro(4, "Robson", 80000.0f);
        lista.venderCarro(14, "Robson", 2f);
        
        lista.listagem("Carros vendidos", false, false);
        
        System.out.println("\n\nCarro 14 disponivel :" + lista.disponivel(14));
        System.out.println("Oferta :" + lista.oferta(14,2));
        System.out.print("Carro Proprio: ");
        lista.imprimeDados(14);
        
        lista.venderCarro(14, "Cleiton", 150000);
        lista.listagem("Carros disponiveis:", false, true);
        
        lista.listagem("\n\nTodos os carros", true, true);
    }
    
    private static Calendar randomDate(int year)
    {
        Calendar date = Calendar.getInstance();
        
        int generated_year = (int)Math.floor(Math.random()*(date.get(Calendar.YEAR)- year +1) + year);
        int generated_month = (int)Math.floor(Math.random()*(12- 1 +1) + 1);
        int generated_day = (int)Math.floor(Math.random()*(29- 1 +1) + 1);
        
        date.set(generated_year, generated_month, generated_day);
        
        return date;
    }
}
