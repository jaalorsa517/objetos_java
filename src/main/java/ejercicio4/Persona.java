package ejercicio4;

public class Persona extends Cliente {
    private String cedula;
    private int edad;

    public Persona(String ced, String nomb, int ed){
        super(nomb);
        this.cedula = ced;
        this.edad = ed;
    }

    public String obEdad(){
        return  String.valueOf(this.edad);
    }

    public void cumplirAnyos(){
        this.edad ++;
    }

    @Override
    public String obIdentificacion() {
        return this.cedula;
    }
}
