/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public public class Mahasiswa {
    // inisialisasi
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Kelas : " + kelas);
    }
}