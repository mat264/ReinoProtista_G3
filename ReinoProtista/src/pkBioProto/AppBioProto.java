package pkBioProto;

import java.util.Scanner;

import pkBioProto.pkHumano.Analista;
import pkBioProto.pkReinoViviente.pkProtoctista.Vorticella;

public class AppBioProto {
   

    public void iniciarReinoProtista(){
        Scanner ingresoDatos=new Scanner(System.in);
        Analista analista =new Analista("12345678910", "Grupo3", "Perez");
        Vorticella vorticella1=new Vorticella("vorti");

        analista.setNombreUsuario("analista");
        analista.setContraseña("12345");

        //Inicio se sesion
        System.out.println("\n ------------------BIOENVENIDO AL SISTEMA BIOPROTO------------");
        boolean acceso=false;

        while (!acceso) {
            System.out.println("Ingrese su usuario: ");
            String ingresoUsuario= ingresoDatos.nextLine();

            System.out.println("Ingrese su contraseña: ");
            String contraseñaUsuario= ingresoDatos.nextLine(); 

            if (validarAcceso(analista, ingresoUsuario, contraseñaUsuario)) {
                acceso=true;
                System.out.println("-----------------Ingreso valido, Bienvenido: "+analista.getNombre());
            }else{
                System.out.println("-------------Credenciales incorrectas");
            }
        }

        //Requerimiento 03
        System.out.println("Como vas analista, la vorticella "+ vorticella1.getNombre()+" tiene hambre");
        System.out.println("Quieres darle de comer??");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Elige una opción: ");
        int opcion=Integer.parseInt(ingresoDatos.nextLine());

        if(opcion==1){
            vorticella1.comerAbsorver(true);
        }else if(opcion==2){
            vorticella1.comerAbsorver(false);
        }
        ingresoDatos.close();

    }

    public boolean validarAcceso(Analista analista, String usuario, String contraseña){
        return analista.getNombreUsuario().equals(usuario) && analista.getContraseña().equals(contraseña);
}

    
}
