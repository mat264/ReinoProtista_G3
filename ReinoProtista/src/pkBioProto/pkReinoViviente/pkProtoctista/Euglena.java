package pkBioProto.pkReinoViviente.pkProtoctista;

// Esta es tu clase para el R01.
// Hereda de Flagelados.
public class Euglena extends Flagelados {

    // Atributo propio para el R01 (en espanol)
    private boolean hayLuz;

    // Constructor de Euglena
    // (Este es el constructor que tu AppBioProto.java está buscando)
    public Euglena(String nombre, String habitat, boolean hayLuz) {
        // Llamo al constructor padre (Flagelados)
        super(nombre, habitat, 1);
        this.hayLuz = hayLuz;
    }

    // --- Metodos obligatorios y sobrescritos ---

    // R01: Implementacion de alimentarse
    // Corregido a 'void' para ser compatible
    @Override
    public void alimentarse() {
        String modoAlimentacion;
        
        if (hayLuz) {
            modoAlimentacion = "realiza fotosíntesis (autótrofa).";
        } else {
            modoAlimentacion = "absorbe materia orgánica (heterótrofa).";
        }
        
        // Usamos getNombre() y System.out.println()
        System.out.println(getNombre() + " " + modoAlimentacion);
    }

    // Sobrescribimos la 'accion' de SerVivo
    @Override
    public void reaccionarEstimulo(String estimulo) {
        // Comprobamos si el estímulo es la luz
        if (estimulo.equalsIgnoreCase("luz")) {
            // Si es luz, llamamos a nuestro método único
            this.orientarHaciaLaLuz();
        } else {
            // Si es otro estímulo, usamos la respuesta genérica
            System.out.println(getNombre() + " reacciona a " + estimulo + " pero no se mueve.");
        }
    }


    // --- Metodos propios de Euglena (R01) ---
    
    // Corregido a 'void'
    public void orientarHaciaLaLuz() {
        if (hayLuz) {
            // Usamos getNombre() y System.out.println()
            System.out.println(getNombre() + " nada hacia la luz (fototaxis positiva).");
        } else {
            // Usamos getNombre() y System.out.println()
            System.out.println(getNombre() + " busca materia en la oscuridad.");
        }
    }
    
    // --- Getters y Setters ---
    
    public boolean isHayLuz() {
        return hayLuz;
    }

    // (Este es el método setHayLuz que tu AppBioProto.java está buscando)
    public void setHayLuz(boolean hayLuz) {
        this.hayLuz = hayLuz;
    }
}