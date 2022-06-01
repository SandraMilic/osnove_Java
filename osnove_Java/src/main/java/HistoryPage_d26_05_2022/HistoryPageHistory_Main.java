package HistoryPage_d26_05_2022;

public class HistoryPageHistory_Main {
    public static void main(String[] args) {

        HistoryPage testIO = new HistoryPage("Test IO", "22.05.2022",
                "www.testio.com", 13, 58);
        HistoryPage facebook = new HistoryPage("Facebook", "22.05.2022",
                "www.facebook.com", 14, 15);
        HistoryPage s1 = new HistoryPage("stranica1", "22.05.2022",
                "www.stranica1.com", 14, 36);
        HistoryPage s2 = new HistoryPage("stranica2", "22.05.2022",
                "www.stranica2.com", 13, 15);
        HistoryPage s3 = new HistoryPage("stranica3", "22.05.2022",
                "www.stranica3.com", 15, 24);
        HistoryPage s4 = new HistoryPage("stranica4", "22.05.2022",
                "www.stranica4.com", 16, 15);
        HistoryPage s5 = new HistoryPage("stranica5", "22.05.2022",
                "www.stranica5.com", 15, 58);

        testIO.sacuvajKolacice("username: sandra | password: sandra123");
        facebook.sacuvajKolacice("username: sandra | password: sandra123");
        facebook.obrisiKolacice();
        s1.sacuvajKolacice("username: sandra | password: sandra123");
        s2.sacuvajKolacice("username: sandra | password: sandra123");
        s3.sacuvajKolacice("username: sandra | password: sandra123");
//        facebook.stampaHistoryPage();
//        testIO.stampaHistoryPage();

        History history = new History();
        history.otvoriStranicu(testIO);
        history.otvoriStranicu(facebook);
        history.otvoriStranicu(s1);
        history.otvoriStranicu(s2);
        history.otvoriStranicu(s3);
//        history.obrisiKolaciceZaLink(s3);
        history.sacuvajKredencija(s3.getNazivStranice(), "username: caka | password: caka123");
        history.obrisiKolaciceZaLink(s3);
//        history.obrisiSveKolacice();
//        history.obrisiSveKolaciceZaSadnjihSatVremena(13, 10);
//        history.obrisiCeluIstoriju();
//        history.obrisiSveKolacice();

        history.pogledajIstoriju();

    }
}
