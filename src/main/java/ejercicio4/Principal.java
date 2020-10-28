package ejercicio4;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco("Principal");
        for (int i = 0; i < 50; i++){
            if (i%2==0){
                banco.adCliente(new Persona("246"+String.valueOf(i),
                        "Peronin" + String.valueOf(i),
                        new Random().nextInt(60)));
            }
            else{
                banco.adCliente(new Empresa("135" + String.valueOf(i),
                        "Empresa"+String.valueOf(i),
                        "Luffy"+ String.valueOf(i)));
            }
        }
        /************************************************************/
        System.out.println("NOMBRE DE LOS CLIENTES DEL BANCO NACIONAL");
        for (int i = 0; i < banco.obNumClietes(); i++) {
            System.out.println("Cliente: " + banco.obCliente(i).obNombre());
        }

        /************************************************************/
        System.out.println("TODOS LOS NOMBRES Y CEDULAS DE LAS PERSONAS CLIENTES DEL BANCO");
        for (int i = 0; i < banco.obNumClietes();i+=2) {
            System.out.println("Persona: " + banco.obCliente(i).obNombre()
                    + " CEDULA: " + banco.obCliente(i).obIdentificacion());
        }

        /************************************************************/
        System.out.println("EL NOMBRE Y REPRESENTANTE DE DE CADA EMPRESA");
        for (int i = 1; i < banco.obNumClietes();i+=2){
            System.out.println("Empresa: " + banco.obCliente(i).obNombre()
                    + " NIT: " + banco.obCliente(i).obIdentificacion() );
        }

        /************************************************************/
        System.out.println("NOMBRES DE LOS CLIENTES MENORES DE EDAD");
        for (int i = 0; i < banco.obNumClietes();i+=2) {
            Persona persona = (Persona) banco.obCliente(i);
            if (Integer.parseInt(persona.obEdad()) <18){
                System.out.println("Persona: " + banco.obCliente(i).obNombre() );
            }
        }

        /************************************************************/
        System.out.println("EL NOMBRE Y EDAD DEL CLIENTE MAS JOVEN");
        Persona persona = (Persona) banco.obCliente(0);
        int joven= Integer.parseInt(persona.obEdad());
        String nombre = banco.obCliente(0).obNombre();
        for (int i = 2; i < banco.obNumClietes();i+=2) {
            if ( Integer.parseInt((((Persona) banco.obCliente(i)).obEdad())) < joven){
                joven= Integer.parseInt((((Persona) banco.obCliente(i)).obEdad()));
                nombre = banco.obCliente(i).obNombre();
            }
        }
        System.out.println("La persona mas joven es: " + nombre + " con " + joven + "años.\n");

        /************************************************************/
        System.out.println("EL NOMBRE Y EDAD DEL CLIENTE MAS VIEJO");
        persona = (Persona) banco.obCliente(0);
        joven= Integer.parseInt(persona.obEdad());
        nombre = banco.obCliente(0).obNombre();
        for (int i = 2; i < banco.obNumClietes();i+=2) {
            if ( Integer.parseInt((((Persona) banco.obCliente(i)).obEdad())) > joven){
                joven= Integer.parseInt((((Persona) banco.obCliente(i)).obEdad()));
                nombre = banco.obCliente(i).obNombre();
            }
        }
        System.out.println("La persona mas vieja es: " + nombre + " con " + joven + "años.\n");
    }
}
