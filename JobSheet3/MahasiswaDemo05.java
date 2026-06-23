/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet3;

import java.util.Scanner;
public class MahasiswaDemo05 {
    // inisialisasi

    public static void main(String[] args) {
        // mulai program

       Scanner inputScanner = new Scanner(System.in);
       Mahasiswa05[] mahasiswa = new Mahasiswa05[3];
       String dummy;

for(int i=0; i < 3; i++) {
    mahasiswa[i] = new Mahasiswa05();

    System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
    System.out.print("NIM  : ");
    mahasiswa[i].nim = inputScanner.nextLine();
    System.out.print("Nama : ");
    mahasiswa[i].nama = inputScanner.nextLine();
    System.out.print("Kelas : ");
    mahasiswa[i].kelas = inputScanner.nextLine();
    System.out.print("IPK : ");
    dummy = inputScanner.nextLine();
    mahasiswa[i].ipk = Float.parseFloat(dummy);
    System.out.println("-------------------------------");
}

        for(int i=0; i < 3; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    System.out.println("NIM   : " + mahasiswa[i].nim);
    System.out.println("Nama  : " + mahasiswa[i].nama);
    System.out.println("Kelas : " + mahasiswa[i].kelas);
    System.out.println("IPK   : " + mahasiswa[i].ipk);
    System.out.println("------------------------------------");
}
    }
}