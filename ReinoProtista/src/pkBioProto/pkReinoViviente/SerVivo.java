package pkBioProto.pkReinoViviente;
public abstract class SerVivo {
    private boolean estaVivo;
    private String nombre;

    public SerVivo() {
        //this.estaVivo=true;
        this.setEstaVivo(true);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}