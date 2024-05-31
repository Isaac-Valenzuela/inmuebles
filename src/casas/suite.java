package casas;

public class suite extends inmueble{
    private boolean tieneJacuzzi;

    public suite(String direccion, double tamano, int numHabitaciones, double precio, boolean tieneJacuzzi ){
        super(direccion, tamano, numHabitaciones, precio);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    @Override
    public void mostrarinformaciom(){
        super.mostrarinformaciom();
        System.out.println("Tiene Jacuzzi: " + isTieneJacuzzi());
        System.out.println(" ");
    }
}
