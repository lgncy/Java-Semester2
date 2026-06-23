/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class Mahasiswa {
    // inisialisasi
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("-----------------------");
    }
}
