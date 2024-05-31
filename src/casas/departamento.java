package casas;


public class departamento extends inmueble {
    private int numPiso;

    public departamento(String direccion, double tamano, int numHabitaciones, double precio, int numPiso ){
        super(direccion, tamano, numHabitaciones, precio);
        this.numPiso = numPiso;
    }

    public int getNumPiso() {
        return numPiso;
    }

    @Override
    public void mostrarinformaciom(){
        super.mostrarinformaciom();
        System.out.println("Numero de pisos: " + getNumPiso());
        System.out.println(" ");
    }
}
