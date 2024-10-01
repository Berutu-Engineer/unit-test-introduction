package repository;

import entity.Kamar;
import entity.Mahasiswa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MahasiswaRepositoryTest {
    private MahasiswaRepository mahasiswaRepository;

    @Test
    public void testTambahMahasiswa_Success() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId("Mahasiwa-01");
        mahasiswa.setNama("Joko");
        mahasiswa.setNim("123456789");
        mahasiswa.setJenisKelamin("Aspa");
        mahasiswaRepository.addMahasiswa(mahasiswa);

        Assertions.assertEquals(1, mahasiswaRepository.getAllMahasiswa().size());
        Assertions.assertEquals("Joko", mahasiswaRepository.getAllMahasiswa().get(0).getNama());
    }

    @Test
    public void getMahasiswaById_NotEmptyMahasiswaSuccess() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId("Mahasiswa-01");
        mahasiswa.setNama("Joko");
        mahasiswa.setNim("123456789");
        mahasiswa.setJenisKelamin("Aspa");
        mahasiswaRepository.addMahasiswsa(mahasiswa);

        Assertions.assertNotNull(MahasiswaRepository.getMahasiswaByIdMahasiswa("Mahasiswa-01"));
        Assertions.assertEquals("Mahasiswa-01", mahasiswa.getId());
        Assertions.assertEquals("Joko", mahasiswa.getNama());
        Assertions.assertEquals("123456789", mahasiswa.getNim());
        Assertions.assertEquals("Aspa", mahasiswa.getJenisKelamin());
    }
}
