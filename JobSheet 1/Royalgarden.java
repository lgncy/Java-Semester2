/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet1;
//PRAKTIKUM FUNGSI

public class Royalgarden {
    // inisialisasi

    public static int hitungPendapatan(int[] stock, int[] harga) {
        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            total += stock[i] * harga[i];
        }
        return total;
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        // mulai program

        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};
        System.out.println("Pendapatan Tiap Cabang RoyalGarden\n");

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock[i], harga);
            String status = statusCabang(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-----------------------------");
        }
    }
}
