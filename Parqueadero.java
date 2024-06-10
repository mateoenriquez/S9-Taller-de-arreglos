public class Parqueadero
{
    //Constantes

    //Numero de puestos en el parqueadero
    public static final int TAMANO = 40;

    //Cuando el parqueadero esta lleno
    public static final int NO_HAY_PUESTO = -1;

    //Cuando el parqueadero esta cerrado
    public static final int PARQUEADERO_CERRADO = -2;

    //Cuando el carro que se busca no esta dentro del parqueadero
    public static final int CARRO_NO_EXISTE = -3;

    //Hora a la que abre el parqueadero
    public static final int HORA_INICIAL = 6;

    //Hora de cierre del parqueadero
    public static final int HORA_CIERRE = 20;

    //La tarifa inicial del parqueadero
    public static final int TARIFA_INICIAL = 1200;

    //Atributos

    private Puesto puestos[];

    private int tarifa;

    private int caja;

    private int horaActual;

    private boolean abierto;

    //Constructores

    public Parqueadero()
    {
        horaActual = HORA_INICIAL;
        abierto = true;
        tarifa = TARIFA_INICIAL;
        caja = 0;
        puestos = new Puesto[TAMANO];
        for (int i = 0; i < TAMANO; i++)
        {
            puestos[i] = new Puesto(i);
        }
    }

    public String darPlacaCarro(int pPosicion)
    {
        String respuesta = "";
        if (estaOcupado())
    }



}
