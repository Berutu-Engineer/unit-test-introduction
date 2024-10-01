package repository;

import entity.Kamar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KamarRepositoryTest {
    @Test
    public void testGetAllKamar_EmptyKamarSuccess() {
        Assertions.assertNull(KamarRepository.getAllKamar());
    }

    @Test
    public void testGetAllKamar_NotEmptyKamarSuccess() {
        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar 1");
        kamar.setKapasitas(6);
        KamarRepository.addKamar(kamar);

        Kamar kamar2 = new Kamar();
        kamar2.setId("Kamar-02");
        kamar2.setNomorKamar("Kamar 2");
        kamar2.setKapasitas(4);
        KamarRepository.addKamar(kamar2);

        Assertions.assertNotNull(KamarRepository.getAllKamar());
        Assertions.assertEquals(2, KamarRepository.getAllKamar().size());
    }

    @Test
    public void testAddKamar_AddedKamarSuccess() {
        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar 1");
        kamar.setKapasitas(6);
        KamarRepository.addKamar(kamar);

        Assertions.assertNotNull(KamarRepository.getAllKamar());
    }

    @Test
    public void getAsramaById_NotEmptyKamarSuccess() {
        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar 1");
        kamar.setKapasitas(6);
        KamarRepository.addKamar(kamar);

        Assertions.assertNotNull(KamarRepository.getKamarByIdKamar("Kamar-01"));
        Assertions.assertEquals("Kamar-01", kamar.getId());
        Assertions.assertEquals("Kamar 1", kamar.getNomorKamar());
        Assertions.assertEquals(6, kamar.getKapasitas());
    }

}
