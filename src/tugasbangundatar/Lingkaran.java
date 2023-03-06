/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangundatar;

/**
 *
 * @author LENOVO
 */
public class Lingkaran implements MenghitungBidang{
    private final double jari;
    private double luas, keliling;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public void luas() {
        luas = Math.PI*jari*jari;
    }

    @Override
    public void keliling() {
        keliling = 2*Math.PI*jari;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
    
    
     
}

