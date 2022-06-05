package d03_06_2022;

public class Ambalaza_Main {
    public static void main(String[] args) {

        Tetrapak t1 = new Tetrapak("12345-11", "Mleko", 100,
                110, true, 100);
        Tetrapak t2 = new Tetrapak("12345-12", "Jogurt", 150,
                170, false, 150);
        Tetrapak t3 = new Tetrapak("12345-13", "Sok", 200,
                210, true, 200);

        StaklenaAmbalaza s1 = new StaklenaAmbalaza("54321-11", "Tuborg",
                330, 450, 50,true, 120);
        StaklenaAmbalaza s2 = new StaklenaAmbalaza("54321-12", "Coca-Cola",
                330, 400, 10,true, 100);
        StaklenaAmbalaza s3 = new StaklenaAmbalaza("54321-13", "Zajecarsko",
                500, 600, 50,false, 70);

        SuperKartica kartica1 = new SuperKartica(12345, "Sandra Milic", 50);

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(t1);
        korpa.dodajAmbalazu(t2);
        korpa.dodajAmbalazu(t3);
        korpa.dodajAmbalazu(s1);
        korpa.dodajAmbalazu(s2);
        korpa.dodajAmbalazu(s3);
        korpa.stampaKorpa();
        System.out.println("Ukupna cena korpe: " + korpa.cenaKorpe(kartica1));
        korpa.izbaciAmbalazu("54321-13");
        korpa.stampaKorpa();
        System.out.println("Ukupna cena korpe: " + korpa.cenaKorpe(kartica1));
    }
}
