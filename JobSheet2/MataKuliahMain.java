/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet2;
//TUGAS 1B

public class MataKuliahMain {
    // inisialisasi

    public static void main(String[] args) {
        // mulai program

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println();

        MataKuliah mk2 = new MataKuliah("IF202", "Struktur Data", 3, 5);

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
    }
}