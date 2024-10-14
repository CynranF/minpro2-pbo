## Identitas
#### Nama : Farhan Imannudin
#### NIM  : 2309116028

## Deskripsi Tugas
Menerapkan kembali semua ketentuan yang ada di posttest 1
Inheritance (minimal terdapat 2 subclass)
Encapsulation (getter dan setter)
Abstraction (Interface dan abstraction dapat dijadikan satu)
Interface (dapat diterapkan untuk CRUD)
Final keyword (class dan properti)

## Deskripsi Hasil
tema dari program saya adalah Sistem Pengelolaan Daftar Belanja, dengan program ini pengguna dapat CRUD dari pembelanjaan mereka

# DOKUMENTASI PROGRAM

### Struktur Kode
Program ini terdiri dari beberapa class dan package:

Package belanja
- Class Main: Sebagai entry point untuk menjalankan program. Mengelola interaksi pengguna dan pilihan menu.
- Class DaftarBelanja: Mengelola daftar belanja, termasuk fungsi CRUD (menambah, menampilkan, menghapus, dan memperbarui item).
- Interface CRUD<T>: Mendefinisikan metode CRUD yang harus diimplementasikan oleh kelas yang mengelola item belanja.
  
Package barang
- Class BelanjaItem: Kelas dasar untuk item belanja, berisi properti dasar seperti nama, kuantitas, dan harga.
- Class Makanan: Subclass dari BelanjaItem yang menambahkan kategori untuk item makanan.
- Class Minuman: Subclass dari BelanjaItem yang menambahkan informasi apakah item minuman beralkohol atau tidak.

### Fungsi Utama
Tampilan awal program memberikan pengguna 6 opsi:

- Tambah Makanan: Memasukkan item makanan baru ke dalam daftar belanja.
- Tambah Minuman: Memasukkan item minuman baru ke dalam daftar belanja.
- Tampilkan Daftar Belanja: Menampilkan semua item yang telah ditambahkan, dikelompokkan berdasarkan kategori.
- Hapus Item: Menghapus item dari daftar berdasarkan nama.
- Update Item: Memperbarui kuantitas dan harga item yang ada.
- Keluar: Menutup program.

### Penjelasan Alur Program

=== Sistem Pengelolaan Daftar Belanja ===
1. Tambah Makanan
2. Tambah Minuman
3. Tampilkan Daftar Belanja
4. Hapus Item
5. Update Item
6. Keluar


#### Opsi 1: Tambah Makanan
![image](https://github.com/user-attachments/assets/06619f2e-8688-4e61-8c38-95c9f1cfe777)

1. Pengguna memasukkan nama, kuantitas, dan harga makanan.
2. Pengguna memilih kategori makanan dari pilihan yang ada.
3. Item makanan ditambahkan ke daftar belanja.


#### Opsi 2: Tambah Minuman
![image](https://github.com/user-attachments/assets/2224f082-874c-4106-933d-a77e2de40e2e)

1. Pengguna memasukkan nama, kuantitas, harga, dan informasi apakah minuman tersebut beralkohol.
2. Item minuman ditambahkan ke daftar belanja.

#### Opsi 3: Tampilkan Daftar Belanja
![image](https://github.com/user-attachments/assets/eca36d3a-62b4-4525-9225-7e936e1d9bc4)
1. Program menampilkan semua item yang telah ditambahkan, memisahkan antara makanan dan minuman.

#### Opsi 4: Hapus Item
![image](https://github.com/user-attachments/assets/17cae9c1-ed82-46a6-9462-c293f05926f1)

1. Pengguna dapat menghapus item dengan memasukkan nama item tersebut.
2. Pengguna dapat memastikan perubahan di opsi 3

#### Opsi 5: Update Item
![image](https://github.com/user-attachments/assets/288fa0cb-cd91-45f3-bdce-91239cce31ec)
![image](https://github.com/user-attachments/assets/4e63e0e3-1619-468b-8689-5949db4f9611)

1. Pengguna dapat memperbarui kuantitas dan harga item yang ada berdasarkan nama item.
2. Pengguna dapat memastikan perubahan di opsi 3

#### Opsi 6: Keluar
![image](https://github.com/user-attachments/assets/f0a4e6f9-da2f-46c1-8e7d-2a5cd19db8bf)

1. Program akan berhenti ketika pengguna memilih opsi ini.


## Penerapan Konsep Pemrograman
- Inheritance: Kelas Makanan dan Minuman merupakan subclass dari BelanjaItem, mewarisi properti dan metode dari kelas induknya.
- Encapsulation: Penggunaan getter dan setter pada kelas BelanjaItem untuk mengakses dan memodifikasi properti privat.
- Abstraction: Dengan menggunakan interface CRUD, program dapat dengan mudah dikelola dan diubah di masa mendatang.
- Static Keyword: Menggunakan static pada ArrayList<BelanjaItem> di kelas DaftarBelanja agar dapat diakses tanpa harus membuat instance dari kelas tersebut.
