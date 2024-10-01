package service;

import entity.Asrama;
import entity.Kamar;
import entity.Mahasiswa;
import repository.AsramaRepository;
import repository.KamarRepository;
import repository.MahasiswaRepository;

public class MahasiswaService {
    private KamarRepository kamarRepository;
    private AsramaRepository asramaRepository;

    public MahasiswaService(AsramaRepository asramaRepository, KamarRepository kamarRepository) {
        this.asramaRepository = asramaRepository;
        this.kamarRepository = kamarRepository;
    }

    public String tambahMahasiswaKeKamar(Mahasiswa mahasiswa, String asramaId, String kamarId) {
        Asrama asrama = asramaRepository.getAsramaByIdAsrama(asramaId);

        if (asrama == null) {
            return "Asrama tidak ditemukan.";
        }

        if (asrama.getJenis().equalsIgnoreCase("Aspi") && mahasiswa.getJenisKelamin().equalsIgnoreCase("Aspa")) {
            return "Tidak bisa menambahkan mahasiswa aspa ke asrama aspi.";
        }

        if (asrama.getJenis().equalsIgnoreCase("Aspa") && mahasiswa.getJenisKelamin().equalsIgnoreCase("Aspi")) {
            return "Tidak bisa menambahkan mahasiswi aspi ke asrama aspa.";
        }

        Kamar kamar = kamarRepository.getKamarByIdKamar(kamarId);
        if (kamar == null) {
            return "Kamar tidak ditemukan.";
        }
        // Cek apakah asrama penuh
        if (kamar.getKapasitas() <= kamar.getListMahasiswa().size()) {
            return "Kamar sudah penuh.";
        }

        kamar.getListMahasiswa().add(mahasiswa);
        return "Mahasiswa berhasil ditambahkan ke kamar.";

    }
}
