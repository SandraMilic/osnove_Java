package Karton_Osoba_Igrac_d31_05_2022;

public class Osoba {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)

    protected  String punoIme;
    protected  String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg, int godinaRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampa() {
        System.out.print("Ime i prezime: " + this.punoIme);
        System.out.print(", JMBG: " + this.jmbg);
        System.out.print(", Godina rodjenja: " + this.godinaRodjenja);
    }
}
