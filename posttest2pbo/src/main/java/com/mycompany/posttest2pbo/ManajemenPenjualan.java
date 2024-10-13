/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.posttest2pbo;

/**
 *
 * @author ACER
 */

import model.Mobil;
import model.MobilSUV;
import model.MobilSedan;
import model.Penjualan;
import java.util.ArrayList;
import java.util.Scanner;

public final class ManajemenPenjualan {
    private static final ArrayList<Mobil> daftarMobil = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void tambahMobil() {
        System.out.println("Masukkan merk mobil:");
        String merk = scanner.nextLine();
        System.out.println("Masukkan model mobil:");
        String model = scanner.nextLine();
        System.out.println("Masukkan harga mobil:");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Pilih jenis mobil (1. SUV, 2. Sedan): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        Mobil mobil;
        if (pilihan == 1) {
            mobil = new MobilSUV(merk, model, harga);
        } else {
            mobil = new MobilSedan(merk, model, harga);
        }

        daftarMobil.add(mobil);
        System.out.println("Mobil berhasil ditambahkan!");
    }

    public static void hapusMobil() {
        System.out.println("Masukkan nomor urut mobil yang ingin dihapus:");
        tampilkanDaftarMobil();
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < daftarMobil.size()) {
            daftarMobil.remove(index);
            System.out.println("Mobil berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    public static void tampilkanDaftarMobil() {
        System.out.println("Daftar Mobil:");
        for (int i = 0; i < daftarMobil.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMobil.get(i).tampilkanDetail();
        }
    }

    public static void buatPenjualan() {
        System.out.println("Masukkan nama pembeli:");
        String namaPembeli = scanner.nextLine();
        Penjualan penjualan = new Penjualan(namaPembeli);

        while (true) {
            tampilkanDaftarMobil();
            System.out.println("Pilih nomor mobil yang ingin dibeli (atau 0 untuk selesai):");
            int pilihan = scanner.nextInt() - 1;
            scanner.nextLine();

            if (pilihan == -1) {
                break;
            } else if (pilihan >= 0 && pilihan < daftarMobil.size()) {
                penjualan.tambahkanMobil(daftarMobil.get(pilihan));
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        penjualan.tampilkanPenjualan();
    }
}
