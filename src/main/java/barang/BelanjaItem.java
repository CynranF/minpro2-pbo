package barang;

public class BelanjaItem {
    private String nama;
    private int kuantitas;
    private double harga;

    public BelanjaItem(String nama, int kuantitas, double harga) {
        this.nama = nama;
        this.kuantitas = kuantitas;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getTotalHarga() {
        return this.harga * this.kuantitas;
    }
}
