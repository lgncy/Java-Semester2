/**
 * Nama  : wildan dwi triatna kusuma
 * NIM   : 254107020030
 */

public class NodePesanan {
    // inisialisasi
    NodePesanan prev;
    Pesanan data;
    NodePesanan next;

    public NodePesanan(NodePesanan prev,
                       Pesanan data,
                       NodePesanan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
