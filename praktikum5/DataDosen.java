package praktikum5;

public class DataDosen {
    Dosen[] listDosen = new Dosen[10];
    int jumlahData = 0;

    void tambah(Dosen dsn) {
        if (jumlahData < listDosen.length) {
            listDosen[jumlahData] = dsn;
            jumlahData++;
        } else {
            System.out.println("Penyimpanan data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("=== Data Dosen ke-" + (i + 1) + " ===");
            listDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 1; j < jumlahData - i; j++) {
                if (listDosen[j].umur < listDosen[j - 1].umur) {
                    Dosen temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 1; i < jumlahData; i++) {
            Dosen temp = listDosen[i];
            int j = i;
            while (j > 0 && listDosen[j - 1].umur < temp.umur) {
                listDosen[j] = listDosen[j - 1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}
