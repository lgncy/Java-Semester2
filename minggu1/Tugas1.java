package minggu1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi data kode plat dan nama kota
        char[] kodePlat = initializeKodePlat();
        char[][] namaKota = initializeNamaKota();

        // Input dari pengguna
        char inputKode = inputKodePlat(sc);

        // Proses pencarian dan menampilkan hasil
        prosesDataPlat(inputKode, kodePlat, namaKota);
    }

    // Fungsi untuk menginisialisasi array kode plat
    static char[] initializeKodePlat() {
        char[] kode = { 'A', 'B', 'D', 'E', 'G', 'H', 'L', 'N', 'M', 'T' };
        return kode;
    }

    // Fungsi untuk menginisialisasi array 2D nama kota
    static char[][] initializeNamaKota() {
        char[][] kota = {
                { 'B', 'A', 'N', 'T', 'E', 'N' }, // A
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' }, // B
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' }, // D
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' }, // E
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' }, // G
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, // H
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' }, // L
                { 'M', 'A', 'L', 'A', 'N', 'G' }, // N
                { 'M', 'A', 'D', 'U', 'R', 'A' }, // M
                { 'T', 'E', 'G', 'A', 'L' } // T
        };
        return kota;
    }

    // Fungsi untuk input kode plat dari pengguna
    static char inputKodePlat(Scanner scanner) {
        System.out.print("Masukkan Kode Plat Nomor: ");
        char input = scanner.next().toUpperCase().charAt(0);
        return input;
    }

    // Fungsi untuk mencari index kode plat dalam array
    static int cariIndexKode(char input, char[] kodePlat) {
        int index = -1;
        for (int i = 0; i < kodePlat.length; i++) {
            if (input == kodePlat[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Fungsi untuk menampilkan nama kota berdasarkan index
    static void tampilkanNamaKota(int index, char[][] namaKota) {
        System.out.print("Kota: ");
        for (int j = 0; j < namaKota[index].length; j++) {
            System.out.print(namaKota[index][j]);
        }
        System.out.println();
    }

    // Fungsi untuk memproses data plat: mencari dan menampilkan
    static void prosesDataPlat(char input, char[] kodePlat, char[][] namaKota) {
        int index = cariIndexKode(input, kodePlat);

        // Pemilihan: apakah kode ditemukan atau tidak
        if (index != -1) {
            tampilkanNamaKota(index, namaKota);
        } else {
            System.out.println("Maaf, kode plat tidak ditemukan.");
        }
    }
}