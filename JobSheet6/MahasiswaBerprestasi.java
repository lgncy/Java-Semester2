/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet6;

public class MahasiswaBerprestasi {
    // inisialisasi
    Mahasiswa [] listMhs = new Mahasiswa [5];
    int idx;

    void tambah (Mahasiswa m){
    if (idx < listMhs.length){
        listMhs[idx]=m;
        idx++;
    } else {
        System.out.println("data sudah penuh");
    }
}
    void tampil (){
    for (int i = 0; i < idx; i++){
        listMhs[i].tampilInformasi();
        System.out.println("--------------------");
    }
}
    void bubbleSort(){
    for (int i = 0; i < idx - 1; i++){
        for (int j = 1; j < idx - i; j++){
            if (listMhs[j].ipk > listMhs[j-1].ipk){
                Mahasiswa tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
        }
    }
}

    int sequentialSearching(double cari) {
        int posisi = -1;

        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x +
                    " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t   : " + listMhs[pos].nim);
            System.out.println("Nama \t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t   : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
    int mid;
    if (right >= left){
        mid = (left + right) / 2;
        if (cari == listMhs[mid].ipk){
            return mid;
        }
        else if (listMhs[mid].ipk < cari){
            return findBinarySearch(cari, left, mid - 1);
        }
        else{
            return findBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
    }
}