/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangundatar;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang implements MenghitungBidang {
    double panjang,lebar,luas, keliling;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void luas() {
        luas = panjang*lebar;
    }

    @Override
    public void keliling() {
        keliling = 2*panjang*luas;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

}
