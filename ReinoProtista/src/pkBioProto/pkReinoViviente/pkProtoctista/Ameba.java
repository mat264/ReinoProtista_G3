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
        this.tipoMovimiento = tipoMovimiento;
        this.habitad = habitad;
    }
    
    public Ameba(String habitad) {
        super("Ameba Proteus", "Pseudópodos", habitad);
        this.tipoMovimiento = "Pseudópodos";
        this.habitad = habitad;
    }
    
    // Métodos específicos de Ameba
    public void fagocitar() {
        System.out.println("La ameba está fagocitando alimento mediante pseudópodos");
    }
    
    @Override
    public void reproducirse() {
        System.out.println("La ameba se está reproduciendo por división binaria");
    }
    
    // Implementación de métodos abstractos de Rizopodos
    @Override
    public void desplazarse() {
        System.out.println("La ameba se está desplazando mediante " + this.tipoMovimiento);
    }
    
    @Override
    public void capturarAlimento() {
        System.out.println("La ameba está capturando alimento extendiendo pseudópodos");
        fagocitar();
    }
    
    // Implementación de métodos abstractos de Protozoos
    @Override
    public void alimentarse() {
        System.out.println("La ameba se está alimentando por fagocitosis en " + this.habitad);
    }
    
    @Override
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    
    @Override
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    
    public String getHabitad() {
        return habitad;
    }
    
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
}