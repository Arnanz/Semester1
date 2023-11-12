import java.util.Scanner;

public class LatihanIndividu102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak pertarungan (dalam meter): ");
        double jarak_pertarungan = input.nextDouble();

        if (jarak_pertarungan <= 5) {
            System.out.println("Gunakan senjata jarak dekat.");
        } else if (jarak_pertarungan <= 1000) {
            System.out.println("Gunakan senjata jarak jauh.");
        } else {
            System.out.println("Jarak pertarungan terlalu jauh untuk senjata jarak dekat maupun jauh.");
        }

        input.close();
    }
}