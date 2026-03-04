package minggu1;

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Inisialisasi data jadwal
        String[][] dataJadwal = initializeJadwal();

        // Jalankan menu utama program
        jalankanMenuUtama(dataJadwal);
    }

    // Fungsi untuk menginisialisasi array jadwal berdasarkan input user
    static String[][] initializeJadwal() {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int jumlahJadwal = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[jumlahJadwal][4];
        inputDataJadwal(jadwal);
        return jadwal;
    }

    // Fungsi untuk menampilkan menu dan mengelola pilihan user
    static void jalankanMenuUtama(String[][] jadwal) {
        int pilihanMenu;
        do {
            tampilkanMenu();
            pilihanMenu = dapatkanPilihanMenu();
            prosesMenu(pilihanMenu, jadwal);
        } while (pilihanMenu != 4);
    }

    // Fungsi untuk menampilkan menu pilihan
    static void tampilkanMenu() {
        System.out.println("\n=== Menu Jadwal Kuliah ===");
        System.out.println("1. Tampilkan Seluruh Jadwal");
        System.out.println("2. Cari Jadwal Berdasarkan Hari");
        System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }

    // Fungsi untuk mendapatkan input pilihan menu dari user
    static int dapatkanPilihanMenu() {
        int pilihan = sc.nextInt();
        sc.nextLine();
        return pilihan;
    }

    // Fungsi untuk memproses pilihan menu yang dipilih user
    static void prosesMenu(int pilihan, String[][] jadwal) {
        switch (pilihan) {
            case 1:
                tampilkanSemuaJadwal(jadwal);
                break;
            case 2:
                pencarianBerdasarkanHari(jadwal);
                break;
            case 3:
                pencarianBerdasarkanMataKuliah(jadwal);
                break;
        }
    }

    // Fungsi untuk menginput data jadwal ke dalam array 2 dimensi
    static void inputDataJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            inputSatuJadwal(jadwal, i);
        }
    }

    // Fungsi untuk menginput satu baris jadwal
    static void inputSatuJadwal(String[][] jadwal, int index) {
        System.out.println("\nInput Jadwal ke-" + (index + 1));
        jadwal[index][0] = inputField("Nama Mata Kuliah : ");
        jadwal[index][1] = inputField("Ruang            : ");
        jadwal[index][2] = inputField("Hari             : ");
        jadwal[index][3] = inputField("Jam Kuliah       : ");
    }

    // Fungsi helper untuk input field
    static String inputField(String label) {
        System.out.print(label);
        return sc.nextLine();
    }

    // Fungsi untuk menampilkan semua jadwal dalam format tabel
    static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println();
        printSeparatorTabel();
        printHeaderTabel();
        printSeparatorTabel();

        if (cekDataKosong(jadwal)) {
            System.out.println("Data jadwal kosong.");
        } else {
            printIsiTabel(jadwal);
        }

        printSeparatorTabel();
    }

    // Fungsi untuk print separator garis tabel
    static void printSeparatorTabel() {
        System.out.println("----------------------------------------------------------------------------");
    }

    // Fungsi untuk print header tabel
    static void printHeaderTabel() {
        System.out.printf("| %-20s | %-10s | %-10s | %-15s |\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
    }

    // Fungsi untuk print isi tabel
    static void printIsiTabel(String[][] jadwal) {
        for (String[] baris : jadwal) {
            printBarisTabel(baris);
        }
    }

    // Fungsi untuk print satu baris tabel
    static void printBarisTabel(String[] baris) {
        System.out.printf("| %-20s | %-10s | %-10s | %-15s |\n", baris[0], baris[1], baris[2], baris[3]);
    }

    // Fungsi untuk mengecek apakah data kosong
    static boolean cekDataKosong(String[][] jadwal) {
        return jadwal.length == 0;
    }

    // Fungsi untuk pencarian jadwal berdasarkan hari
    static void pencarianBerdasarkanHari(String[][] jadwal) {
        String hariDicari = inputHariDicari();
        tampilkanHeaderHasil(hariDicari);

        boolean statusDitemukan = cariDanTampilkanBerdasarkanHari(jadwal, hariDicari);

        if (!statusDitemukan) {
            tampilkanPesanTidakDitemukan("hari");
        }
    }

    // Fungsi untuk input hari yang dicari
    static String inputHariDicari() {
        System.out.print("Masukkan hari yang dicari: ");
        return sc.nextLine();
    }

    // Fungsi untuk menampilkan header hasil pencarian
    static void tampilkanHeaderHasil(String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
    }

    // Fungsi untuk mencari dan menampilkan jadwal berdasarkan hari
    static boolean cariDanTampilkanBerdasarkanHari(String[][] jadwal, String hari) {
        boolean ditemukan = false;

        for (String[] baris : jadwal) {
            if (cocokDenganHari(baris, hari)) {
                tampilkanDetailJadwalHari(baris);
                ditemukan = true;
            }
        }

        return ditemukan;
    }

    // Fungsi untuk mengecek apakah baris cocok dengan hari
    static boolean cocokDenganHari(String[] baris, String hari) {
        return baris[2].equalsIgnoreCase(hari);
    }

    // Fungsi untuk menampilkan detail jadwal per hari
    static void tampilkanDetailJadwalHari(String[] baris) {
        System.out.printf("- %s (%s) Jam %s di %s\n", baris[0], baris[2], baris[3], baris[1]);
    }

    // Fungsi untuk pencarian jadwal berdasarkan mata kuliah
    static void pencarianBerdasarkanMataKuliah(String[][] jadwal) {
        String matkulDicari = inputMataKuliahDicari();

        boolean statusDitemukan = cariDanTampilkanBerdasarkanMatkul(jadwal, matkulDicari);

        if (!statusDitemukan) {
            tampilkanPesanTidakDitemukan("mata kuliah");
        }
    }

    // Fungsi untuk input mata kuliah yang dicari
    static String inputMataKuliahDicari() {
        System.out.print("Masukkan nama mata kuliah: ");
        return sc.nextLine();
    }

    // Fungsi untuk mencari dan menampilkan jadwal berdasarkan mata kuliah
    static boolean cariDanTampilkanBerdasarkanMatkul(String[][] jadwal, String matkul) {
        boolean ditemukan = false;

        for (String[] baris : jadwal) {
            if (cocokDenganMatkul(baris, matkul)) {
                tampilkanDetailJadwalMatkul(baris);
                ditemukan = true;
            }
        }

        return ditemukan;
    }

    // Fungsi untuk mengecek apakah baris cocok dengan mata kuliah
    static boolean cocokDenganMatkul(String[] baris, String matkul) {
        return baris[0].equalsIgnoreCase(matkul);
    }

    // Fungsi untuk menampilkan detail jadwal mata kuliah
    static void tampilkanDetailJadwalMatkul(String[] baris) {
        System.out.printf("\nDetail Matkul: %s | Ruang: %s | Hari: %s | Jam: %s\n",
                baris[0], baris[1], baris[2], baris[3]);
    }

    // Fungsi untuk menampilkan pesan tidak ditemukan
    static void tampilkanPesanTidakDitemukan(String jenis) {
        if (jenis.equals("hari")) {
            System.out.println("Maaf, tidak ada jadwal kuliah pada hari tersebut.");
        } else {
            System.out.println("Maaf, mata kuliah tersebut tidak ditemukan.");
        }
    }
}