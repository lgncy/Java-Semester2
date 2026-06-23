/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class SingleLinkedList {
    // inisialisasi
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;

            System.out.println("Isi Linked List : ");

            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa input) {
        Node ndInput = new Node(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa input) {
        Node ndInput = new Node(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa input) {
        Node ndInput = new Node(input, null);
        Node temp = head;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new Node(input, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node temp = head;

        if (head.data.nama.equalsIgnoreCase(key)) {
            removeFirst();
            return;
        }

        while (temp.next != null) {
            if (temp.next.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;

                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }

            temp = temp.next;
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }
    }
}
