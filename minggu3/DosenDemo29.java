package minggu3;

import java.util.Scanner;

public class DosenDemo29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kodeDosen, namaDosen, jkInput, temp;
        int umur;
        Boolean jk;

        System.out.println("Masukkan jumlah dosen yang ingin di-input");
        int jumlahDosen = Integer.parseInt(input.nextLine());

        Dosen29[] daftarDosen = new Dosen29[jumlahDosen];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.println("Kode: ");
            kodeDosen = input.nextLine();
            System.out.println("Nama: ");
            namaDosen = input.nextLine();
            System.out.println("Jenis Kelamin (Pria/Wanita): ");
            jkInput = input.nextLine();

            if (jkInput.equalsIgnoreCase("Pria")) {
                jk = true;
            } else {
                jk = false;
            }

            System.out.println("Usia: ");
            temp = input.nextLine();
            umur = Integer.parseInt(temp);

            System.out.println("-----------------------------------");

            daftarDosen[i] = new Dosen29(kodeDosen, namaDosen, jk, umur);
        }

        DataDosen29.dataSemuaDosen(daftarDosen);
        DataDosen29.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen29.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen29.InfoDosenPalingTua(daftarDosen);
        DataDosen29.InfoDosenPalingMuda(daftarDosen);
    }
}
