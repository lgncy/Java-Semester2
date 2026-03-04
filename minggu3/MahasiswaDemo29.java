package minggu3;

import java.util.Scanner;

public class MahasiswaDemo29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa29[] dataMahasiswa = new Mahasiswa29[3];
        String temp;

        // Input data mahasiswa menggunakan looping
        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = new Mahasiswa29();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            dataMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama  : ");
            dataMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas : ");
            dataMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK   : ");
            temp = input.nextLine();
            dataMahasiswa[i].ipk = Float.parseFloat(temp);
            System.out.println("-----------------------------------");
        }

        // Menampilkan seluruh data mahasiswa
        System.out.println("\n=== HASIL DATA MAHASISWA ===");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            dataMahasiswa[i].cetakInfo();
        }
    }
}
