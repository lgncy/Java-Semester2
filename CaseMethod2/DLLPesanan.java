/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class DLLPesanan {
    // inisialisasi
    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan pesanan) {
        NodePesanan newNode =
                new NodePesanan(null, pesanan, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortingNama() {
        if (head == null) return;

        NodePesanan i, j;

        for (i = head; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {

                if (i.data.namaPesanan.compareToIgnoreCase(
                        j.data.namaPesanan) > 0) {

                    Pesanan temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public void tampilPesanan() {

        sortingNama();

        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        int total = 0;

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN");
        System.out.println("========================================");

        NodePesanan temp = head;

        while (temp != null) {
            System.out.println(
                    temp.data.kodePesanan + " | "
                    + temp.data.namaPesanan + " | "
                    + temp.data.harga);

            total += temp.data.harga;

            temp = temp.next;
        }

        System.out.println("----------------------------------------");
        System.out.println("Total Pendapatan : Rp " + total);
    }
}
