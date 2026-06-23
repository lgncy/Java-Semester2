/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

package JobSheet9;

public class Konversi {
    // inisialisasi

    int size;
    int[] stack;
    int top;

    Konversi(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
        }
    }

    int pop() {
        if (!isEmpty()) {
            int data = stack[top];
            top--;
            return data;
        } else {
            return -1;
        }
    }
}