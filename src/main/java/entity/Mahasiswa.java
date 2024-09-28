/**
 * Copyright (c) 2024 All Rights Reserved
 */
package entity;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: Mahasiswa.java , v 0.1 2024-09-28 13.54 Yosepri Disyandro Berutu Exp $$
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
