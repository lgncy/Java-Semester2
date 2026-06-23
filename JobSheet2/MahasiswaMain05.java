/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet2;

public class MahasiswaMain05 {
    // inisialisasi

    public static void main(String[] args) {
        // mulai program

        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "254107020030";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila", "254107020030", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa05 mhs3 = new Mahasiswa05("Bagus Saputra", "254107020030", 3.67, "TI 1C");
        mhs3.tampilkanInformasi();
    }
}