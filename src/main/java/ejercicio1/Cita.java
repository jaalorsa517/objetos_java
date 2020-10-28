package ejercicio1;

public class Cita {
    private int numero;
    private int tipo;
    private double tarifa;
    private double valorFinal;

    public Cita(int numero, int tipo, double tarifa){
        this.numero = numero;
        this.tipo= tipo;
        this.tarifa = tarifa;
        this.valorFinal = 0.0;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getTipo(){
        String tipo = "";
        if (this.tipo == 1 || this.tipo == 2 || this.tipo == 3){
            tipo = "general";
        }
        else if (this.tipo == 4 || this.tipo == 5){
            tipo = "especialista";
        }
        return tipo;
    }

    public double getTarifa(){
        return this.tarifa;
    }

    public double calcularValorFinal(){
        String tipo = this.getTipo();
        if (tipo.equals("especialista")) {
            this.valorFinal = this.tarifa * (1+0.5);
        }
        else if (tipo.equals("general")) {
            this.valorFinal = this.tarifa -(this.tarifa * (0.5)) ;
        }
        return this.valorFinal;
    }
}
