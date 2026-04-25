package praktikum5;
import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner inputAngka = new Scanner(System.in);
        Scanner inputTeks = new Scanner(System.in);
        DataDosen daftarData = new DataDosen();
        int pilihanMenu;

        do {
            System.out.println("\n*** SISTEM DATA DOSEN ***");
            System.out.println("1. Tambahkan Data Dosen");
            System.out.println("2. Tampilkan Semua Data Dosen");
            System.out.println("3. Urutkan Berdasarkan Umur (ASC - Termuda ke Tertua)");
            System.out.println("4. Urutkan Berdasarkan Umur (DSC - Tertua ke Termuda)");
            System.out.println("5. Keluar Aplikasi");
            System.out.print("Pilih opsi (1-5): ");
            pilihanMenu = inputAngka.nextInt();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("\n--- Masukkan Data Dosen Baru ---");
                    System.out.print("ID Dosen: ");
                    String id = inputTeks.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = inputTeks.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String inputJk = inputTeks.nextLine();
                    boolean jk = inputJk.equalsIgnoreCase("L");
                    System.out.print("Umur: ");
                    int umur = inputAngka.nextInt();

                    Dosen dosenBaru = new Dosen(id, nama, jk, umur);
                    daftarData.tambah(dosenBaru);
                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Semua Dosen ---");
                    daftarData.tampil();
                    break;

                case 3:
                    System.out.println("\n--- Data Dosen Berdasarkan Umur (Ascending) ---");
                    daftarData.sortingASC();
                    daftarData.tampil();
                    break;

                case 4:
                    System.out.println("\n--- Data Dosen Berdasarkan Umur (Descending) ---");
                    daftarData.sortingDSC();
                    daftarData.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;

                default:
                    System.out.println("Opsi menu tidak dikenali!");
            }
        } while (pilihanMenu != 5);
        
        inputAngka.close();
        inputTeks.close();
    }
}
