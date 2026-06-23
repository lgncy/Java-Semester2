/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet1;
////PRAKTIKUM PEMILIHAN

import java.util.Scanner;

public class Nilaiakhir {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = inputScanner.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = inputScanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = inputScanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = inputScanner.nextDouble();

        System.out.println("===================================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("===================================");
            return;
        }

        double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.30 * uas);

        String huruf = "";
        double mutu = 0;
        String kualifikasi = "";

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            huruf = "A"; mutu = 4; kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            huruf = "B+"; mutu = 3.5; kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            huruf = "B"; mutu = 3; kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            huruf = "C+"; mutu = 2.5; kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            huruf = "C"; mutu = 2; kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            huruf = "D"; mutu = 1; kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            huruf = "E"; mutu = 0; kualifikasi = "Gagal";
        }

        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + huruf);

         if (mutu >= 2) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }

        System.out.println("===================================");
    }
}
