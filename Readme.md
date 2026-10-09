# Inventaris Barang (PBO Pertemuan 4)

Project ini dibuat untuk menyelesaikan tugas PBO materi Java Collections Framework. Program berfungsi buat ngelola data inventaris barang menggunakan `HashMap`.

## Penjelasan Singkat
* **`Produk.java`**: Class blueprint buat nyimpen data produk (kode, nama, stok) lengkap sama getter, setter, dan method `tampilkanInfo()`.
* **`MainInventaris.java`**: Class utama yang mengelola alur program:
  * Menyimpan data ke `HashMap<String, Produk>` menggunakan `kodeProduk` sebagai key.
  * Menampilkan semua daftar barang awal menggunakan For-Each loop (`keySet()`).
  * Mengubah stok barang tertentu lewat `.get(kode).setStok()`.
  * Menghapus data barang dari inventaris memakai `.remove(kode)`.
  * Menampilkan data dan total stok barang yang sudah diperbarui.
