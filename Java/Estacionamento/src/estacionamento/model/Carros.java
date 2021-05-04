package estacionamento.model;
public abstract class Carros 
{
    protected int id = 0;
    protected int year = 0000;
    protected float value = 0f;
    protected boolean available = true;
    protected String license_plate = "";
    private String seller = "";

    public Carros(int id, int year, float value, String license_plate) 
    {
        this.id = id;
        this.year = year;
        this.value = value;
        this.license_plate = license_plate;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public abstract boolean oferta(double valor);
    
    public boolean disponivel()
    {
        return available;
    }
    
    public void imprimeDados()
    {
        System.out.println("\n\nCod: " + id + "\nAno: " + year + "\nPlaca: " + license_plate);
        System.out.println("Disponivel: " + (available ? "disponivel" : "vendido por:  " + seller));
    }
    
    public boolean venderCarro(String vendedor, double valorVenda)
    {
        if(!oferta(valorVenda) || !available) return false;
        available = false;
        seller = vendedor;
        return true;
    }
}
