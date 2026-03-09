Data Structures - Stack Assignment

Repo ini dibuat untuk mengumpulkan tugas mata kuliah Data Structures (materi Stack) menggunakan Java. Ada 5 soal yang dikerjakan di sini.

Isi Repo:
Folder src isinya kodingan Java yang udah dipisah ke folder question1 sampai question5.
Folder report isinya file PDF laporan analisis tugasnya.

Cara Menjalankan Program:
Semua program bisa dijalanin lewat terminal. Pastikan buka terminalnya di folder utama project ini, terus tinggal ketik perintah di bawah ini sesuai nomor soal yang mau dites:

Question 1 - Bracket Checker
javac src/question1/BracketChecker.java
java -cp src question1.BracketChecker

Question 2 - RPN Evaluator
javac src/question2/RPNEvaluator.java
java -cp src question2.RPNEvaluator

Question 3 - Chrono Stack Engine
javac src/question3/ChronoEngine.java
java -cp src question3.ChronoEngine

Question 4 - Cheat Buster Security System
javac src/question4/CheatBuster.java
java -cp src question4.CheatBuster

Question 5 - Operation Chastise
javac src/question5/OperationChastise.java
java -cp src question5.OperationChastise

Format Input:
Semua kodingan udah pake Scanner, jadi bisa langsung mengetik inputnya pas programnya di-run.
Q1: Masukkan urutan kurungnya. Contoh: {[(]}
Q2: Masukkan angka sama operator dipisah spasi. Contoh: 2 1 + 3 *
Q3: Masukkan jumlah angkanya dulu, baru angkanya dipisah spasi. Contoh: 5 terus 1 5 6 3 2
Q4: Masukkan angka acak dipisah spasi. Contoh: 42 9 17 63 28 5 74
Q5: Masukkan satu angka awal. Contoh: 50

Asumsi & Edge Cases:
Q1: Sudah di-handle misal ada kurung tutup yang kelebihan di awal atau kurung buka yang lupa ditutup di akhir biar tidak error.
Q2: Pembagian angka otomatis dibulatkan ke bawah karena bawaan dari tipe data int di Java.
Q3: Logikanya menghitung efek pengurangan duluan dari kanan ke kiri, sehingga angkanya aman tidak akan hancur jadi 0 pas diproses.
Q4: Kalo ada input angka kembar (misal 5 5), kode tetep jalan aman dan datanya tidak akan tergeser atau tertukar.
Q5: Kalo misal menginput angka 1 atau 0, program akan langsung nge-print angkanya tanpa dibagi lagi biar tidak terjadi infinite loop.

Laporan Analisis:
Buat penjelasan rinci cara kerja algoritma, alasan kenapa kodenya benar, sama hitungan kompleksitas (Big O) lengkapnya ada di laporan PDF ini:
./report/Stack_Assignment_Report_SteveAlbertoAuwinardi_2086022510006.pdf