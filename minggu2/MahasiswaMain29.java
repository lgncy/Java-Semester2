package minggu2;

public class MahasiswaMain29 {

    public static void main(String[] args) {
        // Percobaan 2 - Instansiasi dengan konstruktor default
        System.out.println("=== DATA MHS 1 ===");
        Mahasiswa29 mhs1 = new Mahasiswa29();
        mhs1.nama = "Bagaskara Pratama";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        System.out.println("\nSetelah diubah:");
        mhs1.tampilkanInformasi();

        // Percobaan 3 - Instansiasi dengan konstruktor berparameter
        System.out.println("\n=== DATA MHS 2 ===");
        Mahasiswa29 mhs2 = new Mahasiswa29("Arga Candra Wirawan", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        // Membuat objek mahasiswa dengan data pribadi
        System.out.println("\n=== DATA MHS WILDAN ===");
        Mahasiswa29 mhsWildan = new Mahasiswa29("Wildan Dwi Triatna Kusuma", "254107020030", 3.85, "TI 1C");
        mhsWildan.tampilkanInformasi();
    }
}
