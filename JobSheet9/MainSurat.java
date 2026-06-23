/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet9;

import java.util.Scanner;

public class MainSurat {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        StackSurat stack = new StackSurat(5);

        int pilih;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilih = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("ID Surat : ");
                    String id = inputScanner.nextLine();

                    System.out.print("Nama : ");
                    String nama = inputScanner.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = inputScanner.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = inputScanner.next().charAt(0);

                    System.out.print("Durasi : ");
                    int durasi = inputScanner.nextInt();

                    Surat srt = new Surat(id, nama, kelas, jenis, durasi);

                    stack.push(srt);

                    break;

                case 2:

                    Surat proses = stack.pop();

                    if (proses != null) {
                        System.out.println("Surat milik "
                                + proses.namaMahasiswa
                                + " diproses");
                    }

                    break;

                case 3:

                    Surat lihat = stack.peek();

                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        System.out.println("Nama : " + lihat.namaMahasiswa);
                        System.out.println("Kelas : " + lihat.kelas);
                    }

                    break;

                case 4:

                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = inputScanner.nextLine();

                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan");
                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }

                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

    }
}