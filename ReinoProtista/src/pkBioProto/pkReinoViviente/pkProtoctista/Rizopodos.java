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
    
    public abstract void desplazarse();
    public abstract void capturarAlimento();
    
    public String getEstructuraMovimiento() {
        return estructuraMovimiento;
    }
    
    public void setEstructuraMovimiento(String estructuraMovimiento) {
        if (estructuraMovimiento == null || estructuraMovimiento.trim().isEmpty()) {
            System.out.println("Error: La estructura de movimiento no puede estar vacía");
            return;
        }
        this.estructuraMovimiento = estructuraMovimiento;
    }
    
    public String getTipoReproduccion() {
        return tipoReproduccion;
    }
    
    public void setTipoReproduccion(String tipoReproduccion) {
        if (tipoReproduccion == null || tipoReproduccion.trim().isEmpty()) {
            System.out.println("Error: El tipo de reproducción no puede estar vacío");
            return;
        }
        this.tipoReproduccion = tipoReproduccion;
    }
}