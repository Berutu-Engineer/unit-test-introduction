/**
 * Copyright (c) 2024 All Rights Reserved
 */
package repository;

import entity.Asrama;
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

    @Test
    public void testTambahAsrama_NotEmptyRequestSuccess() {
        AsramaRepository.emptyAsrama();

        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspa");
        asrama.setJumlahKamar(10);

        AsramaService.tambahAsrama(asrama);

        Assertions.assertNotNull(AsramaRepository.getAllAsrama());
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
