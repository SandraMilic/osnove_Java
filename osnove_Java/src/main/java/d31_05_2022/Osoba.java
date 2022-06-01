package d31_05_2022;

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

    protected String punoIme;
    protected String jmbg;
    protected int godRodjenja;


    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg, int godRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
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

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void stampa() {
        System.out.print("Ime i prezime: " + this.punoIme);
        System.out.print(", JMBG: " + this.jmbg);
        System.out.println(", Godina rodjenja: " + this.godRodjenja);
    }

}
