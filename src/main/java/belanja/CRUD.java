package belanja;

public interface CRUD<T> {
    void tambahItem(T item);
    void hapusItem(String nama);
    void updateItem(String nama);
    void tampilkanDaftar();
}
