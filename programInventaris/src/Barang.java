public class Barang {
    private String nama;
    private int jumlah;
    private double harga;

    public Barang(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanData() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
    }
}
