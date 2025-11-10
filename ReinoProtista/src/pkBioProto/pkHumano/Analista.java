package pkBioProto.pkHumano;

public class Analista extends Persona {

    private String nombreUsuario;
    private String contraseña;

    public Analista(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    


    

    
}
