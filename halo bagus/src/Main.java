import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // Menampilkan ucapan selamat datang
        System.out.println("Selamat datang, " + nama + "!");

        // Menutup Scanner
        input.close();
    }
}
