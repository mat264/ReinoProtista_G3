package pkBioProto.pkReinoViviente.pkProtoctista;

public class Ameba extends Rizopodos {
    private String tipoMovimiento;
    private String habitad;
    
    public Ameba() {
        super();
        this.tipoMovimiento = "Pseudópodos";
        this.habitad = "Agua dulce";
    }
    
    public Ameba(String nombre, String tipoMovimientoProtozoos, String habitat, String tipoMovimiento, String habitad) {
        super(nombre, tipoMovimientoProtozoos, habitat);
        this.tipoMovimiento = (tipoMovimiento != null && !tipoMovimiento.trim().isEmpty()) 
                              ? tipoMovimiento : "Pseudópodos";
        this.habitad = (habitad != null && !habitad.trim().isEmpty()) 
                       ? habitad : "Agua dulce";
    }
    
    public Ameba(String habitad) {
        super("Ameba Proteus", "Pseudópodos", habitad != null ? habitad : "Agua dulce");
        this.tipoMovimiento = "Pseudópodos";
        this.habitad = (habitad != null && !habitad.trim().isEmpty()) 
                       ? habitad : "Agua dulce";
    }
    
    public void fagocitar() {
        System.out.println("La ameba está fagocitando alimento mediante pseudópodos");
    }
    
    public void reproducirse() {
        System.out.println("La ameba se está reproduciendo por división binaria");
    }
    
    @Override
    public void desplazarse() {
        System.out.println("La ameba se está desplazando mediante " + this.tipoMovimiento);
    }
    
    @Override
    public void capturarAlimento() {
        System.out.println("La ameba está capturando alimento extendiendo pseudópodos");
        fagocitar();
    }
    
    @Override
    public void alimentarse() {
        System.out.println("La ameba se está alimentando por fagocitosis en " + this.habitad);
    }
    
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    
    public void setTipoMovimiento(String tipoMovimiento) {
        if (tipoMovimiento == null || tipoMovimiento.trim().isEmpty()) {
            System.out.println("Error: El tipo de movimiento no puede estar vacío. Se mantiene el valor actual.");
            return;
        }
        this.tipoMovimiento = tipoMovimiento;
    }
    
    public String getHabitad() {
        return habitad;
    }
    
    public void setHabitad(String habitad) {
        if (habitad == null || habitad.trim().isEmpty()) {
            System.out.println("Error: El hábitat no puede estar vacío. Se mantiene el valor actual.");
            return;
        }
        this.habitad = habitad;
    }
}