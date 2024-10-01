/**
 * Copyright (c) 2024 All Rights Reserved
 */
package repository;

import entity.Asrama;
import entity.Kamar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.AsramaService;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: AsramaServiceTest.java , v 0.1 2024-09-28 14.31 Yosepri Disyandro Berutu Exp $$
 */
public class AsramaServiceTest {
    @Test
    public void testTambahAsrama_EmptyRequestSuccess() {
        AsramaRepository.emptyAsrama();

        AsramaService.tambahAsrama(null);
        Assertions.assertNull(AsramaRepository.getAllAsrama());
    }

//    @Test
//    public void testTambahAsrama_NotEmptyRequestSuccess() {
//        AsramaRepository.emptyAsrama();
//
//        Asrama asrama = new Asrama();
//        asrama.setId("Asrama-01");
//        asrama.setNama("Asrama A");
//        asrama.setJenis("Aspa");
//        asrama.setJumlahKamar(10);
//
//        AsramaService.tambahAsrama(asrama);
//
//        Assertions.assertNotNull(AsramaRepository.getAllAsrama());
//    }

    @Test
    public void testTambahAsrama_NotEmptyRequestSuccess() {
        AsramaRepository.emptyAsrama();

        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(10);

        AsramaService.tambahAsrama(asrama);

        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar 1");
        kamar.setKapasitas(6);

        boolean succes = AsramaService.tambahKamarKeAsrama("Asrama-01", kamar);

        Assertions.assertNotNull(AsramaRepository.getAllAsrama());
    }

    @Test
    public void testTambahKamarKeAsramaPenuh() {
        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(1);

        AsramaService.tambahAsrama(asrama);

        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar 1");
        kamar.setKapasitas(6);

        Kamar kamar2 = new Kamar();
        kamar.setId("Kamar-02");
        kamar.setNomorKamar("Kamar 2");
        kamar.setKapasitas(6);

        boolean success1 = AsramaService.tambahKamarKeAsrama("Asrama-01", kamar);
        boolean success2 = AsramaService.tambahKamarKeAsrama("Asrama-01", kamar2); // Asrama sudah penuh

        Assertions.assertTrue(success1);
        Assertions.assertFalse(success2);
        Assertions.assertEquals(1, asrama.getListKamar().size());
    }

    @Test
    public void testGenerateIdAsrama_EmptyAsramaSuccess() {
        AsramaRepository.emptyAsrama();

        Assertions.assertEquals("Asrama-01", AsramaService.generateIdAsrama());
    }

    @Test
    public void testGenerateIdAsrama_NotEmptyAsramaSuccess() {
        AsramaRepository.emptyAsrama();

        Asrama asrama = new Asrama();
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(10);

        AsramaService.tambahAsrama(asrama);

        Assertions.assertEquals("Asrama-02", AsramaService.generateIdAsrama());
    }
}
