package praktikum5;

public class MahasiswaBerprestasi {
    Mahasiswa[] daftarMhs;
    int indeks;

    public MahasiswaBerprestasi(int kuota) {
        daftarMhs = new Mahasiswa[kuota];
    }

    void tambah(Mahasiswa m) {
        if (indeks < daftarMhs.length) {
            daftarMhs[indeks] = m;
            indeks++;
        } else {
            System.out.println("Data mahasiswa sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : daftarMhs) {
            m.tampilInformasi();
            System.out.println("=========================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < daftarMhs.length - 1; i++) {
            for (int j = 1; j < daftarMhs.length - i; j++) {
                if (daftarMhs[j].ipk > daftarMhs[j - 1].ipk) {
                    Mahasiswa temp = daftarMhs[j];
                    daftarMhs[j] = daftarMhs[j - 1];
                    daftarMhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < daftarMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < daftarMhs.length; j++) {
                if (daftarMhs[j].ipk < daftarMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa temp = daftarMhs[idxMin];
            daftarMhs[idxMin] = daftarMhs[i];
            daftarMhs[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < daftarMhs.length; i++) {
            Mahasiswa temp = daftarMhs[i];
            int j = i;
            while (j > 0 && daftarMhs[j - 1].ipk < temp.ipk) {
                daftarMhs[j] = daftarMhs[j - 1];
                j--;
            }
            daftarMhs[j] = temp;
        }
    }
}
