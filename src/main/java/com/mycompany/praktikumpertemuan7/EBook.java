package com.mycompany.praktikumpertemuan7;

public class EBook extends Koleksi implements DapatDinilai {

    public EBook(String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
    }

    @Override
    public void beriRating(int rating) {
        System.out.println(
            "Rating E-Book \"" + judul
            + "\": " + rating + "/5"
        );
    }

    @Override
    public double hitungDendaKeterlambatan(
            int hariTerlambat) {
        return 0.0;
    }
}
