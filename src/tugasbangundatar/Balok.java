/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangundatar;

/**
 *
 * @author LENOVO
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    public double tinggi, volume, luasPermukaan;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public void volume() {
        volume = getLuas()*tinggi;
    }

    @Override
    public void luasPermukaan() {
        luasPermukaan = 2*getLuas()+2*super.lebar*tinggi+2*super.panjang*tinggi;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    
    
}
