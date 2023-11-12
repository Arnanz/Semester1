public class forVar202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bil;
        boolean berhenti = false;
        
        for (; !berhenti; ) {
            System.out.print("Masukkan bilangan: ");
            bil = sc.nextInt();
            System.out
            if (bil == 0) {
                berhenti = true;
            } else {
                System.out.println(bil);
            }
        }