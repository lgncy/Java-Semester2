/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet3;
//TUGAS 2

import java.util.Scanner;
public class DosenDemo05 {
    // inisialisasi

    public static void main(String[] args) {
        // mulai program

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = inputScanner.nextInt();
        inputScanner.nextLine();

        Dosen05[] data = new Dosen05[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.println("\nData Dosen ke-" + (i+1));
            System.out.print("Kode : ");
            String kode = inputScanner.nextLine();
            System.out.print("Nama : ");
            String nama = inputScanner.nextLine();
            System.out.print("Jenis Kelamin (true=Pria / false=Wanita): ");
            boolean jk = inputScanner.nextBoolean();
            System.out.print("Usia : ");
            int usia = inputScanner.nextInt();
            inputScanner.nextLine();

            data[i] = new Dosen05(kode, nama, jk, usia);
        }
        System.out.println("\n===== DATA DOSEN =====");

        for(Dosen05 d : data){
            System.out.println("Kode : " + d.kode);
            System.out.println("Nama : " + d.nama);

            if(d.jenisKelamin){
                System.out.println("Jenis Kelamin : Pria");
            }else{
                System.out.println("Jenis Kelamin : Wanita");
            }
            System.out.println("Usia : " + d.usia);
            System.out.println("---------------------");
        }

        int pria = 0;
        int wanita = 0;

        for(Dosen05 d : data){
            if(d.jenisKelamin){
                pria++;
            }else{
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);

        int totalPria = 0, totalWanita = 0;
        int jPria = 0, jWanita = 0;
        for(Dosen05 d : data){
            if(d.jenisKelamin){
                totalPria += d.usia;
                jPria++;
            }else{
                totalWanita += d.usia;
                jWanita++;
            }
        }

        System.out.println("Rata-rata usia pria : " + (totalPria/jPria));
        System.out.println("Rata-rata usia wanita : " + (totalWanita/jWanita));
        Dosen05 tertua = data[0];
        Dosen05 termuda = data[0];
        for(Dosen05 d : data){

            if(d.usia > tertua.usia){
                tertua = d;
            }
            if(d.usia < termuda.usia){
                termuda = d;
            }
        }

        System.out.println("\nDosen Paling Tua : " + tertua.nama + " (" + tertua.usia + ")");
        System.out.println("Dosen Paling Muda : " + termuda.nama + " (" + termuda.usia + ")");
    }
}