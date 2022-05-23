package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost objava1 = new FacebookPost();

        objava1.profilKojiJeObjavio = "Sandra Sandric";
        objava1.profilGdeJeObjavljeno = "Pera Peric";
        objava1.post = "Lorem ipsum";
        objava1.ukupnoLajkova = 3;
        objava1.ukupnoDeljenja = 0;

        objava1.stampa();
        objava1.likes();
        objava1.likes();
        objava1.likes();
        System.out.println();
        System.out.println("Stampa posle 3 like-a");
        objava1.stampa();
        System.out.println();
        objava1.shares();
        objava1.shares();
        objava1.dislikes();
        System.out.println("Stampa posle 1 dislike-a i 2 share-a");
        objava1.stampa();
        System.out.println();

        FacebookPost objava2 = new FacebookPost();
        objava2.profilKojiJeObjavio = "Rosa Rosic";
        objava2.profilGdeJeObjavljeno = "Pera Peric";
        objava2.post = "Lorem ipsum";
        objava2.ukupnoLajkova = 0;
        objava2.ukupnoDeljenja = 0;

        objava2.stampa();
        objava2.likes();
        System.out.println();
        System.out.println("Stampa posle 1 like-a");
        objava2.stampa();
        System.out.println();
        objava2.dislikes();
        objava2.dislikes();
        objava2.dislikes();
        objava2.shares();
        System.out.println("Stampa posle 3 dislike-a i 1 share-a");
        objava2.stampa();
        System.out.println();


        FacebookPost objava3 = new FacebookPost("Sandra Milic", "Mijat Milic", "Ovo je tekst objave...");

        objava3.stampa();
        objava3.likes();
        objava3.likes();
        objava3.dislikes();
        objava3.shares();
        System.out.println();
        System.out.println("Stampa posle 2 like-a, 1 dislike-a i 1 share-a");
        objava3.stampa();
        System.out.println();

        FacebookPost objava4 = new FacebookPost("Tiki Tikic", "Tea Teic", "Ovo je tekst objave...");

        objava4.stampa();
        objava4.likes();
        objava4.dislikes();
        objava4.shares();
        System.out.println();
        System.out.println("Stampa posle 1 like-a, 1 dislike-a i 1 share-a");
        objava4.stampa();

    }
}
