/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet4;

import java.util.Scanner;

public class PangkatMain {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = inputScanner.nextInt();

        Pangkat[] png = new Pangkat[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai: ");
            int nilai = inputScanner.nextInt();

            System.out.print("Masukkan pangkat: ");
            int pangkat = inputScanner.nextInt();

            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("\nHasil Pangkat:");
        for (int i = 0; i < n; i++) {
            System.out.println("BF: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            System.out.println("DC: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}