/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class AntrianLayanan {
    // inisialisasi
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            data[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa mhs = null;

        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            mhs = data[front];
            size--;

            if (size == 0) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }

        return mhs;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Mahasiswa terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;

            while (i != rear) {
                data[i].tampilkanData();
                System.out.println("-------------------");
                i = (i + 1) % max;
            }

            data[i].tampilkanData();
            System.out.println("-------------------");

            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
    if (!IsEmpty()) {
        System.out.println("Antrian paling belakang:");
        data[rear].tampilkanData();
    } else {
        System.out.println("Antrian kosong");
    }
    }
}