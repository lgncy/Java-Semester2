/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet1;
//TUGAS 1

import java.util.Scanner;

public class Platkendaraan {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program
        Scanner inputScanner = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'L', 'N', 'S', 'T'};
        String[][] kota = {
            {"B","A","N","T","E","N"},
            {"J","A","K","A","R","T","A"},
            {"B","A","N","D","U","N","G"},
            {"C","I","R","E","B","O","N"},
            {"B","O","G","O","R"},
            {"P","E","K","A","L","O","N","G","A","N"},
            {"S","U","R","A","B","A","Y","A"},
            {"M","A","L","A","N","G"},
            {"S","U","M","E","N","E","P"},
            {"T","E","G","A","L"}
        };

        System.out.print("Masukkan kode plat (huruf pertama): ");
        String input = inputScanner.next();
        char hurufInput = inputScanner.charAt(0);
        boolean ketemu = false;

        for (int i = 0; i < kode.length; i++) {
            if (hurufInput == kode[i]) {

                ketemu = true;

                System.out.print("Nama Kota: ");

                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                System.out.println();
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
