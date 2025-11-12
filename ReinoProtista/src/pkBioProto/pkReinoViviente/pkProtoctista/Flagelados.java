package pkBioProto.pkReinoViviente.pkProtoctista;

// Clase abstracta, 'padre' de Euglena
// Hereda de Protozoos (como Esporozoos y Ciliados)
public abstract class Flagelados extends Protozoos {

    // Atributo que comparten todos los flagelados
    private int cantidadFlagelos;

    // --- ESTE ES EL CONSTRUCTOR QUE FALTA ---
    // (String nombre, String habitat, int cantidadFlagelos)
    // Coincide con la llamada super(String, String, int) de Euglena
    public Flagelados(String nombre, String habitat, int cantidadFlagelos) {
        // 'super' llama al constructor de Protozoos
        super(nombre, "Flagelado", habitat); 
        this.cantidadFlagelos = cantidadFlagelos;
    }
    // ------------------------------------------

    // --- Metodos que heredan los hijos (Euglena) ---

    // Corregido a 'void' para ser compatible con SerVivo
    @Override
    public void desplazarse() {
        // Usamos getNombre() porque 'nombre' es private en SerVivo
        System.out.println(getNombre() + " se desplaza agitando su(s) " + cantidadFlagelos + " flagelo(s).");
    }

    // Corregido a 'void' para ser compatible con SerVivo
    @Override
    public void reproducirse() {
        // Usamos getNombre()
        System.out.println(getNombre() + " se reproduce por fisión binaria longitudinal.");
    }

    // Getter
    public int getCantidadFlagelos() {
        return cantidadFlagelos;
    }
    
    // Dejamos que Euglena implemente 'alimentarse()' 
    // y 'reaccionarEstimulo()'
}