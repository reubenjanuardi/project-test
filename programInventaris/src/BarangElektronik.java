public class BarangElektronik extends Barang {
    private String garansi;

    public BarangElektronik(String nama, int jumlah, double harga, String garansi) {
        super(nama, jumlah, harga);
        this.garansi = garansi;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Garansi: " + garansi);
    }
}
