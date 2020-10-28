package ejercicio4;

public abstract class Cliente {
    private String  nombre;

    Cliente(String nombre){
        this.nombre = nombre;
    }

    public String obNombre(){
        return this.nombre;
    }

    public abstract String obIdentificacion();
}
