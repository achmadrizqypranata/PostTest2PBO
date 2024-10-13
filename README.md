# PostTest2PBO
Post Test 2 Praktikum PBO (Pemrograman Berorientasi Objek) (Achmad Rizqy Pranata) - (2209116086)

# Dokumentasi Program (Sistem Manajemen Penjualan Mobil) - (Versi Post Test 2)

1. Menerapkan kembali semua ketentuan di Posttest 1
Seperti pada posttest 1, saya telah menerapkan dasar dari OOP seperti kelas, metode, array, percabangan dan static keyword. Di posttest 2 kali ini, konsep tersebut diperluas dengan fitur OOP yang lebih kompleks seperti inheritance, encapsulation, abstraction, dan interface.

2. Inheritance (minimal terdapat 2 subclass)
Inheritance adalah konsep di mana sebuah kelas dapat mewarisi properti dan metode dari kelas lain. Dalam proyek ini, saya membuat kelas Vehicle sebagai superclass abstrak, yang kemudian diwarisi oleh kelas Mobil. Selanjutnya, Mobil memiliki dua subclass, yaitu MobilSUV dan MobilSedan. Kelas MobilSUV dan MobilSedan mewarisi properti dan metode dari kelas Mobil dan dapat menambahkan detail khusus sesuai dengan jenis mobil.

3. Encapsulation (getter dan setter)
Encapsulation adalah konsep penyembunyian data di mana atribut kelas dibuat private dan diakses melalui metode getter dan setter. Saya menerapkan encapsulation dengan membuat atribut seperti merk, model, dan harga di kelas Vehicle menjadi private, dan menyediakan metode getter dan setter untuk mengakses dan memodifikasi atribut tersebut. Ini memastikan bahwa akses ke data dikontrol dan tidak sembarangan.

4. Abstraction (Interface dan abstraction dapat dijadikan satu)
Abstraction adalah konsep di mana detail implementasi disembunyikan dari pengguna, hanya menyediakan antarmuka yang diperlukan. Saya menerapkan abstraction dengan menggunakan kelas abstrak Vehicle, yang tidak dapat diinstansiasi langsung tetapi dapat diwarisi oleh kelas konkret seperti Mobil. Selain itu, saya juga menggunakan interface CrudOperations untuk menerapkan abstraksi tambahan dalam menangani operasi CRUD (Create, Read, Update, Delete).

5. Interface (dapat diterapkan untuk CRUD)
Interface CrudOperations digunakan untuk menerapkan operasi CRUD dalam aplikasi. Metode create, read, update, dan delete diimplementasikan dalam kelas Penjualan, yang memungkinkan saya mengelola daftar mobil dan melakukan operasi CRUD pada data mobil. Dengan menggunakan interface, saya memastikan bahwa semua kelas yang mengimplementasikan interface ini memiliki metode CRUD.

6. Final keyword (class dan properti)
Final adalah keyword yang digunakan untuk membatasi perubahan pada kelas atau properti. Saya menggunakan final untuk memastikan bahwa kelas ManajemenPenjualan tidak dapat diwarisi lebih lanjut, dan beberapa properti di kelas ini juga ditandai dengan final untuk mencegah modifikasi setelah nilai awal diberikan.

