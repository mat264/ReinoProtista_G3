package pkBioProto.pkReinoViviente.pkProtoctista;

public abstract class Esporozoos extends Protozoos{
    private boolean esParasitico;
    public Esporozoos() {
        super();
        this.esParasitico = true;
    }

    public void infectar (){
        System.out.println("El esporozoos esta infectando a su hospedador");
    }

    public void formarEsporas(){
        System.out.println("El esporozoos esta formando esporas");
    }

    public Esporozoos(String nombre, String tipoMovimiento, String habitat) {
        super(nombre, tipoMovimiento, habitat);
        this.esParasitico = true;
    }

    public boolean isEsParasitico() {
        return esParasitico;
    }

    public void setEsParasitico(boolean esParasitico) {
        this.esParasitico = esParasitico;
    }
}
