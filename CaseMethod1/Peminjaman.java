/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package CaseMethod1;

class Peminjaman {
    // inisialisasi
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;
    String kategori;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }  

    // Modifikasi A3
    void tentukanKategori() {
    if (lamaPinjam <= 3) {
        kategori = "Cepat";
    } else if (lamaPinjam <= 5) {
        kategori = "Normal";
    } else {
        kategori = "Lama";
    }
    }

    void hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;
        if (lamaPinjam > batas) {
            int terlambat = lamaPinjam - batas;
            denda = terlambat * dendaPerHari;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul +
                " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}