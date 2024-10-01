/**
 * Copyright (c) 2024 All Rights Reserved
 */
package entity;

import java.util.List;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: Kamar.java , v 0.1 2024-09-28 13.53 Yosepri Disyandro Berutu Exp $$
 */
public class Kamar {
    private String id;
    private String nomorKamar;
    private int kapasitas;

    public Kamar() {
    }

    public Kamar(String id, String nomorKamar, int kapasitas) {
        this.id = id;
        this.nomorKamar = nomorKamar;
        this.kapasitas = kapasitas;
    }

    private List<Mahasiswa> listMahasiswa;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setListMahasiswa(List<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    public List<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }
}


