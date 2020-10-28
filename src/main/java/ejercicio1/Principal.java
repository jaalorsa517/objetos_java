package ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int numero = 0;
        int tipo = 0;
        double tarifa = 0.0;
        System.out.println("Crear tu cita");
        System.out.println("Ingrese el número de la cita: ");
        numero = ingreso.nextInt();
        System.out.println("Ingrese el tipo de cita. 1,2,3,4,5");
        tipo = ingreso.nextInt();
        System.out.println("Ingrese la tarifa");
        tarifa = ingreso.nextDouble();
        Cita cita = new Cita(numero,tipo,tarifa);
        System.out.println("El numero de la cita es:" + String.valueOf(cita.getNumero()));
        System.out.println("Esta cita es de tipo " + cita.getTipo());
        System.out.println("Su tarifa normal es: " +cita.getTarifa()
                +", pero por se de tipo " + cita.getTipo()+", queda con el valor final de "
                + cita.calcularValorFinal());
    }
}
