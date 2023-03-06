/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangundatar;

/**
 *
 * @author LENOVO
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    private final double tinggi;
    private double volume, luasPermukaan;

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public void volume() {
        volume = getLuas()*tinggi;
    }

    @Override
    public void luasPermukaan() {
        luasPermukaan = getKeliling()*tinggi+2*getLuas();
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    
}
