/**
 * Copyright (c) 2024 All Rights Reserved
 */
package service;

import entity.Asrama;
import repository.AsramaRepository;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: AsramaService.java , v 0.1 2024-09-28 14.01 Yosepri Disyandro Berutu Exp $$
 */
public class AsramaService {

    public static void tambahAsrama(Asrama asrama) {
        if (asrama == null) {
            return;
        }

        asrama.setId(generateIdAsrama());

        AsramaRepository.addAsrama(asrama);
    }

    public static String generateIdAsrama(){
        // kita generate: Asrama-01
        if (AsramaRepository.getAllAsrama() == null) {
            return "Asrama-01";
        }

        return "Asrama-0" + String.valueOf(AsramaRepository.getAllAsrama().size() + 1);
    }
}
