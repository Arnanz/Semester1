import java.util.Scanner;

public class Lingkaran02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        double phi= 3.14;
        System.out.print("Masukkan jari-jari lingkaran : ");
        r = input.nextInt();
        keliling= 2*3.14*r;
        luas= 3.14*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}