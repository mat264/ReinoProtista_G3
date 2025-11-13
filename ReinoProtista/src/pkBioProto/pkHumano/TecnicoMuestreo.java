package pkBioProto.pkHumano;

import pkBioProto.pkReinoViviente.pkProtoctista.Protozoos;
public class TecnicoMuestreo extends Persona{

    public TecnicoMuestreo() {
        super();
    }
    public TecnicoMuestreo(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);

    }

    public void recolectarMuestra(Protozoos muestra, String lugar, String tipoAgua){
        if(muestra == null || lugar == null || tipoAgua == null){
            System.out.println("Error: datos incompletos para recolectar la muestra.");
            return;
        }
        System.out.println("El tecnico " + this.getNombre() + " ha recolectado una muestra de protozoo: " + muestra.getNombre() + " en el lugar: " + lugar + " con tipo de agua: " + tipoAgua);
    }

    public boolean entregarMuestra(Analista analista, Protozoos muestra){
        if(analista != null && muestra != null){
            System.out.println("El tecnico " + this.getNombre() + " ha entregado la muestra de protozoo: " + muestra.getNombre() + " al analista: " + analista.getNombre());
            return true;
        }
        System.out.println("Error al entregar la muestra. Datos incompletos.");
        return false;
    }
}
