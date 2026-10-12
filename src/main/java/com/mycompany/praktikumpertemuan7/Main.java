package com.mycompany.praktikumpertemuan7;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("    SISTEM KOLEKSI PERPUSTAKAAN");
        System.out.println("====================================");

        // Membuat objek koleksi
        Koleksi[] daftarKoleksi = {
            new BukuCetak("Pemrograman Java", 2024),
            new EBook("Belajar OOP", 2025),
            new Majalah("Teknologi Informasi", 2026)
        };

        // Menampilkan informasi setiap koleksi
        for (Koleksi koleksi : daftarKoleksi) {

            System.out.println("\n------------------------------------");

            koleksi.tampilkanInfo();

            System.out.println(
                "Denda 3 hari: Rp"
                + koleksi.hitungDendaKeterlambatan(3)
            );

            // Memeriksa interface peminjaman
            if (koleksi instanceof DapatDipinjam) {
                DapatDipinjam pinjaman =
                    (DapatDipinjam) koleksi;

                pinjaman.prosesPinjamFisik();
            }

            // Memeriksa interface penilaian
            if (koleksi instanceof DapatDinilai) {
                DapatDinilai penilaian =
                    (DapatDinilai) koleksi;

                penilaian.beriRating(5);
            }
        }

        // Perbedaan Abstract Class dan Interface
        System.out.println("\n====================================");
        System.out.println("PERBEDAAN ABSTRACT CLASS DAN INTERFACE");
        System.out.println("====================================");

        System.out.println(
            "Abstract Class menggunakan extends."
        );

        System.out.println(
            "Interface diterapkan menggunakan implements."
        );

        System.out.println(
            "Abstract Class dapat memiliki atribut,"
            + " method biasa, dan abstract method."
        );

        System.out.println(
            "Interface digunakan untuk menetapkan"
            + " kontrak perilaku."
        );

        System.out.println(
            "Satu class dapat mengimplementasikan"
            + " beberapa interface."
        );

        System.out.println("\nProgram selesai dijalankan.");
    }
}
