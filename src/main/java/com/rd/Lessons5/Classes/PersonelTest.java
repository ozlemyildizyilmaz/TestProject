package com.rd.Lessons5.Classes;

import java.time.LocalDate;

public class PersonelTest {
    public static void main(String[] args) {
        Personel personel1 = new Personel();
        Personel personel2 = new Personel();
        Personel personel3 = new Personel();

        personel1.ad="Deniz";
        personel1.soyad="Özgenç";
        personel1.pozisyon="Yazılım Geliştirici";
        personel1.maas=20000.50;
        personel1.departman="IT";
        personel1.iseBaslamaTarihi= LocalDate.of(2020, 5, 1);

        personel2.ad="Meltem";
        personel2.soyad="ÖZtürk";
        personel2.pozisyon="Finans Müdürü";
        personel2.maas=25000.00;
        personel2.departman="Finans";
        personel2.iseBaslamaTarihi=LocalDate.of(2018, 3, 15);

        personel3.ad="Uğur";
        personel3.soyad="Akpınar";
        personel3.pozisyon="Operasyon Yöneticisi";
        personel3.maas=22000.00;
        personel3.departman="Operasyon";
        personel3.iseBaslamaTarihi=LocalDate.of(2017, 7, 20);
        personel1.Listele();
        personel2.Listele();
        personel3.Listele();


    }
}