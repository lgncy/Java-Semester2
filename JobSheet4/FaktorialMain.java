/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet4;

import java.util.Scanner;

public class FaktorialMain {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int n = inputScanner.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Hasil Faktorial BF: " + fk.faktorialBF(n));
        System.out.println("Hasil Faktorial DC: " + fk.faktorialDC(n));
    }
}