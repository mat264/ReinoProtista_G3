package pkBioProto.pkReinoViviente.pkProtoctista;

public class Euglena extends Flagelados {

    private boolean hayLuz;


    public Euglena(String nombre, String habitat, boolean hayLuz) {

        super(nombre, habitat, 1);
        this.hayLuz = hayLuz;
    }


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
            // Si es luz, llamamos a nuestro método 
            this.orientarHaciaLaLuz();
        } else {
            // Si es otro estímulo 
            System.out.println(getNombre() + " reacciona a " + estimulo + " pero no se mueve.");
        }
    }


    // --- Metodos propios
    
    public void orientarHaciaLaLuz() {
        if (hayLuz) {

            System.out.println(getNombre() + " nada hacia la luz (fototaxis positiva).");
        } else {

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