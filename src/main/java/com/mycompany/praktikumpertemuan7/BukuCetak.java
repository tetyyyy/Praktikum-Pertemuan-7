package com.mycompany.praktikumpertemuan7;

public class BukuCetak extends Koleksi
        implements DapatDipinjam, DapatDinilai {

    // Constructor
    public BukuCetak(String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
    }

    // Implementasi interface DapatDipinjam
    @Override
    public void prosesPinjamFisik() {
        System.out.println(
            "Buku cetak \"" + judul
            + "\" berhasil dipinjam."
        );
    }

    // Implementasi interface DapatDinilai
    @Override
    public void beriRating(int rating) {
        System.out.println(
            "Rating buku cetak \"" + judul
            + "\": " + rating + "/5"
        );
    }

    // Implementasi abstract method dari Koleksi
    @Override
    public double hitungDendaKeterlambatan(
            int hariTerlambat) {
        return Math.max(0, hariTerlambat) * 2000.0;
    }
}

