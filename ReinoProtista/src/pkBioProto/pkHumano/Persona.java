package pkBioProto.pkHumano;

public abstract class Persona {
    private String cedula;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {    
        setNombre(nombre);
        setApellido(apellido);
    }
    public Persona(String cedula, String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
        setCedula(cedula);
    }
    public boolean validarCedula(String cedula) {
    
    if (cedula == null || cedula.length() != 10) {
        return false;
    }

    for (char c : cedula.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }

    return true;
}

public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase();
    }

}
