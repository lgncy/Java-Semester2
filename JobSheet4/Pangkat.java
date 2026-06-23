/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet4;

class Pangkat {
    // inisialisasi
    int nilai;
    int pangkat;

    Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int hasil = pangkatDC(a, n / 2);
            return hasil * hasil;
        } else {
            int hasil = pangkatDC(a, (n - 1) / 2);
            return hasil * hasil * a;
        }
    }
}