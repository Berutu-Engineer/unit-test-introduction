package repository;

import entity.Kamar;
import entity.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class KamarRepository {
    private static List<Kamar> listKamar;
    private static List<Mahasiswa> listMahasiswa;

    public static void addKamar(Kamar kamar) {
        if (listKamar == null) {
            listKamar = new ArrayList<>();
        }

        listKamar.add(kamar);
    }

    public static List<Kamar> getAllKamar() {
        return listKamar;
    }

    public static Kamar getKamarByIdKamar(String idKamar) {
        for (Kamar kamar : listKamar) {
            if (idKamar.equals(kamar.getId())) {
                return kamar;
            }
        }
        return null;
    }

    public static void emptyKamar() {
        listKamar = null;
    }
}
