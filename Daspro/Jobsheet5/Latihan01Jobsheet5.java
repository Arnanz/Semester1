import java.util.Scanner;

public class Latihan01Jobsheet5 {
public static void main(String[] args) {
    Scanner sc02 = new Scanner(System.in);
    System.out.print("Masukkan Suhu  : ");
    int suhu = sc02.nextInt();
    if (suhu<16) {
        System.out.println("silakan menggunakan jaket");
    }  
        if (suhu<20) {
        System.out.println("silakan pakai baju tebal");
    }
    else {
        System.out.println("silakan pakai topi");
    }
}
}
