/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet9;

public class Surat {
    // inisialisasi
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat() {

    }

    Surat(String id, String nama, String kls, char jenis, int dur) {
        idSurat = id;
        namaMahasiswa = nama;
        kelas = kls;
        jenisIzin = jenis;
        durasi = dur;
    }
}