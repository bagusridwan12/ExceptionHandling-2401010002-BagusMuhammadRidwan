import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Rekening rekening = new Rekening("", "", 0);
            int pilihan = 0;

            System.out.println(" ===== Rekening ===== ");
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            rekening.setNama(nama);

            System.out.print("Masukkan nomor rekening: ");
            String nomor = sc.nextLine();
            rekening.setNomor(nomor);

            do {
                System.out.println(" ===== Menu pilihan ==== ");
                System.out.println("1. Lihat saldo");
                System.out.println("2. Debit saldo");
                System.out.println("3. Kredit Saldo");
                System.out.println("4. Keluar program");

                System.out.print("Masukkan pilihan menu: ");
                pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        Main.clearScreen();
                        System.out.println("Nama: " + rekening.getNama());
                        System.out.println("Nomor rekening: " + rekening.getNomor());
                        NumberFormat currency = NumberFormat.getCurrencyInstance();
                        System.out.println("Saldo saat ini: " + currency.format(rekening.getSaldo()));
                        break;
                    case 2:
                        Main.clearScreen();
                        System.out.print("Masukkan jumlah debit: ");
                        double debit = sc.nextDouble();
                        rekening.debitSaldo(debit);
                        break;
                    case 3:
                        Main.clearScreen();
                        System.out.print("Masukkan jumlah kredit: ");
                        double kredit = sc.nextDouble();
                        rekening.creditSaldo(kredit);
                        break;
                    case 4:
                        Main.clearScreen();
                        System.out.println("Terima kasih telah menggunakan layanan kami.");
                        break;
                    default:
                        Main.clearScreen();
                        System.out.println("Pilihan menu tidak valid.");
                        break;
                }
            } while (pilihan != 4);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program selesai.");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}