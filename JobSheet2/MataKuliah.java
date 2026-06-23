/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet2;
//TUGAS 1A

public class MataKuliah {
    // inisialisasi

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah() {
    }

    public MataKuliah(String kode, String nm, int sksMK, int jam) {
        kodeMK = kode;
        nama = nm;
        sks = sksMK;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam bertambah. Jumlah jam sekarang adalah: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan gagal! Jam yang tersedia tidak cukup.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Jumlah jam sekarang adalah: " + jumlahJam);
        }
    }
}