# TokoApp - Aplikasi Manajemen & Pencatatan Produk Toko

TokoApp adalah aplikasi desktop berbasis JavaFX dan Maven yang dikembangkan untuk membantu mencatat dan mengelola data produk toko secara lokal. Aplikasi ini dilengkapi dengan form input untuk memasukkan data produk baru (seperti kode, nama, kategori Makanan/Minuman, dan harga), tabel data utama, fitur pencarian produk berdasarkan nama, serta halaman detail yang menampilkan informasi lengkap dan galeri gambar produk secara dinamis.

---

## 📋 Fitur Utama
1. **Form Tambah Produk**: Memungkinkan pengisian nama, kategori (Makanan/Minuman), dan harga produk.
2. **Validasi Input**:
   - Nama produk tidak boleh kosong.
   - Harga produk harus lebih besar dari `0`.
3. **Tabel Data Produk**: Menampilkan daftar produk secara lengkap (Kode, Nama, Kategori, dan Format Harga Rp).
4. **Pencarian Produk**: Mencari produk berdasarkan kata kunci nama produk menggunakan tombol **Cari**.
5. **Halaman Detail Produk**: Menampilkan rincian data produk beserta lampiran gambar yang dimuat secara dinamis dari objek produk yang dipilih.

---

## 🚀 Cara Menjalankan Aplikasi

### Metode 1: Menggunakan Apache NetBeans IDE (Direkomendasikan)
1. **Buka Project**:
   - Jalankan NetBeans IDE.
   - Pilih menu **File** > **Open Project...**, lalu arahkan ke folder proyek `Toko`.
2. **Sinkronisasi Dependencies**:
   - Klik kanan pada proyek **Toko** di panel kiri (*Projects*).
   - Pilih **Reload Project** atau **Resolve Problems** jika ada notifikasi dependensi.
3. **Clean & Build**:
   - Klik kanan pada proyek **Toko** -> pilih **Clean and Build**.
   - Tunggu hingga proses kompilasi selesai (`BUILD SUCCESS`).
4. **Run Project**:
   - Klik kanan pada proyek **Toko** -> pilih **Run**, atau tekan tombol **F6**.
   - Aplikasi akan terbuka secara otomatis.

---

