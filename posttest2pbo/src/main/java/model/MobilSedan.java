/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class MobilSedan extends Mobil {

    public MobilSedan(String merk, String model, double harga) {
        super(merk, model, harga);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Mobil Sedan - ");
        super.tampilkanDetail();
    }
}