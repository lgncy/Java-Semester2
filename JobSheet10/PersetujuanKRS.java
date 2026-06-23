/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

import java.util.Scanner;

public class PersetujuanKRS {
    // inisialisasi

    static void menu() {
        System.out.println("\n=== MENU ANTRIAN KRS ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Proses KRS (2 Mahasiswa)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Terakhir");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Jumlah Sudah KRS");
        System.out.println("8. Jumlah Belum KRS");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;

        do {
            menu();
            pilih = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = inputScanner.nextLine();

                    System.out.print("Nama  : ");
                    String nama = inputScanner.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = inputScanner.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = inputScanner.nextLine();

                    Mahasiswa mhs =
                            new Mahasiswa(nim, nama, prodi, kelas);

                    antrian.Enqueue(mhs);

                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampilDuaDepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println(
                            "Jumlah antrian : "
                                    + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println(
                            "Sudah proses KRS : "
                                    + antrian.getSudahKRS());
                    break;

                case 8:
                    System.out.println(
                            "Belum proses KRS : "
                                    + antrian.getBelumKRS());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

        inputScanner.close();
    }
}