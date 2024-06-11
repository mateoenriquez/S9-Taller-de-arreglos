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

    //Metodos

    public String darPlacaCarro(int pPosicion)
    {
        String respuesta = "";
        if (estaOcupado(pPosicion))
        {
            respuesta = "Placa: " + puestos[pPosicion].darCarro().darPlaca();
        }
        else
        {
            respuesta = "No hay un carro en esta posicion";
        }

        return respuesta;
    }

    public int entrarCarro(String pPlaca)
    {
        int resultado = 0;
        if(!abierto)
        {
            resultado = PARQUEADERO_CERRADO;
        }
        else
        {
            //Buscar un puesto libre para el carro y agregarlo
            int numPuestoCarro = buscarPuestoCaroo(pPlaca.toUpperCase());
            if (numPuestoCarro != CARRO_NO_EXISTE)
            {
                resultado = CARRO_NO_EXISTE;
            }

            //Busco un puesto libre para el carro y agregarlo
            resultado = buscarPuestoLibre();
            if (resultado != NO_HAY_PUESTO)
            {
                Carro carroEntrando = new Carro(pPlaca, horaActual);
                puestos[resultado].parquearCarro(carroEntrando);
            }
        }

        return resultado;
    }

    public int sacarCarro(String pPlaca)
    {
        int resultado = 0;
        if (!abierto)
        {
            resultado = PARQUEADERO_CERRADO;
        }
        else
        {
            int numPuesto = buscarPuestoCarro(pPlaca.toUpperCase());
            if (numPuesto == CARRO_NO_EXISTE)
            {
                resultado = CARRO_NO_EXISTE;
            }
            else
            {
                Carro carro = puestos[numPuesto].darCarro();
                int nHoras = carro.darTiempoEnParqueadero(horaActual);
                int porPagar = nHoras * tarifa;
                caja = caja + porPagar;
                puestos[numPuesto].sacarCarro();
                resultado = porPagar;
            }
        }

        return resultado;
    }

    public int darMontoCaja()
    {
        return caja;
    }

    public int calcularPuestosLibres()
    {
        int puestosLibres = 0;
        for (Puesto puesto : puestos)
        {
            if (!puesto.estaOcupado())
            {
                puestosLibres = puestosLibres + 1;
            }
        }
        return puestosLibres;
    }

    public void cambiarTarifca(int pTarifa)
    {
        tarifa = pTarifa;
    }

    private int buscarPuestoLibre()
    {
        int puesto = NO_HAY_PUESTO;
    }



}
