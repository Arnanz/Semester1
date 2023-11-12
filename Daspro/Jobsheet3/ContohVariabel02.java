public class ContohVariabel02 {
    public static void main(String[] args) {
        String HobySaya = "Bermain catur";
        boolean ispandai = true;
        char jenisKelamin = 'L';
        byte _umurSaya = 20;
        double $ipk = 3.7;
        double tinggi = 1.67;
        
        System.out.println(HobySaya);
        System.out.println("Apakah pandai? " + ispandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}