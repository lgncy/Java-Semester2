/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet3;

import java.util.Scanner;

public class MatakuliahDemo05 {
    // inisialisasi

    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        Matakuliah05[] matakuliah = new Matakuliah05[3];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode : ");
            kode = inputScanner.next();
            System.out.print("Nama : ");
            nama = inputScanner.next();
            System.out.print("SKS : ");
            sks = inputScanner.nextInt();
            System.out.print("Jumlah Jam : ");
            jumlahJam = inputScanner.nextInt();
            System.out.println("-------------------------");
            matakuliah[i] = new Matakuliah05(kode, nama, sks, jumlahJam);
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + matakuliah[i].kode);
            System.out.println("Nama       : " + matakuliah[i].nama);
            System.out.println("SKS        : " + matakuliah[i].sks);
            System.out.println("Jumlah Jam : " + matakuliah[i].jumlahJam);
            System.out.println("-----------------------------");
        }
    }
}