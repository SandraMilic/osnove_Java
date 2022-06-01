package d26_05_2022;

public class ReakcijaFacebookPost_Main {
    public static void main(String[] args) {

        Reakcija p1 = new Reakcija("Milan", "smajli");
        Reakcija p2 = new Reakcija("Sandra", "lajk");
        Reakcija p3 = new Reakcija("Mimi", "srce");
        Reakcija p4 = new Reakcija("Milan", "lajk");
        Reakcija p5 = new Reakcija("Caka", "srce");
        Reakcija p6 = new Reakcija("Vlada", "lajk");
        Reakcija p7 = new Reakcija("Mimisa", "srce");
        Reakcija p8 = new Reakcija("Milos", "lajk");
        Reakcija p9 = new Reakcija("Ana", "smajli");
        Reakcija p10 = new Reakcija("Tiki", "smajli");
        Reakcija p11 = new Reakcija("Joka", "smajli");

        FacebookPost post1 = new FacebookPost("Sandra Milic", "Lorem ipsum");



        post1.dodajReakciju(p1);
        post1.dodajReakciju(p2);
        post1.dodajReakciju(p4);
        post1.dodajReakciju(p5);
        post1.dodajReakciju(p6);
        post1.dodajReakciju(p7);
        post1.dodajReakciju(p8);
        post1.dodajReakciju(p9);
        post1.dodajReakciju(p10);
        post1.dodajReakciju(p11);
        post1.dodajReakciju(p3);

        post1.stampa();
    }
}
