package pkBioProto.pkReinoViviente.pkProtoctista;
public abstract class Ciliados extends Protozoos{
    private  Boolean tieneCilio;

    public  Ciliados(String nombre){
        super();
        setNombre(nombre);
        setTipoMovimiento("Cilios");
        setHabitat("Agua dulce");
        this.tieneCilio = true; 
    }

    public void moverCilios() {
    System.out.println(getNombre() + " se está moviendo usando sus cilios.");
}    
}
