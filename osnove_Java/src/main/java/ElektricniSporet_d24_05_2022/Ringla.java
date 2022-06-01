package ElektricniSporet_d24_05_2022;

public class Ringla {

//    Kreirati klasu Ringla koja ima:
//    tip ringle (obicna ili ekspres)
//    jacinu
//    za obicnu ringu jacina je u opsegu od 0 do 3
//    za ekspres ringlu jacina je u opsegu od 0 do 12
//    jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//    konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//    getter za jacinu
//    setteri ne postoje!!
//    privatnu metodu koja vraca maksimalan broj pojacavanja
//    za obicnu je 3, za ekspres je 12
//    metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//    metodu iskljuci ringlu - metoda postavlja jacinu na 0
//    metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//    metodu koja vraca potrosnju elektricne energije prema formuli
//    100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
//    metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//    metodu koja stampa podatke u formatu:
//    Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//    Tip ringle: tip ringle
//    Jacina: jacina
//    Grejac: jacina grejaca kW

    private String tipRingle;
    private int jacinaRingle;
    private double jacinaGrejaca;

    public Ringla(String tipRingle, double jacinaGrejaca) {
        this.tipRingle = tipRingle;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacinaRingle = 0;
    }

    public int getJacinaRingle() {
        return jacinaRingle;
    }
    private double maksimalanBrojPojacavanja () {
        int brojPojacavanja = 0;
        if (tipRingle.equals("obicna")) {
            return brojPojacavanja = 3;
        }
            return brojPojacavanja = 12;
    }

    public void pojacajRinglu() {
        if (tipRingle.equals("obicna")) {
            jacinaRingle = jacinaRingle + 1;
        }
        if (tipRingle.equals("obicna") && jacinaRingle > 3) {
            jacinaRingle = 3;
        }
        if (tipRingle.equals("ekspres")) {
            jacinaRingle = jacinaRingle + 1;
        }
        if (tipRingle.equals("ekspres") && jacinaRingle > 12) {
            jacinaRingle = 12;
        }
    }

    public void iskluciRinglu() {
        if (tipRingle.equals("obicna")) {
            jacinaRingle = 0;
        }
        if (tipRingle.equals("ekspres")) {
            jacinaRingle = 0;
        }
    }

    public boolean ringlaUkljucena () {
        if (jacinaRingle > 0) {
            return true;
        }
            return false;
    }

    public double potrosnjaUkW (double vremeRada) {
        return  100 / this.maksimalanBrojPojacavanja() * this.jacinaRingle * this.jacinaGrejaca * vremeRada;

    }

    public void stampa () {

        if (ringlaUkljucena()) {
            System.out.println("Ringla je ukljucena");
        }
        else {
            System.out.println("Ringla je iskljucena");
        }
        System.out.println("Tip ringle: " + this.tipRingle);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kw");
    }

}
