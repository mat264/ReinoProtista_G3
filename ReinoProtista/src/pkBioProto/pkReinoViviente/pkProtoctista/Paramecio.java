package pkBioProto.pkReinoViviente.pkProtoctista;

public class Paramecio extends Ciliados{
    // Atributos
    private String nombre;
    private double energia;
    private int cantidadCilios;

    // Constructor
    public Paramecio(String nombre, int cantidadCilios) {
        this.nombre = nombre;
        this.cantidadCilios = cantidadCilios;
        this.energia = 100.0;
    }

    // Métodos
    public void mover() {
        System.out.println(nombre + " se mueve usando sus cilios.");
        energia -= 5;
    }

    public void alimentarse() {
        System.out.println(nombre + " se alimenta de bacterias.");
        energia += 10;
    }

    public void reproducirse() {
        System.out.println(nombre + " se reproduce por fisión binaria.");
    }

    public void mostrarEstado() {
        System.out.println("Paramecio: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Cilios: " + cantidadCilios);
    }
}
