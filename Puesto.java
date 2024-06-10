public class Puesto
{
    //Atributos

    private Carro carro;

    private int numeroPuestos;

    //Constructores

    public Puesto(int pPuesto)
    {
        carro = null;
        numeroPuestos = pPuesto;
    }

    //Metodos

    public Carro darCarro()
    {
        return carro;
    }
    public boolean estaOcupado()
    {
        boolean ocupado = carro != null;
        return ocupado;
    }

    public void parquearCarro(Carro pCarro)
    {
        carro = pCarro;
    }

    public void sacarCarro()
    {
        carro = null;
    }

    public int darNumeroPuesto()
    {
        return numeroPuestos;
    }

    public boolean tieneCarroConPlaca(String pPlaca)
    {
        boolean tieneCarro = true;

        if (carro == null)
        {
            tieneCarro = false;
        } else if (carro.tienePlaca(pPlaca))
        {
         tieneCarro = true;
        }
        else
        {
            tieneCarro = false;
        }

        return tieneCarro;
    }


}
