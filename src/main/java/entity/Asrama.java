/**
 * Copyright (c) 2024 All Rights Reserved
 */
package entity;

import java.util.List;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: Asrama.java , v 0.1 2024-09-28 13.52 Yosepri Disyandro Berutu Exp $$
 */
public class Asrama {

    private String id;
    private String nama;
    private int jumlahKamar;
    private String jenis;
    private String lokasi;

    public Asrama() {
    }

    public Asrama(String id, String nama, int jumlahKamar, String jenis, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.jumlahKamar = jumlahKamar;
        this.jenis = jenis;
        this.lokasi = lokasi;
    }

    private List<Kamar> listKamar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public List<Kamar> getListKamar() {
        return listKamar;
    }

    public void setListKamar(List<Kamar> listKamar) {
        this.listKamar = listKamar;
    }
}
