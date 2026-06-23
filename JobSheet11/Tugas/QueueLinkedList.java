/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class QueueLinkedList {
    // inisialisasi
    Node front;
    Node rear;
    int size;
    int max;

    public QueueLinkedList(int max) {
        this.max = max;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node baru = new Node(mhs);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil:");
        front.data.tampilData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Antrian Terdepan:");
        front.data.tampilData();
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Antrian Paling Akhir:");
        rear.data.tampilData();
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        Node temp = front;

        System.out.println("\nDaftar Antrian:");

        while (temp != null) {
            temp.data.tampilData();
            System.out.println("----------------");
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }
}
