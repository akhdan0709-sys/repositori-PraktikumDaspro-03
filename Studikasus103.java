import java.util.Scanner;
public class Studikasus103{
    public static void main(String[]Args){
    Scanner Sc = new Scanner(System.in);
    int hargaPerCup = 18000;
    int totalHarga,jumlahCup,uangBayar,totalBayar,kembalian;
    double diskon = 0.1;

    System.out.println("Berapa Jumlah Cup Yang Telah Anda Beli");
    jumlahCup = Sc.nextInt();
    System.out.println("Masukan Uang Pembayaran Anda");
    uangBayar = Sc.nextInt();

    totalHarga = jumlahCup * hargaPerCup;
    totalBayar = (int) (totalHarga - diskon);

    if (totalHarga >= 100000){
        System.out.println("Diskon : " + (totalHarga * 10 / 100));
    } else {
        System.out.println("Total Bayar : " + (totalHarga - diskon));
    }
    if (uangBayar >= totalHarga){
        System.out.println("Kembalian : " + (uangBayar - totalBayar));
    } else {
        System.out.println("Uang Tidak Cukup : " +(uangBayar - totalBayar));
    }
    }
}