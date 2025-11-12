package pkBioProto.pkReinoViviente.pkProtoctista;

public abstract class Rizopodos extends Protozoos {
    private String estructuraMovimiento;
    private String tipoReproduccion;
    
    public Rizopodos() {
        super();
        this.estructuraMovimiento = "Pseudópodos";
        this.tipoReproduccion = "División binaria";
    }
    
    public Rizopodos(String nombre, String tipoMovimiento, String habitat) {
        super(nombre, tipoMovimiento, habitat);
        this.estructuraMovimiento = "Pseudópodos";
        this.tipoReproduccion = "División binaria";
    }
    
    // Métodos abstractos que debe implementar Ameba
    @Override
    public abstract void desplazarse();
    public abstract void capturarAlimento();
    
    public String getEstructuraMovimiento() {
        return estructuraMovimiento;
    }
    
    public void setEstructuraMovimiento(String estructuraMovimiento) {
        this.estructuraMovimiento = estructuraMovimiento;
    }
    
    public String getTipoReproduccion() {
        return tipoReproduccion;
    }
    
    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }
}