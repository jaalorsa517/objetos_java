package ejercicio2;

public class Bus {
    private String placa;
    private int capacidadPasajeros;
    private double preciosPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;

    public Bus(String placa, int capacidad, double pasaje){
        this.placa = placa;
        this.capacidadPasajeros = capacidad;
        this.preciosPasaje = pasaje;
        this.pasajerosActuales = 0;
        this.totalPasajeros = 0;
    }

    public String getPlaca(){
        return this.placa;
    }

    public int getCapacidad(){
        return this.capacidadPasajeros;
    }

    public double getPreciosPasaje(){
        return this.preciosPasaje;
    }

    public int getPasajerosActuales(){
        return this.pasajerosActuales;
    }

    public int getPasajerosTotales(){
        return this.totalPasajeros;
    }

    public void subirPasajeros (int pasajeros){
        if (this.pasajerosActuales < this.capacidadPasajeros){
            this.totalPasajeros += pasajeros;
            this.pasajerosActuales += pasajeros;
        }
    }

    public void bajarPasajeros (int pasajeros){
        if (this.pasajerosActuales > 0){
            this.pasajerosActuales -= pasajeros;
        }
    }

    public double getDineroAcumulado(){
        return this.totalPasajeros*this.preciosPasaje;
    }
}
