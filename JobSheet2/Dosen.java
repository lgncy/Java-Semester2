/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet2;
//TUGAS 2A

public class Dosen {
    // inisialisasi

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen() {
        idDosen = "";
        nama = "";
        statusAktif = false;
        tahunBergabung = 0;
        bidangKeahlian = "";
    }

    public Dosen(String idBaru, String namaBaru, boolean statusBaru, int tahunBaru, String bidangBaru) {
        idDosen = idBaru;
        nama = namaBaru;
        statusAktif = statusBaru;
        tahunBergabung = tahunBaru;
        bidangKeahlian = bidangBaru;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    public void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
    }

    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    public void ubahKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
    }
}
