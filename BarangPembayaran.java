public class BarangPembayaran extends Barang implements Pembayaran {
    private int jumlahBeli;

    public BarangPembayaran(String namaBarang, double hargaBarang, String kodeBarang,int jumlahBeli) {
        super(namaBarang, hargaBarang, kodeBarang);
        this.jumlahBeli = jumlahBeli;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    // Implementasi metode dari interface Pembayaran
    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }
}


