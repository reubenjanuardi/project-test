public class BarangNonElektronik extends Barang {
    private String material;

    public BarangNonElektronik(String nama, int jumlah, double harga, String material) {
        super(nama, jumlah, harga);
        this.material = material;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Material: " + material);
    }
}
