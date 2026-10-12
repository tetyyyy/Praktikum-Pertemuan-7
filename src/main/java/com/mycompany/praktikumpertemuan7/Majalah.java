package com.mycompany.praktikumpertemuan7;

public class Majalah extends Koleksi implements DapatDipinjam {

    public Majalah(String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
    }

    @Override
    public void prosesPinjamFisik() {
        System.out.println(
            "Majalah \"" + judul
            + "\" berhasil dipinjam."
        );
    }

    @Override
    public double hitungDendaKeterlambatan(
            int hariTerlambat) {
        return Math.max(0, hariTerlambat) * 1000.0;
    }
}

