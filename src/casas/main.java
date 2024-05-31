package casas;

public class main {
    public static void main(String [] args){
        inmueble i1 = new inmueble("Poli", 12.2, 4, 20.000);
        departamento d1 = new departamento("poli", 12.2 ,
                3, 22.000, 3);
        casaindividual c1 = new casaindividual("Poli", 12.2,
                5, 100.000, 10.000);
        suite s1 = new suite("poli", 14.2, 4, 120.000, true );

        i1.mostrarinformaciom();
        d1.mostrarinformaciom();
        c1.mostrarinformaciom();
        s1.mostrarinformaciom();
    }
}
