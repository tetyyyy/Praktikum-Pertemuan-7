package com.mycompany.praktikumpertemuan7;

public abstract class Koleksi {

    protected String judul;
    protected int tahunTerbit;

    public Koleksi(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    public abstract double hitungDendaKeterlambatan(
            int hariTerlambat);
}
