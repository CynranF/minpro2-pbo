package barang;

public class Makanan extends BelanjaItem {
    private String kategori;

    public Makanan(String nama, int kuantitas, double harga, String kategori) {
        super(nama, kuantitas, harga);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
}
