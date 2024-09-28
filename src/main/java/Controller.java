/**
 * Copyright (c) 2024 All Rights Reserved
 */

import entity.Asrama;
import service.AsramaService;

import java.util.Scanner;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: Controller.java , v 0.1 2024-09-28 13.43 Yosepri Disyandro Berutu Exp $$
 */
public class Controller {

    public static void main(String[] args) {
        // 1. Tampilkan list asrama
        // 2. Tampilkan list mahasiswa
        // 3. Tampilkan list semua kamar dalam satu asrama
        // 4. tampilkan list semua penghuni asrama dalam 1 asrama
        // 5. Tambahkan asrama
        // 6. Tambahkan mahasiswa ke kamar
        // 0. Keluar Aplikasi

        int pilihan = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan list asrama\n2. Tampilkan list mahasiswa\n3. Tampilkan list semua kamar dalam satu asrama");
            System.out.println("4. Tapilkan list semua penghuni asrama dalam 1 asrama\n5. Tambahkan asrama\n6. Tambahkan mahasiswa ke kamar");
            System.out.println("0. Keluar Aplikasi");
            System.out.print("Masukkan pilihan: ");

            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 5) {
                // Membuat Class asrama
                System.out.print("Masukkan Nama Asrama: ");
                String nama = scanner.nextLine();

                System.out.print("Jumlah Kamar: ");
                int jumlahKamar = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Tipe (Aspa:1|Aspi:2)");
                String tipe = scanner.nextLine();

                System.out.println("Lokasi: ");
                String lokasi = scanner.nextLine();

                Asrama asrama = new Asrama("", nama, jumlahKamar, tipe, lokasi);
                AsramaService.tambahAsrama(asrama);
            }
        } while (pilihan != 0);
    }
}
