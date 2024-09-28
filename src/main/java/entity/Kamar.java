/**
 * Copyright (c) 2024 All Rights Reserved
 */
package entity;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: Kamar.java , v 0.1 2024-09-28 13.53 Yosepri Disyandro Berutu Exp $$
 */
public class Kamar {

    private String nomorKamar;
    private int kapasitas;

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
}
