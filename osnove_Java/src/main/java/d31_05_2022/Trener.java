package d31_05_2022;

public class Trener extends Osoba {
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

    private int godineIskustva;
    public String tipTrenera;

    public Trener() {
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    public Trener(String punoIme, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
        super(punoIme, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Godine iskustva: " + this.godineIskustva + ", Tip trenera: " + this.tipTrenera);
        System.out.println();
    }
}
