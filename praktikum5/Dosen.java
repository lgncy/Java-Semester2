package praktikum5;

public class Dosen {
    String idDosen;
    String namaDosen;
    boolean isPria; 
    int umur;

    Dosen(String kd, String name, boolean jk, int age) {
        idDosen = kd;
        namaDosen = name;
        isPria = jk;
        umur = age;
    }

    void tampil() {
        System.out.println("ID Dosen      : " + idDosen);
        System.out.println("Nama Dosen    : " + namaDosen);
        System.out.println("Jenis Kelamin : " + (isPria ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur          : " + umur);
    }
}
