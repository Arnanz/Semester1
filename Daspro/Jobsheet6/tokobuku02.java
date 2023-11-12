import java.util.Scanner;

public class tokobuku02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenis_buku;
        int jumlah_buku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenis_buku = input.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlah_buku = input.nextInt();

        if (jenis_buku.equals("kamus")) {
            diskon = 0.1;
            if (jumlah_buku > 2) {
                diskon += 0.02;
            }
        } else if (jenis_buku.equals("novel")) {
            diskon = 0.07;
            if (jumlah_buku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else if (jenis_buku.equals("lainnya")) {
            if (jumlah_buku > 3) {
                diskon = 0.05;
            }
        }

        double total_harga = jumlah_buku * 50000;
        double total_diskon = total_harga * diskon;
        double total_bayar = total_harga - total_diskon;

        System.out.println("Jumlah diskon yang diberikan: Rp" + total_diskon);
        System.out.println("Total yang harus dibayar: Rp" + total_bayar);
    }
}