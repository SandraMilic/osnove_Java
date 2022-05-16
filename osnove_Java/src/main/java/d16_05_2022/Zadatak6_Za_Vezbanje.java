package d16_05_2022;

public class Zadatak6_Za_Vezbanje {
//    (Za vezbanje)
//    Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//    U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

    public static void main(String[] args) {

        int a = -96;
        int b = -128;
        int c = 1;

        int najmanjiBroj = nadjiNajmanjiBroj(a, b, c);

        System.out.println("Najmanji broj je " + najmanjiBroj);

    }

    static int nadjiNajmanjiBroj(int x, int y, int z) {

        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }
}
