/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package CaseMethod1;

import java.util.Scanner;

public class ManajemenPeminjaman {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        
        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] pinjam = {
            new Peminjaman(mhs[0], buku[0], 7),
            new Peminjaman(mhs[1], buku[1], 3),
            new Peminjaman(mhs[2], buku[2], 10),
            new Peminjaman(mhs[2], buku[3], 6),
            new Peminjaman(mhs[0], buku[1], 4)
        };

        Scanner inputScanner = new Scanner(System.in);
        int pilih;

        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampil Mahasiswa & Buku");
            System.out.println("2. Tampil Peminjaman");
            System.out.println("3. Hitung Denda");
            System.out.println("4. Sorting Denda (DESC)");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("6. Cari berdasarkan NAMA");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = inputScanner.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (Mahasiswa m : mhs) {
                        System.out.println(m.nim + " - " + m.nama + " - " + m.prodi);
                    }

                    System.out.println("\nData Buku:");
                    for (Buku b : buku) {
                        System.out.println(b.kode + " - " + b.judul + " - " + b.tahun);
                    }
                    break;

                case 2:
            System.out.println("\nData Peminjaman:");
            for (Peminjaman p : pinjam) {
                System.out.println(
                    p.mhs.nim + " | " + p.mhs.nama + " | " + p.buku.judul + " | " + p.lamaPinjam + " hari");
            }
            break;

                case 3:
    System.out.println("\nPerhitungan Denda:");
    for (Peminjaman p : pinjam) {
        p.hitungDenda();
        System.out.println(
            p.mhs.nim + " | " +
            p.mhs.nama + " | " +
            p.buku.judul + " | " +
            p.lamaPinjam + " hari | Denda: Rp " + p.denda
        );
    }
    break;

                case 4:
                
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nSetelah Sorting:");
                    for (Peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = inputScanner.next();

                    boolean ketemu = false;

                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                // Modifikasi B3
                case 6:
                    System.out.print("Masukkan nama: ");
                    String cariNama = inputScanner.next();
                    boolean ketemuNama = false;

                    for (Peminjaman p : pinjam) {
                    if (p.mhs.nama.equalsIgnoreCase(cariNama)) {
                    p.tampil();
                    ketemuNama = true;
        }
    }

    if (!ketemuNama) {
        System.out.println("Data tidak ditemukan!");
    }
    break;
            }

        } while (pilih != 0);

        System.out.println("Program selesai.");
    }
}