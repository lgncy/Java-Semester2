/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    // inisialisasi

    public static void menu() {
        System.out.println("\n===== MENU LAYANAN AKADEMIK =====");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Tampilkan Semua Antrian");
        System.out.println("5. Tampilkan Jumlah Antrian");
        System.out.println("6. Cek Antrian Paling Belakang");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        AntrianLayanan antrian = new AntrianLayanan(5);

        int pilihan;

        do {
            menu();
            pilihan = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("NIM   : ");
                    String nim = inputScanner.nextLine();

                    System.out.print("Nama  : ");
                    String nama = inputScanner.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = inputScanner.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = inputScanner.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);

                    antrian.Enqueue(mhs);

                    System.out.println("Mahasiswa berhasil masuk antrian");
                    break;

                case 2:
                    Mahasiswa dipanggil = antrian.Dequeue();

                    if (dipanggil != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        dipanggil.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    System.out.println("Jumlah antrian saat ini = "
                            + antrian.getJumlahAntrian());
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilihan != 0);

        inputScanner.close();
    }
}