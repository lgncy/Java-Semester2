/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet2;
//TUGAS 2B

public class DosenMain {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        Dosen d1 = new Dosen();
        d1.idDosen = "001";
        d1.nama = "Budi Santoso";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Jaringan Komputer";

        System.out.println("=== Data Dosen 1 ===");
        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        System.out.println();

        Dosen d2 = new Dosen("002", "Siti Aminah", false, 2018, "Pemrograman");

        System.out.println("=== Data Dosen 2 ===");
        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2026) + " tahun");
    }
}