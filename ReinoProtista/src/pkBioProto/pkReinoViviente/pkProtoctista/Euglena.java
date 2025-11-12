package pkBioProto.pkReinoViviente.pkProtoctista;


public class Euglena extends Flagelados {


    private boolean hayLuz;

    // Constructor de Euglena
    public Euglena(String nombre, String habitat, boolean hayLuz) {
        super(nombre, habitat, 1); 
        this.hayLuz = hayLuz;
    }

    // Metodos importantes

    @Override
    public void alimentarse() {
        String modoAlimentacion;
        
        if (hayLuz) {
            modoAlimentacion = "realiza fotosíntesis (autótrofa).";
        } else {
            modoAlimentacion = "absorbe materia orgánica (heterótrofa).";
        }
        
        System.out.println(getNombre() + " " + modoAlimentacion);
    }

    @Override
    public void reaccionarEstimulo(String estimulo) {
    
        if (estimulo.equalsIgnoreCase("luz")) {
            // Si es luz se llama al método
            this.orientarHaciaLaLuz();
        } else {
            // Si no es luz, no se mueve
            System.out.println(getNombre() + " reacciona a " + estimulo + " pero no se mueve.");
        }
    }


    // Metodos que son propios de la Euglena 
    
    public void orientarHaciaLaLuz() {
        if (hayLuz) {
            // Usamos getNombre() y System.out.println()
            System.out.println(getNombre() + " nada hacia la luz (fototaxis positiva).");
        } else {
            // Usamos getNombre() y System.out.println()
            System.out.println(getNombre() + " busca materia en la oscuridad.");
        }
    }
    
    
    public boolean isHayLuz() {
        return hayLuz;
    }

    public void setHayLuz(boolean hayLuz) {
        this.hayLuz = hayLuz;
    }
}