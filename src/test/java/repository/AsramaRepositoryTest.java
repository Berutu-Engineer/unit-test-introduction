/**
 * Copyright (c) 2024 All Rights Reserved
 */
package repository;

import entity.Asrama;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: AsramaRepositoryTest.java , v 0.1 2024-09-28 14.11 Yosepri Disyandro Berutu Exp $$
 */
public class AsramaRepositoryTest {

    @Test
    public void testGetAllAsrama_EmptyAsramaSuccess(){
        Assertions.assertNull(AsramaRepository.getAllAsrama());
    }

    @Test
    public void testGetAllAsrama_NotEmptyAsramaSuccess(){
        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(10);
        AsramaRepository.addAsrama(asrama);

        Asrama asrama2 = new Asrama();
        asrama2.setId("Asrama-02");
        asrama2.setNama("Asrama B");
        asrama2.setJenis("Aspi");
        asrama2.setJumlahKamar(10);
        AsramaRepository.addAsrama(asrama2);

        Assertions.assertNotNull(AsramaRepository.getAllAsrama());
        Assertions.assertEquals(2, AsramaRepository.getAllAsrama().size());
    }

    @Test
    public void testAddAsrama_AddedAsramaSuccess(){
        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(10);

        AsramaRepository.addAsrama(asrama);

        Assertions.assertNotNull(AsramaRepository.getAllAsrama());
    }

    // Test Driven Development (TDD)
    @Test void getAsramaById_NotEmptyAsramaSuccess(){
        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
//        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(10);

        AsramaRepository.addAsrama(asrama);

        Assertions.assertNotNull(AsramaRepository.getAsramaByIdAsrama("Asrama-01"));
        Assertions.assertEquals("Asrama-01", asrama.getId());
        Assertions.assertEquals("Asrama A", asrama.getNama());
        Assertions.assertEquals("Aspa", asrama.getJenis());
        Assertions.assertEquals(10, asrama.getJumlahKamar());
    }
}
