package com.rd.Lessons8Homework;

import java.util.*;

public class KelimeTara {
    public static void main(String[] args) {
        String[] kelimeler = {"kalem", "elalem", "kelam", "kelime"};
        List<String> harfTekrariOlanKelimeList = new ArrayList<>();
        for (String kelime : kelimeler) {
            if (harfTekrariVarMi(kelime)) {
                harfTekrariOlanKelimeList.add(kelime);
                if (harfTekrariOlanKelimeList.size() == 2) {
                    break;
                }
            }
        }
        if (harfTekrariOlanKelimeList.size() == 2) {

            List<Character> harfler =harfListesiOlustur(harfTekrariOlanKelimeList);

            Random random= new Random();
            Collections.shuffle(harfler, random);

            StringBuilder sonuc = new StringBuilder();
            for (char c : harfler) {
                sonuc.append(c);
            }
            System.out.println("Tekrar eden harf içeren 2 kelime: " + harfTekrariOlanKelimeList);
            System.out.println("Oluşturulan yeni metin: "+ sonuc);
        }
        else {
            System.out.println("Tekrar eden harf içeren yeterli kelime yok.");
        }

    }

    public static List<Character> harfListesiOlustur(List<String> kelimelistesi){
        List<Character> harfListesi = new ArrayList<>();
        for (String kelime : kelimelistesi) {
            for (char harf : kelime.toCharArray()) {
                harfListesi.add(harf);
            }
        }
        return harfListesi;
    }
    public static boolean harfTekrariVarMi(String kelime) {
        List<Character> harfListesi = new ArrayList<>();
        for (char c : kelime.toCharArray()) {
            if (harfListesi.contains(c)) {
                return true;
            }
            harfListesi.add(c);
        }
        return false;
    }
}
