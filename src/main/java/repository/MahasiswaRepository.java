package repository;


import entity.Kamar;
import entity.Mahasiswa;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepository {
    private static List<Mahasiswa> listMahasiswa;

    public static void addMahasiswa(Mahasiswa mahasiswa) {
        if (listMahasiswa == null) {
            listMahasiswa = new ArrayList<>();
        }

        listMahasiswa.add(mahasiswa);
    }

    public static List<Mahasiswa> getAllMahasiswa() {
        return listMahasiswa;
    }

    public static Mahasiswa getMahasiswaByIdMahasiswa(String idMahasiswa) {
        for (Mahasiswa mahasiswa : listMahasiswa) {
            if (idMahasiswa.equals(mahasiswa.getId())) {
                return mahasiswa;
            }
        }
        return null;
    }

    public static void emptyMahasiswa() {
        listMahasiswa = null;
    }

}
