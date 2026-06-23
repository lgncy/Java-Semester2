/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class Mahasiswa05 {
    // inisialisasi
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa05(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}
