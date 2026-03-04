package minggu3;

public class DataDosen29 {

    // Menampilkan seluruh data dosen
    public static void dataSemuaDosen(Dosen29[] daftarDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        for (int i = 0; i < daftarDosen.length; i++) {
            String jk = daftarDosen[i].jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Kode: " + daftarDosen[i].kode);
            System.out.println("Nama: " + daftarDosen[i].nama);
            System.out.println("Jenis Kelamin: " + jk);
            System.out.println("Usia: " + daftarDosen[i].usia);
            System.out.println("-----------------------------------");
        }
    }

    // Menghitung jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen29[] daftarDosen) {
        int totalPria = 0;
        int totalWanita = 0;

        for (int i = 0; i < daftarDosen.length; i++) {
            if (daftarDosen[i].jenisKelamin) {
                totalPria++;
            } else {
                totalWanita++;
            }
        }
        System.out.println("JUMLAH DOSEN PER JENIS KELAMIN");
        System.out.println("Jumlah Pria   : " + totalPria);
        System.out.println("Jumlah Wanita : " + totalWanita);
    }

    // Menghitung rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen29[] daftarDosen) {
        int sumUsiaPria = 0, sumUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (int i = 0; i < daftarDosen.length; i++) {
            if (daftarDosen[i].jenisKelamin) {
                sumUsiaPria = sumUsiaPria + daftarDosen[i].usia;
                countPria++;
            } else {
                sumUsiaWanita = sumUsiaWanita + daftarDosen[i].usia;
                countWanita++;
            }
        }
        System.out.println("=== RATA-RATA USIA DOSEN ===");
        if (countPria > 0) {
            System.out.println("Pria : " + (double) sumUsiaPria / countPria);
        }
        if (countWanita > 0) {
            System.out.println("Wanita : " + (double) sumUsiaWanita / countWanita);
        }
    }

    // Mencari dan menampilkan dosen paling tua
    public static void InfoDosenPalingTua(Dosen29[] daftarDosen) {
        Dosen29 dosenTertua = daftarDosen[0];
        for (int i = 1; i < daftarDosen.length; i++) {
            if (daftarDosen[i].usia > dosenTertua.usia) {
                dosenTertua = daftarDosen[i];
            }
        }
        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Nama : " + dosenTertua.nama);
        System.out.println("Usia : " + dosenTertua.usia);
    }

    // Mencari dan menampilkan dosen paling muda
    public static void InfoDosenPalingMuda(Dosen29[] daftarDosen) {
        Dosen29 dosenTermuda = daftarDosen[0];
        for (int i = 1; i < daftarDosen.length; i++) {
            if (daftarDosen[i].usia < dosenTermuda.usia) {
                dosenTermuda = daftarDosen[i];
            }
        }
        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Nama : " + dosenTermuda.nama);
        System.out.println("Usia : " + dosenTermuda.usia);
    }

}
