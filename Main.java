import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar carro");
            System.out.println("2. Tiempo promedio de carros");
            System.out.println("3. Carro con más horas");
            System.out.println("4. Hay carro más de 8 horas");
            System.out.println("5. Carros más de 3 horas");
            System.out.println("6. Hay carros con placa igual");
            System.out.println("7. Contar carros con placa PB");
            System.out.println("8. Hay carro con 24 horas");
            System.out.println("9. Metodo 1");
            System.out.println("10. Desocupar parqueadero");
            System.out.println("11. Metodo 2");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese placa del carro:");
                    String placa = scanner.next();
                    System.out.println("Ingrese horas parqueado:");
                    int horas = scanner.nextInt();
                    parqueadero.agregarCarro(new Carro(placa, horas));
                    break;
                case 2:
                    System.out.println("Tiempo promedio de carros: " + parqueadero.darTiempoPromedio());
                    break;
                case 3:
                    Carro carro = parqueadero.carroConMasHoras();
                    if (carro != null) {
                        System.out.println("Carro con más horas: " + carro.getPlaca() + " con " + carro.getHorasParqueado() + " horas");
                    } else {
                        System.out.println("No hay carros en el parqueadero");
                    }
                    break;
                case 4:
                    System.out.println("¿Hay carro más de 8 horas?: " + (parqueadero.hayCarroMasDeOchoHoras() ? "Sí" : "No"));
                    break;
                case 5:
                    System.out.println("Carros más de 3 horas:");
                    for (Carro c : parqueadero.darCarrosMasDeTresHorasParqueados()) {
                        System.out.println(c.getPlaca() + " con " + c.getHorasParqueado() + " horas");
                    }
                    break;
                case 6:
                    System.out.println("¿Hay carros con placa igual?: " + (parqueadero.hayCarrosPlacaIgual() ? "Sí" : "No"));
                    break;
                case 7:
                    System.out.println("Carros con placa PB: " + parqueadero.contarCarrosQueComienzanConPlacaPB());
                    break;
                case 8:
                    System.out.println("¿Hay carro con 24 horas?: " + (parqueadero.hayCarroCon24Horas() ? "Sí" : "No"));
                    break;
                case 9:
                    System.out.println(parqueadero.metodo1());
                    break;
                case 10:
                    System.out.println("Cantidad de carros sacados: " + parqueadero.desocuparParqueadero());
                    break;
                case 11:
                    System.out.println(parqueadero.metodo2());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
