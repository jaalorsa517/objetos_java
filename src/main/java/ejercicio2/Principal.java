package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Bus bus = new Bus("TOE 391",3, 20);
        System.out.println("La placa es: " + bus.getPlaca());
        System.out.println("La capacidad total del bus es: " + String.valueOf(bus.getCapacidad()));
        System.out.println("El precio del pasaje es: " + String.valueOf(bus.getPreciosPasaje()));
        System.out.println("La cantidad de pasajeros actuales es de: " + String.valueOf(bus.getPasajerosActuales()));

        System.out.println("Intenta subir 2 pasajeros");
        bus.subirPasajeros(2);
        System.out.println("La cantidad de pasajeros actuales es de: " + String.valueOf(bus.getPasajerosActuales()));

        System.out.println("Intenta bajar 1 pasajeros");
        bus.bajarPasajeros(1);
        System.out.println("La cantidad de pasajeros actuales es de: " + String.valueOf(bus.getPasajerosActuales()));

        System.out.println("Intenta subir 2 pasajeros");
        bus.subirPasajeros(2);
        System.out.println("La cantidad de pasajeros actuales es de: " + String.valueOf(bus.getPasajerosActuales()));

        System.out.println("Intenta subir 2 pasajeros");
        bus.subirPasajeros(2);
        System.out.println("Bus lleno, no se pudo subir más gente");
        System.out.println("La cantidad de pasajeros actuales es de: " + String.valueOf(bus.getPasajerosActuales()));

        System.out.println("La cantidad de pasajeros totales es de: " + String.valueOf(bus.getPasajerosTotales()));
        System.out.println("El dinero acumulado del bus es: " + String.valueOf(bus.getDineroAcumulado()));
    }
}
