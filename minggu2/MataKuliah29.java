package minggu2;

public class MataKuliah29 {

    // Atribut mata kuliah
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor kosong
    public MataKuliah29() {
    }

    // Konstruktor lengkap dengan parameter
    public MataKuliah29(String kode, String namaMK, int jmlSks, int jam) {
        this.kodeMK = kode;
        this.nama = namaMK;
        this.sks = jmlSks;
        this.jumlahJam = jam;
    }

    // Cetak informasi mata kuliah
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------------");
    }

    // Perbarui nilai SKS
    void ubahSKS(int nilaiSksBaru) {
        this.sks = nilaiSksBaru;
        System.out.println("SKS mata kuliah " + nama + " telah diubah menjadi: " + sks);
    }

    // Menambahkan jam kuliah
    void tambahJam(int tambahanJam) {
        jumlahJam = jumlahJam + tambahanJam;
        System.out.println("Jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
    }

    // Mengurangi jam kuliah dengan pengecekan
    void kurangiJam(int penguranganJam) {
        if (jumlahJam >= penguranganJam) {
            jumlahJam = jumlahJam - penguranganJam;
            System.out.println("Jam berhasil dikurangi. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam saat ini (" + jumlahJam
                    + ") tidak mencukupi untuk dikurangi " + penguranganJam + " jam.");
        }
    }
}
