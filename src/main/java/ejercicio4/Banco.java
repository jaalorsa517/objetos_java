package ejercicio4;

public class Banco {
    private String nombre;
    private Cliente clientes [];
    private int numeroDeClientes;

    public Banco(String nom){
        this.nombre = nom;
        this.clientes = new Cliente[100];
        this.numeroDeClientes = 0;
    }

    public String obNombre(){
        return this.nombre;
    }

    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    public void adCliente (Cliente clie){
        this.clientes[this.numeroDeClientes]= clie;
        this.numeroDeClientes ++;
    }

    public int obNumClietes(){
        return this.numeroDeClientes;
    }

    public Cliente obCliente (int posicion){
        return this.clientes[posicion];
    }

    public Cliente[] obClientes(){
        return this.clientes;
    }

}
