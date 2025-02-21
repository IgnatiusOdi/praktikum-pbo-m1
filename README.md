# praktikum-pbo-m1

## Praktikum PBO M1

### No 1

Buatlah aplikasi notes sederhana. Berikut adalah tampilan dari menu utama :

```
Menu
1. Tambah note
2. Lihat note
3. Edit note
>>>
```

Bila pilihan Tambah note dipilih, maka user akan membuat note/catatan baru dengan penomoran dilanjutkan dari note terakhir (penomoran dimulai dari 1). Berikan pesan bahwa note berhasil ditambahkan. Berikut tampilan tambah note :

```
>>> 1
===Tambah note===
Judul : Catetan belanja
Isi   : Kentang, Aqua, Odading
Tambah note berhasil!
```

Setelah mengisi judul dan isinya, kembalikan ke menu utama. Untuk melihat semua note yang telah ditambahkan, dapat memilih menu Lihat note. Pada menu Lihat note, tampilkan judul dari tiap note yang sudah dibuat berdasarkan urutan penambahannya. Untuk melihat isi dari note, user dapat menginputkan nomor sesuai dengan daftar notes.

```
>>> 2

===Daftar Notes===
1. Catetan belanja
2. Daftar mantan
0. Kembali
>>> 1

Isi : Kentang, Aqua, Odading
===Daftar Notes===
1. Catetan belanja
2. Daftar mantan
0. Kembali
>>> 0
```

Notes dapat diedit dengan cara memilih menu Edit note pada menu utama. Berikut tampilan untuk menu Edit note:

```
>>> 3

===Edit note===
1. Catetan belanja
2. Daftar mantan
0. Kembali
>>> 2

===Editing===
Judul : Daftar mantan
Isi   : Alexa, Wynne R, Clarisa, Wynne C
1. Tambah di depan
2. Tambah di belakang
3. Hapus kata
0. Keluar dari mode edit
>>>
```

Terdapat 3 jenis edit. Bila pilihan Tambah di depan dipilih, program akan meminta inputan untuk ditambahkan pada bagian depan dari isi note tersebut. Beri pesan bahwa note berhasil diedit. Bila pilihan Tambah di belakang dipilih, program akan meminta inputan untuk ditambahkan pada bagian belakang dari isi note tersebut. Beri pesan bahwa note berhasil diedit. Bila pilihan Hapus kata dipilih, program akan meminta satu kata yang ingin dihapus dari isi note tersebut. Semua kata akan terhapus dari isi note bila sama dengan inputan. Kemudian berikan pemberitahuan berapa kata yang sudah dihapus.

Catatan : Program akan berada pada mode editing terus-menerus sampai user memilih menu Keluar dari mode edit. Setelah memilih menu Keluar dari mode edit, kembalikan tampilan ke menu Edit note (menu untuk memilih note yang ingin diedit).

Berikut tampilan untuk ketiga jenis edit :

```
=== Editing ===
Judul : Daftar mantan
Isi   : Alexa, Wynne R, Clarisa, Wynne C
1. Tambah di depan
2. Tambah di belakang
3. Hapus kata
0. Keluar dari mode edit
>>> 1
Masukkan tambahan note : Roxanne,
Berhasil mengedit note!

=== Editing ===
Judul : Daftar mantan
Isi   : Roxanne, Alexa, Wynne R, Clarisa, Wynne C
1. Tambah di depan
2. Tambah di belakang
3. Hapus kata
0. Keluar dari mode edit
>>> 2
Masukkan tambahan note : , Gaby
Berhasil mengedit note!

=== Editing ===
Judul : Daftar mantan
Isi   : Roxanne, Alexa, Wynne R, Clarisa, Wynne C, Gaby
1. Tambah di depan
2. Tambah di belakang
3. Hapus kata
0. Keluar dari mode edit
>>> 3
Masukkan kata yang ingin dihapus : Wynne
Berhasil menghapus 2 kata pada note!

=== Editing ===
Judul : Daftar mantan
Isi   : Roxanne, Alexa,  R, Clarisa,  C, Gaby
1. Tambah di depan
2. Tambah di belakang
3. Hapus kata
0. Keluar dari mode edit
>>> 0

=== Edit note ===
1. Catetan belanja
2. Daftar mantan
0. Kembali
>>>
```

Catatan : Tiap menu akan terus meminta inputan bila inputan yang diberikan tidak valid.

### Tugas

Buatlah game Stack 2048 Sederhana. Permainan dimulai dengan menu awal sebagai berikut:

```
=====Stack 2048=====
Main Menu
1. Play
2. Leaderboard
3. Exit
>>
```

Menu 1\
Pada saat player memilih menu play, sebelum permainan game dimulai mintalah user untuk memberikan nama terlebih dahulu.

```
Masukkan Nama Player : Chen
```

Setelah player memasukkan nama, permainan akan langsung mulai. Tampilan awal program adalah sebagai berikut :

```
Score : 0
-----------------
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
Menu Play:
Next Card : 002
1. Masukan Card
2. Discard Card (3)
3. Bersihkan Kolom (0)
4. Bersihkan Baris (0)
>>
```

Pada awal permainan semua bagian papan akan berisi “ ”. Next card pada menu play akan berisi angka random (2,4,8,16,32,64). Score pada awal permainan adalah 0.

Pilihan Menu 1 (Masukan Card)\
Saat user memilih menu pilihan ini, user akan menginputkan pilihan kolom yang akan memindahkan angka pada Next Card ke dalam papan. Tambahkan pula angka 0 hingga angka pada kolom menjadi 3 digit apabila angka bukan 3 digit.\
Sistem permainan Stack 2048 hampir sama seperti permainan 2048 biasa. Jika terdapat angka yang sama diatas angka tersebut, maka angka tersebut akan dijumlahkan dan hasil dari penjumlahan tersebut akan menjadi angka yang diatas. Maksimal suatu card pada papan adalah 256. Contoh:

```
Score : 49
-----------------
|256|256|256|064|
|128|064|032|016|
|128|064|032|016|
|064|032|002|   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
Menu Play:
Next Card : 002
1. Masukan Card
2. Discard Card (3)
3. Bersihkan Kolom (0)
4. Bersihkan Baris (0)
>> 1
Kolom yang dipilih : 3

Score : 50
-----------------
|256|256|256|064|
|128|064|032|016|
|128|064|032|016|
|064|032|004|   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
Menu Play:
Next Card : 002
1. Masukan Card
2. Discard Card (3)
3. Bersihkan Kolom (0)
4. Bersihkan Baris (0)
>>
```

Proses tersebut akan berjalan terus hingga atasnya tidak ada angka yang sama atau sudah paling atas baris. Score akan bertambah sesuai dengan berapa kali terjadi penjumlahan yang terjadi pada saat masukan card. Apabila user memilih kolom yang sudah penuh maka berikanlah pesan error “Kolom tersebut sudah penuh”.

Pilihan Menu 2 (Discard Card)\
Saat user memilih menu pilihan ini, user akan merandom lagi angka pada Next Card. Jumlah pemakaian akan berkurang 1 apabila user memilih pilihan menu ini. Apabila user memilih menu ini saat jumlah pemakan sisa 0, berilah pesan error “Jumlah discard card sudah terpakai semua”.

Pilihan Menu 3 (Bersihkan Kolom)\
Saat user memilih menu pilihan ini, user akan memilih kolom yang dipilih. Setelah user memilih kolom maka 1 kolom yang dipilih akan kosong lagi . Kemudian kurangilah sebanyak 1 setelah user memakai power up ini. Berilah pengecekan apabila baris yang diinputkan melebihi dari 4 atau kurang dari 1.

Pilihan Menu 4 (Bersihkan Baris)\
Saat user memilih menu pilihan ini, user akan memilih baris yang dipilih. Setelah user memilih baris maka 1 baris yang dipilih akan kosong lagi. Angka yang di bawah baris tersebut akan naik dan jangan lupa beri pengecekan apabila terdapat angka yang sama diatas angka tersebut. Kemudian kurangilah sebanyak 1 setelah user memakai power up ini. Berilah pengecekan apabila baris yang diinputkan melebihi dari 8 atau kurang dari 1.

Power up “Bersihkan Baris” & “Bersihkan Kolom” bisa didapatkan jika terjadi chain penjumlahan (proses penjumlahan secara berlangsung) sebanyak 3 kali atau lebih. Apabila terjadi chain penjumlahan sebanyak 3x maka randomlah 1 power up yang akan didapatkan oleh user.

```
Score : 50
-----------------
|256|256|256|064|
|128|064|032|016|
|064|032|004|   |
|016|   |   |   |
|008|   |   |   |
|004|   |   |   |
|002|   |   |   |
|   |   |   |   |
Menu Play:
Next Card : 002
1. Masukan Card
2. Discard Card (3)
3. Bersihkan Kolom (0)
4. Bersihkan Baris (0)
>> 1
Kolom yang dipilih : 1

Score : 50
-----------------
|256|256|256|064|
|128|064|032|016|
|064|032|004|   |
|032|   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
|   |   |   |   |
Menu Play:
Next Card : 002
1. Masukan Card
2. Discard Card (3)
3. Bersihkan Kolom (0)
4. Bersihkan Baris (0)
>>
```

Perhatikan Kolom 1, apabila 002 masuk ke kolom 1 maka terjadi penjumlahan sebanyak 4x.

-   002 + 002 = 004
-   004 + 004 = 008
-   008 + 008 = 016
-   016 + 016 = 032

Karena terjadi chain sebanyak 4x maka akan merandom power up untuk player dan score akan bertambah sebanyak 4.

Apabila papan telah penuh dan tidak ada angka yang bisa dimasukan lagi maka cetaklah papan terakhir kali, beri pesan game over + score player. Masukkan score player ke dalam leaderboard apabila termasuk dalam top 3 leaderboard. Kemudian kembalikan player ke main menu awal.

Menu 2\
Format leaderboard adalah Nama – Score, urutkan score dari tertinggi ke terendah. Leaderboard hanya berisi tiga score player tertinggi. Buatlah tampilan leaderboard sebagai berikut

```
Leaderboard
1. Chen-650
2. Jason-450
3. Widean-350
0. Exit
>>
```

Apabila user menginputkan 0 maka player akan ke main menu awal

Menu 3\
Apabila user memilih menu exit maka keluarlah dari program ini.
