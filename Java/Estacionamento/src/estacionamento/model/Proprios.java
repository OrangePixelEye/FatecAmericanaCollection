package estacionamento.model;

import java.util.Calendar;

/**
 *
 * @author Felipe Batista
 */
public class Proprios extends Carros
{
    private Calendar date_buy = Calendar.getInstance();

    public Proprios(int id, int year, float value, String license_plate, Calendar date) 
    {
        super(id, year, value, license_plate);
        date_buy = date;
    }

    @Override
    public void imprimeDados()
    {
        super.imprimeDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Valor de compra " + value);
    }

    @Override
    public boolean oferta(double valor)
    {
        return (valor >= value * 1.1 ); 
    }
}
