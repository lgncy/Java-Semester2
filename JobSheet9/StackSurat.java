/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet9;

public class StackSurat {
    // inisialisasi
    Surat[] stack;
    int top;
    int size;

    StackSurat(int ukuran) {
        size = ukuran;
        stack = new Surat[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Surat srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh");
        }
    }

    Surat pop() {
        if (!isEmpty()) {
            Surat s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }

        return false;
    }
}