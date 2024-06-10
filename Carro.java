public class Carro
{
    //Atributos

    //PLaca del carro
    private String placa;

    //Hora dellegada del carro al parqueadero: valor entre 6 y 20
    private int horaLlegada;

    //Constructores

    public Carro (String pPlaca, int pHora)
    {
        placa = pPlaca;
        horaLlegada = pHora;
    }

    //Metodos

    public String darPlaca()
    {
        return placa;
    }

    public int darHoraLLegada()
    {
        return horaLlegada;
    }

    public boolean tienePlaca(String pPlaca)
    {
        boolean tienePLaca = false;

        if (placa.equalsIgnoreCase(pPlaca))
        {
            tienePLaca = true;
        }
        else
        {
            tienePLaca = false;
        }
        return tienePLaca;
    }
    public int darTiempoEnParqueadero(int pHoraSalida)
    {
        int tiempoParqueadero = pHoraSalida - horaLlegada + 1;
        return tiempoParqueadero;
    }

}
