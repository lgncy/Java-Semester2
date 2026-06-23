/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet1;
////PRAKTIKUM PERULANGAN

import java.util.Scanner;

public class Deretanbilangan {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim = inputScanner.nextLong();
        int n = (int)(nim % 100);

        if (n < 10) {
            n = n + 10;
        }

        System.out.println("n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {
                System.out.print(i + " ");
            }

            else if (i % 3 == 0) {
                System.out.print("# ");
            }

            else if (i % 2 != 0) {
                System.out.print("* ");
            }

            else {
                System.out.print(i + " ");
            }
        }
    }
}
