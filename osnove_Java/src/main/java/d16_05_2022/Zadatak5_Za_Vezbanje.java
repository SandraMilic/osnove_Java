package d16_05_2022;

public class Zadatak5_Za_Vezbanje {
//    (Za vezbanje)
//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//    Primer izvrsenja:
//    izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//    izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//     Napomena: Resiti bez koriscenja petlji.

    public static void main(String[] args) {

        int m = -7;
        int n = 3;

        int z = prebrojavanje(m, n);
        System.out.println("Izbroji (" + m + ", " + n + ") ima za rezultat " + z);

    }

    static int prebrojavanje(int x, int y) {

//  Pod uslovom da je x (prvi uneti broj) uvek manji od y (drugi uneti broj)!

        if (x < 0 && y < 0) {
            return -x - (-y) - 1;
        } else if (x < 0 && y == 0) {
            return -x - 1;
        } else if (x < 0 && y > 0) {
            return -x + y - 1;
        } else if (x == 0 && y > 0) {
            return y - 1;
        } else { // x > 0 && y > 0
            return y - x - 1;
        }
    }
}


