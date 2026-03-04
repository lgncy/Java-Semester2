package minggu3;

public class MataKuliah29 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Konstruktor berparameter untuk inisialisasi mata kuliah
    public MataKuliah29(String inputKode, String inputNama, int inputSks, int inputJam) {
        this.kode = inputKode;
        this.nama = inputNama;
        this.sks = inputSks;
        this.jumlahJam = inputJam;
    }

    // Method untuk menampilkan informasi mata kuliah
    public void cetakInfo() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("SKS: " + this.sks);
        System.out.println("Jumlah Jam: " + this.jumlahJam);
        System.out.println("-----------------------------------");
    }
}
