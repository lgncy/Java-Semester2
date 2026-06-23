/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet1;
////PRAKTIKUM ARRAY

import java.util.Scanner;

public class MenghitungIP {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("=============================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jml = inputScanner.nextInt();
        inputScanner.nextLine();

        String[] nama = new String[jml];
        int[] sks = new int[jml];
        String[] huruf = new String[jml];
        double[] setara = new double[jml];

        double totalNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < jml; i++) {

            System.out.println("\nData MK ke-" + (i + 1));

            System.out.print("Nama MK: ");
            nama[i] = inputScanner.nextLine();

            System.out.print("Bobot SKS: ");
            sks[i] = inputScanner.nextInt();
            inputScanner.nextLine();

            System.out.print("Nilai Huruf (A/B+/B/C+/C/D/E): ");
            huruf[i] = inputScanner.nextLine();

            if (huruf[i].equalsIgnoreCase("A")) setara[i] = 4.0;
            else if (huruf[i].equalsIgnoreCase("B+")) setara[i] = 3.5;
            else if (huruf[i].equalsIgnoreCase("B")) setara[i] = 3.0;
            else if (huruf[i].equalsIgnoreCase("C+")) setara[i] = 2.5;
            else if (huruf[i].equalsIgnoreCase("C")) setara[i] = 2.0;
            else if (huruf[i].equalsIgnoreCase("D")) setara[i] = 1.0;
            else setara[i] = 0.0;

            totalNilai += setara[i] * sks[i];
            totalSks += sks[i];
        }
        System.out.println("================================");
        System.out.println("\n--- Tabel Konversi Nilai ---");
        System.out.println("================================");

        for (int i = 0; i < jml; i++) {
            System.out.println("Mata Kuliah : " + nama[i]);
            System.out.println("SKS         : " + sks[i]);
            System.out.println("Nilai Huruf : " + huruf[i]);
            System.out.println("Setara      : " + setara[i]);
            System.out.print("=============================");
        }
        double ip = totalNilai / totalSks;

        System.out.println("Total SKS: " + totalSks);
        System.out.println("=============================");
        System.out.println("IP Semester: " + ip);
    }
}
