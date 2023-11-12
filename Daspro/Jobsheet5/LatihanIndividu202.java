import java.util.Scanner;

public class LatihanIndividu202 {
    public static void main(String[] args) {
        // Data pengguna yang disimpan dalam sistem
        String usernameSistem = "pasha123";
        String passwordSistem = "pasha123";

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine().trim(); // Trim leading and trailing whitespaces
        System.out.print("Masukkan password: ");
        String password = input.nextLine().trim(); // Trim leading and trailing whitespaces

        if (!username.isEmpty() && !password.isEmpty()) { // Check for empty inputs
            if (username.equals(usernameSistem) && password.equals(passwordSistem)) {
                System.out.println("Login berhasil. Selamat datang, " + username + "!");
            } else {
                System.out.println("Username atau password salah.");
            }
        } else {
            System.out.println("Username atau password tidak boleh kosong.");
        }

        input.close();
    }
}