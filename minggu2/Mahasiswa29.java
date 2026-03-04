package minggu2;

public class Mahasiswa29 {

    // Atribut class Mahasiswa
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor tanpa parameter
    public Mahasiswa29() {
    }

    // Konstruktor dengan parameter
    public Mahasiswa29(String inputNama, String inputNim, double inputIpk, String inputKelas) {
        this.nama = inputNama;
        this.nim = inputNim;
        this.ipk = inputIpk;
        this.kelas = inputKelas;
    }

    // Menampilkan seluruh data mahasiswa
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    // Mengubah kelas mahasiswa
    void ubahKelas(String klsBaru) {
        this.kelas = klsBaru;
    }

    // Update IPK dengan validasi rentang 0.0 sampai 4.0
    void updateIpk(double nilaiIpkBaru) {
        if (nilaiIpkBaru >= 0.0 && nilaiIpkBaru <= 4.0) {
            this.ipk = nilaiIpkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    // Evaluasi kinerja berdasarkan IPK
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
