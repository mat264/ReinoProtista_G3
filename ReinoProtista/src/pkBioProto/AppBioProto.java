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
        Euglena euglena = new Euglena("Euglena Verde", "Charco", true);

        tecnico.recolectarMuestra(plasmodium, "Rio Amazonas", "Agua dulce");
        tecnico.entregarMuestra(analista, plasmodium);
        registrar(plasmodium, "Agua dulce", "Rio Amazonas");

        tecnico.recolectarMuestra(vorticella, "estanque", "Agua dulce");
        tecnico.entregarMuestra(analista, vorticella);

        tecnico.recolectarMuestra(euglena, "Parque", "Agua estancada");
        tecnico.entregarMuestra(analista, euglena);
        registrar(euglena, "Agua estancada", "Parque");

        System.out.println("-----------CLASIFICACION--------------");
        System.out.println("Plasmodium " + analista.clasificarMuestra(plasmodium));
        System.out.println("Vorticella "+ analista.clasificarMuestra(vorticella));
        System.out.println("Euglena "+ analista.clasificarMuestra(euglena));


        System.out.println("--------------EVALUACION DE PELIGROSIDAD--------------");
        analista.evaluarPeligrosidad(plasmodium, "Agua dulce");

        System.out.println("----------ALIMENTAR VORTICELLA--------------");
        System.out.println("Como vas analista, la vorticella "+ vorticella.getNombre()+" tiene hambre");
        System.out.println("Quieres darle de comer??");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Elige una opción: ");
        int opcion=Integer.parseInt(ingresoDatos.nextLine());

        if(opcion==1){
            vorticella.comerAbsorver(true);
        }else if(opcion==2){
            vorticella.comerAbsorver(false);
        }

System.out.println("\n---------- PROBAR EUGLENA --------------");
        System.out.println("Analista, ahora vamos a probar la " + euglena.getNombre());
        System.out.println("¿Quieres aplicar luz a la muestra?");
        System.out.println("1. Sí, aplicar luz");
        System.out.println("2. No, dejar en oscuridad");
        System.out.print("Elige una opción: ");
        int opcionLuz = Integer.parseInt(ingresoDatos.nextLine());

        if(opcionLuz == 1){
            euglena.setHayLuz(true);
        } else {
            euglena.setHayLuz(false);
        }
        
        System.out.println("\n... Probando reacción al estímulo 'luz'...");
        euglena.reaccionarEstimulo("luz"); 
        
        System.out.println("... Probando alimentación ...");
        euglena.alimentarse(); 
        
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