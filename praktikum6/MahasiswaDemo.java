package praktikum6;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan total jumlah mahasiswa: ");
        int totalMhs = Integer.parseInt(inputUser.nextLine());
        MahasiswaBerprestasi daftarData = new MahasiswaBerprestasi(totalMhs);

        for (int i = 0; i < totalMhs; i++) {
            System.out.println("====================================");
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nimMhs = inputUser.nextLine();
            System.out.print("Nama  : ");
            String namaMhs = inputUser.nextLine();
            System.out.print("Kelas : ");
            String kelasMhs = inputUser.nextLine();
            System.out.print("IPK   : ");
            String ipkString = inputUser.nextLine();
            Double ipkMhs = Double.parseDouble(ipkString);
            System.out.println("=======================================");
            daftarData.tambah(new Mahasiswa(nimMhs, namaMhs, kelasMhs, ipkMhs));
        }

        daftarData.tampil();
        
        // melakukan pencarian data sequential
        System.out.println("=======================================");
        System.out.println("Pencarian Data (Sequential)");
        System.out.println("=======================================");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari: ");
        System.out.print("IPK Target: ");
        String cariString = inputUser.nextLine();
        double ipkTarget = Double.parseDouble(cariString);

        System.out.println("\n[Hasil Menggunakan Sequential Searching]");
        int hasilPosisiSeq = daftarData.sequentialSearching(ipkTarget);
        daftarData.tampilPosisi(ipkTarget, hasilPosisiSeq);
        daftarData.tampilDataSearch(ipkTarget, hasilPosisiSeq);

        //melakukan pencarian data Binary
        System.out.println("=======================================");
        System.out.println("\n[Hasil Menggunakan Binary Search]");
        System.out.println("=======================================");
        double hasilPosisiBin = daftarData.findBinarySearch(ipkTarget, 0, totalMhs - 1);
        int intPosisiBin = (int) hasilPosisiBin;
        daftarData.tampilPosisi(ipkTarget, intPosisiBin);
        daftarData.tampilDataSearch(ipkTarget, intPosisiBin);
    }
}
