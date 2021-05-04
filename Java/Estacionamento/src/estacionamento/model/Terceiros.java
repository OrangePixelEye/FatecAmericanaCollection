package estacionamento.model;

/**
 *
 * @author Felipe Batista
 */
public class Terceiros extends Carros
{
    private String owner = "";

    public Terceiros(int id, int year, float value, String license_plate, String owner)
    {
        super(id, year, value, license_plate);
        this.owner = owner;
    }

    @Override
    public void imprimeDados()
    {
        super.imprimeDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Dono: " + owner);
        System.out.println("Valor desejado " + value);
    }

    @Override
    public boolean oferta(double valor) 
    {
        return (valor >= value * 1.05);
    }
}
