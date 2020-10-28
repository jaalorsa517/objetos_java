package ejercicio3;

public class Cuenta {
    private String numero;
    private String tipo;
    private double saldoActual;
    private double saldoMinimo;

    public Cuenta(int numero, String tipo, double valorInicial){
        this.numero = String.valueOf(numero);
        this.tipo= tipo;
        this.saldoActual = valorInicial;
        this.saldoMinimo = valorInicial * 0.1;
    }

    public void consignar(double monto){
        this.saldoActual += monto;
    }

    public void retirar (double monto){
        if (this.saldoActual - this.saldoMinimo >= monto){
            this.saldoActual -= monto;
        }
        else{
            this.saldoActual -= this.saldoActual - this.saldoMinimo;
        }
    }

    public double getSaldo(){
        return this.saldoActual;
    }

    public double getSaldoMinimo(){
        return this.saldoMinimo;
    }

    public double getCapacidadCredito(){
        double capacidad = 0;
        if (this.tipo.equals("ahorro")){
            capacidad = this.saldoActual - this.saldoMinimo;
        }
        else if (this.tipo.equals("crédito")){
            capacidad = this.saldoActual*3;
        }
        return capacidad;
    }
}
