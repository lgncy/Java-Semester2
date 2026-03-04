package minggu3;

import java.util.Scanner;

public class MataKuliahDemo29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MataKuliah29[] daftarMK = new MataKuliah29[3];
        String kodeMK, namaMK, temp;
        int nilaiSks, jam;

        for (int i = 0; i < daftarMK.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: ");
            kodeMK = input.nextLine();
            System.out.println("Nama: ");
            namaMK = input.nextLine();
            System.out.println("SKS: ");
            temp = input.nextLine();
            nilaiSks = Integer.parseInt(temp);
            System.out.println("Jumlah Jam: ");
            temp = input.nextLine();
            jam = Integer.parseInt(temp);
            System.out.println("-----------------------------------");

            daftarMK[i] = new MataKuliah29(kodeMK, namaMK, nilaiSks, jam);
        }

        System.out.println("\n=== HASIL DATA MAHASISWA ===");
        for (int i = 0; i < daftarMK.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            daftarMK[i].cetakInfo();
        }
    }
}
