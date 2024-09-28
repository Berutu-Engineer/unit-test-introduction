/**
 * Copyright (c) 2024 All Rights Reserved
 */
package repository;

import entity.Asrama;
import entity.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: AsramaRepository.java , v 0.1 2024-09-28 14.03 Yosepri Disyandro Berutu Exp $$
 */
public class AsramaRepository {
    private static List<Asrama> listAsrama;
    private static List<Mahasiswa> listMahasiswa;

    public static void addAsrama(Asrama asrama) {
        if (listAsrama == null) {
            listAsrama = new ArrayList<>();
        }

        listAsrama.add(asrama);
    }

    public static List<Asrama> getAllAsrama() {
        return listAsrama;
    }

    public static Asrama getAsramaByIdAsrama(String idAsrama) {
        for (Asrama asrama : listAsrama) {
            if (idAsrama.equals(asrama.getId())) {
                return asrama;
            }
        }
        return null;
    }

    public static void emptyAsrama() {
        listAsrama = null;
    }

}
