public class Rekening {
    private String nama;
    private String nomor;
    private double saldo;

    public Rekening(String nama, String nomor, double saldo) {
        this.nama = nama;
        this.nomor = nomor;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double debitSaldo(double jumlah) throws Exception {
        if (jumlah <= 0) {
            throw new Exception("Jumlah penarikan harus lebih besar dari 0");
        }

        if (jumlah > this.saldo) {
            throw new Exception("Saldo tidak mencukupi untuk penarikan sebesar " + jumlah + ".");
        }

        double finalSaldo = this.saldo - jumlah;
        this.saldo = finalSaldo;
        return finalSaldo;
    }

    public double creditSaldo(double jumlah) throws Exception {
        if (jumlah <= 0) {
            throw new Exception("Jumlah setoran harus lebih besar dari 0");
        }

        double finalSaldo = this.saldo + jumlah;
        this.saldo = finalSaldo;
        return finalSaldo;
    }
}