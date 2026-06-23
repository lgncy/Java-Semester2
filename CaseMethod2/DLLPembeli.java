/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class DLLPembeli {
    // inisialisasi
    NodePembeli head;
    NodePembeli tail;
    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli pembeli) {
        NodePembeli newNode =
                new NodePembeli(null, nomor++, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public NodePembeli hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }

        NodePembeli temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return temp;
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("========================================");
        System.out.println("Daftar Antrian");
        System.out.println("========================================");

        NodePembeli temp = head;

        while (temp != null) {
            System.out.println(
                    temp.nomorAntrian + ". "
                    + temp.data.namaPembeli
                    + " - " + temp.data.noHp);
            temp = temp.next;
        }
    }
}
