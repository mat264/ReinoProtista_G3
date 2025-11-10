package pkBioProto;

import java.util.Scanner;

import pkBioProto.pkHumano.Analista;
import pkBioProto.pkReinoViviente.pkProtoctista.Vorticella;

public class AppBioProto {
    

    
    public void iniciarBioProto(){
        Scanner ingresoDatos=new Scanner(System.in);
        Analista analista =new Analista("12345678910", "Analista", "Perez");
        Vorticella vorticella1=new Vorticella("vorti");

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
}
