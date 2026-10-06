import java.util.Scanner;
public class Studikasus203 {
    public static void main(String[]Args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Siapa Nama Anda");
    String nama = Sc.nextLine();
    System.out.println("Apa Jenis Kegiatan Yang Anda Pilih (BELMAWA,BAKORMA,MANDIRI,PKM");
    String kegiatan = Sc.nextLine().trim();
    System.out.println("Berapa Jumlah Dokumen Yang Telah Anda Kumpulkan :");
    int dokumen = Sc.nextInt();
    System.out.println("Anda Peringkat juata Keberapa");
    int juara = Sc.nextInt();
    Sc.nextLine();

    System.out.println("Status Pendanaan PKM");
    String PKM = Sc.nextLine().trim();
    boolean pendanaan = PKM.equalsIgnoreCase("1");


    if (dokumen > 3){
        System.out.println("Dokumen Anda Lengkap");
    } else {
        System.out.println("Dokumen Anda Kurang Lengkap");
    }
    if (pendanaan){
        System.out.println("Anda Lolos");
    } else {
        System.out.println("Anda Tidak Lolos");
    }
    if (juara >= 1 && juara <= 3){
        System.out.println("Anda Mendapatkan Penghargaan");
    } else {
        System.out.println("Anda Tidak Mendapatkan Penghargaan");
    }
    }
}
