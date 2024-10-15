import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenInventaris inventaris = new ManajemenInventaris();
        int pilihan;

        do {
            System.out.println("\n===== Menu Inventaris EAD LAB =====\n");
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Non-Elektronik");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // handle newline

            switch (pilihan) {
                case 1:
                    inventaris.tambahBarangElektronik();
                    break;
                case 2:
                    inventaris.tambahBarangNonElektronik();
                    break;
                case 3:
                    inventaris.tampilkanSemuaBarang();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}