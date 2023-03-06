/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbangundatar;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TugasBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();   
    }
    
    static void menu(){
        String ch, back;
        double panjang,lebar,jari,tinggi;
        Scanner input = new Scanner (System.in);
        
        System.out.print("============\n MENU UTAMA\n============\n");
        System.out.print("""
                           1. Hitung Balok
                           2. Hitung Tabung
                           0. Exit
                           """);
        System.out.print("Pilih : ");
        ch = input.nextLine();
        
        switch(ch){
            case "1" -> {
                System.out.print("Input Panjang : ");
                panjang = input.nextDouble();
                System.out.print("Input Lebar : ");
                lebar = input.nextDouble();
                System.out.print("Input Tinggi : ");
                tinggi = input.nextDouble();
                
                Balok balok = new Balok(tinggi, panjang, lebar);
                balok.luas();
                balok.keliling();
                balok.volume();
                balok.luasPermukaan();
                System.out.println("Luas Persegi Panjang = " + balok.getLuas());
                System.out.println("Keliling Persegi Panjang = " + balok.getKeliling());
                System.out.println("Volume Balok = " + balok.getVolume());
                System.out.println("Luas Permukaan Balok = " + balok.getLuasPermukaan());
            }
                
            case "2" -> {
                System.out.print("Input Tinggi : ");
                tinggi = input.nextDouble();
                System.out.print("Input Jari : ");
                jari = input.nextDouble();
                
                Tabung tabung = new Tabung(tinggi, jari);
                tabung.luas();
                tabung.keliling();
                tabung.volume();
                tabung.luasPermukaan();
                System.out.println("Luas Lingkaran = " +tabung.getLuas());
                System.out.println("Keliling Lingkaran = " + tabung.getKeliling());
                System.out.println("Volume Tabung = " + tabung.getVolume());
                System.out.println("Luas Permukaan Tabung = " + tabung.getLuasPermukaan());
            }
                
            case "0" -> {
                System.exit(0);
            }
            
            default -> {
                System.out.println("Tidak ada di pilih");
                break;
            }
        }
            
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0 )");
            back=input.next();
            
            if("1".equals(back))
                menu();
    }
}
