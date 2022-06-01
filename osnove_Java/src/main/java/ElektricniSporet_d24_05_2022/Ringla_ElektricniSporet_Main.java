package ElektricniSporet_d24_05_2022;

public class Ringla_ElektricniSporet_Main {
    public static void main(String[] args) {


        Ringla p1 = new Ringla("obicna", 0.8);
        Ringla p2 = new Ringla("ekspres", 1.5);
        Ringla p3 = new Ringla("obicna", 0.5);
        Ringla p4 = new Ringla("ekspres", 1.8);

        p1.pojacajRinglu();
        p2.pojacajRinglu();
        p3.pojacajRinglu();

        ElektricniSporet bosh = new ElektricniSporet("Bosh", 5, 3, p1, p2, p3, p4);


        bosh.stampaSporet();
        bosh.pojacaj(4);

        bosh.stampaSporet();
        System.out.println("Potrosnja elektricno sporeta u kW: " + bosh.ukupnaPotrosnjaSporeta(2));
    }
}
