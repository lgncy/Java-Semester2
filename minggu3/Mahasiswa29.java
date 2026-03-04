package minggu3;

public class Mahasiswa29 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    // Method untuk mencetak seluruh informasi mahasiswa
    public void cetakInfo() {
        System.out.println("NIM   : " + this.nim);
        System.out.println("Nama  : " + this.nama);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("IPK   : " + this.ipk);
        System.out.println("-----------------------------------");
    }
}
