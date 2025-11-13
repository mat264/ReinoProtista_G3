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
        Scanner ingresoDatos = new Scanner(System.in);
        Analista analista = new Analista("Juan", "Perez", "1234567890", "juanp", "12345");
        TecnicoMuestreo tecnico = new TecnicoMuestreo("Ana", "Gomez", "0987654321");

        iniciarReinoProtista();
        ingreso(analista);

        PlasmodiumVivax plasmodium = new PlasmodiumVivax("sangre");
        Vorticella vorticella = new Vorticella("vorti");
        Paramecio paramecio = new Paramecio("Paramecio", 50.0);
        Ameba ameba = new Ameba("Agua dulce");
        Euglena euglena = new Euglena("Euglena Verde", "Charco", true);

        System.out.println("\n==============================================");
        System.out.println("      REGISTRO DE MUESTREO - BIOPROTO LAB      ");
        System.out.println("==============================================\n");

        System.out.println(">> Procesando muestra #1 (Plasmodium Vivax)");
        tecnico.recolectarMuestra(plasmodium, "Río Amazonas", "Agua dulce");
        tecnico.entregarMuestra(analista, plasmodium);
        registrar(plasmodium, "Agua dulce", "Río Amazonas");

        System.out.println("\n----------------------------------------------\n");

        System.out.println(">> Procesando muestra #2 (Vorticella)");
        tecnico.recolectarMuestra(vorticella, "Estanque", "Agua dulce");
        tecnico.entregarMuestra(analista, vorticella);

        registrar(vorticella, "Agua dulce", "Estanque");

        System.out.println("\n----------------------------------------------\n");

        System.out.println(">> Procesando muestra #3 (Paramecio)");
        tecnico.recolectarMuestra(paramecio, "Laguna", "Agua dulce");
        tecnico.entregarMuestra(analista, paramecio);
        registrar(paramecio, "Agua dulce", "Laguna");

        System.out.println("\n----------------------------------------------\n");

        System.out.println(">> Procesando muestra #4 (Ameba)");
        tecnico.recolectarMuestra(ameba, "Laguna", "Agua dulce");
        tecnico.entregarMuestra(analista, ameba);
        registrar(ameba, "Agua dulce", "Laguna");

        System.out.println("\n----------------------------------------------\n");

        System.out.println(">> Procesando muestra #5 (Euglena)");
        tecnico.recolectarMuestra(euglena, "Parque", "Agua estancada");
        tecnico.entregarMuestra(analista, euglena);
        registrar(euglena, "Agua estancada", "Parque");

        System.out.println("\n==============================================");
        System.out.println("MUESTREO COMPLETADO CON ÉXITO");
        System.out.println("==============================================\n");


  System.out.println("-----------CLASIFICACION--------------");
       System.out.println("Plasmodium " + analista.clasificarMuestra(plasmodium));
       System.out.println("Vorticella "+ analista.clasificarMuestra(vorticella));
       System.out.println("Paramecio "+ analista.clasificarMuestra(paramecio));
       System.out.println("Ameba " + analista.clasificarMuestra(ameba));
       System.out.println("Euglena "+ analista.clasificarMuestra(euglena));


        System.out.println("--------------EVALUACION DE PELIGROSIDAD--------------");
        analista.evaluarPeligrosidad(plasmodium, "Agua dulce", "Rio Amazonas");

        System.out.println("---------- ESTUDIO DEL PLASMODIUM --------------");
        plasmodium.infectarHumano();
        plasmodium.reproducirseEnMosquito();
        plasmodium.desplazarse();
        plasmodium.alimentarse();

        System.out.println("----------ALIMENTAR VORTICELLA--------------");
        System.out.println("Como vas analista, la vorticella " + vorticella.getNombre() + " tiene hambre");
        System.out.println("Quieres darle de comer??");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Elige una opción: ");
        int opcion = Integer.parseInt(ingresoDatos.nextLine());

        if(opcion == 1){
            vorticella.comerAbsorver(true);
        } else if(opcion == 2){
            vorticella.comerAbsorver(false);
        }
 System.out.println("\n----------ESTUDIO DE LA AMEBA--------------");
        System.out.println("Analista " + analista.getNombre() + ", tenemos una ameba recién capturada: " + ameba.getNombre());
        System.out.println("Hábitat de origen: " + ameba.getHabitad());
        System.out.println("Tipo de movimiento: " + ameba.getTipoMovimiento());
        System.out.println("\n¿Qué experimento deseas realizar con la ameba?");
        System.out.println("1. Observar desplazamiento bajo el microscopio");
        System.out.println("2. Estudiar su proceso de alimentación (fagocitosis)");
        System.out.println("3. Documentar su reproducción asexual");
        System.out.println("4. Análisis completo de comportamiento");
        System.out.print("Selecciona el experimento: ");
        int opcionAmeba = Integer.parseInt(ingresoDatos.nextLine());

        System.out.println("\n--- INICIANDO EXPERIMENTO ---");
        if(opcionAmeba == 1){
            System.out.println(" Experimento: Observación de locomoción");
            System.out.println("Colocando la ameba en el portaobjetos...");
            System.out.println("Aplicando gota de agua...");
            System.out.println("Enfocando microscopio a 100x...\n");
            ameba.desplazarse();
            System.out.println("\n Observación completada. La ameba muestra movimiento ameboide típico.");
        } else if(opcionAmeba == 2){
            System.out.println(" Experimento: Proceso de fagocitosis");
            System.out.println("Agregando partículas de alimento al medio...");
            System.out.println("La ameba detecta el alimento cercano...");
            System.out.println("Observando respuesta quimiotáctica...\n");
            ameba.capturarAlimento();
            System.out.println("\n Experimento exitoso. Fagocitosis documentada correctamente.");
        } else if(opcionAmeba == 3){
            System.out.println(" Experimento: Reproducción asexual");
            System.out.println("Condiciones óptimas establecidas (temperatura: 25°C)...");
            System.out.println("La ameba ha alcanzado tamaño crítico para división...");
            System.out.println("Iniciando proceso de citocinesis...\n");
            ameba.reproducirse();
            System.out.println("\n División binaria completada. Dos células hijas viables observadas.");
        } else if(opcionAmeba == 4){
            System.out.println(" Experimento: Análisis integral de comportamiento");
            System.out.println("=== FASE 1: LOCOMOCIÓN ===");
            ameba.desplazarse();
            System.out.println("\n=== FASE 2: ALIMENTACIÓN ===");
            ameba.capturarAlimento();
            System.out.println("\n=== FASE 3: REPRODUCCIÓN ===");
            ameba.reproducirse();
            System.out.println("\n Análisis completo finalizado.");
            System.out.println(" Reporte: La ameba muestra todos los comportamientos esperados.");
            System.out.println("    Organismo viable y saludable para estudios adicionales.");
        } else {
            System.out.println(" Opción no válida. Experimento cancelado.");
        }

        System.out.println("\n--- FINALIZANDO SESIÓN DE LABORATORIO ---");
        System.out.println("Gracias por usar BioProto, " + analista.getNombre() + "!");

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