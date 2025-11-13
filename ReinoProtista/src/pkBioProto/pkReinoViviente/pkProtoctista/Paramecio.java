package pkBioProto.pkReinoViviente.pkProtoctista;
public class Paramecio extends Ciliados {
    // Atributos privados
    private String nombre;
    private double energia;
    
    // Constructor por defecto
    public Paramecio() {
        super();
        this.nombre = "Paramecio";
        this.energia = 50.0;
    }
    
    // Constructor con nombre
    public Paramecio(String nombre) {
        super(nombre);
        this.nombre = nombre;
        this.energia = 50.0;
    }
    
    // Constructor con parámetros
    public Paramecio(String nombre, double energia) {
        super(nombre);
        this.nombre = nombre;
        this.energia = energia;
    }
    
    // Método para alimentarse
    public void alimentarse() {
        energia += 10.0;
        System.out.println(nombre + " se está alimentando. Energía aumentada a: " + energia);
    }
    
    // Método para reproducirse
    public void reproducirse() {
        if (energia >= 50.0) {
            energia -= 30.0;
            System.out.println(nombre + " se está reproduciendo por fisión binaria.");
            System.out.println("Energía restante: " + energia);
        } else {
            System.out.println(nombre + " no tiene suficiente energía para reproducirse.");
            System.out.println("Se necesitan al menos 50 de energía. Energía actual: " + energia);
        }
    }
    
    // Método para mostrar el estado
    public void mostrarEstado() {
        
        System.out.println("Estado del Paramecio\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Tiene cilios: " + (isTieneCilio() ? "Sí" : "No"));
     
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getEnergia() {
        return energia;
    }
    
    public void setEnergia(double energia) {
        this.energia = energia;
    }
    
    @Override
    public String toString() {
        return "Paramecio{" +
               "nombre='" + nombre + '\'' +
               ", energia=" + energia +
               ", tieneCilio=" + isTieneCilio() +
               '}';
    }
}