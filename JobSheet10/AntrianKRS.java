/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class AntrianKRS {
    // inisialisasi
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        sudahKRS = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = mhs;
        size++;
    }

    public Mahasiswa Dequeue() {
        if (IsEmpty()) {
            return null;
        }

        Mahasiswa mhs = data[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return mhs;
    }

    public void prosesKRS() {
        if (size == 0) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Mahasiswa yang diproses:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = Dequeue();

            if (mhs != null) {
                mhs.tampilkanData();
                System.out.println("------------------");
                sudahKRS++;
            }
        }
    }

    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        int i = front;

        while (true) {
            data[i].tampilkanData();
            System.out.println("------------------");

            if (i == rear)
                break;

            i = (i + 1) % max;
        }
    }

    public void tampilDuaDepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        int i = front;

        for (int j = 0; j < 2 && j < size; j++) {
            data[i].tampilkanData();
            System.out.println("------------------");
            i = (i + 1) % max;
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        data[rear].tampilkanData();
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahKRS() {
        return sudahKRS;
    }

    public int getBelumKRS() {
        return 30 - sudahKRS;
    }
}