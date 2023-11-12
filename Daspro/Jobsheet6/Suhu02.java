import java.util.Scanner;
public class Suhu02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int suhu;
        char hujan;

        System.out.print("Masukan Suhu : ");
        suhu = input02.nextInt();
        System.out.print("Apakah Hujan : ( ya atau tidak) ");
        hujan = input02.next().charAt(0);
        if(suhu > 27) {
            System.out.println("Memakai Dress"); {
                if(hujan == 'y'|| hujan == 'Y') {
                    System.out.println("Membawa Payung");
                } else {
                    System.out.println("Memakai Sunscreen");
                }
            }
        } else {
            System.out.println("Memakai Celana Panjang");
        }
    }
    
}