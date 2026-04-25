package praktikum5;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kuota mahasiswa: ");
        int jumlahKuota = input.nextInt();
        input.nextLine(); // membersihkan newline 
        
        MahasiswaBerprestasi dataList = new MahasiswaBerprestasi(jumlahKuota);

        for (int i = 0; i < jumlahKuota; i++) {
            System.out.println("====================================");
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); // membersihkan newline
            
            Mahasiswa mahasiswaBaru = new Mahasiswa(nim, nama, kelas, ipk);
            dataList.tambah(mahasiswaBaru);
        }

        System.out.println("\n--- Data mahasiswa sebelum sorting ---");
        dataList.tampil();

        System.out.println("--- Data Mahasiswa setelah sorting berdasarkan IPK (DESC) dengan BUBBLE SORT ---");
        dataList.bubbleSort();
        dataList.tampil();

        System.out.println("--- Data yang sudah terurut menggunakan SELECTION SORT (ASC) ---");
        dataList.selectionSort();
        dataList.tampil();

        System.out.println("--- Data yang sudah terurut menggunakan INSERTION SORT (DSC) ---");
        dataList.insertionSort();
        dataList.tampil();
    }
}
