package pkBioProto.pkReinoViviente.pkProtoctista;

public class Vorticella extends Ciliados {

    public Vorticella(String nombre){
        super(nombre);
    }

    public void comerAbsorver(boolean alimentar){
        if(alimentar){
            System.out.println("La Vorticella ha absorbido algas. Ahora está llena y contenta.");
        } else {
            System.out.println("La Vorticella sigue con hambre");
        }
    }
}

