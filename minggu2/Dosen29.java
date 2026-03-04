package minggu2;

public class Dosen29 {

    // Atribut data dosen
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor tanpa parameter
    public Dosen29() {
    }

    // Konstruktor dengan parameter lengkap
    public Dosen29(String id, String namaDosen, boolean aktif, int thnGabung, String keahlian) {
        this.idDosen = id;
        this.nama = namaDosen;
        this.statusAktif = aktif;
        this.tahunBergabung = thnGabung;
        this.bidangKeahlian = keahlian;
    }

    // Cetak seluruh informasi dosen
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("---------------------------------");
    }

    // Mengatur status aktif dosen
    void setStatusAktif(boolean statusBaru) {
        this.statusAktif = statusBaru;
        System.out
                .println("Status aktif dosen " + nama + " diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // Menghitung lama masa kerja dosen
    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    // Mengubah bidang keahlian dosen
    void ubahKeahlian(String keahlianBaru) {
        this.bidangKeahlian = keahlianBaru;
        System.out.println("Bidang keahlian " + nama + " diubah menjadi: " + bidangKeahlian);
    }
}
