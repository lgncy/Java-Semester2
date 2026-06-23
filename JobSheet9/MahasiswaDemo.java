/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet9;

import java.util.Scanner;

public class MahasiswaDemo {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        TugasMahasiswa stack = new TugasMahasiswa(5);

        Scanner inputScanner = new Scanner(System.in);

        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");

            System.out.print("Pilih: ");
            pilih = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama: ");
                    String nama = inputScanner.nextLine();

                    System.out.print("NIM: ");
                    String nim = inputScanner.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = inputScanner.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kelas);

                    stack.push(mhs);

                    System.out.println("Tugas " + nama + " berhasil dikumpulkan");

                    break;

                case 2:

                    Mahasiswa dinilai = stack.pop();

                    if (dinilai != null) {

                        System.out.println("Menilai tugas dari " + dinilai.nama);

                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = inputScanner.nextInt();

                        dinilai.tugasDinilai(nilai);

                        System.out.println(
                            "Nilai Tugas " +
                            dinilai.nama +
                            " adalah " +
                            dinilai.nilai
                        );
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai Biner Tugas: " + biner);
                    }

                    break;

                case 3:

                    Mahasiswa lihat = stack.peek();

                    if (lihat != null) {
                        System.out.println(
                            "Tugas terakhir dikumpulkan oleh " +
                            lihat.nama
                        );
                    }

                    break;

                case 4:

                    stack.print();

                    break;

                case 5:
                Mahasiswa bawah = stack.lihatTerbawah();
                if (bawah != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " +bawah.nama);
                }
                break;

                case 6:
                System.out.println("Jumlah tugas yang terkumpul: " +stack.jumlahTugas());
                break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}