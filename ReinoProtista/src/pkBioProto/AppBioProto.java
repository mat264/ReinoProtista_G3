package pkBioProto;
import java.util.Scanner;

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
        Scanner ingresoDatos=new Scanner(System.in);
        Analista analista = new Analista("Juan", "Perez", "1234567890", "juanp", "12345");
        TecnicoMuestreo tecnico = new TecnicoMuestreo("Ana", "Gomez", "0987654321", "anag", "mypassword");

        iniciarReinoProtista();
        ingreso(analista);

        PlasmodiumVivax plasmodium = new PlasmodiumVivax ("sangre");
        Vorticella vorticella=new Vorticella("vorti");

        tecnico.recolectarMuestra(plasmodium, "Rio Amazonas", "Agua dulce");
        tecnico.entregarMuestra(analista, plasmodium);
        registrar(plasmodium, "Agua dulce", "Rio Amazonas");

        tecnico.recolectarMuestra(vorticella, "estanque", "Agua dulce");
        tecnico.entregarMuestra(analista, vorticella);

        System.out.println("-----------CLASIFICACION--------------");
        System.out.println("Plasmodium " + analista.clasificarMuestra(plasmodium));
        System.out.println("Vorticella "+ analista.clasificarMuestra(vorticella));

        System.out.println("--------------EVALUACION DE PELIGROSIDAD--------------");
        analista.evaluarPeligrosidad(plasmodium, "Agua dulce");

        System.out.println("----------ALIMENTAR VORTICELLA--------------");
        System.out.println("Como vas analista, la vorticella "+ vorticella.getNombre()+" tiene hambre");
        System.out.println("Quieres darle de comer??");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int opcion=0;
        boolean valido=false;
        do {
            try {
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(ingresoDatos.nextLine());
            if (opcion == 1 || opcion == 2) {
            valido = true;
        } else {
            System.out.println("Opción invalida");
        }

         } catch (NumberFormatException e) {
            System.out.println("ingresa un número ");
        }
     } while (valido==false);

        if (opcion == 1) {
            vorticella.comerAbsorver(true);
        } else {
        vorticella.comerAbsorver(false);
        }
       ingresoDatos.close();
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