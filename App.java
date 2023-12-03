import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a zzz");
            Date date = new Date();
         

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n");
            System.out.println("                MINI MARKET BUDIBOY");
            System.out.printf("Tanggal Transaksi\t: %s\n", dateFormat.format(date));
            System.out.printf("Jam\t\t\t: %s\n", timeFormat.format(date));
            System.out.println("=================================================");
            
            System.out.println("                DATA PELANGGAN");
            System.out.println("-------------------------------------------------");
            
            System.out.printf("Nama Pelanggan\t\t: ");
            String namaPelanggan = scanner.nextLine();
            System.out.printf("No. HP\t\t\t: ");
            String noTelp = scanner.nextLine();
            System.out.printf("Alamat\t\t\t: ");
            String Alamat = scanner.nextLine();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            
            System.out.println("                DATA PEMBELIAN BARANG");
            System.out.println("-------------------------------------------------");
            System.out.printf("Kode Barang\t\t: ");
            String kodeBarang = scanner.nextLine();
            System.out.printf("Nama Barang\t\t: ");
            String namaBarang = scanner.nextLine();
            System.out.printf("Harga Barang\t\t: ");
            double hargaBarang = scanner.nextDouble();
            System.out.printf("Jumlah Beli\t\t: ");
            int jumlahBeli = scanner.nextInt();
            double totalBayar = hitungTotalBayar(hargaBarang, jumlahBeli);
            System.out.printf("TOTAL BAYAR\t\t: Rp. %.2f\n", totalBayar);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.printf("Kasir\t\t\t: BudiBoy\n");

            


        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memproses input: " + e.getMessage());
        }
    }

    private static double hitungTotalBayar(double hargaBarang, int jumlahBeli) {
        return hargaBarang*jumlahBeli;
    }
}
