package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod m = new Proizvod();

        m.naziv = "Krkonja";
        m.cena = 107.7;
        m.tezina = 50;

        m.stampa();
        m.povecajCenu(20);

        System.out.println("Stampa posle povecanja cene za 20rsd.");
        m.stampa();
        System.out.println("Cena sa popustom je " + m.vratiCenuSaPopustom(70) + "RSD");
        System.out.println("Cena postarine iznosi: " + m.racunajPostarinu() + "RSD");
        System.out.println();

        Proizvod n = new Proizvod();

        n.naziv = "Igracka Meda";
        n.cena = 200;
        n.tezina = 307;

        n.stampa();

        System.out.println("Cena sa popustom je " + n.vratiCenuSaPopustom(50) + "RSD");
        n.povecajCenu(50);
        System.out.println("Stampa posle povecanja cene za 50rsd.");
        n.stampa();
        System.out.println("Cena sa popustom je " + n.vratiCenuSaPopustom(100) + "RSD");
        n.stampa();
        System.out.println("Cena postarine iznosi: " + n.racunajPostarinu() + "RSD");
    }
}
