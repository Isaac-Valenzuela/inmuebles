package casas;

public class casaindividual extends inmueble{
    private double tamanoTerreno;

    public casaindividual(String direccion, double tamano, int numHabitaciones, double precio, double tamanoTerreno ){
        super(direccion, tamano, numHabitaciones, precio);
        this.tamanoTerreno = tamanoTerreno;
    }

    public double getTamanoTerreno() {
        return tamanoTerreno;
    }

    @Override
    public void mostrarinformaciom(){
        super.mostrarinformaciom();
        System.out.println("Tamaño del terreno: " + getTamanoTerreno());
        System.out.println(" ");
    }
}
