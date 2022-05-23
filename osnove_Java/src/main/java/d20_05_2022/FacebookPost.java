package d20_05_2022;

public class FacebookPost {
//    Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//    ime i prezime korisnika koji je objavio post
//    ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    tekst objave
//    broj lajkova
//    broj deljenja
//    Konstruktore:
//    difoltni konstuktor
//    konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//    Od metoda:
//    like(), koja povecava broj lajkova za 1.
//    dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//    share(), koja povecava broj deljenja za 1
//    print(), koja stampa objavu u formatu:
//            (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//            (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//    Primer stampanja:
//    Milan Jovanovic >>> Pera Peric
//    Ovo je tekst objave
//    Likes 3 | Shares 1

    public String profilKojiJeObjavio;
    public String profilGdeJeObjavljeno;
    public String post;
    public int ukupnoLajkova;
    public int ukupnoDeljenja;

    public FacebookPost () {}

    public FacebookPost (String profilKojiJeObjavio, String profilGdeJeObjavljeno, String post) {
        this.profilKojiJeObjavio = profilKojiJeObjavio;
        this.profilGdeJeObjavljeno = profilGdeJeObjavljeno;
        this.post = post;
    }

    public void stampa() {
        System.out.println(this.profilKojiJeObjavio + " >>> " + this.profilGdeJeObjavljeno);
        System.out.println(this.post);
        System.out.println("Likes " + this.ukupnoLajkova + " | " + "Shares " + this.ukupnoDeljenja);
    }

    public void likes() {
        this.ukupnoLajkova = this.ukupnoLajkova + 1;
    }

    public void dislikes() {
        this.ukupnoLajkova = this.ukupnoLajkova - 1;
        if (this.ukupnoLajkova < 1) {
            this.ukupnoLajkova = 0;
        }
    }

    public void shares() {
        this.ukupnoDeljenja = this.ukupnoDeljenja + 1;
    }
}




