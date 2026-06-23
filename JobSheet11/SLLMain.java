/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

import java.util.Scanner;

public class SLLMain {
    // inisialisasi
    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();

        System.out.println("=== INPUT DATA MAHASISWA ===");

        for (int i = 1; i <= 4; i++) {

            System.out.println("\nData Mahasiswa ke-" + i);

            System.out.print("NIM   : ");
            String nim = inputScanner.nextLine();

            System.out.print("Nama  : ");
            String nama = inputScanner.nextLine();

            System.out.print("Kelas : ");
            String kelas = inputScanner.nextLine();

            System.out.print("IPK   : ");
            double ipk = inputScanner.nextDouble();
            inputScanner.nextLine();

            Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        System.out.println("\nData dalam Linked List:");
        sll.print();

        inputScanner.close();
    }
}
