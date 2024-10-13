/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ACER
 */
public class Mobil extends Vehicle {

    public Mobil(String merk, String model, double harga) {
        super(merk, model, harga);
    }

    @Override
    public void tampilkanDetail() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Merk: " + getMerk() + ", Model: " + getModel() + ", Harga: " + formatter.format(getHarga()));
    }
}