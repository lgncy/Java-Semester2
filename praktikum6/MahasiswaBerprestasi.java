package praktikum6;

public class MahasiswaBerprestasi {
    Mahasiswa[] daftarMahasiswa;
    int jumlahData;

    public MahasiswaBerprestasi() {
        daftarMahasiswa = new Mahasiswa[5];
    }

    public MahasiswaBerprestasi(int jumlahMhs) {
        daftarMahasiswa = new Mahasiswa[jumlahMhs];
    }

    void tambah(Mahasiswa m) {
        if (jumlahData < daftarMahasiswa.length) {
            daftarMahasiswa[jumlahData] = m;
            jumlahData++;
        } else {
            System.out.println("Penyimpanan data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("=========================");
            }
        }
    }

    // PENANDA: INI ADALAH METHOD UNTUK SEQUENTIAL SEARCH
    int sequentialSearching(double cariIPK) {
        int indexHasil = -1;
        for (int j = 0; j < daftarMahasiswa.length; j++) {
            if (daftarMahasiswa[j] != null && daftarMahasiswa[j].ipk == cariIPK) {
                indexHasil = j;
                break;
            }
        }
        return indexHasil;
    }

    
    // PENANDA: INI ADALAH METHOD UNTUK BINARY SEARCH
    int findBinarySearch(double cariIPK, int batasKiri, int batasKanan) {
        int nilaiTengah;
        if (batasKanan >= batasKiri) {
            nilaiTengah = (batasKiri + batasKanan) / 2;
            if (cariIPK == daftarMahasiswa[nilaiTengah].ipk) {
                return (nilaiTengah);
            // PROSES DIVIDE & CONQUER:
            } else if (daftarMahasiswa[nilaiTengah].ipk < cariIPK) { // Tanda diubah dari > menjadi < untuk pengurutan DESCENDING
                return findBinarySearch(cariIPK, batasKiri, nilaiTengah - 1);
            } else {
                return findBinarySearch(cariIPK, nilaiTengah + 1, batasKanan);
            }
        }
        return -1;
    }

    void tampilPosisi(double nilaiCari, int posisiIndex) {
        if (posisiIndex != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + nilaiCari + " ditemukan pada posisi indeks ke-" + posisiIndex);
        } else {
            System.out.println("Data dengan IPK " + nilaiCari + " tidak dapat ditemukan di dalam sistem");
        }
    }

    void tampilDataSearch(double nilaiCari, int posisiIndex) {
        if (posisiIndex != -1) {
            System.out.println("NIM   : " + daftarMahasiswa[posisiIndex].nim);
            System.out.println("Nama  : " + daftarMahasiswa[posisiIndex].nama);
            System.out.println("Kelas : " + daftarMahasiswa[posisiIndex].kelas);
            System.out.println("IPK   : " + nilaiCari);
        } else {
            System.out.println("Data detail mahasiswa dengan IPK " + nilaiCari + " tidak ditemukan.");
        }
    }
}
