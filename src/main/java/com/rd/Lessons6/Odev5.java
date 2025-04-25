package com.rd.Lessons6;

public class Odev5 {
    public static void main(String[] args) {

        int calisilanGunSayisi=28;
        //int calisilanGunSayisi=20;
        int maas;
        maas=maasHesapla(calisilanGunSayisi) ;
        System.out.println("Toplam maaşınız: " + maas + " TL");


    }
    public static int maasHesapla(int gunSayisi) {
        int gunluk = 750;
        int primMiktari = 1000;
        int toplamMaas = gunSayisi * gunluk;
        int fazlaGun = gunSayisi - 25;
        int prim= (fazlaGun > 0) ? fazlaGun * primMiktari : 0;
        toplamMaas +=prim;

        return toplamMaas;
    }

}
