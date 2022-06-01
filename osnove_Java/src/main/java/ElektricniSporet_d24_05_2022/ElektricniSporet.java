package ElektricniSporet_d24_05_2022;

import java.util.ArrayList;

public class ElektricniSporet {
    ArrayList <Ringla> sporet = new ArrayList<>();

//    marku storeta (npr: Beko, Bosh)
//    garanciju kao broj godina
//    maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//    4 ringle
//    gore levo
//    gore desno
//    dole levo
//    dole desno
//    konstruktor koji postavlja sve atribute
//    gettere za sve atribut
//    ne postoje setteri
//    metodu pojacaj kojoj se prosledjuje pozicija ringle
//    pozicija 1 je ringla gore levo
//    pozicija 2 je ringla gore desno
//    pozicija 3 je ringla dole levo
//    pozicija 4 je ringla dole desno
//    Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se
//    pojacava u tom pozivu funkije
//    Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//    metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//    pozicija 1 je ringla gore levo
//    pozicija 2 je ringla gore desno
//    pozicija 3 je ringla dole levo
//    pozicija 4 je ringla dole desno
//    metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle
//            (kao parametar se unosi vreme koliko vec ringle rade)

    private String marka;
    private int garancija;
    private int maksimalanBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka,
                            int garancija,
                            int maksimalniBrojUkljucenihRingli,
                            Ringla goreLevo,
                            Ringla goreDesno,
                            Ringla doleLevo,
                            Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maksimalanBrojUkljucenihRingli = maksimalniBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaksimalanBrojUkljucenihRingli() {
        return maksimalanBrojUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public void pojacaj (int pozicija) {
        sporet.add(this.goreLevo);
        sporet.add(this.goreDesno);
        sporet.add(this.doleLevo);
        sporet.add(this.doleDesno);

        int brojac = 0;

        for (int i = 0; i < this.sporet.size(); i++) {
            this.sporet.get(i).ringlaUkljucena();
                brojac++;

            for (int j = 0; j < brojac; j++) {
                if (brojac > this.maksimalanBrojUkljucenihRingli) {
                    this.sporet.get(j).iskluciRinglu();
                }
            }
        }
        this.sporet.get(pozicija -1).pojacajRinglu();
    }

    public void iskljuci (int pozicija) {
        this.sporet.get(pozicija -1).iskluciRinglu();
    }

    public double ukupnaPotrosnjaSporeta (double vremeRada) {
        double suma = 0;

        for (int i = 0; i < this.sporet.size(); i++) {
            suma = suma + this.sporet.get(i).potrosnjaUkW(vremeRada);
        }
        return suma;
    }

    public void stampaSporet () {
        System.out.println(this.marka + " - " + this.garancija);
        System.out.println("Ringle: ");
        System.out.println();
        System.out.println("Gore levo: ");
        this.goreLevo.stampa();
        System.out.println();
        System.out.println("Gore desno: ");
        this.goreDesno.stampa();
        System.out.println();
        System.out.println("Dole levo: ");
        this.doleLevo.stampa();
        System.out.println();
        System.out.println("Dole desno: ");
        this.doleDesno.stampa();
        System.out.println();
    }
}
