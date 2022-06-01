package Karton_Osoba_Igrac_d31_05_2022;

public class IgracKarton_Main {
//    U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Mijat Milic", "0811011737522",
                2011, 7, "napadac", true);

        Karton zuti = new Karton("zuti");
        Karton crveni = new Karton("crveni");

        igrac1.dodajKarton(zuti);
        igrac1.dodajKarton(zuti);
        igrac1.dodajKarton(zuti);
        igrac1.dodajKarton(zuti);
        igrac1.dodajKarton(crveni);
        igrac1.dodajKarton(crveni);

        igrac1.stampa();

    }
}
