package repository;

import entity.Kamar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.KamarService;

public class KamarServiceTest {
    @Test
    public void testTambahKamar_EmptyRequestSuccess() {
        KamarRepository.emptyKamar();
        KamarService.tambahKamar(null);
        Assertions.assertNull(KamarRepository.getAllKamar());
    }

    @Test
    public void testTambahKamar_NotEmptyRequestSuccess() {
        KamarRepository.emptyKamar();
        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar A");
        kamar.setKapasitas(4);

        KamarService.tambahKamar(kamar);

        Assertions.assertNotNull(KamarRepository.getAllKamar());
    }

    @Test
    public void testGenerateIdKamar_EmptyKamarSuccess() {
        KamarRepository.emptyKamar();

        Assertions.assertEquals("Kamar-01", KamarService.generateIdKamar());
    }

    @Test
    public void testGenerateIdKamar_NotEmptyKamarSuccess() {
        KamarRepository.emptyKamar();

        Kamar kamar = new Kamar();
        kamar.setNomorKamar("Kamar-02");
        kamar.setKapasitas(6);

        KamarService.tambahKamar(kamar);

        Assertions.assertEquals("Kamar-02", KamarService.generateIdKamar());
    }
}
