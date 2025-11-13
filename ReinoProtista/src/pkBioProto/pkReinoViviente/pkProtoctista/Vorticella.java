package pkBioProto.pkReinoViviente.pkProtoctista;

public class Vorticella extends Ciliados {
    private String forma;
    private String metodoAlimentacion;

   
    public Vorticella(String nombre, String habitat){
        super(nombre);
        this.forma="campana invertida";
        this.metodoAlimentacion="filtracion";
    }

    public Vorticella(String nombre){
        super(nombre);
        this.forma="campana invertida";
        this.metodoAlimentacion="Filtracion";
    }

    public void capturarAlimento() {
        System.out.println(getNombre() + " está capturando alimento con sus cilios.");
    }

    public void comerAbsorver(boolean alimentar){
        if(alimentar){
            capturarAlimento();
            System.out.println("La Vorticella ha absorbido algas. Ahora está llena y contenta.");
        } else {
            System.out.println("La Vorticella sigue con hambre");
        }
    }

    

     public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getMetodoAlimentacion() {
        return metodoAlimentacion;
    }

    public void setMetodoAlimentacion(String metodoAlimentacion) {
        this.metodoAlimentacion = metodoAlimentacion;
    }

    
}

