/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

import java.util.Scanner;

public class MainRoyalDelish {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);

        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();

        int pilih;

        do {
            System.out.println("\n===== ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Cari Pembeli");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu : ");
            pilih = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = inputScanner.nextLine();

                    System.out.print("No HP : ");
                    String hp = inputScanner.nextLine();

                    antrian.tambahAntrian(
                            new Pembeli(nama, hp));

                    System.out.println(
                            "Pembeli masuk antrian.");
                    break;

                case 2:

                    antrian.tampilAntrian();
                    break;

                case 3:

                    NodePembeli dipanggil =
                            antrian.hapusAntrian();

                    if (dipanggil != null) {

                        System.out.println(
                                "Melayani : "
                                + dipanggil.data.namaPembeli);

                        System.out.print(
                                "Kode Pesanan : ");
                        int kode = inputScanner.nextInt();
                        inputScanner.nextLine();

                        System.out.print(
                                "Nama Pesanan : ");
                        String namaPesanan =
                                inputScanner.nextLine();

                        System.out.print(
                                "Harga : ");
                        int harga = inputScanner.nextInt();

                        pesanan.tambahPesanan(
                                new Pesanan(
                                        kode,
                                        namaPesanan,
                                        harga));
                    }
                    break;

                case 4:

                    pesanan.tampilPesanan();
                    break;

                case 5:
                    System.out.print("Masukkan nama pembeli : ");
                    String cari = inputScanner.nextLine();
                    antrian.cariPembeli(cari);
                    break;

                case 6:

                    System.out.println(
                            "Program selesai.");
                    break;

                default:

                    System.out.println(
                            "Menu tidak tersedia!");
            }

        } while (pilih != 6);
    }
}
