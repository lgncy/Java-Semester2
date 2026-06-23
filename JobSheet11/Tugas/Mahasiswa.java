/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class Mahasiswa {
    // inisialisasi
    String nim;
    String nama;
    String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
    }
}
