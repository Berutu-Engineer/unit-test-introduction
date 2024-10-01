package service;

import entity.Kamar;
import repository.AsramaRepository;
import repository.KamarRepository;

public class KamarService {

    public static void tambahKamar(Kamar kamar) {
        if (kamar == null) {
            return;
        }

        kamar.setId(generateIdKamar());

        KamarRepository.addKamar(kamar);
    }

    public static String generateIdKamar(){
        if (KamarRepository.getAllKamar() == null) {
            return "Kamar-01";
        }

        return "Kamar-0" + String.valueOf(KamarRepository.getAllKamar().size() + 1);
    }
}
