/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class DoubleLinkedList05 {
    // inisialisasi
    Node05 head;
    Node05 tail;

    public DoubleLinkedList05() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node05 search(String nim) {
        Node05 current = head;

        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa05 data) {
        Node05 current = search(keyNim);

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        Node05 newNode =
                new Node05(current, data, current.next);

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node05 current = head;

        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node05 current = tail;

        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------");
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data terhapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data terhapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
