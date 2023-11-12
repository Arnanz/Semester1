import java.util.Scanner;

public class Latihanbilangan02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input02.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input02.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input02.nextInt();

        // if else condition
        int bilanganTerbesar;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilanganTerbesar = bil1;
                System.out.println("Bilangan terbesar adalah bilangan ke 1");
            } else {
                bilanganTerbesar = bil3;
                System.out.println("Bilangan terbesar adalah bilangan ke 3");
            }
        } else {
            if (bil2 > bil3) {
                bilanganTerbesar = bil2;
                System.out.println("Bilangan terbesar adalah bilangan ke 2");
            } else {
                bilanganTerbesar = bil3;
                System.out.println("Bilangan terbesar adalah bilangan ke 3");
            }
        }
        
        input02.close();
    }
}