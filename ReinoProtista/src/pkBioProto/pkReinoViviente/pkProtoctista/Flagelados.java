package pkBioProto.pkReinoViviente.pkProtoctista;

public abstract class Flagelados extends Protozoos {


    private int cantidadFlagelos;

    public Flagelados(String nombre, String habitat, int cantidadFlagelos) {
        // 'super' llama al constructor de Protozoos
        super(nombre, "Flagelado", habitat); 
        this.cantidadFlagelos = cantidadFlagelos;
    }

    // Método que hereda a euglena

   
    @Override
    public void desplazarse() {

        System.out.println(getNombre() + " se desplaza agitando su(s) " + cantidadFlagelos + " flagelo(s).");
    }

    @Override
    public void reproducirse() {

        System.out.println(getNombre() + " se reproduce por fisión binaria longitudinal.");
    }

   
    public int getCantidadFlagelos() {
        return cantidadFlagelos;
    }

}