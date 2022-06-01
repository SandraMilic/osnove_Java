package d26_05_2022;

public class Reakcija {
//    Kreirati klasu Reakcija koja ima
//    tip reakcije (smajli, like, srce)
//    ime i prezime korisnika koji je reagovao
//    gettere, settere i konstruktore

    private String tipReakcije;
    private String punoImeKorisnikKojiReaguje;

    public String getTipReakcije() {
        return tipReakcije;
    }

    public String getPunoImeKorisnikKojiReaguje() {
        return punoImeKorisnikKojiReaguje;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public void setPunoImeKorisnikKojiReaguje(String punoImeKorisnikKojiReaguje) {
        this.punoImeKorisnikKojiReaguje = punoImeKorisnikKojiReaguje;
    }

    public Reakcija(String punoImeKorisnikKojiReaguje, String tipReakcije) {
        this.tipReakcije = tipReakcije;
        this.punoImeKorisnikKojiReaguje = punoImeKorisnikKojiReaguje;
    }
}
