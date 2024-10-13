/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class MobilSUV extends Mobil {

    public MobilSUV(String merk, String model, double harga) {
        super(merk, model, harga);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Mobil SUV - ");
        super.tampilkanDetail();
    }
}