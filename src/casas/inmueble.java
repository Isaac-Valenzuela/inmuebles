package casas;

public class inmueble{
    private String direccion;
    private double tamano;
    private int numHabitaciones;
    private double precio;

    public inmueble(String direccion, double tamano, int numHabitaciones, double precio){
        this.direccion = direccion;
        this.tamano = tamano;
        this.numHabitaciones = numHabitaciones;
        this.precio = precio;
    }
    public String getDireccion() {
        return direccion;
    }
    public double getTamano() {
        return tamano;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    public double getPrecio() {
        return precio;
    }

    public void mostrarinformaciom(){
        System.out.println(" ");
        System.out.println("Direccion: " + direccion);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Numero de habitaciones: " + numHabitaciones);
        System.out.println("Precio: " + precio);
    }
}