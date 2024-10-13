/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author ACER
 */

import java.util.ArrayList;

public class Penjualan implements CrudOperations {
    private String namaPembeli;
    private ArrayList<Mobil> daftarMobil;
    private double totalPembayaran;

    public Penjualan(String namaPembeli) {
        this.namaPembeli = namaPembeli;
        this.daftarMobil = new ArrayList<>();
        this.totalPembayaran = 0;
    }

    public void tambahkanMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        totalPembayaran += mobil.getHarga();
    }

    public void tampilkanPenjualan() {
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Mobil yang dibeli:");
        for (Mobil mobil : daftarMobil) {
            mobil.tampilkanDetail();
        }
        System.out.println("Total Pembayaran: Rp" + totalPembayaran);
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    // CRUD Operations
    @Override
    public void create(Object obj) {
        if (obj instanceof Mobil) {
            tambahkanMobil((Mobil) obj);
        }
    }

    @Override
    public void read() {
        tampilkanPenjualan();
    }

    @Override
    public void update(int index, Object obj) {
        if (index >= 0 && index < daftarMobil.size() && obj instanceof Mobil) {
            daftarMobil.set(index, (Mobil) obj);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < daftarMobil.size()) {
            daftarMobil.remove(index);
        }
    }
}
