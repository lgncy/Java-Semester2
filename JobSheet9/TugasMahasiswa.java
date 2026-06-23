/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet9;

public class TugasMahasiswa {
    // inisialisasi
    Mahasiswa[] stack;
    int size;
    int top;
    int jumlahTugas() {
    return top + 1;
    }

        TugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Mahasiswa pop() {
        if (!isEmpty()) {
            Mahasiswa mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Mahasiswa peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    void print() {
        System.out.println("Daftar semua tugas");
        System.out.println("Nama\tNIM\tKelas");

        for (int i = top; i >= 0; i--) {
            System.out.println(
                stack[i].nama + "\t" +
                stack[i].nim + "\t" +
                stack[i].kelas
            );
        }
    }
    Mahasiswa lihatTerbawah() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        System.out.println("Stack kosong!");
        return null;
    }
    }
    String konversiDesimalKeBiner(int nilai) {
    Konversi stack = new Konversi(32);
        while (nilai > 0) {
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
    }
    String biner = "";
        while (!stack.isEmpty()) {
        biner += stack.pop();
    }
    return biner;
    }
}