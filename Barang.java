public class Barang {
  protected String namaBarang;
    protected double hargaBarang;
    protected String kodebarang;

    public Barang(String namaBarang, double hargaBarang, String kodeBarang) 
    {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.kodebarang = kodeBarang;
    }

    public String getNamaBarang() 
    {
        return namaBarang;
    }

    public double getHargaBarang() 
    {
        return hargaBarang;
    }

    public String getkodeBarang() 
    {
        return kodebarang;
    }
}
