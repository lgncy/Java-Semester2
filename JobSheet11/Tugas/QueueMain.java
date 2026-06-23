/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

import java.util.Scanner;

public class QueueMain {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        QueueLinkedList antrian = new QueueLinkedList(10);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Antrian Terdepan");
            System.out.println("5. Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("NIM   : ");
                    String nim = inputScanner.nextLine();

                    System.out.print("Nama  : ");
                    String nama = inputScanner.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = inputScanner.nextLine();

                    Mahasiswa mhs =
                            new Mahasiswa(nim, nama, kelas);

                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    System.out.println(
                            "Jumlah mahasiswa dalam antrian : "
                                    + antrian.getSize());
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);

        inputScanner.close();
    }
}
