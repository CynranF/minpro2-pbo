package barang;

public class Minuman extends BelanjaItem {
    private boolean beralkohol;

    public Minuman(String nama, int kuantitas, double harga, boolean beralkohol) {
        super(nama, kuantitas, harga);
        this.beralkohol = beralkohol;
    }

    public boolean isBeralkohol() {
        return beralkohol;
    }
}
