package pkBioProto.pkHumano;

import pkBioProto.pkReinoViviente.pkProtoctista.Protozoos;

public class Analista extends Persona{
    private String nombreUsuario;
    private String contrasena;

    public Analista() {
        super();
    }

    public Analista(String nombre, String apellido, String cedula, String nombreUsuario, String contrasena) {
        super(nombre, apellido, cedula);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public boolean setClave(String login, String password){
        if(login != null && password != null && login.length() >=5){
            this.nombreUsuario = login;
            this.contrasena = password;
            return true;
        }
        if(password == null || password.length() < 5){
            System.out.println("Error: login o password nulos");
            return false;
        }
        this.nombreUsuario = login;
        this.contrasena = password;
        System.out.println("Clave registrada correctamente");
        return true;
    }

    public void recibirMuestra(Protozoos muestra){
        System.out.println("El analista " + this.getNombre() + " ha recibido una muestra de protozoo: " + muestra.getNombre());
    }

    public String clasificarMuestra (Protozoos muestra){
        if(muestra == null || muestra.getNombre() == null){
            System.out.println("Error: muestra nula o sin nombre");
            return "Desconocido";
        }

        String tipo = "Otro tipo";
        if(muestra != null){
            String nombre = muestra.getNombre().toLowerCase();
            if(nombre.contains("amoeba")){
                tipo = "Ameba";
            }else if(nombre.contains ("paramecio")){
                tipo = "Ciliado";
            }else if(nombre.contains ("ameba")){
                tipo = "Rizopodo";
            }else if(nombre.contains ("plasmodium")){
                tipo = "Esporozoo";
            }
        }
        System.out.println("La muestra " + muestra.getNombre() + " ha sido clasificada como: " + tipo);
        return tipo;
    }

    public boolean evaluarPeligrosidad(Protozoos muestra, String tipoAgua) {
        if (muestra == null) {
            System.out.println("Error: la muestra no puede ser nula.");
            return false;
        }
        if (tipoAgua == null || tipoAgua.isEmpty()) {
            System.out.println("Error: el tipo de agua no puede estar vacío.");
            return false;
        }

        String nombre = muestra.getNombre().toLowerCase();
        boolean peligro = false;

        if (nombre.contains("ameba") && tipoAgua.equalsIgnoreCase("estancada")) peligro = true;
        else if (nombre.contains("plasmodium")) peligro = true;
        System.out.println("Peligrosidad de " + muestra.getNombre() + ": " + peligro);
        return peligro;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
