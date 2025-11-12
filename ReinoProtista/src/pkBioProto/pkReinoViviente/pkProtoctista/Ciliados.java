package pkBioProto.pkReinoViviente.pkProtoctista;
public abstract class Ciliados extends Protozoos{
    // Atributo privado
    private boolean tieneCilio;
    
    // Constructor sin parámetros
    public Ciliados() {
        super();
        this.tieneCilio = true;
    }
    
    // Constructor con parámetros
    public Ciliados(String nombre) {
        super(nombre, "Movimiento por cilios", "Agua");
        this.tieneCilio = true;
    }
    
    // Constructor con más parámetros
    public Ciliados(String nombre, String tipoMovimiento, String habitat) {
        super(nombre, tipoMovimiento, habitat);
        this.tieneCilio = true;
    }
    
    // Método público
    public void moverCilios() {
        if (tieneCilio) {
            System.out.println("Los cilios se están moviendo de forma coordinada");
        } else {
            System.out.println("No tiene cilios para moverse");
        }
    }
    
    // Getter y Setter
    public boolean isTieneCilio() {
        return tieneCilio;
    }
    
    public void setTieneCilio(boolean tieneCilio) {
        this.tieneCilio = tieneCilio;
    }
}

