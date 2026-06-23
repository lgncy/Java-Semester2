/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet5;

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
}