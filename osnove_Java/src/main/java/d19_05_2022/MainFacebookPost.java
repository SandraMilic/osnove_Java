package d19_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();

        post1.profilKojiJeObjavio = "Sandra Milic";
        post1.profilGdeJeObjavljeno = "Petar Petrovic";
        post1.post = "Lorem Ipsum";
        post1.ukupnoLajkova = 0;
        post1.ukupnoDeljenja = 7;

        post1.stampa();

        post1.likes();
        System.out.println();
        System.out.println("Stampa posle 1 like-a");
        post1.stampa();
        System.out.println();
        post1.dislikes();
        post1.dislikes();
        System.out.println("Stampa posle 2 dislike-a");
        post1.stampa();
        System.out.println();
        post1.shares();
        post1.shares();
        System.out.println("Stampa posle 2 share-a");
        post1.stampa();
        System.out.println();

        FacebookPost post2 = new FacebookPost();

        post2.profilKojiJeObjavio = "Mijat Mijatovic";
        post2.profilGdeJeObjavljeno = "Dusan Dusko";
        post2.post = "Lorem ipsum dolor sit amet, consectetur adipiscing elit...";
        post2.ukupnoLajkova = 100;
        post2.ukupnoDeljenja = 93;

        post2.stampa();

        post2.likes();
        post2.likes();
        System.out.println();
        System.out.println("Stampa posle 2 like-a");
        post2.stampa();
        System.out.println();
        post2.dislikes();
        post2.dislikes();
        post2.dislikes();
        post2.dislikes();
        post2.dislikes();
        System.out.println("Stampa posle 5 dislike-a");
        post2.stampa();
        System.out.println();
        post2.shares();
        post2.shares();
        post2.shares();
        post2.shares();
        post2.shares();
        post2.shares();
        System.out.println("Stampa posle 6 share-a");
        post2.stampa();
    }
}
