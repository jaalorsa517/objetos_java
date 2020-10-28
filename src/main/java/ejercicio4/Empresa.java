package ejercicio4;

public class Empresa extends Cliente {
    private String nit;
    private String representante;

    public Empresa (String nit, String nom, String r){
        super(nom);
        this.nit = nit;
        this.representante = r;
    }

    @Override
    public String obIdentificacion(){
        return this.nit;
    }

    public String obRepresentante (){
        return this.representante;
    }

    public String cambiarRepres(String repres){
        this.representante = repres;
        return this.representante;
    }
}
