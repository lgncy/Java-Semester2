package minggu2;

public class MataKuliahMain29 {

    public static void main(String[] args) {
        System.out.println("--- LATIHAN MATA KULIAH OLEH WILDAN DWI TRIATNA (29) ---");

        // Objek pertama - dibuat menggunakan konstruktor kosong
        System.out.println("\n=== DATA MATA KULIAH 1 ===");
        MataKuliah29 mk1 = new MataKuliah29();
        mk1.kodeMK = "ASD26";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        // Pemanggilan method untuk objek mk1
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(10);
        mk1.kurangiJam(2);

        // Objek kedua - dibuat menggunakan konstruktor berparameter
        System.out.println("\n=== DATA MATA KULIAH 2 ===");
        MataKuliah29 mk2 = new MataKuliah29("PBO26", "Pemrograman Berorientasi Objek", 3, 6);

        // Pemanggilan method untuk objek mk2
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
    }
}
