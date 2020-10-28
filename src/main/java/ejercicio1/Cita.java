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
        switch (this.tipo){
            case 1 | 2 | 3:
                tipo = "general";
                break;
            case 4 | 5:
                tipo = "especialista";
                break;
        }
        return tipo;
    }

    public double getTarifa(){
        return this.tarifa;
    }

    public double calcularValorFinal(){
        String tipo = this.getTipo();
        switch (tipo){
            case "especialista":
                this.valorFinal = this.tarifa * (1+0.5);
                break;
            case "general":
                this.valorFinal = this.tarifa -(this.tarifa * (0.5)) ;
                break;
        }
        return this.valorFinal;
    }
}
