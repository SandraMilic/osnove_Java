package d24_05_2022;

public class RacunTransakcija_Main {
    public static void main(String[] args) {
        Racun uplatilac = new Racun("160-101007015-63", "Sandra Milic", 10000);

//        uplatilac.promeniStanjeNaRacunu(1000);
//        uplatilac.stampaRacun();

        Racun primalac = new Racun("160-000000000-60", "Ana Smith", 2000);

        Transakcija transfer1 = new Transakcija("ID 2345", uplatilac, primalac);

        transfer1.izvrsiTransakciju(5000);
        transfer1.stampaTransakcija();
    }
}


