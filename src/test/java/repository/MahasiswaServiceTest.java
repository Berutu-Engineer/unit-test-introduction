package repository;

import entity.Asrama;
import entity.Kamar;
import entity.Mahasiswa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.MahasiswaService;
import java.util.ArrayList;
import java.util.Arrays;

public class MahasiswaServiceTest {

    @Test
    public void testTambahMahasiswaKeKamar_KamarPenuh() {
        AsramaRepository asramaRepository = new AsramaRepository();
        KamarRepository kamarRepository = new KamarRepository();
        MahasiswaService mahasiswaService = new MahasiswaService(asramaRepository, kamarRepository);

        Asrama asramaPutra = new Asrama();
        asramaPutra.setId("Asrama-01");
        asramaPutra.setNama("Asrama 1");
        asramaPutra.setJenis("Aspa");
        asramaPutra.setJumlahKamar(10);
        asramaPutra.setLokasi("Lokasi A");
        asramaRepository.addAsrama(asramaPutra);

        Kamar kamar = new Kamar();
        kamar.setId("Kamar-01");
        kamar.setNomorKamar("Kamar 1");
        kamar.setKapasitas(2);
        kamar.setListMahasiswa(new ArrayList<>());
        kamar.getListMahasiswa().add(new Mahasiswa("Mahasiswa-02", "124", "Budi", "Aspa"));
        kamar.getListMahasiswa().add(new Mahasiswa("Mahasiswa-03", "125", "Yanto", "Aspa"));
        kamarRepository.addKamar(kamar);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId("Mahasiswa-04");
        mahasiswa.setNama("Joko");
        mahasiswa.setNim("123456789");
        mahasiswa.setJenisKelamin("Aspa");

        String result = mahasiswaService.tambahMahasiswaKeKamar(mahasiswa, "Asrama-01", "Kamar-01");

        Assertions.assertEquals("Kamar sudah penuh.", result);
    }

    @Test
    public void testTambahMahasiswaKeAsrama_JenisKelaminTidakSesuai() {
        AsramaRepository asramaRepository = new AsramaRepository();
        KamarRepository kamarRepository = new KamarRepository();
        MahasiswaService mahasiswaService = new MahasiswaService(asramaRepository, kamarRepository);


        Asrama asrama = new Asrama();
        asrama.setId("Asrama-01");
        asrama.setNama("Asrama A");
        asrama.setJenis("Aspi");
        asrama.setJumlahKamar(1);

        asramaRepository.addAsrama(asrama);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId("Mahasiswa-01");
        mahasiswa.setNama("Joko");
        mahasiswa.setNim("123456789");
        mahasiswa.setJenisKelamin("Aspa");
        String result = mahasiswaService.tambahMahasiswaKeKamar(mahasiswa, "Asrama-01", "Kamar-01");

        Assertions.assertEquals("Tidak bisa menambahkan mahasiswa aspa ke asrama aspi.", result);
    }

    @Test
    public void testTambahMahasiswaKeKamar_BerhasilDitambahkan() {
        AsramaRepository asramaRepository = new AsramaRepository();
        KamarRepository kamarRepository = new KamarRepository();
        MahasiswaService mahasiswaService = new MahasiswaService(asramaRepository, kamarRepository);

        Asrama asramaPutri = new Asrama("Asrama-01", "Asrama 1", 10, "Aspi", "Lokasi A");
        asramaRepository.addAsrama(asramaPutri);

        Kamar kamar = new Kamar("Kamar-01", "Kaamr 1", 2);
        kamar.setListMahasiswa(new ArrayList<>());
        kamarRepository.addKamar(kamar);

        Mahasiswa mahasiswa = new Mahasiswa("Mahasiswa-01", "123", "Siti", "Aspi");
        String result = mahasiswaService.tambahMahasiswaKeKamar(mahasiswa, "Asrama-01", "Kamar-01");
        Assertions.assertEquals("Mahasiswa berhasil ditambahkan ke kamar.", result);

        Kamar kamarUpdated = kamarRepository.getKamarByIdKamar("Kamar-01");
        Assertions.assertEquals(1, kamarUpdated.getListMahasiswa().size());
        Assertions.assertEquals("Siti", kamarUpdated.getListMahasiswa().get(0).getNama());
    }



}
