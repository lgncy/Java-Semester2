/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet2;

public class Mahasiswa05 {
    // inisialisasi

    String nama;
    String nim;
    double ipk;
    String kelas;

    public Mahasiswa05() {
    }

    public Mahasiswa05(String namaBaru, String nimBaru, double ipkBaru, String kelasBaru) {
        nama  = namaBaru;
        nim   = nimBaru;
        ipk   = ipkBaru;
        kelas = kelasBaru;
    }

    void tampilkanInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
}

void ubahKelas(String kelasBaru) {
    kelas = kelasBaru;
}

void updateIpk(double ipkBaru) {
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    } else {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");
    }
}

String nilaiKinerja() {
    if (ipk >= 3.5) {
        return "Kinerja sangat baik";
    } else if (ipk >= 3.0) {
        return "Kinerja baik";
    } else if (ipk >= 2.0) {
        return "Kinerja cukup";
    } else {
        return "Kinerja kurang";
    }
    }
}