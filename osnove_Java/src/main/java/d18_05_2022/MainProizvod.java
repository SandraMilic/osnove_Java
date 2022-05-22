package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod p = new Proizvod();

        p.naziv = "Krkonja";
        p.cena = 107.7;
        p.tezina = 50;

        p.stampa();
        System.out.println();

        Proizvod o = new Proizvod();

        o.naziv = "Igracka Meda";
        o.cena = 200;
        o.tezina = 307;

        o.stampa();
    }
}
