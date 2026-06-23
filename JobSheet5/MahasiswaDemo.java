/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet5;

import java.util.Scanner;

public class MahasiswaDemo {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program
        Scanner inputScanner = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = inputScanner.nextInt();
        inputScanner.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = inputScanner.nextLine();

            System.out.print("Nama  : ");
            String nama = inputScanner.nextLine();

            System.out.print("Kelas : ");
            String kelas = inputScanner.nextLine();

            System.out.print("IPK   : ");
            double ipk = inputScanner.nextDouble();
            inputScanner.nextLine();

            Mahasiswa m = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}