package com.rd.Lessons5.Classes;

import java.time.LocalDate;

public class Personel {

    public String ad;
    public String soyad;
    public String pozisyon;
    public double maas;
    public String departman;
    public LocalDate iseBaslamaTarihi;

    void Listele(){
        System.out.println("Adı: "+ad+ " Soyadı: "+soyad+ " Pozisyon: "+pozisyon+ " Maas: "+maas+ " Departman: "+departman+ " İşe Başlama Tarihi :"+ iseBaslamaTarihi);
    }
}