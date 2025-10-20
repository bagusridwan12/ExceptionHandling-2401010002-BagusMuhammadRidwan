import java.util.Scanner;

// Kelas abstrak sebagai dasar
abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
}

// Kelas Kubus
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}

// Kelas Balok
class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

// Kelas Bola
class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== PROGRAM MENGHITUNG VOLUME & LUAS PERMUKAAN ===");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.println("4. Keluar");
            System.out.print("Pilih bentuk (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisi = input.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    System.out.println("Volume Kubus = " + kubus.hitungVolume());
                    System.out.println("Luas Permukaan Kubus = " + kubus.hitungLuasPermukaan());
                    break;

                case 2:
                    System.out.print("Masukkan panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.println("Volume Balok = " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + balok.hitungLuasPermukaan());
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari bola: ");
                    double r = input.nextDouble();
                    Bola bola = new Bola(r);
                    System.out.println("Volume Bola = " + bola.hitungVolume());
                    System.out.println("Luas Permukaan Bola = " + bola.hitungLuasPermukaan());
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}
