import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahBarangElektronik() {
        System.out.print("Masukkan Nama Barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = input.nextDouble();
        input.nextLine(); // handle newline
        System.out.print("Masukkan Garansi Barang: ");
        String garansi = input.nextLine();

        BarangElektronik barang = new BarangElektronik(nama, jumlah, harga, garansi);
        daftarBarang.add(barang);
        System.out.println("Barang Elektronik berhasil ditambahkan!");
    }

    public void tambahBarangNonElektronik() {
        System.out.print("Masukkan Nama Barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = input.nextDouble();
        input.nextLine(); // handle newline
        System.out.print("Masukkan Material Barang: ");
        String material = input.nextLine();

        BarangNonElektronik barang = new BarangNonElektronik(nama, jumlah, harga, material);
        daftarBarang.add(barang);
        System.out.println("Barang Non-Elektronik berhasil ditambahkan!");
    }

    public void tampilkanSemuaBarang() {
        for (Barang barang : daftarBarang) {
            barang.tampilkanData();
            System.out.println("===============================");
        }
    }
}
