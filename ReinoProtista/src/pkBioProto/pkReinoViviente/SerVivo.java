package pkBioProto.pkReinoViviente;
public abstract class SerVivo {
    private boolean estaVivo;
    private String nombre;

    private String tipoMovimiento;
    private String habitat;

    public SerVivo(){
        this.estaVivo = true ;
    }

    public SerVivo(String nombre, String tipoMovimiento, String habitat) {
        this.estaVivo = true;
        this.nombre = nombre;
        this.tipoMovimiento = tipoMovimiento;
        this.habitat = habitat;
    }

    public void reproducirse(){
        System.out.println("El ser vivo se esta reproduciendo");
    }
    public void desplazarse(){
        System.out.println("El ser vivo se esta desplazando");
    }
    public void reaccionarEstimulo(String estimulo){
        System.out.println("El ser vivo esta reaccionando al estimulo: " + estimulo);
    }
    public void alimentarse(){
        System.out.println("El ser vivo se esta alimentando");
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo de movimiento: " + this.tipoMovimiento);
        System.out.println("Habitat: " + this.habitat);
    }


    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
}

