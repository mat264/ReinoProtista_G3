package pkBioProto.pkReinoViviente.pkProtoctista;

public class PlasmodiumVivax extends Esporozoos{
    private String enfermedad;
    private String nombreCientifico;
    private String hospedador;

    public PlasmodiumVivax() {
        super();
        this.nombreCientifico = ("Plasmodium Vivax");
        this.enfermedad = "Malaria";
        this.hospedador = "Humano";
    }

    public PlasmodiumVivax(String nombre, String tipoMovimiento, String habitat, String enfermedad, String nombreCientifico, String hospedador) {
        super(nombre, tipoMovimiento, habitat);
        this.enfermedad = enfermedad;
        this.nombreCientifico = nombreCientifico;
        this.hospedador = hospedador;
    }

    public PlasmodiumVivax(String habitat) {
        super("Plasmodium Vivax", "Sporozoos", "Dentro del cuerpo humano");
        this.nombreCientifico = ("Plasmodium Vivax");
        this.enfermedad = "Malaria";
        this.hospedador = "Humano";
    }

    public void infectarHumano(){
        System.out.println("El Plasmodium Vivax esta infectando a un humano");
    }

    public void reproducirseEnMosquito(){
        System.out.println("El Plasmodium Vivax se esta reproduciendo en el mosquito Anopheles");
    }

    @Override
    public void alimentarse(){
        System.out.println("El Plasmodium Vivax se esta alimentando dentro del hospedador: " + this.hospedador);
    }

    @Override
    public void reproducirse(){
        System.out.println("El Plasmodium Vivax se esta reproduciendo asexualmente dentro del hospedador: " + this.hospedador);
    }

    @Override
    public void desplazarse(){
        System.out.println("El Plasmodium Vivax se esta desplazando mediante esporozoitos");
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getHospedador() {
        return hospedador;
    }

    public void setHospedador(String hospedador) {
        this.hospedador = hospedador;
    }
    
}
