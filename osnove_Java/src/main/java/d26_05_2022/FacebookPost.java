package d26_05_2022;

import java.util.ArrayList;

public class FacebookPost {

//    Kreirati klasu FacebookPost koja ima:
//    ime i prezime korisnika koji je stavio oglas
//    tekst objave
//    niz reakcija
//    metodu reaguj, koja dodaje reakciju u niz
//            (modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post
//    (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//    Primer: Milan - lajkuje
//    Nemanja - lajkuje
//    Milan - daje srce
//    Post ima lajk od Nemanje i srce od Milana.
//    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//    metodu stampaj koja stampa podatke u formatu:
//    ime i prezime
//    tekst objave
//    Smajli 10 | Like 15 | Srce 2

    private String punoImeKorisnikPost;
    private String tekstPosta;
    private ArrayList <Reakcija> nizReakcija = new ArrayList<>();

    public FacebookPost(String punoImeKorisnikPost, String tekstPosta) {
        this.punoImeKorisnikPost = punoImeKorisnikPost;
        this.tekstPosta = tekstPosta;

    }

    public String getPunoImeKorisnikPost() {
        return punoImeKorisnikPost;
    }

    public void setPunoImeKorisnikPost(String punoImeKorisnikPost) {
        this.punoImeKorisnikPost = punoImeKorisnikPost;
    }

    public void setTekstPosta(String tekstPosta) {
        this.tekstPosta = tekstPosta;
    }

    public void setNizReakcija(ArrayList<Reakcija> nizReakcija) {
        this.nizReakcija = nizReakcija;
    }

    public String getTekstPosta() {
        return tekstPosta;
    }

    public ArrayList<Reakcija> getNizReakcija() {
        return nizReakcija;
    }

    public void dodajReakciju (Reakcija reakcija) {
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            Reakcija predhodnaReakcija = this.nizReakcija.get(i);

            if (predhodnaReakcija.getPunoImeKorisnikKojiReaguje().equals(reakcija.getPunoImeKorisnikKojiReaguje())) {
                this.nizReakcija.remove(i);
            }
        }
        this.nizReakcija.add(reakcija);
    }

    private int brojTipovaReakcija (String tipReakcije) {
        int brojac = 0;

        for (int i = 0; i < this.nizReakcija.size(); i++) {
            if (tipReakcije.equals(this.nizReakcija.get(i).getTipReakcije())) {
                brojac ++;

            }
        }
        return brojac;
    }

    public void stampa () {
        System.out.println(this.punoImeKorisnikPost);
        System.out.println();
        System.out.println(this.tekstPosta);
        System.out.println();
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            System.out.println(this.nizReakcija.get(i).getPunoImeKorisnikKojiReaguje() + " - " + this.nizReakcija.get(i).getTipReakcije());
            for (int j = 0; j < 1; j++) {
                System.out.println();
            }
        }
        System.out.println("smajli " + this.brojTipovaReakcija("smajli")
                + " | " + "lajk " + this.brojTipovaReakcija("lajk")
                + " | " + "srce " + this.brojTipovaReakcija("srce"));
    }
}
