package estacionamento.controller;

import estacionamento.model.Carros;

/**
 *
 * @author Felipe Batista
 */
public class ListaCarros
{
    private Carros[] carros;
    private int usando = 0;

    public ListaCarros(int capacidade)
    {
        carros = new Carros[capacidade];
    }
    
    private Carros getCarro(int cod)
    {
        for(Carros carro : carros)
        {
            if(carro != null)
                if(carro.getId() == cod) return carro;
        }
        return null;
    }
    
    public boolean add(Carros car)
    {
        if(getCarro(car.getId()) != null || usando > carros.length) return false;
        carros[usando] = car;
        usando++;
        return true;
    }
    
    public boolean disponivel(int cod)
    {
        Carros car = getCarro(cod);
        return (car != null ? car.disponivel() : false);
    }
    
    public void imprimeDados(int cod)
    {
        Carros car = getCarro(cod);
        if(car != null)
        {
            car.imprimeDados();
            return;
        }
        System.out.println("Car " + cod + " not found");
    }
    
    public boolean oferta(int cod, double valor)
    {
        Carros car = getCarro(cod);
        return (car != null ? car.oferta(valor) : false);
    }
    
    public boolean venderCarro(int cod, String vendedor, double valorVenda)
    {
        Carros car = getCarro(cod);
        return (car != null ? car.venderCarro(vendedor, valorVenda) : false);
    }
    
    public void listagem (String title, boolean all, boolean disp)
    {
        System.out.print("\n" + title + "\n");
        if(all)
        {
            //foreach
            for(Carros carro : carros) carro.imprimeDados();
            return;
        }
        for(Carros carro : carros)
        {
            if(carro != null)
                if(carro.disponivel() == disp) carro.imprimeDados();
        }
    }
}
