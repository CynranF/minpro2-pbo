package belanja;

import barang.BelanjaItem;
import barang.Makanan;
import barang.Minuman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarBelanja daftar = new DaftarBelanja();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Pengelolaan Daftar Belanja ===");
            System.out.println("1. Tambah Makanan");
            System.out.println("2. Tambah Minuman");
            System.out.println("3. Tampilkan Daftar Belanja");
            System.out.println("4. Hapus Item");
            System.out.println("5. Update Item");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Makanan: ");
                    String namaMakanan = scanner.nextLine();
                    System.out.print("Kuantitas: ");
                    int kuantitasMakanan = scanner.nextInt();
                    System.out.print("Harga: ");
                    double hargaMakanan = scanner.nextDouble();

                    System.out.println("Pilih Kategori:");
                    System.out.println("1. Makanan Ringan");
                    System.out.println("2. Makanan Berat");
                    System.out.println("3. Buah dan Sayuran");
                    System.out.println("4. Makanan Olahan");
                    System.out.print("Pilih kategori (1-4): ");
                    int kategoriPilihan = scanner.nextInt();
                    String kategori = "";

                    switch (kategoriPilihan) {
                        case 1:
                            kategori = "Makanan Ringan";
                            break;
                        case 2:
                            kategori = "Makanan Berat";
                            break;
                        case 3:
                            kategori = "Buah dan Sayuran";
                            break;
                        case 4:
                            kategori = "Makanan Olahan";
                            break;
                        default:
                            System.out.println("Pilihan kategori tidak valid. Kategori akan diset ke 'Tidak Diketahui'.");
                            kategori = "Tidak Diketahui";
                            break;
                    }

                    Makanan makanan = new Makanan(namaMakanan, kuantitasMakanan, hargaMakanan, kategori);
                    daftar.tambahItem(makanan);
                    break;

                case 2:
                    System.out.print("Nama Minuman: ");
                    String namaMinuman = scanner.nextLine();
                    System.out.print("Kuantitas: ");
                    int kuantitasMinuman = scanner.nextInt();
                    System.out.print("Harga: ");
                    double hargaMinuman = scanner.nextDouble();
                    System.out.print("Beralkohol (true/false): ");
                    boolean beralkohol = scanner.nextBoolean();
                    Minuman minuman = new Minuman(namaMinuman, kuantitasMinuman, hargaMinuman, beralkohol);
                    daftar.tambahItem(minuman);
                    break;

                case 3:
                    daftar.tampilkanDaftar();
                    break;
                case 4:
                    System.out.print("Nama item yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    daftar.hapusItem(namaHapus);
                    break;
                case 5:
                    System.out.print("Nama item yang akan diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    daftar.updateItem(namaUpdate);
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
