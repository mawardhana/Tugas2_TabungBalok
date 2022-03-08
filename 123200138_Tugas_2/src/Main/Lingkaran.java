/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements MenghitungBidang {
     private double jari, hasilLuas, hasilKel;
    
    public Lingkaran(double r){
        jari = r;
    }
    
    // Encaptulation
    public void setJari(int r){
        jari = r;
    }
    
    public double getJari(){
        return jari;
    }
    
    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = PHI * (jari * jari);
        return hasilLuas;
    }

    @Override
    public double hitungKeliling() {
        return hasilKel = PHI * (2*jari);
    }
}
