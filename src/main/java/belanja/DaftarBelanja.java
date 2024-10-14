package belanja;

import barang.BelanjaItem;
import java.util.ArrayList;
import barang.Makanan;
import barang.Minuman;
import java.util.Scanner;


public class DaftarBelanja {
    private static ArrayList<BelanjaItem> listBelanja = new ArrayList<>();

    public void tambahItem(BelanjaItem item) {
        listBelanja.add(item);
        System.out.println("Item berhasil ditambahkan!");
    }

    public void tampilkanDaftar() {
        if (listBelanja.isEmpty()) {
            System.out.println("Daftar belanja kosong.");
        } else {
            System.out.println("Daftar Belanja:");
            System.out.println("\n=== Makanan ===");
            for (BelanjaItem item : listBelanja) {
                if (item instanceof Makanan) {
                    Makanan makananItem = (Makanan) item; // Casting
                    System.out.println(makananItem.getNama() + " - " + makananItem.getKuantitas() + " x " + makananItem.getHarga() + " = " + makananItem.getTotalHarga() + " (Kategori: " + makananItem.getKategori() + ")");
                }
            }
            System.out.println("\n=== Minuman ===");
            for (BelanjaItem item : listBelanja) {
                if (item instanceof Minuman) {
                    Minuman minumanItem = (Minuman) item; // Casting
                    System.out.println(minumanItem.getNama() + " - " + minumanItem.getKuantitas() + " x " + minumanItem.getHarga() + " = " + minumanItem.getTotalHarga() + " (Beralkohol: " + minumanItem.isBeralkohol() + ")");
                }
            }
        }
    }

    public void hapusItem(String nama) {
        boolean found = false;
        for (BelanjaItem item : listBelanja) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                listBelanja.remove(item);
                found = true;
                System.out.println("Item berhasil dihapus!");
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan.");
        }
    }

    public void updateItem(String nama) {
        boolean found = false;
        for (BelanjaItem item : listBelanja) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                found = true;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan kuantitas baru: ");
                int kuantitasBaru = scanner.nextInt();
                System.out.print("Masukkan harga baru: ");
                double hargaBaru = scanner.nextDouble();

                item.setKuantitas(kuantitasBaru);
                item.setHarga(hargaBaru);
                System.out.println("Item berhasil diperbarui!");
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan.");
        }
    }
}
