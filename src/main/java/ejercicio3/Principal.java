package ejercicio3;

public class Principal {
    public static void main(String[] args) {
        System.out.println("CUENTA AHORRO");
        Cuenta cuentaAhorro = new Cuenta(1234,"ahorro",500);
        System.out.println("Su saldo es: " + cuentaAhorro.getSaldo() + " y su saldo minimo es: " + cuentaAhorro.getSaldoMinimo());
        cuentaAhorro.consignar(200);
        System.out.println("Se consigno 200 y su nuevo saldo es: " + cuentaAhorro.getSaldo());
        System.out.println("Se intenta retirar 690");
        cuentaAhorro.retirar(690);
        System.out.println("Fondos insuficientes, se retiro lo que se pudo. Su nuevo saldo es: " + cuentaAhorro.getSaldo());
        System.out.println("Su capacidad de crédito es: " + cuentaAhorro.getCapacidadCredito() + "\n");


        System.out.println("CUENTA CREDITO");
        Cuenta cuentaCredito = new Cuenta(1235,"crédito",1000);
        System.out.println("Su saldo es: " + cuentaCredito.getSaldo() + " y su saldo minimo es: " + cuentaCredito.getSaldoMinimo());
        cuentaCredito.consignar(500);
        System.out.println("Se consigno 500 y su nuevo saldo es: " + cuentaCredito.getSaldo());
        System.out.println("Se intenta retirar 1500");
        cuentaCredito.retirar(1500);
        System.out.println("Fondos insuficientes, se retiro lo que se pudo. Su nuevo saldo es: " + cuentaCredito.getSaldo());
        System.out.println("Su capacidad de crédito es: " + cuentaCredito.getCapacidadCredito());
    }
}
