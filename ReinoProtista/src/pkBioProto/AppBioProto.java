package pkBioProto;
import pkBioProto.pkHumano.*;
import pkBioProto.pkReinoViviente.pkProtoctista.*;
public class AppBioProto {
    private String nombreUsuario;
    private String contrasena;

    public AppBioProto() {
    }

    public AppBioProto(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public void iniciarReinoProtista(){
        System.out.println("Iniciando el sistema de Reino Protista con usuario.....");
    }

    public boolean ingreso (Analista usuario){
        if(usuario != null && usuario.getNombre() != null && usuario.getApellido() != null){
            System.out.println("Ingreso exitoso. Bienvenido " + usuario.getNombre() + " " + usuario.getApellido());
            return true;
        }
        System.out.println("Error en el ingreso. Datos incompletos.");
        return false;
    }

    public boolean registrar (Protozoos muestra, String tipoAgua, String lugar){
        if(muestra != null && lugar != null && tipoAgua != null){
            System.out.println("Muestra registrada: " + muestra.getNombre() + ", Tipo de agua: " + tipoAgua + ", Lugar: " + lugar);
            return true;
        }else
        System.out.println("Error: datos incompletos para registrar la muestra.");
        return false;
    }

    public void flujoPrincipal(){
        Analista analista = new Analista("Juan", "Perez", "1234567890", "juanp", "securepass");
        TecnicoMuestreo tecnico = new TecnicoMuestreo("Ana", "Gomez", "0987654321", "anag", "mypassword");

        iniciarReinoProtista();
        ingreso(analista);

        PlasmodiumVivax plasmodium = new PlasmodiumVivax ("sangre");

        tecnico.recolectarMuestra(plasmodium, "Rio Amazonas", "Agua dulce");
        tecnico.entregarMuestra(analista, plasmodium);
        registrar(plasmodium, "Agua dulce", "Rio Amazonas");

        System.out.println("-----------CLASIFICACION--------------");
        System.out.println("Plasmodium " + analista.clasificarMuestra(plasmodium));

        System.out.println("--------------EVALUACION DE PELIGROSIDAD--------------");
        analista.evaluarPeligrosidad(plasmodium, "Agua dulce");
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
